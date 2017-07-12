package com.incarcloud.rooster.gather.rpc.cmd;/**
 * Created by fanbeibei on 2017/7/7.
 */

/**
 * @author Fan Beibei
 * @Description: 工厂类，用于创建下发给车辆的命令
 * @date 2017/7/7 17:45
 */
public interface CommandFacotry {

    /**
     * 创建二进制命令
     *
     * @param type     命令类型
     * @param protocol 协议
     * @return
     */
    byte[] createCommand(CommandType type, String protocol);

}
