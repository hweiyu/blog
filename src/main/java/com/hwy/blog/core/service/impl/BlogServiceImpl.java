package com.hwy.blog.core.service.impl;

import com.hwy.blog.core.dao.BlogDao;
import com.hwy.blog.core.model.Blog;
import com.hwy.blog.core.service.BlogService;
import com.hwy.blog.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public int insert(Blog model) {
        return 0;
    }

    @Override
    public int delete(Blog model) {
        return 0;
    }

    @Override
    public int update(Blog model) {
        return 0;
    }

    @Override
    public Optional<List<Blog>> select(Blog model, Page page) {
        return Optional.ofNullable(blogDao.select(model, page));
    }

    @Override
    public Optional<Blog> get(Blog model) {
        return Optional.empty();
    }
}
