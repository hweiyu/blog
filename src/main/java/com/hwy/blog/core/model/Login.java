package com.hwy.blog.core.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Login extends BaseModel {

    /**
     * 登录名
	 */
	private String loginName;

    /**
     * 密码
	 */
	private String password;

}