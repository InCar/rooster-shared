package com.incarcloud.rooster.datapack;

/**
 * 数据提取包
 *
 * @author Aaric, created on 2017-06-27T13:47.
 * @since 2.0
 */
public class DataPackTarget {

    /**
     * 数据对象
     */
    private DataPackObject _dataPackObject;
    /**
     * 消息内容（如果为空，忽略）
     */
    private String _msg;

    public DataPackTarget(DataPackObject dataPackObject) {
        _dataPackObject = dataPackObject;
    }

    public DataPackTarget(DataPackObject dataPackObject, String msg) {
        _dataPackObject = dataPackObject;
        _msg = msg;
    }

    public DataPackObject getDataPackObject() {
        return _dataPackObject;
    }

    public String getMsg() {
        return _msg;
    }

    @Override
    public String toString() {
        return "DataPackTarget{" +
                "_dataPackObject=" + _dataPackObject +
                ", _msg='" + _msg + '\'' +
                '}';
    }
}
