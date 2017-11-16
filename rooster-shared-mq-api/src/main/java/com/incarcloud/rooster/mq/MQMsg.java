package com.incarcloud.rooster.mq;

import com.incarcloud.rooster.util.StringUtil;
import io.netty.buffer.ByteBuf;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Base64;

/**
 * @author Xiong Guanghua
 * @ClassName: MQMsg
 * @Description: 消息队列里的数据模式
 * @date 2017年6月5日 上午10:46:34
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

    public MQMsg() {

    }

    /**
     *
     * @param mark 消息的标签
     * @param data 消息的数据区
     */
    public MQMsg(String mark, byte[] data) {
        if (StringUtil.isBlank(mark) || null == data) {
            throw new IllegalArgumentException();
        }

        this._data = data;
        this._mark = mark.trim();
    }

    /**
     *
     * @param mark 消息的标签
     * @param data 消息的数据区
     */
    public MQMsg(String mark, ByteBuf data) {
        if (StringUtil.isBlank(mark) || null == data) {
            throw new IllegalArgumentException();
        }

        this._mark = mark.trim();
        this._data = new byte[data.readableBytes()];
        data.getBytes(data.readerIndex(), _data);
    }


    public String getMark() {
        return _mark;
    }

    public byte[] getData() {
        return _data;
    }

    /**
     * 返回数据的Base64编码的字符串
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
        return (getMark() + "->" + getDataB64()).getBytes("UTF-8");
    }


    /**
     * 反序列化为MQMsg对象
     *
     * @param bytes
     * @return
     * @throws UnsupportedEncodingException
     */
    public static MQMsg deserializeFromBytes(byte[] bytes) throws UnsupportedEncodingException {
        String s = new String(bytes,"UTF-8");
        if(!s.contains("->")){
            return null;
        }

        String mark = s.split("\\->")[0];
        String dataB64 = s.split("\\->")[1];

        return new MQMsg(mark,Base64.getDecoder().decode(dataB64));
    }


    @Override
    public String toString() {
        return "MQMsg [_mark=" + _mark + ", _data=" + getDataB64() + "]";
    }
}
