package com.incarcloud.rooster.datapack;

import com.incarcloud.rooster.datatarget.DataTarget;

/**
 * 数据提取包
 *
 * @author Aaric, created on 2017-06-27T13:47.
 * @since 2.0
 */
public class DataPackTarget {

    /**
     * 数据对象类型
     */
    private ETargetType _targetType;
    /**
     * 数据对象
     */
    private DataTarget _dataTarget;
    /**
     * 消息内容（如果为空，忽略）
     */
    private String _msg;

    public DataPackTarget(ETargetType targetType, DataTarget dataTarget, String msg) {
        _targetType = targetType;
        _dataTarget = dataTarget;
        _msg = msg;
    }

    public ETargetType getTargetType() {
        return _targetType;
    }

    public DataTarget getDataTarget() {
        return _dataTarget;
    }

    public String getMsg() {
        return _msg;
    }
}
