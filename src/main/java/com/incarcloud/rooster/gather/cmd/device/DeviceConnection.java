package com.incarcloud.rooster.gather.cmd.device;

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


	public DeviceConnection(String vin, Channel channel) {
		this.vin = vin;
		this.channel = channel;
	}

	public String getVin() {
		return vin;
	}

	public Channel getChannel() {
		return channel;
	}

}
