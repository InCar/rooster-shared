package com.incarcloud.rooster.dispatch;

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
     * 通知
     */
    private String _notice;

    public DataPackTarget(ETargetType targetType, DataTarget dataTarget, String notice) {
        _targetType = targetType;
        _dataTarget = dataTarget;
        _notice = notice;
    }

    public ETargetType getTargetType() {
        return _targetType;
    }

    public DataTarget getDataTarget() {
        return _dataTarget;
    }

    public String getNotice() {
        return _notice;
    }
}
