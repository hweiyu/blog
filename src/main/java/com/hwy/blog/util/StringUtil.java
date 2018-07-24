package com.hwy.blog.util;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/22 14:47
 **/
public class StringUtil {

    public static boolean isEmpty(String str) {
        return null == str || "".equals(str);
    }

    public static String join(String[] arr) {
        if (null == arr || arr.length == 0) {
            return null;
        }
        StringBuilder buf = new StringBuilder(256);
        for (String str : arr) {
            buf.append(",").append(str);
        }
        return buf.substring(1);
    }
}
