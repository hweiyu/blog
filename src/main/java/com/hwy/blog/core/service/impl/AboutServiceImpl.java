package com.hwy.blog.core.service.impl;

import com.hwy.blog.core.dao.AboutDao;
import com.hwy.blog.core.model.About;
import com.hwy.blog.core.service.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 13:59
 **/
@Service
public class AboutServiceImpl implements AboutService {

    @Autowired
    private AboutDao aboutDao;

    @Override
    public Optional<About> get() {
        return Optional.ofNullable(aboutDao.get(null));
    }
}
