package com.incarcloud.rooster.mq;

import java.util.List;

/**
 * 远程控制发送MQ接口
 *
 * Created by Kong on 2018/1/11.
 */
public interface IBigSuperMQ {

    /**
     * 发送单个消息
     *
     * @param topic 主题
     * @param data 消息体
     * @return
     */
    MqSendResult post(String topic, byte[] data);

    /**
     * 批量发送消息
     *
     * @param topic 主题
     * @param datas 消息体
     * @return
     */
    List<MqSendResult> post(String topic, List<byte[]> datas);

    /**
     * 批量接收消息
     *
     * @param topic 主题
     * @param size 消息数量
     * @return
     */
    List<byte[]> batchReceive(String topic, int size);

    /**
     * 释放当前连接（线程安全的客户端无需实现此方法，有些客户端不是线程安全，比如kafka的消费者）
     * @param topic 主题
     */
    void releaseCurrentConn(String topic);

    /**
     * 关闭
     */
    void close();
}
