package com.incarcloud.rooster.gather.cmd;

import io.netty.channel.Channel;

/**
 * 设备连接
 * 
 * @author fanbeibei
 *
 */
public class DeviceConnection {

	/**
	 * 车辆vin码
	 */
	private String vin;
	/**
	 * 通讯通道
	 */
	private Channel channel;

	/**
	 * 通讯协议
	 */
	private String protocal;

	public DeviceConnection(String vin, Channel channel, String protocal) {
		this.vin = vin;
		this.channel = channel;
		this.protocal = protocal;
	}

	public String getVin() {
		return vin;
	}

	public Channel getChannel() {
		return channel;
	}

	public String getProtocal() {
		return protocal;
	}

}
