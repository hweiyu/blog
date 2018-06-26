package com.hwy.blog.web.dto.res;

import com.google.common.collect.Lists;
import com.hwy.blog.page.Page;
import com.hwy.blog.util.ListUtil;
import com.hwy.blog.web.dto.PageDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/22 15:36
 **/
@Getter
@Setter
public class PageRes<T> extends PageDto {

    private static final long serialVersionUID = -3935670522954979562L;

    private List<T> list;

    public PageRes() {

    }

    public static <T> PageRes<T> create(Page page) {
        return create(Lists.newArrayList(), page);
    }

    public static <T> PageRes<T> create(List<T> list, Page page) {
        PageRes<T> result = new PageRes<>();
        result.setList(ListUtil.nullToEmptyList(list));
        result.setPage(page);
        return result;
    }
}
