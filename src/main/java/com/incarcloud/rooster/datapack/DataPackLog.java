package com.incarcloud.rooster.datapack;

/**
 * @author ChenZhao
 * @ClassName: DataPackLog
 * @Description: 车辆登入
 * @date 2017-09-06 14:11
 */
public class DataPackLog extends DataPackObject {
    //登录类型 0 车辆登入 1 车辆登出
    private int loginType;
    //可充电储能子系统数
    private int sysNumber;
    //可充电储能系统编码长度
    private int codeLength;
    //可充电储能系统编码
    private String sysCode;
    //登入登出流水号
    private int serialNo;

    public DataPackLog(DataPack dataPack) {
        super(dataPack);
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public int getLoginType() {
        return loginType;
    }

    public void setLoginType(int loginType) {
        this.loginType = loginType;
    }

    public int getSysNumber() {
        return sysNumber;
    }

    public void setSysNumber(int sysNumber) {
        this.sysNumber = sysNumber;
    }

    public int getCodeLength() {
        return codeLength;
    }

    public void setCodeLength(int codeLength) {
        this.codeLength = codeLength;
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }
}
