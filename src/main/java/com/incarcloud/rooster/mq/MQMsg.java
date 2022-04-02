package com.incarcloud.rooster.mq;

import com.incarcloud.rooster.share.Constants;
import io.netty.buffer.ByteBuf;
import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * 消息队列里的数据模式
 *
 * @author Xiong Guanghua
 * @version 1.0
 */
public class MQMsg {
    
    /**
     * 消息的标签
     */
    private String _mark;
    /**
     * 数据
     */
    private byte[] _data;

    /**
     * 默认构造函数
     */
    public MQMsg() {

    }

    /**
     * 构造函数，要求指定协议标签和数据流
     *
     * @param mark 消息的标签
     * @param data 消息的数据区
     */
    public MQMsg(String mark, byte[] data) {
        if (StringUtils.isBlank(mark) || null == data) {
            throw new IllegalArgumentException();
        }

        this._data = data;
        this._mark = mark.trim();
    }

    /**
     * @param mark 消息的标签
     * @param data 消息的数据区
     */
    public MQMsg(String mark, ByteBuf data) {
        if (StringUtils.isBlank(mark) || null == data) {
            throw new IllegalArgumentException();
        }

        this._mark = mark.trim();
        this._data = new byte[data.readableBytes()];
        data.getBytes(data.readerIndex(), _data);
    }

    /**
     * 获得协议标签
     *
     * @return
     */
    public String getMark() {
        return _mark;
    }

    /**
     * 获得数据流
     *
     * @return
     */
    public byte[] getData() {
        return _data;
    }

    /**
     * 返回数据的Base64编码的字符串
     *
     * @return
     */
    public String getDataB64() {
        return Base64.getEncoder().encodeToString(_data);
    }

    /**
     * 序列化为字节数组
     *
     * @return
     */
    public byte[] serializeToBytes() throws UnsupportedEncodingException {
        return (getMark() + "->" + getDataB64()).getBytes(Constants.DEFAULT_CHARSET);
    }

    /**
     * 反序列化为MQMsg对象
     *
     * @param bytes 字节流
     * @return
     * @throws UnsupportedEncodingException
     */
    public static MQMsg deserializeFromBytes(byte[] bytes) throws UnsupportedEncodingException {
        // 校验数据合法性
        String content = new String(bytes, Constants.DEFAULT_CHARSET);
        if (!content.contains("->")) {
            return null;
        }

        // 格式："mark->base64string"
        String[] dataStrings = content.split("\\->");
        return new MQMsg(dataStrings[0], Base64.getDecoder().decode(dataStrings[1]));
    }

    @Override
    public String toString() {
        return "MQMsg [_mark=" + _mark + ", _data=" + getDataB64() + "]";
    }
}
