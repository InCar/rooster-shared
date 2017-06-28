package com.incarcloud.rooster.dispatch;

import com.incarcloud.rooster.datapack.DataPack;
import com.incarcloud.rooster.datapack.IDataParser;

import java.util.List;

/**
 * 数据分发器
 *
 * @author Aaric, created on 2017-06-27T11:25.
 * @since 2.0
 */
public class DataDispatch {

    /**
     * 数据包
     */
    private DataPack _dataPack;
    /**
     * 提取器，由协议解析方提供
     */
    private IDataParser _dataParser;

    /**
     * 构造函数
     *
     * @param dataPack 数据包
     * @param dataParser 解析器
     */
    public DataDispatch(DataPack dataPack, IDataParser dataParser) {
        if(null == dataPack) {
            throw new IllegalArgumentException("dataPack can't be null");
        }
        if(null == dataParser) {
            throw new IllegalArgumentException("dataParser can't be null");
        }
        _dataPack = dataPack;
        _dataParser = dataParser;
    }

    /**
     * 解析数据包完整消息体
     *
     * @return
     */
    public List<DataPackTarget> extractBody() {
        return _dataParser.extractBody(_dataPack);
    }
}
