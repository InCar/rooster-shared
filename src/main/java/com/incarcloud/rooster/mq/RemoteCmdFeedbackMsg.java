package com.incarcloud.rooster.mq;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 远程控制命令MQ反馈实体
 *
 * @author Aaric, created on 2018-01-10T16:00.
 * @version 2.1.12-SNAPSHOT
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class RemoteCmdFeedbackMsg {

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
     * 发送状态：0-失败, 1-成功
     */
    private Integer status;

    /**
     * 发送结果
     * 新增字段、本来可以替代status字段、为了避免影响之前逻辑
     * 0:成功
     * 1:校验发送截止时间失败、取消发送
     * 2:设备离线
     * 3:发送到设备失败、异常
     *
     */
    private Integer res=0;

    /**
     * 异常信息
     */
    private String exceptionMessage;

    public RemoteCmdFeedbackMsg() {
    }

    public RemoteCmdFeedbackMsg(RemoteCmdSendMsg msg, Integer status) {
        this.refId = msg.getRefId();
        this.deviceId = msg.getDeviceId();
        this.packId = msg.getPackId();
        this.cmdType = msg.getCmdType();
        this.status = status;
    }

    public RemoteCmdFeedbackMsg(RemoteCmdSendMsg msg, Integer status,Integer res) {
        this.refId = msg.getRefId();
        this.deviceId = msg.getDeviceId();
        this.packId = msg.getPackId();
        this.cmdType = msg.getCmdType();
        this.status = status;
        this.res=res;
    }
}
