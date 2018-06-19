package com.hwy.blog.core.service.impl;

import com.hwy.blog.core.dao.LoginDao;
import com.hwy.blog.core.model.Login;
import com.hwy.blog.core.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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
        return get(Login.builder().loginName(loginName).build());
    }

    @Override
    public int insert(Login model) {
        return 0;
    }

    @Override
    public int delete(Login model) {
        return 0;
    }

    @Override
    public int update(Login model) {
        return 0;
    }

    @Override
    public Optional<List<Login>> select(Login model) {
        return Optional.empty();
    }

    @Override
    public Optional<Login> get(Login model) {
        return Optional.ofNullable(loginDao.get(model));
    }
}
