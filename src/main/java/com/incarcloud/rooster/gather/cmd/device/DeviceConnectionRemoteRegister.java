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
     * @param protocal 设备协议
     * @param serverUrl 连接服务器的url, 传输协议(tcp/udp/mqtt):ip:端口号
     */
    void registerConnection(String vin, String protocal, String serverUrl);


}
