package com.incarcloud.rooster.bigtable;

import com.incarcloud.rooster.datapack.DataPackObject;

/**
 * @author Fan Beibei
 * @Description: bigtable 操作抽象接口
 * @date 2017/7/5 9:43
 */
public interface IBigTable {

    /**
     * 保存采集的数据
     * @param rowKey 行健
     * @param data 数据
     * @throws Exception
     */
    void saveDataPackObject(String rowKey, DataPackObject data) throws Exception;

    /**
     * 保存vin码
     * @param vin
     */
    void saveVin(String vin)throws Exception;

    /**
     * 根据开始时间字符串查询开始时间RowKey
     *
     * @param startTimeString 开始时间字符串
     * @return
     */
    String queryRowKey(String startTimeString);

    /**
     * 根据开始时间点循环读取数据
     *
     * @param startTimeRowKey 开始时间RowKey
     * @param dataReadable 读取数据接口
     * @return
     */
    String queryData(String startTimeRowKey, IDataReadable dataReadable);
    
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
