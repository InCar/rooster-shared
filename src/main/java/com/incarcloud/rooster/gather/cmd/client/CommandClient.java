package com.incarcloud.rooster.gather.cmd.client;/**
 * Created by fanbeibei on 2017/7/17.
 */

import com.incarcloud.rooster.gather.cmd.CommandType;
import com.incarcloud.rooster.gather.cmd.RespContent;

import java.io.IOException;

/**
 * @author Fan Beibei
 * @Description: 描述
 * @date 2017/7/17 11:08
 */
public interface CommandClient {

    /**
     * 向车辆发送指令（自动选择设备）
     *
     * @param vin     车辆vin码（没有vin码时候, DEVICEID+#+设备号  代替vin码）
     * @param command 指令类型
     * @param args    指令参数
     */
    public RespContent sendCommand(String vin, CommandType command, Object[] args) throws IOException;

}
