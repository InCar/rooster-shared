package com.incarcloud.rooster.bigtable;

import com.incarcloud.rooster.datapack.DataPackObject;
import com.incarcloud.rooster.datapack.DataPackPosition;

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
     * @param recieveTime 二级索引用接收时间时间生成便于同步数据
     * @throws Exception
     */
    void saveDataPackObject(String rowKey, DataPackObject data, Date recieveTime) throws Exception;

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
     *                        @see com.incarcloud.rooster.util.RowKeyUtil#makeMinDetectionTimeIndexRowKey(String)
     * @param dataReadable    读取数据接口
     * @return 读取完毕后的最后一个RowKey字符串
     */
    String queryData(String startTimeRowKey, IDataReadable dataReadable);

    /**
     * 查询位置数据列表
     *
     * @param vinOrCode 据vin码或设备号
     * @param startTime 查询开始时间
     * @param endTime　查询结束时间
     * @return 位置数据集合
     */
    List<DataPackPosition> queryLocationData(String vinOrCode, Date startTime, Date endTime);

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
