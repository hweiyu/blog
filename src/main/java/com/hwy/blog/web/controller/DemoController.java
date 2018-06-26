package com.hwy.blog.web.controller;

import com.hwy.blog.web.business.DemoBiz;
import com.hwy.blog.web.dto.BlogResult;
import com.hwy.blog.web.dto.res.DemoRes;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
@RequestMapping("${api.url.prefix}")
@Api(description = "样例接口")
public class DemoController extends BaseController {

    @Autowired
    private DemoBiz demoBiz;

    @PostMapping(value = "demo")
    public BlogResult<DemoRes> demo() {
        return success(new DemoRes("this is demo api"));
    }
}
