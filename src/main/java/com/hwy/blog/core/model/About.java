package com.hwy.blog.core.model;

public class About extends BaseModel {

    /**
     * 手机
	 */
	private String phone;

    /**
     * QQ
	 */
	private String qq;

    /**
     * 邮箱
	 */
	private String email;

    /**
     * 介绍内容
	 */
	private String context;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
}