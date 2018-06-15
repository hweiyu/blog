package com.hwy.blog.web.controller;

import com.hwy.blog.exception.BlogException;
import com.hwy.blog.util.ResultUtil;
import com.hwy.blog.web.business.LoginBiz;
import com.hwy.blog.web.dto.BlogResult;
import com.hwy.blog.web.dto.req.LoginReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 14:05
 **/
@RestController
public class LoginController {

    @Autowired
    private LoginBiz loginBiz;

    @PostMapping(value = "login")
    public BlogResult<String> login(@RequestBody LoginReq req) {
        boolean res = true;
        String errMsg = "";
        try {
            res = loginBiz.checkLogin(req);
        } catch (BlogException e) {
            errMsg = e.getMessage();
        }
        return ResultUtil.create(res, errMsg, null);
    }
}
