package com.smart.util;

/**
 * 类型转换
 * Created by wang on 2017/7/15.
 */
public class CastUtil {

    /**
     * 转为string型
     */
    public static String castString(Object obj){
        return castString(obj,"");
    }

    /**
     * 转为string型（提供默认值）
     */
    public static String castString(Object obj,String defaultValue){
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    /**
     * 转为int型
     */
    public static int castInt(Object obj) {
        return castInt(obj,0);
    }

    public static int castInt(Object obj,int defaultValue){
        int intValue = defaultValue;
        if(obj != null){
            String strValue = castString(obj);
            try {
                if(StringUtil.isNotEmpty(strValue)){
                    intValue = Integer.parseInt(strValue);
                }
            }catch (NumberFormatException e){
                intValue = defaultValue;
            }
        }
        return intValue;
    }

    /**
     * 转为boolean型
     */
    public static boolean castBoolean(Object obj) {
        return castBoolean(obj,false);
    }

    /**
     * 转为boolean型
     */
    public static boolean castBoolean(Object obj,boolean defaultValue){
        boolean booleanValue = defaultValue;
        if(obj != null){
            booleanValue = Boolean.parseBoolean(castString(obj));
        }
        return booleanValue;
    }
}
