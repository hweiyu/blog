package com.hwy.blog.core.model;

public class Blog extends BaseModel {

    /**
     * 标题
	 */
	private String topic;

    /**
     * 内容
	 */
	private String context;

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
}