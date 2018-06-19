package com.hwy.blog.core.base;

import java.util.List;
import java.util.Optional;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/15 9:08
 **/
public interface BaseService<T> {

    int insert(T model);

    int delete(T model);

    int update(T model);

    Optional<List<T>> select(T model);

    Optional<T> get(T model);
}
