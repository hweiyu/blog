package com.hwy.blog.controller;

import com.hwy.blog.business.DemoBiz;
import com.hwy.blog.dto.BlogResult;
import com.hwy.blog.dto.res.DemoRes;
import com.hwy.blog.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 9:15
 **/
@RestController
public class DemoController {

    @Autowired
    private DemoBiz demoBiz;

    @RequestMapping(value = "demo")
    public BlogResult<DemoRes> demo() {
        return ResultUtil.success(new DemoRes("this is demo api"));
    }
}
