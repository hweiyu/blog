package com.hwy.blog.core.service.impl;

import com.hwy.blog.core.dao.LoginDao;
import com.hwy.blog.core.model.Login;
import com.hwy.blog.core.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 14:01
 **/
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    @Override
    public Optional<Login> getByLoginName(String loginName) {
        Login login = loginDao.get(Login.builder()
                .loginName(loginName)
                .build());
        return Optional.ofNullable(login);
    }
}
