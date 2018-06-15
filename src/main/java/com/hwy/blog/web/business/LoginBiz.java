package com.hwy.blog.web.business;

import com.hwy.blog.web.dto.req.LoginReq;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 14:02
 **/
public interface LoginBiz {

    boolean checkLogin(LoginReq req);
}
