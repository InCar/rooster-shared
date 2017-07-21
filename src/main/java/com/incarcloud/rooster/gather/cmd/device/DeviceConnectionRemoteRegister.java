package com.incarcloud.rooster.gather.cmd.device;/**
 * Created by fanbeibei on 2017/7/19.
 */

/**
 * @author Fan Beibei
 * @Description: 设备连接远程注册器
 * @date 2017/7/19 11:15
 */
public interface DeviceConnectionRemoteRegister {

    /**
     * 注册连接
     * @param vin
     * @param cmdServerUrl 命令服务的url
     */
    void registerConnection(String vin,  String cmdServerUrl);


    /**
     * 移除连接
     * @param vin
     */
    void removeConnection(String vin);


}
