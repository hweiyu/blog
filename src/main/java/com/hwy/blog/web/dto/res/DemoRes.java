package com.hwy.blog.web.dto.res;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 11:47
 **/
public class DemoRes extends BaseRes {

    private static final long serialVersionUID = 6318696761616344011L;

    public DemoRes(String message) {
        this.message = message;
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
