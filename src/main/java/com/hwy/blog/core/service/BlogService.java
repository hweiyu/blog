package com.hwy.blog.core.service;

import com.hwy.blog.core.model.Blog;

import java.util.List;
import java.util.Optional;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 13:59
 **/
public interface BlogService {

    Optional<List<Blog>> list();
}
