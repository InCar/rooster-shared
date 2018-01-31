package com.incarcloud.rooster.datapack;

/**
 * @author ChenZhao
 * @ClassName: DataPackCanMc
 * @Description: can mc 0x0Cf11F05 0x0cF12F05 0x0CF13F05
 * @date 2017-09-14 17:10
 */
public class DataPackCanMc extends DataPackObject {

    /**
     * 电机控制器工作状态
     */
    private Integer runStatus;
    /**
     * 温度状态
     */
    private Integer temStatus;
    /**
     * 母线电压状态
     */
    private Integer voltageStatus;
    /**
     * 母线电压
     */
    private Float voltageRange;
    /**
     * 电机温度
     */
    private Integer motorTemprature;
    /**
     * 控制器温度
     */
    private Integer mcTemprature;
    /**
     * 电机转速
     */
    private Integer motorRpm;
    /**
     * 电机相电流
     */
    private Float motorCurrent;
    /**
     * 电机控制器状态
     */
    private Integer muStatus;
    /**
     * 加速踏板开度
     */
    private Integer aprRate;
    /**
     * 电机控制器当前估计扭矩
     */
    private Float mcNm;
    /**
     * 母线电流
     */
    private Float busCurrent;
    /**
     * 制动踏板开度
     */
    private Integer brakeRate;
    /**
     * 车型类别
     */
    private Integer carType;
    /**
     * 任一相电流是否过流
     */
    private Integer isCurrentOut;
    /**
     * 直流母线是否过流
     */
    private Integer isBusCurrentOut;
    /**
     * 电机转速超过限值
     */
    private Integer isMotorRpmOut;
    /**
     * 霍尔故障
     */
    private Integer isHolzerError;
    /**
     * 加速踏板故障
     */
    private Integer isAprError;
    /**
     * 档位输入故障
     */
    private Integer isGeerError;
    /**
     * LIFE值
     */
    private Integer motorLife;
    /**
     * 母线电流传感器故障
     */
    private Integer busCurrentSensorError;
    /**
     * 相线电流传感器故障
     */
    private Integer phaseCurrentSensorError;
    /**
     * 母线电压传感器故障
     */
    private Integer busVolSensorError;
    /**
     * 控制器温度传感器故障
     */
    private Integer controlTempSensorError;
    /**
     * 电机温度传感器故障
     */
    private Integer mTempSensorError;
    /**
     * 旋转变压器故障
     */
    private Integer rotaryTransformerError;
    /**
     * 控制器温度报警
     */
    private Integer controlTempError;
    /**
     * 控制器过温故障
     */
    private Integer controlOuttempError;
    /**
     * 电机温度报警
     */
    private Integer mTempAlarm;
    /**
     * 电机过温故障
     */
    private Integer mOuttempError;
    /**
     * 母线过流（短路）
     */
    private Integer busOutcurrent;
    /**
     * 母线过压报警
     */
    private Integer busOutvolAlarm;
    /**
     * 母线过压故障
     */
    private Integer busOutvolError;
    /**
     * 母线欠压报警
     */
    private Integer busUpdervolAlarm;
    /**
     * 母线欠压故障
     */
    private Integer busUpdervolError;
    /**
     * 控制电欠压故障
     */
    private Integer controlUpdervolError;
    /**
     * 控制电过压故障
     */
    private Integer controlOutvolError;
    /**
     * 相线过流
     */
    private Integer phaseOutcurrent;
    /**
     * 电机超速报警
     */
    private Integer mOutspeedAlarm;
    /**
     * 电机超速故障
     */
    private Integer mOutspeedError;
    /**
     * 预充电故障
     */
    private Integer perchargeError;
    /**
     * 加速踏板预采样故障
     */
    private Integer pedalPersamplingError;
    /**
     * CAN总线通讯故障
     */
    private Integer canCommunicationError;
    /**
     * 故障等级
     */
    private Integer errorLevel;
    /**
     * 降功率等级
     */
    private Integer deratingLevel;
    /**
     * 动力输出状态
     */
    private Integer powerOutStatus;
    /**
     * 供应商配置代码
     */
    private String supplierCode;


    public DataPackCanMc(DataPackObject dataPack) {
        super(dataPack);
    }

    public Integer getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
    }

    public Integer getTemStatus() {
        return temStatus;
    }

    public void setTemStatus(Integer temStatus) {
        this.temStatus = temStatus;
    }

    public Integer getVoltageStatus() {
        return voltageStatus;
    }

    public void setVoltageStatus(Integer voltageStatus) {
        this.voltageStatus = voltageStatus;
    }

    public Float getVoltageRange() {
        return voltageRange;
    }

    public void setVoltageRange(Float voltageRange) {
        this.voltageRange = voltageRange;
    }

    public Integer getMotorTemprature() {
        return motorTemprature;
    }

    public void setMotorTemprature(Integer motorTemprature) {
        this.motorTemprature = motorTemprature;
    }

    public Integer getMcTemprature() {
        return mcTemprature;
    }

    public void setMcTemprature(Integer mcTemprature) {
        this.mcTemprature = mcTemprature;
    }

    public Integer getMotorRpm() {
        return motorRpm;
    }

    public void setMotorRpm(Integer motorRpm) {
        this.motorRpm = motorRpm;
    }

    public Float getMotorCurrent() {
        return motorCurrent;
    }

    public void setMotorCurrent(Float motorCurrent) {
        this.motorCurrent = motorCurrent;
    }

    public Integer getMuStatus() {
        return muStatus;
    }

    public void setMuStatus(Integer muStatus) {
        this.muStatus = muStatus;
    }

    public Integer getAprRate() {
        return aprRate;
    }

    public void setAprRate(Integer aprRate) {
        this.aprRate = aprRate;
    }

    public Float getMcNm() {
        return mcNm;
    }

    public void setMcNm(Float mcNm) {
        this.mcNm = mcNm;
    }

    public Float getBusCurrent() {
        return busCurrent;
    }

    public void setBusCurrent(Float busCurrent) {
        this.busCurrent = busCurrent;
    }

    public Integer getBrakeRate() {
        return brakeRate;
    }

    public void setBrakeRate(Integer brakeRate) {
        this.brakeRate = brakeRate;
    }

    public Integer getCarType() {
        return carType;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    public Integer getIsCurrentOut() {
        return isCurrentOut;
    }

    public void setIsCurrentOut(Integer isCurrentOut) {
        this.isCurrentOut = isCurrentOut;
    }

    public Integer getIsBusCurrentOut() {
        return isBusCurrentOut;
    }

    public void setIsBusCurrentOut(Integer isBusCurrentOut) {
        this.isBusCurrentOut = isBusCurrentOut;
    }

    public Integer getIsMotorRpmOut() {
        return isMotorRpmOut;
    }

    public void setIsMotorRpmOut(Integer isMotorRpmOut) {
        this.isMotorRpmOut = isMotorRpmOut;
    }

    public Integer getIsHolzerError() {
        return isHolzerError;
    }

    public void setIsHolzerError(Integer isHolzerError) {
        this.isHolzerError = isHolzerError;
    }

    public Integer getIsAprError() {
        return isAprError;
    }

    public void setIsAprError(Integer isAprError) {
        this.isAprError = isAprError;
    }

    public Integer getIsGeerError() {
        return isGeerError;
    }

    public void setIsGeerError(Integer isGeerError) {
        this.isGeerError = isGeerError;
    }

    public Integer getMotorLife() {
        return motorLife;
    }

    public void setMotorLife(Integer motorLife) {
        this.motorLife = motorLife;
    }

    public Integer getBusCurrentSensorError() {
        return busCurrentSensorError;
    }

    public void setBusCurrentSensorError(Integer busCurrentSensorError) {
        this.busCurrentSensorError = busCurrentSensorError;
    }

    public Integer getPhaseCurrentSensorError() {
        return phaseCurrentSensorError;
    }

    public void setPhaseCurrentSensorError(Integer phaseCurrentSensorError) {
        this.phaseCurrentSensorError = phaseCurrentSensorError;
    }

    public Integer getBusVolSensorError() {
        return busVolSensorError;
    }

    public void setBusVolSensorError(Integer busVolSensorError) {
        this.busVolSensorError = busVolSensorError;
    }

    public Integer getControlTempSensorError() {
        return controlTempSensorError;
    }

    public void setControlTempSensorError(Integer controlTempSensorError) {
        this.controlTempSensorError = controlTempSensorError;
    }

    public Integer getmTempSensorError() {
        return mTempSensorError;
    }

    public void setmTempSensorError(Integer mTempSensorError) {
        this.mTempSensorError = mTempSensorError;
    }

    public Integer getRotaryTransformerError() {
        return rotaryTransformerError;
    }

    public void setRotaryTransformerError(Integer rotaryTransformerError) {
        this.rotaryTransformerError = rotaryTransformerError;
    }

    public Integer getControlTempError() {
        return controlTempError;
    }

    public void setControlTempError(Integer controlTempError) {
        this.controlTempError = controlTempError;
    }

    public Integer getControlOuttempError() {
        return controlOuttempError;
    }

    public void setControlOuttempError(Integer controlOuttempError) {
        this.controlOuttempError = controlOuttempError;
    }

    public Integer getmTempAlarm() {
        return mTempAlarm;
    }

    public void setmTempAlarm(Integer mTempAlarm) {
        this.mTempAlarm = mTempAlarm;
    }

    public Integer getmOuttempError() {
        return mOuttempError;
    }

    public void setmOuttempError(Integer mOuttempError) {
        this.mOuttempError = mOuttempError;
    }

    public Integer getBusOutcurrent() {
        return busOutcurrent;
    }

    public void setBusOutcurrent(Integer busOutcurrent) {
        this.busOutcurrent = busOutcurrent;
    }

    public Integer getBusOutvolAlarm() {
        return busOutvolAlarm;
    }

    public void setBusOutvolAlarm(Integer busOutvolAlarm) {
        this.busOutvolAlarm = busOutvolAlarm;
    }

    public Integer getBusOutvolError() {
        return busOutvolError;
    }

    public void setBusOutvolError(Integer busOutvolError) {
        this.busOutvolError = busOutvolError;
    }

    public Integer getBusUpdervolAlarm() {
        return busUpdervolAlarm;
    }

    public void setBusUpdervolAlarm(Integer busUpdervolAlarm) {
        this.busUpdervolAlarm = busUpdervolAlarm;
    }

    public Integer getBusUpdervolError() {
        return busUpdervolError;
    }

    public void setBusUpdervolError(Integer busUpdervolError) {
        this.busUpdervolError = busUpdervolError;
    }

    public Integer getControlUpdervolError() {
        return controlUpdervolError;
    }

    public void setControlUpdervolError(Integer controlUpdervolError) {
        this.controlUpdervolError = controlUpdervolError;
    }

    public Integer getControlOutvolError() {
        return controlOutvolError;
    }

    public void setControlOutvolError(Integer controlOutvolError) {
        this.controlOutvolError = controlOutvolError;
    }

    public Integer getPhaseOutcurrent() {
        return phaseOutcurrent;
    }

    public void setPhaseOutcurrent(Integer phaseOutcurrent) {
        this.phaseOutcurrent = phaseOutcurrent;
    }

    public Integer getmOutspeedAlarm() {
        return mOutspeedAlarm;
    }

    public void setmOutspeedAlarm(Integer mOutspeedAlarm) {
        this.mOutspeedAlarm = mOutspeedAlarm;
    }

    public Integer getmOutspeedError() {
        return mOutspeedError;
    }

    public void setmOutspeedError(Integer mOutspeedError) {
        this.mOutspeedError = mOutspeedError;
    }

    public Integer getPerchargeError() {
        return perchargeError;
    }

    public void setPerchargeError(Integer perchargeError) {
        this.perchargeError = perchargeError;
    }

    public Integer getPedalPersamplingError() {
        return pedalPersamplingError;
    }

    public void setPedalPersamplingError(Integer pedalPersamplingError) {
        this.pedalPersamplingError = pedalPersamplingError;
    }

    public Integer getCanCommunicationError() {
        return canCommunicationError;
    }

    public void setCanCommunicationError(Integer canCommunicationError) {
        this.canCommunicationError = canCommunicationError;
    }

    public Integer getErrorLevel() {
        return errorLevel;
    }

    public void setErrorLevel(Integer errorLevel) {
        this.errorLevel = errorLevel;
    }

    public Integer getDeratingLevel() {
        return deratingLevel;
    }

    public void setDeratingLevel(Integer deratingLevel) {
        this.deratingLevel = deratingLevel;
    }

    public Integer getPowerOutStatus() {
        return powerOutStatus;
    }

    public void setPowerOutStatus(Integer powerOutStatus) {
        this.powerOutStatus = powerOutStatus;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    @Override
    public String toString() {
        return "DataPackCanMc{" +
                "runStatus=" + runStatus +
                ", temStatus=" + temStatus +
                ", voltageStatus=" + voltageStatus +
                ", voltageRange=" + voltageRange +
                ", motorTemprature=" + motorTemprature +
                ", mcTemprature=" + mcTemprature +
                ", motorRpm=" + motorRpm +
                ", motorCurrent=" + motorCurrent +
                ", muStatus=" + muStatus +
                ", aprRate=" + aprRate +
                ", mcNm=" + mcNm +
                ", busCurrent=" + busCurrent +
                ", brakeRate=" + brakeRate +
                ", carType=" + carType +
                ", isCurrentOut=" + isCurrentOut +
                ", isBusCurrentOut=" + isBusCurrentOut +
                ", isMotorRpmOut=" + isMotorRpmOut +
                ", isHolzerError=" + isHolzerError +
                ", isAprError=" + isAprError +
                ", isGeerError=" + isGeerError +
                ", motorLife=" + motorLife +
                ", busCurrentSensorError=" + busCurrentSensorError +
                ", phaseCurrentSensorError=" + phaseCurrentSensorError +
                ", busVolSensorError=" + busVolSensorError +
                ", controlTempSensorError=" + controlTempSensorError +
                ", mTempSensorError=" + mTempSensorError +
                ", rotaryTransformerError=" + rotaryTransformerError +
                ", controlTempError=" + controlTempError +
                ", controlOuttempError=" + controlOuttempError +
                ", mTempAlarm=" + mTempAlarm +
                ", mOuttempError=" + mOuttempError +
                ", busOutcurrent=" + busOutcurrent +
                ", busOutvolAlarm=" + busOutvolAlarm +
                ", busOutvolError=" + busOutvolError +
                ", busUpdervolAlarm=" + busUpdervolAlarm +
                ", busUpdervolError=" + busUpdervolError +
                ", controlUpdervolError=" + controlUpdervolError +
                ", controlOutvolError=" + controlOutvolError +
                ", phaseOutcurrent=" + phaseOutcurrent +
                ", mOutspeedAlarm=" + mOutspeedAlarm +
                ", mOutspeedError=" + mOutspeedError +
                ", perchargeError=" + perchargeError +
                ", pedalPersamplingError=" + pedalPersamplingError +
                ", canCommunicationError=" + canCommunicationError +
                ", errorLevel=" + errorLevel +
                ", deratingLevel=" + deratingLevel +
                ", powerOutStatus=" + powerOutStatus +
                ", supplierCode='" + supplierCode + '\'' +
                '}';
    }
}
