package com.incarcloud.rooster.gather.rpc.session;/**
 * Created by fanbeibei on 2017/7/7.
 */

/**
 * @author Fan Beibei
 * @Description: 车辆连接gather的会话管理
 * @date 2017/7/7 12:14
 */
public interface SessionManager {


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
