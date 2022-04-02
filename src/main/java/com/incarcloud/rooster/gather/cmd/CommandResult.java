package com.incarcloud.rooster.gather.cmd;

import lombok.Data;

import java.util.List;

/**
 * 下行指令执行结果
 *
 * @author Aaric, created on 2020-06-01T16:16.
 * @version 1.2.0-SNAPSHOT
 */
@Data
public class CommandResult {

    /**
     * 消息ID：ic协议表示命令标识，jtt808表示消息ID
     */
    private Long msgId;

    /**
     * 消息流水号：ic协议表示平台流水号，jtt808表示消息流水号
     */
    private Long msgSn;

    /**
     * 设备号
     */
    private String deviceId;

    /**
     * 车架号
     */
    private String vin;

    /**
     * 协议名称，即DataParserXxx.PROTOCOL_NAME，例如：gmmc, jtt808
     */
    private String protocolName;

    /**
     * 执行结果反馈ID规则：{deviceId}-{protocolName}-{msgId}-{msgSn}，kafka通知主题：tiger-feedback
     */
    private String feedbackId;

    /**
     * 执行结果：false-失败，true-成功<br>
     * 失败code写入executeMsg
     */
    private Boolean executeStatus;

    /**
     * 执行结果说明
     */
    private String executeMsg;

    /**
     * 封装到DataPack存储的RowKey信息
     */
    private List<String> ids;

    /**
     * 附加信息，例如被设备分包处理的信息，请求图片，音频，视频等。。。<br>
     * 建议使用base64编解码
     */
    private String extra;

    /**
     * 检测时间
     */
    private Long detectionTime;

    public CommandResult() {
    }

    public CommandResult(String feedbackId, Boolean executeStatus) {
        this.feedbackId = feedbackId;
        this.executeStatus = executeStatus;
    }
}
