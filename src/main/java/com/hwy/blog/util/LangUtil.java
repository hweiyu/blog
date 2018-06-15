package com.hwy.blog.util;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 14:25
 **/
public class LangUtil {

    public static int nvl(Integer i, int defaults) {
        return i == null ? defaults : i;
    }

    public static long nvl(Long l, long defaults) {
        return l == null ? defaults : l;
    }

    public static boolean nvl(Boolean b, boolean defaults) {
        return b == null ? defaults : b;
    }

    public static boolean nvl(String bool, boolean defaults) {
        return bool == null ? defaults : Boolean.parseBoolean(bool);
    }

    public static String nvl(String string, String defaults) {
        return string == null ? defaults : string;
    }

    public static <F, T> List<T> transform(List<F> fromList, Function<? super F, ? extends T> function) {
        List<T> result = Lists.newArrayList();
        if (null != fromList) {
            for (F input : fromList) {
                result.add(function.apply(input));
            }
        }
        return result;
    }

    public static <T> List<T> filter(List<T> fromList, Predicate<? super T> predicate) {
        List<T> result = Lists.newArrayList();
        if (null != fromList) {
            for (T input : fromList) {
                if (predicate.test(input)) {
                    result.add(input);
                }
            }
        }
        return result;
    }

    public static List<Long> longList(List<String> stringList) {
        List<Long> result = Lists.newArrayList();
        for (String string : stringList) {
            result.add(Long.valueOf(string));
        }
        return result;
    }

    public static <T> T getFisrt(List<T> list) {
        if (null != list && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }
}
