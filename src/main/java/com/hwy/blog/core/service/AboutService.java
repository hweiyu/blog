package com.hwy.blog.core.service;

import com.hwy.blog.core.model.About;

import java.util.Optional;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 13:58
 **/
public interface AboutService {

    Optional<About> get();
}
