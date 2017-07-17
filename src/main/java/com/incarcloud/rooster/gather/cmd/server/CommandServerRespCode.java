package com.incarcloud.rooster.gather.cmd.server;/**
 * Created by fanbeibei on 2017/7/17.
 */

/**
 * @author Fan Beibei
 * @Description: 服务器回复类型
 * @date 2017/7/17 15:23
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
     * 其他错误
     */
    OTHER_ERROR

}
