package com.hwy.blog.util;

import java.util.List;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/15 14:48
 **/
public class CollectionUtil {

    public static <T> T getFisrt(List<T> col) {
        if (null != col && !col.isEmpty()) {
            return col.get(0);
        }
        return null;
    }
}
