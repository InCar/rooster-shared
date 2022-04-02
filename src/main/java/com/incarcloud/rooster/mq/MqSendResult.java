package com.incarcloud.rooster.mq;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 发送消息返回的结果
 *
 * @author Fan Beibei
 * @version 1.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class MqSendResult {

    /**
     * 异常信息
     */
    private MQException exception;

    /**
     * 返回的数据
     */
    private Object data;

    /**
     * 构造函数
     *
     * @param exception 异常信息
     * @param data      数据对象
     */
    public MqSendResult(MQException exception, Object data) {
        super();
        this.exception = exception;
        this.data = data;
    }
}
