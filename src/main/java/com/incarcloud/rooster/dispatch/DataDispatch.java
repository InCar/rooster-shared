package com.incarcloud.rooster.dispatch;

import com.incarcloud.rooster.datapack.DataPack;

import java.util.List;

/**
 * 数据分发器
 *
 * @author Aaric, created on 2017-06-27T11:25.
 * @since 1.0-SNAPSHOT
 */
public class DataDispatch {

    /**
     * 数据包
     */
    private DataPack _dataPack;
    /**
     * 提取器，由协议解析方提供
     */
    private IDataExtractor _dataExtractor;

    /**
     * 构造函数
     *
     * @param dataPack 数据包
     * @param dataExtractor 提取器
     */
    public DataDispatch(DataPack dataPack, IDataExtractor dataExtractor) {
        if(null == dataPack) {
            throw new IllegalArgumentException("dataPack can't be null");
        }
        if(null == dataExtractor) {
            throw new IllegalArgumentException("dataExtractor can't be null");
        }
        _dataPack = dataPack;
        _dataExtractor = dataExtractor;
    }

    public List<DataPackTarget> extract() {
        return _dataExtractor.extract(_dataPack);
    }
}
