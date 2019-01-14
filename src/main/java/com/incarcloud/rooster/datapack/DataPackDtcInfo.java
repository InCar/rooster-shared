package com.incarcloud.rooster.datapack;

/**
 * 自诊断DTC信息
 *
 * @author Kong, created on 2019-01-04T16:51.
 * @since 1.2.0-SNAPSHOT
 */
public class DataPackDtcInfo extends DataPackObject{

    /**
     * 供电电压过高
     * 0-故障未发生
     * 1-故障已发生
     * 11-故障确认发生
     * 10-故障已恢复但未确认
     * 8-故障确认恢复恢复
     */
    private Integer supplyVoltageHigh ;

    /**
     * 供电电压过低
     * 0-故障未发生
     * 1-故障已发生
     * 11-故障确认发生
     * 10-故障已恢复但未确认
     * 8-故障确认恢复恢复
     */
    private Integer supplyVoltageLow ;

    /**
     * GPS天线开路
     * 0-故障未发生
     * 1-故障已发生
     * 11-故障确认发生
     * 10-故障已恢复但未确认
     * 8-故障确认恢复恢复
     */
    private Integer gpsAntennaOpen ;

    /**
     * GPS天线短路
     * 0-故障未发生
     * 1-故障已发生
     * 11-故障确认发生
     * 10-故障已恢复但未确认
     * 8-故障确认恢复恢复
     */
    private Integer gpsAntennaShort ;

    /**
     * 备用电池未连接
     * 0-故障未发生
     * 1-故障已发生
     * 11-故障确认发生
     * 10-故障已恢复但未确认
     * 8-故障确认恢复恢复
     */
    private Integer backupBatteryNotConnected ;

    /**
     * CAN通讯故障
     * 0-故障未发生
     * 1-故障已发生
     * 11-故障确认发生
     * 10-故障已恢复但未确认
     * 8-故障确认恢复恢复
     */
    private Integer canCommunicationFailure ;

    /**
     * LTE分集天线开路
     * 0-故障未发生
     * 1-故障已发生
     * 11-故障确认发生
     * 10-故障已恢复但未确认
     * 8-故障确认恢复恢复
     */
    private Integer lteDiversityAntennaOpen ;

    /**
     * LTE分集天线短路
     * 0-故障未发生
     * 1-故障已发生
     * 11-故障确认发生
     * 10-故障已恢复但未确认
     * 8-故障确认恢复恢复
     */
    private Integer lteDiversityAntennaShort ;

    /**
     * 备用电池寿命末期
     * 0-故障未发生
     * 1-故障已发生
     * 11-故障确认发生
     * 10-故障已恢复但未确认
     * 8-故障确认恢复恢复
     */
    private Integer backupBatteryEndOfLife ;

    /**
     * GPS模块故障
     * 0-故障未发生
     * 1-故障已发生
     * 11-故障确认发生
     * 10-故障已恢复但未确认
     * 8-故障确认恢复恢复
     */
    private Integer gpsModelFailure ;

    /**
     * Gsensor模块故障
     * 0-故障未发生
     * 1-故障已发生
     * 11-故障确认发生
     * 10-故障已恢复但未确认
     * 8-故障确认恢复恢复
     */
    private Integer gsensorModelFailure ;

    /**
     * 备用电池温度过高
     * 0-故障未发生
     * 1-故障已发生
     * 11-故障确认发生
     * 10-故障已恢复但未确认
     * 8-故障确认恢复恢复
     */
    private Integer backupBatteryTemperatureHigh ;

    /**
     * KL30断开
     * 0-故障未发生
     * 1-故障已发生
     * 11-故障确认发生
     * 10-故障已恢复但未确认
     * 8-故障确认恢复恢复
     */
    private Integer KL30Open ;

    /**
     * LTE主集天线开路
     * 0-故障未发生
     * 1-故障已发生
     * 11-故障确认发生
     * 10-故障已恢复但未确认
     * 8-故障确认恢复恢复
     */
    private Integer lteMainAntennaOpen ;

    /**
     * LTE主集天线短路
     * 0-故障未发生
     * 1-故障已发生
     * 11-故障确认发生
     * 10-故障已恢复但未确认
     * 8-故障确认恢复恢复
     */
    private Integer lteMainAntennaShort ;

    public DataPackDtcInfo(DataPackObject object) {
        super(object);
    }


    public Integer getSupplyVoltageHigh() {
        return supplyVoltageHigh;
    }

    public void setSupplyVoltageHigh(Integer supplyVoltageHigh) {
        this.supplyVoltageHigh = supplyVoltageHigh;
    }

    public Integer getSupplyVoltageLow() {
        return supplyVoltageLow;
    }

    public void setSupplyVoltageLow(Integer supplyVoltageLow) {
        this.supplyVoltageLow = supplyVoltageLow;
    }

    public Integer getGpsAntennaOpen() {
        return gpsAntennaOpen;
    }

    public void setGpsAntennaOpen(Integer gpsAntennaOpen) {
        this.gpsAntennaOpen = gpsAntennaOpen;
    }

    public Integer getGpsAntennaShort() {
        return gpsAntennaShort;
    }

    public void setGpsAntennaShort(Integer gpsAntennaShort) {
        this.gpsAntennaShort = gpsAntennaShort;
    }

    public Integer getBackupBatteryNotConnected() {
        return backupBatteryNotConnected;
    }

    public void setBackupBatteryNotConnected(Integer backupBatteryNotConnected) {
        this.backupBatteryNotConnected = backupBatteryNotConnected;
    }

    public Integer getCanCommunicationFailure() {
        return canCommunicationFailure;
    }

    public void setCanCommunicationFailure(Integer canCommunicationFailure) {
        this.canCommunicationFailure = canCommunicationFailure;
    }

    public Integer getLteDiversityAntennaOpen() {
        return lteDiversityAntennaOpen;
    }

    public void setLteDiversityAntennaOpen(Integer lteDiversityAntennaOpen) {
        this.lteDiversityAntennaOpen = lteDiversityAntennaOpen;
    }

    public Integer getLteDiversityAntennaShort() {
        return lteDiversityAntennaShort;
    }

    public void setLteDiversityAntennaShort(Integer lteDiversityAntennaShort) {
        this.lteDiversityAntennaShort = lteDiversityAntennaShort;
    }

    public Integer getBackupBatteryEndOfLife() {
        return backupBatteryEndOfLife;
    }

    public void setBackupBatteryEndOfLife(Integer backupBatteryEndOfLife) {
        this.backupBatteryEndOfLife = backupBatteryEndOfLife;
    }

    public Integer getGpsModelFailure() {
        return gpsModelFailure;
    }

    public void setGpsModelFailure(Integer gpsModelFailure) {
        this.gpsModelFailure = gpsModelFailure;
    }

    public Integer getGsensorModelFailure() {
        return gsensorModelFailure;
    }

    public void setGsensorModelFailure(Integer gsensorModelFailure) {
        this.gsensorModelFailure = gsensorModelFailure;
    }

    public Integer getBackupBatteryTemperatureHigh() {
        return backupBatteryTemperatureHigh;
    }

    public void setBackupBatteryTemperatureHigh(Integer backupBatteryTemperatureHigh) {
        this.backupBatteryTemperatureHigh = backupBatteryTemperatureHigh;
    }

    public Integer getKL30Open() {
        return KL30Open;
    }

    public void setKL30Open(Integer KL30Open) {
        this.KL30Open = KL30Open;
    }

    public Integer getLteMainAntennaOpen() {
        return lteMainAntennaOpen;
    }

    public void setLteMainAntennaOpen(Integer lteMainAntennaOpen) {
        this.lteMainAntennaOpen = lteMainAntennaOpen;
    }

    public Integer getLteMainAntennaShort() {
        return lteMainAntennaShort;
    }

    public void setLteMainAntennaShort(Integer lteMainAntennaShort) {
        this.lteMainAntennaShort = lteMainAntennaShort;
    }

    @Override
    public String toString() {
        return "DataPackDtcInfo{" +
                "supplyVoltageHigh=" + supplyVoltageHigh +
                ", supplyVoltageLow=" + supplyVoltageLow +
                ", gpsAntennaOpen=" + gpsAntennaOpen +
                ", gpsAntennaShort=" + gpsAntennaShort +
                ", backupBatteryNotConnected=" + backupBatteryNotConnected +
                ", canCommunicationFailure=" + canCommunicationFailure +
                ", lteDiversityAntennaOpen=" + lteDiversityAntennaOpen +
                ", lteDiversityAntennaShort=" + lteDiversityAntennaShort +
                ", backupBatteryEndOfLife=" + backupBatteryEndOfLife +
                ", gpsModelFailure=" + gpsModelFailure +
                ", gsensorModelFailure=" + gsensorModelFailure +
                ", backupBatteryTemperatureHigh=" + backupBatteryTemperatureHigh +
                ", KL30Open=" + KL30Open +
                ", lteMainAntennaOpen=" + lteMainAntennaOpen +
                ", lteMainAntennaShort=" + lteMainAntennaShort +
                '}';
    }
}
