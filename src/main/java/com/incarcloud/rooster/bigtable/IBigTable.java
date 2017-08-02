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
    public void saveDataPackObject(String rowKey, DataPackObject data) throws Exception;


    /**
     * 保存vin码
     * @param vin
     */
    public void saveVin(String vin);
    
    /**
     * 关闭，回收资源
     */
    public  void close();
}
