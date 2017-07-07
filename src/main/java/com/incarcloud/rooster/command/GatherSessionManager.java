package com.incarcloud.rooster.command;/**
 * Created by fanbeibei on 2017/7/7.
 */

import io.netty.channel.Channel;

/**
 * @author Fan Beibei
 * @Description: 车辆连接gather的会话管理
 * @date 2017/7/7 12:14
 */
public interface GatherSessionManager {


    /**
     * 为车辆注册会话信息
     *
     * @param vin 车辆vin码
     * @param session
     * @return
     */
    public  boolean registerSession(String vin,Session session);

    /**
     * 释放会话
     * @param vin 车辆vin码
     * @return
     */
    public boolean releaseSession(String vin);

    /**
     * 获取车辆会话
     * @param vin 车辆vin码
     * @return
     */
    public Session getSession(String vin);

}
