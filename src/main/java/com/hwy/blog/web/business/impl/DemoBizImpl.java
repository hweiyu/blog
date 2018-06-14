package com.hwy.blog.web.business.impl;

import com.hwy.blog.web.business.DemoBiz;
import com.hwy.blog.core.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 9:15
 **/
@Service
public class DemoBizImpl implements DemoBiz {

    @Autowired
    private DemoService demoService;
}
