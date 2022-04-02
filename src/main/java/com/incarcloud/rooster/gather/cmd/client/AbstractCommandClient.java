package com.incarcloud.rooster.gather.cmd.client;

import com.incarcloud.shared.cmd.CommandServerRespCode;
import com.incarcloud.shared.cmd.CommandType;
import com.incarcloud.shared.cmd.RespContent;

import java.io.IOException;

/**
 * CommandClient的抽象
 *
 * @author Fan Beibei
 * @version 1.0
 */
public abstract class AbstractCommandClient implements CommandClient {

    @Override
    public RespContent sendCommand(String vin, CommandType command, Object[] args) throws IOException {
        String url = getServerUrl(vin);

        if (null == url) {
            return new RespContent(CommandServerRespCode.DEV_OFFLINE, "device not connect");
        }

        return sendCommand(url, vin, command, args);
    }

    /**
     * 根据vin码获取服务端地址
     *
     * @param vin 车辆vin码
     * @return
     */
    protected abstract String getServerUrl(String vin);

    /**
     * @param url     服务端地址
     * @param vin     车辆vin码
     * @param command 指令类型
     * @param args    指令参数
     * @throws Exception
     */
    public abstract RespContent sendCommand(String url, String vin, CommandType command, Object[] args) throws IOException;
}
