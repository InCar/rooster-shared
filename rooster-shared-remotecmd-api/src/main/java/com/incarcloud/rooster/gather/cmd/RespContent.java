package com.incarcloud.rooster.gather.cmd;/**
 * Created by fanbeibei on 2017/7/17.
 */

/**
 * @author Fan Beibei
 * @Description: 回复内容格式
 * @date 2017/7/17 15:14
 */
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

    public void setCode(CommandServerRespCode code) {
        this.code = code;
    }

    public void setDescInfo(String descInfo) {
        this.descInfo = descInfo;
    }

    public CommandServerRespCode getCode() {
        return code;
    }

    public String getDescInfo() {
        return descInfo;
    }

    @Override
    public String toString() {
        return "RespContent{" +
                "code=" + code +
                ", descInfo='" + descInfo + '\'' +
                '}';
    }
}
