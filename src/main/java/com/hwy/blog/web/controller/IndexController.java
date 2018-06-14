package com.hwy.blog.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/13 16:51
 **/
public class IndexController {

    @RequestMapping(value = "/")
    public String index() {
        return "/static/index.html";
    }
}
