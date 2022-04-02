package com.incarcloud.rooster.gather.cmd;

/**
 * 服务器回复类型
 *
 * @author Fan Beibei
 * @version 1.0
 */
public enum CommandServerRespCode {

    /**
     * 操作成功
     */
    OP_SUCCESS,
    /**
     * 操作不支持
     */
    OP_NOTSUPPORT,
    /**
     * 设备不在线
     */
    DEV_OFFLINE,
    /**
     * 请求参数错误
     */
    REQ_PARAM_ERROR,

    /**
     * 请求超时
     */
    REQ_TIMEOUT,
    /**
     * 其他错误
     */
    OTHER_ERROR
}
