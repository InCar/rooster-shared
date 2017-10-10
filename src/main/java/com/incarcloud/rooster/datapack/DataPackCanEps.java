package com.incarcloud.rooster.datapack;

/**
 * @author ChenZhao
 * @ClassName: DataPackCanEps
 * @Description: can EPS  0x18FF00E0 0x18FF01E0
 * @date 2017-09-14 14:25
 */
public class DataPackCanEps extends DataPackObject{
    private Integer errLevel; // EPS故障等级
    private Integer isWork; // EPS工作状态
    private Float helpMoment; // EPS助力力矩
    private Float electricity; // EPS电机工作电流
    private Float voltage; // 电源电压
    private Integer isSensorErr; // EPS传感器故障
    private Integer isCurrentException; // EPS电流异常
    private Integer isVoltageHigher; // EPS电压过高
    private Integer isTempHigher; // EPS温度过高
    private Integer isVoltageLower; // EPS电压过低
    private Integer isInitException; // EPS初始化异常
    private Integer isDriverErr; // EPS电机驱动器故障
    private Integer isMotorInitErr;//电机初始化及轮询故障
    private Integer isAngleSensorErr;//角度传感器故障
    private Integer isCanCtrlErr;//CAN控制器故障
    private Integer isKeyInvalid;//钥匙位置或车速信号失效
    private Integer isTempLowerLmt;//温度传感器超下限
    private Integer isTempUpperLmt;//温度传感器超上限

    public DataPackCanEps(DataPackObject dataPack) {
        super(dataPack);
    }

    @Override
    public String toString() {
        return "DataPackCanEps{" +
                "errLevel=" + errLevel +
                ", isWork=" + isWork +
                ", helpMoment=" + helpMoment +
                ", electricity=" + electricity +
                ", voltage=" + voltage +
                ", isSensorErr=" + isSensorErr +
                ", isCurrentException=" + isCurrentException +
                ", isVoltageHigher=" + isVoltageHigher +
                ", isTempHigher=" + isTempHigher +
                ", isVoltageLower=" + isVoltageLower +
                ", isInitException=" + isInitException +
                ", isDriverErr=" + isDriverErr +
                ", isMotorInitErr=" + isMotorInitErr +
                ", isAngleSensorErr=" + isAngleSensorErr +
                ", isCanCtrlErr=" + isCanCtrlErr +
                ", isKeyInvalid=" + isKeyInvalid +
                ", isTempLowerLmt=" + isTempLowerLmt +
                ", isTempUpperLmt=" + isTempUpperLmt +
                ", id='" + id + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", packId=" + packId +
                ", protocolName='" + protocolName + '\'' +
                ", protocolVersion='" + protocolVersion + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", tripId=" + tripId +
                ", vid='" + vid + '\'' +
                ", vin='" + vin + '\'' +
                ", license='" + license + '\'' +
                ", subPackTotal=" + subPackTotal +
                ", subPackIndex=" + subPackIndex +
                ", encryptName='" + encryptName + '\'' +
                ", detectionTime=" + detectionTime +
                ", _group='" + _group + '\'' +
                ", _name='" + _name + '\'' +
                ", _version='" + _version + '\'' +
                ", receiveTime=" + receiveTime +
                '}';
    }

    public Integer getErrLevel() {
        return errLevel;
    }

    public void setErrLevel(Integer errLevel) {
        this.errLevel = errLevel;
    }

    public Integer getIsWork() {
        return isWork;
    }

    public void setIsWork(Integer isWork) {
        this.isWork = isWork;
    }

    public Float getHelpMoment() {
        return helpMoment;
    }

    public void setHelpMoment(Float helpMoment) {
        this.helpMoment = helpMoment;
    }

    public Float getElectricity() {
        return electricity;
    }

    public void setElectricity(Float electricity) {
        this.electricity = electricity;
    }

    public Float getVoltage() {
        return voltage;
    }

    public void setVoltage(Float voltage) {
        this.voltage = voltage;
    }

    public Integer getIsSensorErr() {
        return isSensorErr;
    }

    public void setIsSensorErr(Integer isSensorErr) {
        this.isSensorErr = isSensorErr;
    }

    public Integer getIsCurrentException() {
        return isCurrentException;
    }

    public void setIsCurrentException(Integer isCurrentException) {
        this.isCurrentException = isCurrentException;
    }

    public Integer getIsVoltageHigher() {
        return isVoltageHigher;
    }

    public void setIsVoltageHigher(Integer isVoltageHigher) {
        this.isVoltageHigher = isVoltageHigher;
    }

    public Integer getIsTempHigher() {
        return isTempHigher;
    }

    public void setIsTempHigher(Integer isTempHigher) {
        this.isTempHigher = isTempHigher;
    }

    public Integer getIsVoltageLower() {
        return isVoltageLower;
    }

    public void setIsVoltageLower(Integer isVoltageLower) {
        this.isVoltageLower = isVoltageLower;
    }

    public Integer getIsInitException() {
        return isInitException;
    }

    public void setIsInitException(Integer isInitException) {
        this.isInitException = isInitException;
    }

    public Integer getIsDriverErr() {
        return isDriverErr;
    }

    public void setIsDriverErr(Integer isDriverErr) {
        this.isDriverErr = isDriverErr;
    }

    public Integer getIsMotorInitErr() {
        return isMotorInitErr;
    }

    public void setIsMotorInitErr(Integer isMotorInitErr) {
        this.isMotorInitErr = isMotorInitErr;
    }

    public Integer getIsAngleSensorErr() {
        return isAngleSensorErr;
    }

    public void setIsAngleSensorErr(Integer isAngleSensorErr) {
        this.isAngleSensorErr = isAngleSensorErr;
    }

    public Integer getIsCanCtrlErr() {
        return isCanCtrlErr;
    }

    public void setIsCanCtrlErr(Integer isCanCtrlErr) {
        this.isCanCtrlErr = isCanCtrlErr;
    }

    public Integer getIsKeyInvalid() {
        return isKeyInvalid;
    }

    public void setIsKeyInvalid(Integer isKeyInvalid) {
        this.isKeyInvalid = isKeyInvalid;
    }

    public Integer getIsTempLowerLmt() {
        return isTempLowerLmt;
    }

    public void setIsTempLowerLmt(Integer isTempLowerLmt) {
        this.isTempLowerLmt = isTempLowerLmt;
    }

    public Integer getIsTempUpperLmt() {
        return isTempUpperLmt;
    }

    public void setIsTempUpperLmt(Integer isTempUpperLmt) {
        this.isTempUpperLmt = isTempUpperLmt;
    }
}
