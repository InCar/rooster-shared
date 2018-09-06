package com.incarcloud.rooster.cache;

import java.util.Set;

/**
 * 缓存管理器
 *
 * @author Aaric, created on 2018-01-10T16:54.
 * @since 2.1.12-SNAPSHOT
 */
public interface ICacheManager {

    /**
     * 设置缓存数据
     *
     * @param key   键名
     * @param value 键值
     */
    void set(String key, String value);

    /**
     * 设置缓存数据
     *
     * @param key     键名
     * @param value   键值
     * @param timeout 超时时间，单位：秒
     */
    void set(String key, String value, int timeout);

    /**
     * 根据key获取数据
     *
     * @param key 键名
     * @return
     */
    String get(String key);

    /**
     * 根据key移除数据
     *
     * @param key 键名
     */
    void delete(String key);

    /**
     * 设置超时时间
     *
     * @param key     键名
     * @param timeout 超时时间，单位：秒
     */
    void expire(String key, int timeout);

    /**
     * 模糊查询键集合
     *
     * @param pattern 查询条件
     * @return
     */
    Set<String> keys(String pattern);

    /**
     * 设置缓存数据-hash结构
     *
     * @param key     键名
     * @param hashKey hash键名
     * @param value   键值
     */
    void hset(String key, String hashKey, String value);

    /**
     * 根据key获取数据-hash结构
     *
     * @param key     键名
     * @param hashKey hash键名
     */
    String hget(String key, String hashKey);

    /**
     * 根据key移除数据-hash结构
     *
     * @param key     键名
     * @param hashKey hash键名
     */
    void hdelete(String key, String hashKey);

    /**
     * 根据key查询容量-hash结构
     *
     * @param key 键名
     */
    long hsize(String key);

    /**
     * 设置缓存数据-geo结构
     *
     * @param key       键名
     * @param flagKey   flag键名
     * @param longitude 经度
     * @param latitude  纬度
     */
    void gset(String key, String flagKey, double longitude, double latitude);

    /**
     * 根据key获取数据-geo结构
     *
     * @param key     键名
     * @param flagKey flag键名
     */
    double[] gget(String key, String flagKey);

    /**
     * 根据key移除数据-geo结构
     *
     * @param key     键名
     * @param flagKey flag键名
     */
    void gdelete(String key, String flagKey);

    /**
     * 从左边插入数据-list结构
     *
     * @param key   键名
     * @param value 键值
     * @version 2.3.0-SNAPSHOT
     */
    void lpush(String key, String value);

    /**
     * 从右边获取数据-list结构
     *
     * @param key 键名
     * @return
     * @version 2.3.0-SNAPSHOT
     */
    String rpop(String key);

    /**
     * 获取集合大小-list结构
     *
     * @param key 键名
     * @return
     * @version 2.3.0-SNAPSHOT
     */
    long llen(String key);
}
