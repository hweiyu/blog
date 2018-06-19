package com.hwy.blog.core.model;

import com.hwy.blog.core.base.BaseModel;

public class Image extends BaseModel {

	/**
	 * 关系id
	 */
	private Long relId;

    /**
     * 图片路径
	 */
	private String path;

    /**
     * 图片类型
	 */
	private Integer imgType;

	public Long getRelId() {
		return relId;
	}

	public void setRelId(Long relId) {
		this.relId = relId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getImgType() {
		return imgType;
	}

	public void setImgType(Integer imgType) {
		this.imgType = imgType;
	}
}