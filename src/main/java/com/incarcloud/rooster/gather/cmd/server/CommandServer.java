package com.incarcloud.rooster.gather.cmd.server;

import java.net.UnknownHostException;

/**
 * 提供远程命令操作的服务接口
 *
 * @author Fan Beibei
 * @version 1.0
 */
public interface CommandServer {

    /**
     * 开启服务
     */
    void start();

    /**
     * 结束服务
     */
    void stop();

    /**
     * 获取服务地址
     *
     * @return
     */
    String getUrl() throws UnknownHostException;
}
