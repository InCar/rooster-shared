package com.incarcloud.rooster.gather.cmd.server;

import com.incarcloud.shared.util.NetUtils;

import java.net.UnknownHostException;

/**
 * CommandServer的抽象实现
 *
 * @author Fan Beibei
 * @version 1.0
 */
public abstract class AbstractRestfulCommandServer implements CommandServer {

    protected int port;

    public AbstractRestfulCommandServer(int port) {
        if (port < 0 || port > 0xFFFF) {
            throw new IllegalArgumentException("port out of range:" + port);
        }

        this.port = port;
    }

    @Override
    public String getUrl() throws UnknownHostException {
        return "http://" + NetUtils.getAvailableHostOfLocal() + ":" + port;
    }
}
