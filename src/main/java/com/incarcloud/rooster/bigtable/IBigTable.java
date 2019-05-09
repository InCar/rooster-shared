package com.incarcloud.rooster.bigtable;


import com.incarcloud.rooster.datapack.DataPackObject;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 大数据操作抽象接口
 *
 * @author Aaric, updated on 2018-09-06T14:16.
 * @version 2.3.0-SNAPSHOT
 */
public interface IBigTable {

    /**
     * 保存车辆数据
     *
     * @param rowKey 行健
     * @param data   车辆数据，格式化json字符串保持
     * @throws Exception
     */
    void saveDataPackObject(String rowKey, DataPackObject data) throws Exception;

    /**
     * 批量保存车辆数据
     *
     * @param data 车辆数据
     * @throws Exception
     */
    void batchSaveDataPackObjects(Map<String, DataPackObject> data) throws Exception;

    /**
     * 根据行键获得车辆数据
     *
     * @param rowKey 行键
     * @param clazz  指定数据类型
     * @return
     */
    <T extends DataPackObject> T getData(String rowKey, Class<T> clazz);

    /**
     * 获得某个类型最新车辆数据，支持指定按照最早或最新排序
     *
     * @param vin   车架号
     * @param clazz 指定数据类型
     * @param sort  默认按照时间倒序，排序规则：按照时间升序或者倒序
     * @return
     */
    <T extends DataPackObject> T getData(String vin, Class<T> clazz, Sort sort);

    /**
     * 根据车架号和时间段查询原始数据列表
     *
     * @param vin       车架号
     * @param clazz     指定数据类型
     * @param startTime 查询开始时间
     * @param endTime   　查询结束时间
     * @return 数据集合
     */
    <T extends DataPackObject> List<T> queryData(String vin, Class<T> clazz, Date startTime, Date endTime);

    /**
     * 根据车架号和key分页查询原始数据列表
     *
     * @param vin      车架号
     * @param clazz    指定数据类型
     * @param pageSize 分页大小
     * @param startKey 起始RowKey
     * @return
     */
    <T extends DataPackObject> List<T> queryData(String vin, Class<T> clazz, Integer pageSize, String startKey);

    /**
     * 根据车架号、时间段分页查询数据列表
     *
     * @param vin       车架号
     * @param clazz     指定数据类型
     * @param sort      默认按照时间倒序，排序规则：按照时间升序或者倒序
     * @param startTime 查询开始时间，如果有startKey，startTime设置无效
     * @param endTime   查询结束时间
     * @param pageSize  分页大小
     * @param startKey  起始RowKey
     * @return
     */
    <T extends DataPackObject> List<T> queryData(String vin, Class<T> clazz, Sort sort, Date startTime, Date endTime, Integer pageSize, String startKey);

    /**
     * 关闭，回收资源
     */
    void close();

    /**
     * 排序规则
     */
    enum Sort {

        /**
         * 按照时间升序
         */
        ASC,

        /**
         * 按照时间倒序
         */
        DESC
    }
}
