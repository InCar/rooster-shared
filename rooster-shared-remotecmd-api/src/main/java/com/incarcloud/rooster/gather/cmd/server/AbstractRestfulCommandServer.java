package com.incarcloud.rooster.cmd.server;/**
 * Created by fanbeibei on 2017/7/17.
 */

import com.incarcloud.rooster.util.NetUtils;

import java.net.UnknownHostException;

/**
 * @author Fan Beibei
 * @Description: CommandServer的抽象实现
 * @date 2017/7/17 11:22
 */
public abstract class AbstractRestfulCommandServer implements CommandServer {
    protected int port;

    public AbstractRestfulCommandServer(int port) {
        if (port < 0 || port > 0xFFFF)
            throw new IllegalArgumentException("port out of range:" + port);

        this.port = port;
    }


    @Override
    public String getUrl() throws UnknownHostException {
        return "http://" + NetUtils.getAvailableHostOfLocal() + ":" + port;
    }
}
