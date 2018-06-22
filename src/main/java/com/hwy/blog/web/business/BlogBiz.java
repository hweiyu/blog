package com.hwy.blog.web.business;

import com.hwy.blog.web.dto.res.BlogRes;
import com.hwy.blog.web.dto.req.BlogReq;
import com.hwy.blog.web.dto.res.PageRes;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 14:02
 **/
public interface BlogBiz {

    PageRes<BlogRes> list(BlogReq blogReq);
}
