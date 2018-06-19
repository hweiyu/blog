package com.hwy.blog.web.business.impl;

import com.hwy.blog.core.model.About;
import com.hwy.blog.core.service.AboutService;
import com.hwy.blog.web.business.AboutBiz;
import com.hwy.blog.web.dto.res.AboutRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 14:02
 **/
@Service
public class AboutBizImpl implements AboutBiz {

    @Autowired
    private AboutService aboutService;

    @Override
    public AboutRes get() {
        About empty = new About();
        return AboutRes.get(aboutService.get(empty).orElse(empty));
    }
}
