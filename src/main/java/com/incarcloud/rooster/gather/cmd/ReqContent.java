package com.incarcloud.rooster.gather.cmd;/**
 * Created by fanbeibei on 2017/7/17.
 */

/**
 * @author Fan Beibei
 * @Description: 请求内容的格式
 * @date 2017/7/17 15:15
 */
public class ReqContent {
    /**
     * 命令类型
     */
    private CommandType cmdType;
    /**
     * 车辆vin码
     */
    private String vin;

    public ReqContent() {
    }

    public ReqContent(CommandType cmdType, String vin) {
        this.cmdType = cmdType;
        this.vin = vin;
    }

    public void setCmdType(CommandType cmdType) {
        this.cmdType = cmdType;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public CommandType getCmdType() {
        return cmdType;
    }

    public String getVin() {
        return vin;
    }

    @Override
    public String toString() {
        return "ReqContent{" +
                "cmdType=" + cmdType +
                ", vin='" + vin + '\'' +
                '}';
    }
}
