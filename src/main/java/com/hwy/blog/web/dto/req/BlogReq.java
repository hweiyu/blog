package com.hwy.blog.web.dto.req;

import com.hwy.blog.web.dto.PageDto;
import lombok.Getter;
import lombok.Setter;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/22 15:06
 **/
@Getter
@Setter
public class BlogReq extends PageDto {

    private static final long serialVersionUID = 791824195102835115L;

    private String label;
}
