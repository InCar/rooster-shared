package com.incarcloud.rooster.dispatch;

import com.incarcloud.rooster.datapack.DataPack;

import java.util.List;

/**
 * 数据提取器接口
 *
 * @author Aaric, created on 2017-06-27T13:32.
 * @since 1.0-SNAPSHOT
 */
public interface IDataExtractor {

    /**
     * 提取
     *
     * @param dataPack 数据包
     * @return
     */
    List<DataPackTarget> extract(DataPack dataPack);
}
