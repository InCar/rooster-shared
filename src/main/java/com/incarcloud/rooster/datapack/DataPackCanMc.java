package com.incarcloud.rooster.datapack;

/**
 * @author ChenZhao
 * @ClassName: DataPackCanMc
 * @Description: can mc 0x0Cf11F05 0x0cF12F05 0x0CF13F05
 * @date 2017-09-14 17:10
 */
public class DataPackCanMc extends DataPackObject{
    private Integer runStatus;
    private Integer temStatus;
    private Integer voltageStatus;
    private Float voltageRange;
    private Integer motorTemprature;
    private Integer mcTemprature;
    private Integer motorRpm;
    private Float motorCurrent;
    private Integer muStatus;
    private Integer aprRate;
    private Float mcNm;
    private Float busCurrent;
    private Integer brakeRate;
    private Integer carType;
    private Integer isCurrentOut;
    private Integer isBusCurrentOut;
    private Integer isMotorRpmOut;
    private Integer isHolzerError;
    private Integer isAprError;
    private Integer isGeerError;
    private Integer motorLife;
    private Integer busCurrentSensorError;
    private Integer phaseCurrentSensorError;
    private Integer busVolSensorError;
    private Integer controlTempSensorError;
    private Integer mTempSensorError;
    private Integer rotaryTransformerError;
    private Integer controlTempError;
    private Integer controlOuttempError;
    private Integer mTempAlarm;
    private Integer mOuttempError;
    private Integer busOutcurrent;
    private Integer busOutvolAlarm;
    private Integer busOutvolError;
    private Integer busUpdervolAlarm;
    private Integer busUpdervolError;
    private Integer controlUpdervolError;
    private Integer controlOutvolError;
    private Integer phaseOutcurrent;
    private Integer mOutspeedAlarm;
    private Integer mOutspeedError;
    private Integer perchargeError;
    private Integer pedalPersamplingError;
    private Integer canCommunicationError;
    private Integer errorLevel;
    private Integer deratingLevel;
    private Integer powerOutStatus;
    private String supplierCode;


    public DataPackCanMc(DataPack dataPack) {
        super(dataPack);
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
}
