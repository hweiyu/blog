package com.hwy.blog.exception;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/15 14:45
 **/
public class BlogException extends RuntimeException {

    private static final long serialVersionUID = 3475730047623279947L;

    public BlogException(String message) {
        super(message);
    }
}
