package com.hwy.blog.web.controller;

import com.hwy.blog.web.business.BlogBiz;
import com.hwy.blog.web.dto.BlogResult;
import com.hwy.blog.web.dto.res.BlogRes;
import com.hwy.blog.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 14:04
 **/
@RestController
public class BlogController {

    @Autowired
    private BlogBiz blogBiz;

    @RequestMapping(value = "blog/list")
    public BlogResult<List<BlogRes>> list() {
        return ResultUtil.success(blogBiz.list());
    }
}
