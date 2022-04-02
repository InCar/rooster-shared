package com.incarcloud.rooster.gather.cmd;

/**
 * 下发短信车辆的命令类型
 *
 * @author Kong, created on 2019-07-01T16:12.
 * @version 1.0.0-SNAPSHOT
 */
public enum SmsCommandType {

    /**
     * 设置服务器地址
     */
    SET_SERVER_ADDRESS,
    /**
     * 获取服务器地址
     */
    QUERY_SERVER_ADDRESS,
    /**
     * 获取车辆位置
     */
    QUERY_LOCATION,
    /**
     * 设置短信通道号码
     */
    SET_CHANNEL_NUMBER,
    /**
     * 设置日志开关
     */
    SET_LOG_ON_OFF,
    /**
     * 获取车辆状态
     */
    QUERY_VEHICLE_STATUS
}
