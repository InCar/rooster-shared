package com.incarcloud.rooster.datapack;

import lombok.Data;

/**
 * 远程控制对象
 *
 * @author Kong, created on 2019-06-26T17:32.
 * @version 1.0.0-SNAPSHOT
 */
@Data
public class DataPackDownlinkControl {

    /**
     * T-BOX标识
     */
    private String boxFlag;
    /**
     * 指令ID
     */
    private long commandId;
    /**
     * 密钥KEY
     */
    private byte[] key;
}
