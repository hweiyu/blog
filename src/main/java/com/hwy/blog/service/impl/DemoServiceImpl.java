package com.hwy.blog.service.impl;

import com.hwy.blog.dao.DemoDao;
import com.hwy.blog.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 9:09
 **/
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao demoDao;
}
