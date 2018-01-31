package com.incarcloud.rooster.util;/**
 * Created by fanbeibei on 2017/7/4.
 */

/**
 * @author Fan Beibei
 * @Description: 描述
 * @date 2017/7/4 17:07
 */
public class StringUtil {

    /**
     *  是否为空或空白字符
     * @param s
     * @return
     */
    public static  boolean isBlank(String s){
        if(null == s || "".equals(s.trim())){
            return true;
        }

        return false;

    }
}
