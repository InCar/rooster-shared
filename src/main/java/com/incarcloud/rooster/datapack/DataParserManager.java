package com.incarcloud.rooster.datapack;

import java.util.HashMap;
import java.util.Map;

/**
 * DataParser工厂
 *
 * @author Aaric, created on 2017-06-27T17:11.
 * @since 2.0
 */
public class DataParserFactory {

    /**
     * 解析器关系
     */
    private static Map<String, Class> dataParserMap = new HashMap<>();

    /**
     * 注册解析器类
     *
     * @param tag tag
     * @param clazz class
     */
    public static void register(String tag, Class clazz) {
        dataParserMap.put(tag, clazz);
    }

    /**
     * 获得解析类
     *
     * @param tag
     * @return
     */
    public static Class getDataParserClass(String tag) {
        return dataParserMap.get(tag);
    }

    private DataParserFactory() {};
}
