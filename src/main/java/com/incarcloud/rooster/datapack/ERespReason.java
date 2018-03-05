package com.incarcloud.rooster.datapack;

/**
 * 应答原因
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
    ACTIVATED
}
