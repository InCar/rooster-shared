package com.incarcloud.rooster.gather.cmd.device;

/**
 * 设备连接远程注册器
 *
 * @author Fan Beibei
 * @version 1.0
 */
public interface DeviceConnectionRemoteRegister {

    /**
     * 注册连接
     *
     * @param vin
     * @param cmdServerUrl 命令服务的url
     */
    void registerConnection(String vin, String cmdServerUrl);

    /**
     * 移除连接
     *
     * @param vin 车架号
     */
    void removeConnection(String vin);
}
