package com.hwy.blog.page;

import com.google.common.collect.Lists;
import com.hwy.blog.util.StringUtil;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.CachingExecutor;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.SimpleExecutor;
import org.apache.ibatis.mapping.*;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 14:06
 **/
@Intercepts({@Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class,
        RowBounds.class, ResultHandler.class})})
@Component
public class PagingInterceptor implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Executor executor = (Executor) invocation.getTarget();
        MappedStatement ms = (MappedStatement) invocation.getArgs()[0];
        Object parameter = invocation.getArgs()[1];
        RowBounds rowBounds = (RowBounds) invocation.getArgs()[2];
        ResultHandler<?> resultHandler = (ResultHandler<?>) invocation.getArgs()[3];
        if(rowBounds == null) {
            rowBounds = new RowBounds();
        }
        BoundSql boundSql = ms.getBoundSql(parameter);
        CacheKey key = executor.createCacheKey(ms, parameter, rowBounds, boundSql);
        if (rowBounds instanceof Page) {
            // 执行count操作
            String sql = MySqlHelper.count(boundSql.getSql());
//            logger.debug("generate count total rows sql: {}", StringUtils.replacePattern(sql, "\\s+", " "));
            int total = query(executor, ms, parameter, boundSql, sql);
            Page page = (Page) rowBounds;
            page.setTotalCount(total);
            page.setPage(page.computePageNo());
            sql = MySqlHelper.limit(boundSql.getSql(), rowBounds.getOffset(), rowBounds.getLimit());
            setFieldValue(boundSql, "sql", sql);
            System.out.println("========sql:" + sql);
        }
        // 清除翻页参数，禁止DefaultResultSetHandler#skipRows跳过结果集
        rowBounds = RowBounds.DEFAULT;
        return executor.query(ms, parameter, rowBounds, resultHandler, key, boundSql);
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
    }

    private int query(Executor executor, MappedStatement statement, Object parameter, BoundSql boundSql, String sql) {
        if (executor instanceof CachingExecutor) {
            executor = getFieldValue(executor, "delegate");
        }
        if (executor instanceof SimpleExecutor) {
            try {
                BoundSql newBoundSql = new BoundSql(statement.getConfiguration(), sql, boundSql.getParameterMappings(),
                        boundSql.getParameterObject());
                setFieldValue(newBoundSql, "metaParameters", getFieldValue(boundSql, "metaParameters"));
                MappedStatement newStatement = copyFromMappedStatement(statement, newBoundSql);
                List<Integer> result = ((SimpleExecutor) executor).doQuery(newStatement, parameter, RowBounds.DEFAULT,
                        Executor.NO_RESULT_HANDLER, newBoundSql);
                if (result.size() == 1) {
                    return result.get(0);
                }
            } catch (SQLException e) {
                String error = "query count total rows failure, origin sql:{"
                        + boundSql.getSql() + "}, generated sql:{"
                        + sql + "}";
//                ExceptionLog.print(error, e);
            }
        }
        return 0;
    }

    private MappedStatement copyFromMappedStatement(MappedStatement ms, final BoundSql newBoundSql) {
        // 参考MapperBuilderAssistant
        MappedStatement.Builder statementBuilder = new MappedStatement.Builder(ms.getConfiguration(), ms.getId()
                + "-Count", new SqlSource() {
            @Override
            public BoundSql getBoundSql(Object parameterObject) {
                return newBoundSql;
            }
        }, ms.getSqlCommandType());
        statementBuilder.resource(ms.getResource());
        statementBuilder.fetchSize(ms.getFetchSize());
        statementBuilder.statementType(ms.getStatementType());
        statementBuilder.keyGenerator(ms.getKeyGenerator());
        statementBuilder.keyProperty(join(ms.getKeyProperties()));
        statementBuilder.keyColumn(join(ms.getKeyColumns()));
        statementBuilder.databaseId(ms.getDatabaseId());
        statementBuilder.lang(ms.getLang());
        statementBuilder.resultOrdered(ms.isResultOrdered());
        statementBuilder.resultSets(join(ms.getResultSets()));
        // setStatementTimeout
        statementBuilder.timeout(ms.getTimeout());
        // setStatementParameterMap
        statementBuilder.parameterMap(ms.getParameterMap());
        // setStatementResultMap
        statementBuilder.resultSetType(ms.getResultSetType());
        // setStatementCache
        statementBuilder.flushCacheRequired(ms.isFlushCacheRequired());
        statementBuilder.useCache(ms.isUseCache());
        statementBuilder.cache(ms.getCache());
        // 修改结果集类型为int
        ResultMap resultMap = new ResultMap.Builder(ms.getConfiguration(), "Count", Integer.class,
                new ArrayList<>(), null).build();
        statementBuilder.resultMaps(Lists.newArrayList(resultMap));
        return statementBuilder.build();
    }

    private String join(String[] items) {
        if (items == null || items.length == 0) {
            return null;
        }
        return StringUtil.join(items);
    }

    public static void setFieldValue(Object object, String fieldName, Object value) {
        Field field = ReflectionUtils.findField(object.getClass(), fieldName);
        if (field == null) {
            throw new IllegalArgumentException("Could not find field [" + fieldName + "] on target [" + object + "]");
        }
        ReflectionUtils.makeAccessible(field);
        ReflectionUtils.setField(field, object, value);
    }

    @SuppressWarnings("unchecked")
    public static <T> T getFieldValue(Object object, String fieldName) {
        Field field = ReflectionUtils.findField(object.getClass(), fieldName);
        if (field == null) {
            throw new IllegalArgumentException("Could not find field [" + fieldName + "] on target [" + object + "]");
        }
        ReflectionUtils.makeAccessible(field);
        return (T) ReflectionUtils.getField(field, object);
    }

}
