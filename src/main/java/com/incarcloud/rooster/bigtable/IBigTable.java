package com.incarcloud.rooster.bigtable;/**
 * Created by fanbeibei on 2017/7/5.
 */

import com.incarcloud.rooster.datatarget.DataTarget;

/**
 * @author Fan Beibei
 * @Description: bigtable 操作抽象接口
 * @date 2017/7/5 9:43
 */
public interface IBigTable {

    /**
     * 保存数据
     * @param rowKey 行健
     * @param data 数据
     * @param tableName 表格名
     * @throws Exception
     */
    public void save(String rowKey, DataTarget data, String tableName) throws Exception;


    /**
     * 关闭，回收资源
     */
    public  void close();



}
