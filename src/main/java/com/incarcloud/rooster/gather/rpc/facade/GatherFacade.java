package com.incarcloud.rooster.gather.rpc.facade;/**
 * Created by fanbeibei on 2017/7/7.
 */

import com.incarcloud.rooster.gather.rpc.cmd.CommandType;

/**
 * @author Fan Beibei
 * @Description: 提供外部调用的接口
 * @date 2017/7/7 12:08
 */
public interface GatherFacade {

    /**
     * 向车辆发送指令（自动选择设备）
     *
     * @param vin     车辆vin码
     * @param command 指令类型
     */
    public void sendCommand(String vin, CommandType command) throws Exception;



}
