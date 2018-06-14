package com.hwy.blog.typeHandler;

import com.hwy.blog.enums.DataStatus;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 14:06
 **/
public class DataStatusTypeHandler implements TypeHandler<DataStatus> {

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, DataStatus dataStatus, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i, dataStatus.getStatus());
    }

    @Override
    public DataStatus getResult(ResultSet resultSet, String s) throws SQLException {
        int result = resultSet.getInt(s);
        return get(result);
    }

    @Override
    public DataStatus getResult(ResultSet resultSet, int i) throws SQLException {
        int result = resultSet.getInt(i);
        return get(result);
    }

    @Override
    public DataStatus getResult(CallableStatement callableStatement, int i) throws SQLException {
        int result = callableStatement.getInt(i);
        return get(result);
    }

    private DataStatus get(int status) {
        Optional<DataStatus> opt = DataStatus.of(status);
        return null != opt && opt.isPresent() ? opt.get() : null;
    }
}
