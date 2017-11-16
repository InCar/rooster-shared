package com.incarcloud.rooster.datapack;

/**
 * @author ChenZhao
 * @ClassName: DataPackCanEps
 * @Description: can EPS  0x18FF00E0 0x18FF01E0
 * @date 2017-09-14 14:25
 */
public class DataPackCanEps extends DataPackObject {

    /**
     * EPS故障等级
     */
    private Integer errLevel;
    /**
     * EPS工作状态
     */
    private Integer isWork;
    /**
     * EPS助力力矩
     */
    private Float helpMoment;
    /**
     * EPS电机工作电流
     */
    private Float electricity;
    /**
     * 电源电压
     */
    private Float voltage;
    /**
     * EPS传感器故障
     */
    private Integer isSensorErr;
    /**
     * EPS电流异常
     */
    private Integer isCurrentException;
    /**
     * EPS电压过高
     */
    private Integer isVoltageHigher;
    /**
     * EPS温度过高
     */
    private Integer isTempHigher;
    /**
     * EPS电压过低
     */
    private Integer isVoltageLower;
    /**
     * EPS初始化异常
     */
    private Integer isInitException;
    /**
     * EPS电机驱动器故障
     */
    private Integer isDriverErr;
    /**
     * 电机初始化及轮询故障
     */
    private Integer isMotorInitErr;
    /**
     * 角度传感器故障
     */
    private Integer isAngleSensorErr;
    /**
     * CAN控制器故障
     */
    private Integer isCanCtrlErr;
    /**
     * 钥匙位置或车速信号失效
     */
    private Integer isKeyInvalid;
    /**
     * 温度传感器超下限
     */
    private Integer isTempLowerLmt;
    /**
     * 温度传感器超上限
     */
    private Integer isTempUpperLmt;

    public DataPackCanEps(DataPackObject dataPack) {
        super(dataPack);
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
                '}';
    }
}
