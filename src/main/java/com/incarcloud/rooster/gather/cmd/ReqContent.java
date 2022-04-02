package com.incarcloud.rooster.gather.cmd;

import lombok.Data;

/**
 * 请求内容的格式
 *
 * @author Fan Beibei
 * @version 1.0
 */
@Data
public class ReqContent {

    /**
     * 命令类型
     */
    private CommandType cmdType;
    /**
     * 命令参数
     */
    private Object[] args;
    /**
     * 车辆vin码
     */
    private String vin;

    public ReqContent() {
    }

    public ReqContent(CommandType cmdType, String vin, Object[] args) {
        this.cmdType = cmdType;
        this.vin = vin;
        this.args = args;
    }
}
