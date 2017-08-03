package com.incarcloud.rooster.bigtable;

import com.incarcloud.rooster.datapack.DataPackAlarm;
import com.incarcloud.rooster.datapack.DataPackOverview;
import com.incarcloud.rooster.datapack.DataPackPeak;
import com.incarcloud.rooster.datapack.DataPackPosition;

/**
 * 转移存储数据接口
 *
 * @author Aaric, created on 2017-08-03T15:11.
 * @since 2.0
 */
public interface ITransferStorage {

    /**
     * 存储位置数据
     *
     * @param dataPackPosition 原始位置数据
     */
    void storageLocation(DataPackPosition dataPackPosition);

    /**
     * 存储条件数据
     *
     * @param dataPackPeak 原始条件数据
     */
    void storageCondition(DataPackPeak dataPackPeak);

    /**
     * 存储报警数据
     *
     * @param dataPackAlarm 原始报警数据
     */
    void storageAlarm(DataPackAlarm dataPackAlarm);

    /**
     * 存储行驶数据
     *
     * @param dataPackOverview 原始行驶数据
     */
    void storageDrive(DataPackOverview dataPackOverview);
}
