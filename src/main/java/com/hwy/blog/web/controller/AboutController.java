package com.hwy.blog.web.controller;

import com.hwy.blog.web.business.AboutBiz;
import com.hwy.blog.web.dto.BlogResult;
import com.hwy.blog.web.dto.res.AboutRes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
@RequestMapping("${api.url.prefix}")
@Api(description = "关于我接口")
public class AboutController extends BaseController {

    @Autowired
    private AboutBiz aboutBiz;

    @PostMapping(value = "about/get")
    @ApiOperation(value = "获取关于我的数据", notes = "获取关于我的数据")
    public BlogResult<AboutRes> get() {
        return success(aboutBiz.get());
    }
}
