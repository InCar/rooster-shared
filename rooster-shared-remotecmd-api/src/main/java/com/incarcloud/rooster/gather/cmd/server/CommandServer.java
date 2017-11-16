package com.incarcloud.rooster.cmd.server;/**
 * Created by fanbeibei on 2017/7/17.
 */

import java.net.UnknownHostException;

/**
 * @author Fan Beibei
 * @Description: 提供远程命令操作的服务接口
 * @date 2017/7/17 11:03
 */
public interface CommandServer {
    /**
     * 开启服务
     */
    public void start();

    /**
     * 结束服务
     */
    public void stop();

    /**
     *  获取服务地址
     *
     * @return
     */
    public String getUrl() throws UnknownHostException;
}
