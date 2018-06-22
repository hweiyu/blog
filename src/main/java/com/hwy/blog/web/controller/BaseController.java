package com.hwy.blog.web.controller;

import com.hwy.blog.util.ResultUtil;
import com.hwy.blog.web.dto.BlogResult;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/22 15:45
 **/
public class BaseController {

    public static <T> BlogResult<T> success(T data) {
        return ResultUtil.success(data);
    }

    public static <T> BlogResult<T> error(String message) {
        return error(message, null);
    }

    public static <T> BlogResult<T> error(String message, T data) {
        return ResultUtil.error(message, data);
    }

    public static <T> BlogResult<T> create(boolean res, String message, T data) {
        return ResultUtil.create(res, message, data);
    }
}
