package com.smart.util;

import java.util.Collection;
import java.util.Map;

/**
 * 集合工具类
 * Created by wang on 2017/7/15.
 */
public class CollectionUtil {
    /**
     * 判断是Collection否为空
     */
    public static boolean isEmpty(Collection<?> collection){
        return CollectionUtils.isEmpty(collection);
    }

    /**
     * 判断是Collection否为非空
     */
    public static boolean isNotEmpty(Collection<?> collection){
        return !isEmpty(collection);
    }

    /**
     * 判断map是否为空
     */
    public static boolean isEmpty(Map<?,?> map){
        return MapUtils.isEmpty(map);
    }

    /**
     * 判断map是否为非空
     */
    public static boolean isNotEmpty(Map<?,?> map){
        return !isEmpty(map);
    }

}
