package com.hwy.blog.web.business;

import com.hwy.blog.web.dto.res.BlogRes;

import java.util.List;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 14:02
 **/
public interface BlogBiz {

    List<BlogRes> list();
}