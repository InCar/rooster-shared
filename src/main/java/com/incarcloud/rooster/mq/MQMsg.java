package com.incarcloud.rooster.mq;

import io.netty.buffer.ByteBuf;

import java.util.Base64;

/**
 * 消息队列里的数据模式
 * 
 * @author 熊广化
 *
 */
public class MQMsg {
	/**
	 * 一个标记,比如 tricheer-adas-2.0.0
	 */
	private String _mark;
	/**
	 * 数据
	 */
	private byte[] _data;

	public String getMark() {
		return _mark;
	}

	public void setMark(String value) {
		_mark = value;
	}

	public byte[] getData() {
		return _data;
	}

	public void setData(byte[] value) {
		_data = value;
	}

	public String getDataB64() {
		return Base64.getEncoder().encodeToString(_data);
	}

	public void setData(ByteBuf value) {
		_data = new byte[value.readableBytes()];
		value.getBytes(value.readerIndex(), _data);
	}
}
