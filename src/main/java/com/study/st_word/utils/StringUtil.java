package com.study.st_word.utils;

/**
 * Created by wangyubing on 2019/3/29.
 */
public class StringUtil {

    public static boolean isNotEmpty(String str) {
        return str != null && str.length() > 0 && str.trim().length() > 0;
    }

    public static boolean isEmpty(String str) {
        return !isNotEmpty(str);
    }

    public static boolean isNotEmpty(Integer integer) {
        return integer != null && !integer.equals("");
    }

    public static boolean isEmpty(Integer integer) {
        return !isNotEmpty(integer);
    }
}
