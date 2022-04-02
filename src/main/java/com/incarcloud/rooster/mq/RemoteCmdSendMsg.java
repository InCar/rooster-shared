package com.incarcloud.rooster.mq;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 远程控制命令MQ发送实体
 *
 * @author Aaric, created on 2018-01-10T15:57.
 * @version 2.1.12-SNAPSHOT
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class RemoteCmdSendMsg {

    /**
     * 业务ID
     */
    private String refId;

    /**
     * 设备ID
     */
    private String deviceId;

    /**
     * 数据包ID(消息流水号)
     */
    private Integer packId;

    /**
     * 命令类型<br>
     *
     * @see com.incarcloud.rooster.gather.cmd.CommandType
     */
    private String cmdType;

    /**
     * 命令数据包(BASE64加密，使用转byte[])
     */
    private String cmdString;

    public RemoteCmdSendMsg() {
    }

    public RemoteCmdSendMsg(String deviceId, String cmdString) {
        this.deviceId = deviceId;
        this.cmdString = cmdString;
    }

    public RemoteCmdSendMsg(String deviceId, Integer packId, String cmdString) {
        this.deviceId = deviceId;
        this.packId = packId;
        this.cmdString = cmdString;
    }

    public RemoteCmdSendMsg(String deviceId, Integer packId, String cmdType, String cmdString) {
        this.deviceId = deviceId;
        this.packId = packId;
        this.cmdType = cmdType;
        this.cmdString = cmdString;
    }

    public RemoteCmdSendMsg(String refId, String deviceId, Integer packId, String cmdType, String cmdString) {
        this.refId = refId;
        this.deviceId = deviceId;
        this.packId = packId;
        this.cmdType = cmdType;
        this.cmdString = cmdString;
    }
}
