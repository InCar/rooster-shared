package com.incarcloud.rooster.bigtable;


import com.incarcloud.rooster.datapack.DataPackObject;

import java.util.Date;
import java.util.List;

/**
 * @author Fan Beibei
 * @Description: bigtable 操作抽象接口
 * @date 2017/7/5 9:43
 */
public interface IBigTable {

    /**
     * 保存采集的数据
     *
     * @param rowKey      行健
     * @param data        数据
     * @param receiveTime 二级索引用接收时间时间生成便于同步数据
     * @throws Exception
     */
    void saveDataPackObject(String rowKey, DataPackObject data, Date receiveTime) throws Exception;

    /**
     * 保存vin码
     *
     * @param vin
     */
    void saveVin(String vin) throws Exception;

    /**
     * 根据开始时间RowKey循环读取数据到INF_MAX
     *
     * @param startTimeRowKey 开始时间RowKey，格式：DETECTIONTIME_yyyyMMddHHmmss_#######################################
     * @param dataReadable    读取数据接口
     * @return 读取完毕后的最后一个RowKey字符串
     * @see com.incarcloud.rooster.util.RowKeyUtil#makeMinDetectionTimeIndexRowKey(String)
     */
    String queryData(String startTimeRowKey, IDataReadable dataReadable);

    /**
     * 查询索引表获得最新同步时间点
     *
     * @return 时间戳
     */
    long queryLatestTimeMillis();

    /**
     * 查询并读取处理指定时间点数据（某一秒的数据）
     *
     * @param queryTime    指定时间点
     * @param dataReadable 读取数据接口
     * @return
     */
    boolean queryData(Date queryTime, IDataReadable dataReadable);

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

    /**
     * 大数据读取接口
     */
    interface IDataReadable {

        /**
         * 读取数据
         *
         * @param object 数据流
         */
        void onRead(Object object);
    }
}
