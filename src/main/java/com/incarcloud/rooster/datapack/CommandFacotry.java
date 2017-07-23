package com.incarcloud.rooster.datapack;/**
 * Created by fanbeibei on 2017/7/7.
 */

import com.incarcloud.rooster.gather.cmd.CommandType;
import io.netty.buffer.ByteBuf;

/**
 * @author Fan Beibei
 * @Description: 工厂类，用于创建下发给车辆的命令
 * @date 2017/7/7 17:45
 */
public interface CommandFacotry {

    /**
     * 创建二进制命令,若不支持此命令则返回null
     *
     * @param type     命令类型
     * @return
     */
    ByteBuf createCommand(CommandType type);

}
