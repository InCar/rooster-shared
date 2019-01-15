package com.incarcloud.rooster.cache;

/**
 * 报警参数设置
 *
 * @author Kong, created on 2019-01-15T10:23.
 * @since 2.4.1-SNAPSHOT
 */
public class AlarmParamSetting {

    /**
     * IMEI
     */
    private String imei ;

    /**
     * 报警参数版本
     */
    private String alarmVersion ;

    /**
     * 超速报警阈值
     */
    private Integer overspeed ;

    /**
     * 超速报警关系 0：等于，1：大于，2，小于
     */
    private Integer overspeedRelation ;

    /**
     * 冷却液报警阈值
     */
    private Integer coolingFluid ;

    /**
     * 冷却液关系 0：等于，1：大于，2，小于
     */
    private Integer coolingFluidRelation ;

    /**
     * 蓄电池电压最小阈值
     */
    private Integer batteryMinVoltage ;

    /**
     * 蓄电池电压最小关系 0：等于，1：大于，2，小于
     */
    private Integer batteryMinVoltageRelation ;

    /**
     * 蓄电池电压最大阈值
     */
    private Integer batteryMaxVoltage ;

    /**
     * 蓄电池电压最大关系 0：等于，1：大于，2，小于
     */
    private Integer batteryMaxVoltageRelation ;

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getAlarmVersion() {
        return alarmVersion;
    }

    public void setAlarmVersion(String alarmVersion) {
        this.alarmVersion = alarmVersion;
    }

    public Integer getOverspeed() {
        return overspeed;
    }

    public void setOverspeed(Integer overspeed) {
        this.overspeed = overspeed;
    }

    public Integer getOverspeedRelation() {
        return overspeedRelation;
    }

    public void setOverspeedRelation(Integer overspeedRelation) {
        this.overspeedRelation = overspeedRelation;
    }

    public Integer getCoolingFluid() {
        return coolingFluid;
    }

    public void setCoolingFluid(Integer coolingFluid) {
        this.coolingFluid = coolingFluid;
    }

    public Integer getCoolingFluidRelation() {
        return coolingFluidRelation;
    }

    public void setCoolingFluidRelation(Integer coolingFluidRelation) {
        this.coolingFluidRelation = coolingFluidRelation;
    }

    public Integer getBatteryMinVoltage() {
        return batteryMinVoltage;
    }

    public void setBatteryMinVoltage(Integer batteryMinVoltage) {
        this.batteryMinVoltage = batteryMinVoltage;
    }

    public Integer getBatteryMinVoltageRelation() {
        return batteryMinVoltageRelation;
    }

    public void setBatteryMinVoltageRelation(Integer batteryMinVoltageRelation) {
        this.batteryMinVoltageRelation = batteryMinVoltageRelation;
    }

    public Integer getBatteryMaxVoltage() {
        return batteryMaxVoltage;
    }

    public void setBatteryMaxVoltage(Integer batteryMaxVoltage) {
        this.batteryMaxVoltage = batteryMaxVoltage;
    }

    public Integer getBatteryMaxVoltageRelation() {
        return batteryMaxVoltageRelation;
    }

    public void setBatteryMaxVoltageRelation(Integer batteryMaxVoltageRelation) {
        this.batteryMaxVoltageRelation = batteryMaxVoltageRelation;
    }
}
