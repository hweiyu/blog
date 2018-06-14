package com.hwy.blog.dao;

import java.util.List;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 9:10
 **/
public interface BaseDao<T> {

    int insert(T model);

    int delete(T model);

    int update(T model);

    List<T> select(T model);

    T get(T model);
}
