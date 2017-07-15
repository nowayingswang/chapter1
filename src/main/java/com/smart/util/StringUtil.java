package com.smart.util;

import org.apache.commons.lang3.StringUtils;

/**
 * 字符串操作类
 * Created by wang on 2017/7/15.
 */
public class StringUtil {

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    private static boolean isEmpty(String str) {
        if(str != null){
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }
}
