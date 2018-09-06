package com.incarcloud.rooster.bigtable;


import com.incarcloud.rooster.datapack.DataPackObject;

import java.util.Date;
import java.util.List;

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
     * 保存车架号
     *
     * @param vin 车架号
     */
    void saveVin(String vin) throws Exception;

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
     * 关闭，回收资源
     */
    void close();
}
