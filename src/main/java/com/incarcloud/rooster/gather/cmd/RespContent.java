package com.incarcloud.rooster.gather.cmd;

import lombok.Data;

/**
 * 回复内容格式
 *
 * @author Fan Beibei
 * @version 1.0
 */
@Data
public class RespContent {

    /**
     * 返回码
     */
    private CommandServerRespCode code;
    /**
     * 结果描述信息
     */
    private String descInfo;

    public RespContent() {
    }

    public RespContent(CommandServerRespCode code, String descInfo) {
        this.code = code;
        this.descInfo = descInfo;
    }
}
