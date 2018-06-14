package com.hwy.blog.business.impl;

import com.hwy.blog.business.BlogBiz;
import com.hwy.blog.dto.res.BlogRes;
import com.hwy.blog.model.Blog;
import com.hwy.blog.service.BlogService;
import com.hwy.blog.util.LangUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 14:02
 **/
@Service
public class BlogBizImpl implements BlogBiz {

    @Autowired
    private BlogService blogService;

    @Override
    public List<BlogRes> list() {
        List<Blog> blogList = blogService.list();
        return LangUtil.transform(blogList, new Function<Blog, BlogRes>() {
            @Override
            public BlogRes apply(Blog blog) {
                return BlogRes.get(blog);
            }
        });
    }
}
