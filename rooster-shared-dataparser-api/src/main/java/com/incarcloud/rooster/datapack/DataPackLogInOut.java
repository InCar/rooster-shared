package com.incarcloud.rooster.datapack;

/**
 * @author ChenZhao
 * @ClassName: DataPackLogInOut
 * @Description: 车辆登入
 * @date 2017-09-06 14:11
 */
public class DataPackLogInOut extends DataPackObject {

    /**
     * 登录类型：0-登录
     */
    public static final int LOGIN_TYPE_LOGIN = 0;
    /**
     * 登录类型：1-登出
     */
    public static final int LOGIN_TYPE_LOGOUT = 1;

    /**
     * 登录类型 0 车辆登入 1 车辆登出
     */
    private Integer loginType;
    /**
     * 可充电储能子系统数
     */
    private Integer sysNumber;
    /**
     * 可充电储能系统编码长度
     */
    private Integer codeLength;
    /**
     * 可充电储能系统编码
     */
    private String sysCode;
    /**
     * 登入登出流水号
     */
    private Integer serialNo;

    /**
     * 加密密钥字符串(BASE64加密，使用转byte[])
     */
    private String securityKey;

    public DataPackLogInOut(DataPackObject dataPack) {
        super(dataPack);
    }

    /**
     * 软件版本号
     */
    private String softwareVersion;

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
        this.loginType = loginType;
    }

    public Integer getSysNumber() {
        return sysNumber;
    }

    public void setSysNumber(Integer sysNumber) {
        this.sysNumber = sysNumber;
    }

    public Integer getCodeLength() {
        return codeLength;
    }

    public void setCodeLength(Integer codeLength) {
        this.codeLength = codeLength;
    }

    public String getSysCode() {
        return sysCode;
    }

    public void setSysCode(String sysCode) {
        this.sysCode = sysCode;
    }

    public Integer getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(Integer serialNo) {
        this.serialNo = serialNo;
    }

    public String getSecurityKey() {
        return securityKey;
    }

    public void setSecurityKey(String securityKey) {
        this.securityKey = securityKey;
    }

    @Override
    public String toString() {
        return "DataPackLogInOut [loginType=" + loginType + ", sysNumber=" + sysNumber + ", codeLength=" + codeLength
                + ", sysCode=" + sysCode + ", serialNo=" + serialNo + ", securityKey=" + securityKey
                + ", softwareVersion=" + softwareVersion + "]";
    }

}
