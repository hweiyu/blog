package com.hwy.blog.web.business.impl;

import com.hwy.blog.core.model.Login;
import com.hwy.blog.core.service.LoginService;
import com.hwy.blog.exception.BlogException;
import com.hwy.blog.util.Md5Util;
import com.hwy.blog.web.business.LoginBiz;
import com.hwy.blog.web.dto.req.LoginReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 14:03
 **/
@Service
public class LoginBizImpl implements LoginBiz {

    @Autowired
    private LoginService loginService;

    @Override
    public boolean checkLogin(LoginReq req) {
        Optional<Login> opt = loginService.getByLoginName(req.getLoginName());
        if (opt.isPresent()) {
            String md5Password = Md5Util.getMD5(req.getPassword());
            if (!req.getPassword().equals(md5Password)) {
                throw new BlogException("密码不正确");
            }
            return true;
        }
        throw new BlogException("账户不存在");
    }
}
