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
    String queryMinTimeRowKey(String startTimeString);

    /**
     * 转移数据并存储数据
     *
     * @param startTimeRowKey 开始时间RowKey
     * @param transferStorage 转移与数据存储助手
     * @return
     */
    String transferToStorage(String startTimeRowKey, ITransferStorage transferStorage);
    
    /**
     * 关闭，回收资源
     */
    public  void close();
}
