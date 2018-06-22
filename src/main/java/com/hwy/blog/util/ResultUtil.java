package com.hwy.blog.util;

import com.hwy.blog.web.dto.BlogResult;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 9:26
 **/
public class ResultUtil {

    private static final String TRUE = Boolean.TRUE.toString();

    private static final String FLASE = Boolean.FALSE.toString();

    private static final String DEFAULT_CODE = "1";

    public static<T> BlogResult<T> success(T data) {
        BlogResult<T> result = new BlogResult<>();
        result.setResult(TRUE);
        result.setData(data);
        result.setCode(DEFAULT_CODE);
        return result;
    }

    public static <T> BlogResult<T> error(String message) {
        return error(message, null);
    }

    public static <T> BlogResult<T> error(String message, T data) {
        BlogResult<T> result = new BlogResult<>();
        result.setResult(FLASE);
        result.setMessage(message);
        result.setData(data);
        result.setCode(DEFAULT_CODE);
        return result;
    }

    public static <T> BlogResult<T> create(boolean res, String message, T data) {
        return res ? success(data) : error(message, data);
    }
}
