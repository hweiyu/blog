package com.hwy.blog.core.service.impl;

import com.hwy.blog.core.dao.BlogDao;
import com.hwy.blog.core.model.Blog;
import com.hwy.blog.core.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 14:00
 **/
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogDao blogDao;

    @Override
    public List<Blog> list() {
        return blogDao.select(null);
    }
}
