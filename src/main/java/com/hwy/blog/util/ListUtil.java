package com.hwy.blog.util;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/26 11:52
 **/
public class ListUtil {

    public static <T> T getFisrt(List<T> list) {
        if (null != list && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    public static <T> List<T> nullToEmptyList(List<T> list) {
        return null == list ? Lists.newArrayList() : list;
    }
}
