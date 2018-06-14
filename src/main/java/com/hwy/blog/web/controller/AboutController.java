package com.hwy.blog.web.controller;

import com.hwy.blog.util.ResultUtil;
import com.hwy.blog.web.business.AboutBiz;
import com.hwy.blog.web.dto.BlogResult;
import com.hwy.blog.web.dto.res.AboutRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 14:03
 **/
@RestController
public class AboutController {

    @Autowired
    private AboutBiz aboutBiz;

    @RequestMapping(value = "about/get")
    public BlogResult<AboutRes> get() {
        return ResultUtil.success(aboutBiz.get());
    }
}
