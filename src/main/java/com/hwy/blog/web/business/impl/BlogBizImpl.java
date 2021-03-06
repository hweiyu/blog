package com.hwy.blog.web.business.impl;

import com.hwy.blog.web.business.BlogBiz;
import com.hwy.blog.web.dto.res.BlogRes;
import com.hwy.blog.core.model.Blog;
import com.hwy.blog.core.service.BlogService;
import com.hwy.blog.util.LangUtil;
import com.hwy.blog.web.dto.req.BlogReq;
import com.hwy.blog.web.dto.res.PageRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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
    public PageRes<BlogRes> list(BlogReq blogReq) {
        Optional<List<Blog>> blogList = blogService.select(new Blog(), blogReq.getPage());
        List<BlogRes> data = LangUtil.transform(blogList.orElse(null), new Function<Blog, BlogRes>() {
            @Override
            public BlogRes apply(Blog blog) {
                return BlogRes.get(blog);
            }
        });
        return PageRes.create(data, blogReq.getPage());
    }
}
