package com.anthony.util;

/**
 * Created by Anthony on 2019/9/8 22:43
 */
public class StringUtils {


    private StringUtils() {

    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static String reverse(String str) {
        if (str == null || str.length() == 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

}
