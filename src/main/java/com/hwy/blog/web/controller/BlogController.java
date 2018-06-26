package com.hwy.blog.web.controller;

import com.hwy.blog.web.business.BlogBiz;
import com.hwy.blog.web.dto.BlogResult;
import com.hwy.blog.web.dto.res.BlogRes;
import com.hwy.blog.web.dto.req.BlogReq;
import com.hwy.blog.web.dto.res.PageRes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 14:04
 **/
@RestController
@RequestMapping("${api.url.prefix}")
@Api(description = "博客接口")
public class BlogController extends BaseController {

    @Autowired
    private BlogBiz blogBiz;

    @PostMapping(value = "blog/list")
    @ApiOperation(value = "获取博客列表", notes = "获取博客列表")
    public BlogResult<PageRes<BlogRes>> list(@RequestBody BlogReq blogReq) {
        return success(blogBiz.list(blogReq));
    }
}
