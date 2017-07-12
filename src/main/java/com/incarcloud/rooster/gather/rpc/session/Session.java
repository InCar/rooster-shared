package com.incarcloud.rooster.gather.rpc.session;/**
 * Created by fanbeibei on 2017/7/7.
 */

import io.netty.channel.Channel;

/**
 * @author Fan Beibei
 * @Description: 车辆会话
 * @date 2017/7/7 12:27
 */
public class Session {
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

    /**
     *
     * @param vin 车辆vin码
     * @param channel 通讯通道
     * @param protocal 通讯协议
     */
    public Session(String vin, Channel channel, String protocal) {
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
