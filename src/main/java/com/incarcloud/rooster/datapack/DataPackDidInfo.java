package com.incarcloud.rooster.datapack;

import java.util.Date;

/**
 * 自诊断DID信息
 *
 * @author Kong, created on 2019-01-04T16:51.
 * @since 1.2.0-SNAPSHOT
 */
public class DataPackDidInfo extends DataPackObject{

    /**
     * 软件版本号
     */
    private String softVersionNo ;

    /**
     * 硬件版本号
     */
    private String hardwareVersionNo ;

    /**
     * 零件号
     */
    private String partNumber ;

    /**
     * 车型标记
     * 0-ZC
     * 1-RE
     * 2-NS
     */
    private Integer vehicleModel ;

    /**
     * IMEI
     */
    private String imei ;

    /**
     * T-BOX SN
     */
    private String sn ;

    /**
     * ICCID
     */
    private String iccid ;

    /**
     * TSP登录状态
     * 0-未连接
     * 1-连接
     */
    private Integer loginStatus ;

    /**
     * T-BOX激活状态
     * 0-未激活
     * 1-激活
     */
    private Integer activationStatus ;

    /**
     * DA连接状态
     * 0-未连接
     * 1-连接
     */
    private Integer daConntectStatus ;

    /**
     * RSSI
     */
    private Integer rssi ;

    /**
     * 公网拨号状态
     * 0-失败
     * 1-成功
     */
    private Integer publicDialStatus ;

    /**
     * 私网拨号状态
     * 0-失败
     * 1-成功
     */
    private Integer privateDialStatus ;

    /**
     * MPU最近一次重启时间
     */
    private Date mpuLatestRestartTime ;

    /**
     * ACC状态
     * 0-ACC OFF
     * 1-ACC ON
     */
    private Integer accStatus ;

    /**
     * 网络接入PLMN标识
     * PLMN : 46000~46020
     */
    private Integer plmnFlag ;

    /**
     * 网络注册状态
     * 0-失败
     * 1-成功
     */
    private Integer wlanRegisteredStatus ;

    /**
     * 网络拒绝原因
     * 网络拒接原因码 0---0xFFFF
     */
    private Integer wlanRefusedReason ;

    /**
     * GPS定位信息
     */
    private DataPackPosition position;

    /**
     * 系统时间
     */
    private Date systemTime ;

    /**
     * 最近一次公网连接时间
     */
    private Date latestPublicConnectTime ;

    /**
     * MPU当前工作时间（单位：秒）
     */
    private Long mpuCurrentTime ;

    /**
     * MCU当前工作时间（单位：秒）
     */
    private Long mcuCurrentTime ;

    /**
     * 电源电压
     */
    private Integer powerVoltage ;

    /**
     * 备用电池电压
     */
    private Integer standbyPowerVoltage ;

    /**
     * MPU最近一次重启原因
     * 0-WatchDog
     * 其他：预留
     */
    private Integer mpuLastestRestartReason ;

    /**
     * MCU重启次数
     */
    private Integer mcuRestartCount ;

    /**
     * MPU休眠条件状态
     * 1:SC_BLOCK
     * 2:DM_BLOCK
     * 3:RM_BLOCK
     * 4:NM_BLOCK
     * 5:WM_BLOCK
     * 6:CM_BLOCK
     * 7:MCUA_BLOCK
     * 8:WLAN_BLOCK
     * 9:UP_BLOCK
     * 10:CS_BLOCK
     * 11:GPS_BLOCK
     * 12:RS_BLOCK
     * 13:AT_BLOCK
     */
    private Integer mpuDormancyStatus ;

    /**
     * MCU休眠条件状态-ACC
     * 0-ACC OFF
     * 1-ACC ON
     */
    private Integer mcuDormancyAccStatus ;

    /**
     * MCU休眠条件状态-CAN
     * 0-CAN睡眠
     * 1-CAN工作
     */
    private Integer mcuDormancyCanStatus ;

    /**
     * MCU休眠条件状态-MPU
     * 0-MPU睡眠
     * 1-MPU工作
     */
    private Integer mcuDormancyMPUStatus ;

    /**
     * MCU休眠条件状态
     * 0-已超时
     * 1-超时等待中
     */
    private Integer mcuDormancyStatus ;

    /**
     * MPU RTC唤醒周期（单位：秒）
     */
    private Integer mpuRtcWakeUpCycle ;

    /**
     * MCU最近一次唤醒时间（单位：秒）
     */
    private Integer mcuLatestWakeUpTime ;

    public DataPackDidInfo(DataPackObject object) {
        super(object);
    }

    public String getSoftVersionNo() {
        return softVersionNo;
    }

    public void setSoftVersionNo(String softVersionNo) {
        this.softVersionNo = softVersionNo;
    }

    public String getHardwareVersionNo() {
        return hardwareVersionNo;
    }

    public void setHardwareVersionNo(String hardwareVersionNo) {
        this.hardwareVersionNo = hardwareVersionNo;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public Integer getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(Integer vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public Integer getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    public Integer getActivationStatus() {
        return activationStatus;
    }

    public void setActivationStatus(Integer activationStatus) {
        this.activationStatus = activationStatus;
    }

    public Integer getDaConntectStatus() {
        return daConntectStatus;
    }

    public void setDaConntectStatus(Integer daConntectStatus) {
        this.daConntectStatus = daConntectStatus;
    }

    public Integer getRssi() {
        return rssi;
    }

    public void setRssi(Integer rssi) {
        this.rssi = rssi;
    }

    public Integer getPublicDialStatus() {
        return publicDialStatus;
    }

    public void setPublicDialStatus(Integer publicDialStatus) {
        this.publicDialStatus = publicDialStatus;
    }

    public Integer getPrivateDialStatus() {
        return privateDialStatus;
    }

    public void setPrivateDialStatus(Integer privateDialStatus) {
        this.privateDialStatus = privateDialStatus;
    }

    public Date getMpuLatestRestartTime() {
        return mpuLatestRestartTime;
    }

    public void setMpuLatestRestartTime(Date mpuLatestRestartTime) {
        this.mpuLatestRestartTime = mpuLatestRestartTime;
    }

    public Integer getAccStatus() {
        return accStatus;
    }

    public void setAccStatus(Integer accStatus) {
        this.accStatus = accStatus;
    }

    public Integer getPlmnFlag() {
        return plmnFlag;
    }

    public void setPlmnFlag(Integer plmnFlag) {
        this.plmnFlag = plmnFlag;
    }

    public Integer getWlanRegisteredStatus() {
        return wlanRegisteredStatus;
    }

    public void setWlanRegisteredStatus(Integer wlanRegisteredStatus) {
        this.wlanRegisteredStatus = wlanRegisteredStatus;
    }

    public Integer getWlanRefusedReason() {
        return wlanRefusedReason;
    }

    public void setWlanRefusedReason(Integer wlanRefusedReason) {
        this.wlanRefusedReason = wlanRefusedReason;
    }

    public DataPackPosition getPosition() {
        return position;
    }

    public void setPosition(DataPackPosition position) {
        this.position = position;
    }

    public Date getSystemTime() {
        return systemTime;
    }

    public void setSystemTime(Date systemTime) {
        this.systemTime = systemTime;
    }

    public Date getLatestPublicConnectTime() {
        return latestPublicConnectTime;
    }

    public void setLatestPublicConnectTime(Date latestPublicConnectTime) {
        this.latestPublicConnectTime = latestPublicConnectTime;
    }

    public Long getMpuCurrentTime() {
        return mpuCurrentTime;
    }

    public void setMpuCurrentTime(Long mpuCurrentTime) {
        this.mpuCurrentTime = mpuCurrentTime;
    }

    public Long getMcuCurrentTime() {
        return mcuCurrentTime;
    }

    public void setMcuCurrentTime(Long mcuCurrentTime) {
        this.mcuCurrentTime = mcuCurrentTime;
    }

    public Integer getPowerVoltage() {
        return powerVoltage;
    }

    public void setPowerVoltage(Integer powerVoltage) {
        this.powerVoltage = powerVoltage;
    }

    public Integer getStandbyPowerVoltage() {
        return standbyPowerVoltage;
    }

    public void setStandbyPowerVoltage(Integer standbyPowerVoltage) {
        this.standbyPowerVoltage = standbyPowerVoltage;
    }

    public Integer getMpuLastestRestartReason() {
        return mpuLastestRestartReason;
    }

    public void setMpuLastestRestartReason(Integer mpuLastestRestartReason) {
        this.mpuLastestRestartReason = mpuLastestRestartReason;
    }

    public Integer getMcuRestartCount() {
        return mcuRestartCount;
    }

    public void setMcuRestartCount(Integer mcuRestartCount) {
        this.mcuRestartCount = mcuRestartCount;
    }

    public Integer getMpuDormancyStatus() {
        return mpuDormancyStatus;
    }

    public void setMpuDormancyStatus(Integer mpuDormancyStatus) {
        this.mpuDormancyStatus = mpuDormancyStatus;
    }

    public Integer getMcuDormancyAccStatus() {
        return mcuDormancyAccStatus;
    }

    public void setMcuDormancyAccStatus(Integer mcuDormancyAccStatus) {
        this.mcuDormancyAccStatus = mcuDormancyAccStatus;
    }

    public Integer getMcuDormancyCanStatus() {
        return mcuDormancyCanStatus;
    }

    public void setMcuDormancyCanStatus(Integer mcuDormancyCanStatus) {
        this.mcuDormancyCanStatus = mcuDormancyCanStatus;
    }

    public Integer getMcuDormancyMPUStatus() {
        return mcuDormancyMPUStatus;
    }

    public void setMcuDormancyMPUStatus(Integer mcuDormancyMPUStatus) {
        this.mcuDormancyMPUStatus = mcuDormancyMPUStatus;
    }

    public Integer getMcuDormancyStatus() {
        return mcuDormancyStatus;
    }

    public void setMcuDormancyStatus(Integer mcuDormancyStatus) {
        this.mcuDormancyStatus = mcuDormancyStatus;
    }

    public Integer getMpuRtcWakeUpCycle() {
        return mpuRtcWakeUpCycle;
    }

    public void setMpuRtcWakeUpCycle(Integer mpuRtcWakeUpCycle) {
        this.mpuRtcWakeUpCycle = mpuRtcWakeUpCycle;
    }

    public Integer getMcuLatestWakeUpTime() {
        return mcuLatestWakeUpTime;
    }

    public void setMcuLatestWakeUpTime(Integer mcuLatestWakeUpTime) {
        this.mcuLatestWakeUpTime = mcuLatestWakeUpTime;
    }

    @Override
    public String toString() {
        return "DataPackDidInfo{" +
                "softVersionNo='" + softVersionNo + '\'' +
                ", hardwareVersionNo='" + hardwareVersionNo + '\'' +
                ", partNumber='" + partNumber + '\'' +
                ", vehicleModel=" + vehicleModel +
                ", imei='" + imei + '\'' +
                ", sn='" + sn + '\'' +
                ", iccid='" + iccid + '\'' +
                ", loginStatus=" + loginStatus +
                ", activationStatus=" + activationStatus +
                ", daConntectStatus=" + daConntectStatus +
                ", rssi=" + rssi +
                ", publicDialStatus=" + publicDialStatus +
                ", privateDialStatus=" + privateDialStatus +
                ", mpuLatestRestartTime=" + mpuLatestRestartTime +
                ", accStatus=" + accStatus +
                ", plmnFlag=" + plmnFlag +
                ", wlanRegisteredStatus=" + wlanRegisteredStatus +
                ", wlanRefusedReason=" + wlanRefusedReason +
                ", position=" + position +
                ", systemTime=" + systemTime +
                ", latestPublicConnectTime=" + latestPublicConnectTime +
                ", mpuCurrentTime=" + mpuCurrentTime +
                ", mcuCurrentTime=" + mcuCurrentTime +
                ", powerVoltage=" + powerVoltage +
                ", standbyPowerVoltage=" + standbyPowerVoltage +
                ", mpuLastestRestartReason=" + mpuLastestRestartReason +
                ", mcuRestartCount=" + mcuRestartCount +
                ", mpuDormancyStatus=" + mpuDormancyStatus +
                ", mcuDormancyAccStatus=" + mcuDormancyAccStatus +
                ", mcuDormancyCanStatus=" + mcuDormancyCanStatus +
                ", mcuDormancyMPUStatus=" + mcuDormancyMPUStatus +
                ", mcuDormancyStatus=" + mcuDormancyStatus +
                ", mpuRtcWakeUpCycle=" + mpuRtcWakeUpCycle +
                ", mcuLatestWakeUpTime=" + mcuLatestWakeUpTime +
                '}';
    }
}
