package com.hwy.blog.web.dto;

import com.hwy.blog.page.Page;
import lombok.Getter;
import lombok.Setter;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/22 15:03
 **/
@Getter
@Setter
public class PageDto extends Dto {

    private static final long serialVersionUID = 6715759564671684902L;

    private Page page;
}
