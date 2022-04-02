package com.incarcloud.rooster.datapack;

/**
 * 应答原因
 *
 * @author Aaric
 * @version 1.0
 */
public enum ERespReason {

    /**
     * 未知错误
     */
    NA,
    /**
     * 成功接收
     */
    OK,
    /**
     * 服务器处理错误
     */
    ERROR,
    /**
     * 激活时VIN不匹配
     */
    MISMATCH,
    /**
     * 设备已激活
     */
    ACTIVATED,
    /**
     * 车辆已激活
     */
    VIN_ACTIVATED,
    /**
     * 设备不存在
     */
    NON_EXIST_DEVICE,
    /**
     * 与设备SN绑定关系错误
     */
    MISMATCH_DEVICE_SN,
    /**
     * 不适配该车系
     */
    NON_ADAPTED_SERIES,
    /**
     * 设备已激活
     */
    DEVICE_ACTIVATED
}
