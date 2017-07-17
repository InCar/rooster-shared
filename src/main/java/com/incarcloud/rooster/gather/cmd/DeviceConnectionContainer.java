package com.incarcloud.rooster.gather.cmd;

/**
 * 设备连接容器
 * 
 * @author fanbeibei
 *
 */
public interface DeviceConnectionContainer {
	/**
	 * 添加设备连接
	 *
	 * @param conn
	 * @return
	 */
	public void addDeviceConnection(DeviceConnection conn) throws Exception;

	/**
	 * 移除设备连接
	 * 
	 * @param vin
	 *            车辆vin码
	 * @return
	 */
	public void removeDeviceConnection(String vin) throws Exception;

	/**
	 * 获取设备连接
	 * 
	 * @param vin
	 *            车辆vin码
	 * @return
	 * @throws Exception
	 */
	public DeviceConnection getDeviceConnection(String vin) throws Exception;
}
