package com.incarcloud.rooster.gather.cmd;

/**
 * 工厂类，用于创建下发给车辆的命令
 *
 * @author Fan Beibei
 * @version 1.0
 */
public interface CommandFactory {

    /**
     * 创建二进制命令,若不支持此命令则返回null
     *
     * @param type 命令类型
     * @param args 命令参数列表
     * @return
     * @throws Exception
     */
    byte[] createCommand(CommandType type, Object... args) throws Exception;
}
