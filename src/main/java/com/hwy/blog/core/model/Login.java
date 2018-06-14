package com.hwy.blog.core.model;

public class Login extends BaseModel {

    /**
     * 登录名
	 */
	private String loginName;

    /**
     * 密码
	 */
	private String password;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}