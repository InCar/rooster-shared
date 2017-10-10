package com.incarcloud.rooster.datapack;

/**
 * @author ChenZhao
 * @ClassName: DataPackCanObc
 * @Description: can OBC 0x18FF50E5 0x18FF51E5 0x18FF52E5
 * @date 2017-09-14 16:39
 */
public class DataPackCanObc extends DataPackObject{
    private Float outVoltage;
    private Float outCurrent;
    private Integer isHardErr;
    private Integer isTempHigh;
    private Integer isVoltageErr;
    private Integer isRunning;
    private Integer isCommected;
    private Integer isReady;
    private Float inVoltage;
    private Float inCurrent;
    private Float pfcVoltage;
    private Float v12Voltage;
    private Float v12Current;
    private Float hardOutkwLevel;
    private Integer hardOutcurrentLevel;
    private Integer temprature1;
    private Integer temprature2;
    private Integer temprature3;
    private Integer fanStatus;
    private Integer chargerStatus;
    private Integer tempratureError;
    private Integer inUpdervoltage1;
    private Integer inUpdervoltage2;
    private Integer inOutvoltage;
    private Integer highvolOutUpdervol;
    private Integer highvolOutOutdervol;
    private Integer outOutcurrent;
    private Integer pfcVolError;
    private Integer v12OutvolError;
    private Integer v12UpdervolError;

    public DataPackCanObc(DataPackObject dataPack) {
        super(dataPack);
    }

    @Override
    public String toString() {
        return "DataPackCanObc{" +
                "outVoltage=" + outVoltage +
                ", outCurrent=" + outCurrent +
                ", isHardErr=" + isHardErr +
                ", isTempHigh=" + isTempHigh +
                ", isVoltageErr=" + isVoltageErr +
                ", isRunning=" + isRunning +
                ", isCommected=" + isCommected +
                ", isReady=" + isReady +
                ", inVoltage=" + inVoltage +
                ", inCurrent=" + inCurrent +
                ", pfcVoltage=" + pfcVoltage +
                ", v12Voltage=" + v12Voltage +
                ", v12Current=" + v12Current +
                ", hardOutkwLevel=" + hardOutkwLevel +
                ", hardOutcurrentLevel=" + hardOutcurrentLevel +
                ", temprature1=" + temprature1 +
                ", temprature2=" + temprature2 +
                ", temprature3=" + temprature3 +
                ", fanStatus=" + fanStatus +
                ", chargerStatus=" + chargerStatus +
                ", tempratureError=" + tempratureError +
                ", inUpdervoltage1=" + inUpdervoltage1 +
                ", inUpdervoltage2=" + inUpdervoltage2 +
                ", inOutvoltage=" + inOutvoltage +
                ", highvolOutUpdervol=" + highvolOutUpdervol +
                ", highvolOutOutdervol=" + highvolOutOutdervol +
                ", outOutcurrent=" + outOutcurrent +
                ", pfcVolError=" + pfcVolError +
                ", v12OutvolError=" + v12OutvolError +
                ", v12UpdervolError=" + v12UpdervolError +
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

    public Float getOutVoltage() {
        return outVoltage;
    }

    public void setOutVoltage(Float outVoltage) {
        this.outVoltage = outVoltage;
    }

    public Float getOutCurrent() {
        return outCurrent;
    }

    public void setOutCurrent(Float outCurrent) {
        this.outCurrent = outCurrent;
    }

    public Integer getIsHardErr() {
        return isHardErr;
    }

    public void setIsHardErr(Integer isHardErr) {
        this.isHardErr = isHardErr;
    }

    public Integer getIsTempHigh() {
        return isTempHigh;
    }

    public void setIsTempHigh(Integer isTempHigh) {
        this.isTempHigh = isTempHigh;
    }

    public Integer getIsVoltageErr() {
        return isVoltageErr;
    }

    public void setIsVoltageErr(Integer isVoltageErr) {
        this.isVoltageErr = isVoltageErr;
    }

    public Integer getIsRunning() {
        return isRunning;
    }

    public void setIsRunning(Integer isRunning) {
        this.isRunning = isRunning;
    }

    public Integer getIsCommected() {
        return isCommected;
    }

    public void setIsCommected(Integer isCommected) {
        this.isCommected = isCommected;
    }

    public Integer getIsReady() {
        return isReady;
    }

    public void setIsReady(Integer isReady) {
        this.isReady = isReady;
    }

    public Float getInVoltage() {
        return inVoltage;
    }

    public void setInVoltage(Float inVoltage) {
        this.inVoltage = inVoltage;
    }

    public Float getInCurrent() {
        return inCurrent;
    }

    public void setInCurrent(Float inCurrent) {
        this.inCurrent = inCurrent;
    }

    public Float getPfcVoltage() {
        return pfcVoltage;
    }

    public void setPfcVoltage(Float pfcVoltage) {
        this.pfcVoltage = pfcVoltage;
    }

    public Float getV12Voltage() {
        return v12Voltage;
    }

    public void setV12Voltage(Float v12Voltage) {
        this.v12Voltage = v12Voltage;
    }

    public Float getV12Current() {
        return v12Current;
    }

    public void setV12Current(Float v12Current) {
        this.v12Current = v12Current;
    }

    public Float getHardOutkwLevel() {
        return hardOutkwLevel;
    }

    public void setHardOutkwLevel(Float hardOutkwLevel) {
        this.hardOutkwLevel = hardOutkwLevel;
    }

    public Integer getHardOutcurrentLevel() {
        return hardOutcurrentLevel;
    }

    public void setHardOutcurrentLevel(Integer hardOutcurrentLevel) {
        this.hardOutcurrentLevel = hardOutcurrentLevel;
    }

    public Integer getTemprature1() {
        return temprature1;
    }

    public void setTemprature1(Integer temprature1) {
        this.temprature1 = temprature1;
    }

    public Integer getTemprature2() {
        return temprature2;
    }

    public void setTemprature2(Integer temprature2) {
        this.temprature2 = temprature2;
    }

    public Integer getTemprature3() {
        return temprature3;
    }

    public void setTemprature3(Integer temprature3) {
        this.temprature3 = temprature3;
    }

    public Integer getFanStatus() {
        return fanStatus;
    }

    public void setFanStatus(Integer fanStatus) {
        this.fanStatus = fanStatus;
    }

    public Integer getChargerStatus() {
        return chargerStatus;
    }

    public void setChargerStatus(Integer chargerStatus) {
        this.chargerStatus = chargerStatus;
    }

    public Integer getTempratureError() {
        return tempratureError;
    }

    public void setTempratureError(Integer tempratureError) {
        this.tempratureError = tempratureError;
    }

    public Integer getInUpdervoltage1() {
        return inUpdervoltage1;
    }

    public void setInUpdervoltage1(Integer inUpdervoltage1) {
        this.inUpdervoltage1 = inUpdervoltage1;
    }

    public Integer getInUpdervoltage2() {
        return inUpdervoltage2;
    }

    public void setInUpdervoltage2(Integer inUpdervoltage2) {
        this.inUpdervoltage2 = inUpdervoltage2;
    }

    public Integer getInOutvoltage() {
        return inOutvoltage;
    }

    public void setInOutvoltage(Integer inOutvoltage) {
        this.inOutvoltage = inOutvoltage;
    }

    public Integer getHighvolOutUpdervol() {
        return highvolOutUpdervol;
    }

    public void setHighvolOutUpdervol(Integer highvolOutUpdervol) {
        this.highvolOutUpdervol = highvolOutUpdervol;
    }

    public Integer getHighvolOutOutdervol() {
        return highvolOutOutdervol;
    }

    public void setHighvolOutOutdervol(Integer highvolOutOutdervol) {
        this.highvolOutOutdervol = highvolOutOutdervol;
    }

    public Integer getOutOutcurrent() {
        return outOutcurrent;
    }

    public void setOutOutcurrent(Integer outOutcurrent) {
        this.outOutcurrent = outOutcurrent;
    }

    public Integer getPfcVolError() {
        return pfcVolError;
    }

    public void setPfcVolError(Integer pfcVolError) {
        this.pfcVolError = pfcVolError;
    }

    public Integer getV12OutvolError() {
        return v12OutvolError;
    }

    public void setV12OutvolError(Integer v12OutvolError) {
        this.v12OutvolError = v12OutvolError;
    }

    public Integer getV12UpdervolError() {
        return v12UpdervolError;
    }

    public void setV12UpdervolError(Integer v12UpdervolError) {
        this.v12UpdervolError = v12UpdervolError;
    }
}
