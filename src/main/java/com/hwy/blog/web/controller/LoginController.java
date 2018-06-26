package com.hwy.blog.web.controller;

import com.hwy.blog.exception.BlogException;
import com.hwy.blog.web.business.LoginBiz;
import com.hwy.blog.web.dto.BlogResult;
import com.hwy.blog.web.dto.req.LoginReq;
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
 * @date 2018/6/14 14:05
 **/
@RestController
@RequestMapping("${api.url.prefix}")
@Api(description = "登录接口")
public class LoginController extends BaseController {

    @Autowired
    private LoginBiz loginBiz;

    @PostMapping(value = "login")
    @ApiOperation(value = "校验登录", notes = "校验登录")
    public BlogResult<String> login(@RequestBody LoginReq req) {
        boolean res = true;
        String errMsg = "";
        try {
            res = loginBiz.checkLogin(req);
        } catch (BlogException e) {
            errMsg = e.getMessage();
        }
        return create(res, errMsg, null);
    }
}
