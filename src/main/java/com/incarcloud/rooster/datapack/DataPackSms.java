package com.incarcloud.rooster.datapack;

import lombok.Data;

/**
 * 短信解析对象
 *
 * @author Kong, created on 2019-07-01T16:22.
 * @version 1.0.0-SNAPSHOT
 */
@Data
public class DataPackSms {

    /**
     * 命令号
     */
    private String cmd;
    /**
     * 执行状态  1-成功, -1 失败
     */
    private Integer status;
    /**
     * 命令ID
     */
    private String cmdId;
    /**
     * 干扰码
     */
    private String nonceStr;
    /**
     * 签名
     */
    private String sign;

    public DataPackSms() {
    }

    public DataPackSms(DataPackSms obj) {
        this.cmd = obj.cmd;
        this.status = obj.status;
        this.cmdId = obj.cmdId;
        this.nonceStr = obj.nonceStr;
        this.sign = obj.sign;
    }
}
