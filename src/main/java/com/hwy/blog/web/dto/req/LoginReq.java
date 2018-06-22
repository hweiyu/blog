package com.hwy.blog.web.dto.req;

import com.hwy.blog.web.dto.BaseReq;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/15 14:59
 **/
@Builder
@Getter
@Setter
public class LoginReq extends BaseReq {

    private static final long serialVersionUID = 4069419127250807562L;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 密码
     */
    private String password;
}
