package com.incarcloud.rooster.datapack;

/**
 * 数据对象类型
 *
 * @author Aaric, created on 2017-06-27T11:50.
 * @since 2.0
 */
public enum ETargetType {

    /**
     * 整车数据
     */
    OVERVIEW,
    /**
     * 电池数据
     */
    BATTERY,
    /**
     * 驱动电机数据
     */
    MOTOR,
    /**
     * 发动机数据
     */
    ENGINE,
    /**
     * 位置数据
     */
    POSITION,
    /**
     * 极值数据
     */
    PEAK,
    /**
     * 报警数据
     */
    ALARM,
    /**
     * 上报设备信息
     */
    DEVICE
}
