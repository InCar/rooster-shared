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
     * “0x00”表示故障未发生，
     * “0x20”上次清故障后测试失败，
     * “0x21/0x29”故障已发生但未确认，
     * “0x2B”故障确认发生，
     * “0x2A”故障已恢复但未确认，
     * “0x28”故障确认恢复，
     * “0x50”测试未完成，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer supplyVoltageHigh ;

    /**
     * 供电电压过高-发生次数
     */
    private Integer supplyVoltageHighCount ;

    /**
     * 供电电压过低
     * “0x00”表示故障未发生，
     * “0x20”上次清故障后测试失败，
     * “0x21/0x29”故障已发生但未确认，
     * “0x2B”故障确认发生，
     * “0x2A”故障已恢复但未确认，
     * “0x28”故障确认恢复，
     * “0x50”测试未完成，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer supplyVoltageLow ;

    /**
     * 供电电压过低-发生次数
     */
    private Integer supplyVoltageLowCount ;

    /**
     * GPS天线开路
     * “0x00”表示故障未发生，
     * “0x20”上次清故障后测试失败，
     * “0x21/0x29”故障已发生但未确认，
     * “0x2B”故障确认发生，
     * “0x2A”故障已恢复但未确认，
     * “0x28”故障确认恢复，
     * “0x50”测试未完成，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer gpsAntennaOpen ;

    /**
     * GPS天线开路-发生次数
     */
    private Integer gpsAntennaOpenCount ;

    /**
     * GPS天线短路
     * “0x00”表示故障未发生，
     * “0x20”上次清故障后测试失败，
     * “0x21/0x29”故障已发生但未确认，
     * “0x2B”故障确认发生，
     * “0x2A”故障已恢复但未确认，
     * “0x28”故障确认恢复，
     * “0x50”测试未完成，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer gpsAntennaShort ;

    /**
     * GPS天线短路-发生次数
     */
    private Integer gpsAntennaShortCount ;

    /**
     * 备用电池未连接
     * “0x00”表示故障未发生，
     * “0x20”上次清故障后测试失败，
     * “0x21/0x29”故障已发生但未确认，
     * “0x2B”故障确认发生，
     * “0x2A”故障已恢复但未确认，
     * “0x28”故障确认恢复，
     * “0x50”测试未完成，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer backupBatteryNotConnected ;

    /**
     * 备用电池未连接-发生次数
     */
    private Integer backupBatteryNotConnectedCount ;

    /**
     * CAN通讯故障
     * “0x00”表示故障未发生，
     * “0x20”上次清故障后测试失败，
     * “0x21/0x29”故障已发生但未确认，
     * “0x2B”故障确认发生，
     * “0x2A”故障已恢复但未确认，
     * “0x28”故障确认恢复，
     * “0x50”测试未完成，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer canCommunicationFailure ;

    /**
     * CAN通讯故障-发生次数
     */
    private Integer canCommunicationFailureCount ;

    /**
     * LTE分集天线开路
     * “0x00”表示故障未发生，
     * “0x20”上次清故障后测试失败，
     * “0x21/0x29”故障已发生但未确认，
     * “0x2B”故障确认发生，
     * “0x2A”故障已恢复但未确认，
     * “0x28”故障确认恢复，
     * “0x50”测试未完成，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer lteDiversityAntennaOpen ;

    /**
     * LTE分集天线开路-发生次数
     */
    private Integer lteDiversityAntennaOpenCount ;

    /**
     * LTE分集天线短路
     * “0x00”表示故障未发生，
     * “0x20”上次清故障后测试失败，
     * “0x21/0x29”故障已发生但未确认，
     * “0x2B”故障确认发生，
     * “0x2A”故障已恢复但未确认，
     * “0x28”故障确认恢复，
     * “0x50”测试未完成，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer lteDiversityAntennaShort ;

    /**
     * LTE分集天线短路-发生次数
     */
    private Integer lteDiversityAntennaShortCount ;

    /**
     * 备用电池寿命末期
     * “0x00”表示故障未发生，
     * “0x20”上次清故障后测试失败，
     * “0x21/0x29”故障已发生但未确认，
     * “0x2B”故障确认发生，
     * “0x2A”故障已恢复但未确认，
     * “0x28”故障确认恢复，
     * “0x50”测试未完成，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer backupBatteryEndOfLife ;

    /**
     * 备用电池寿命末期-发生次数
     */
    private Integer backupBatteryEndOfLifeCount ;

    /**
     * GPS模块故障
     * “0x00”表示故障未发生，
     * “0x20”上次清故障后测试失败，
     * “0x21/0x29”故障已发生但未确认，
     * “0x2B”故障确认发生，
     * “0x2A”故障已恢复但未确认，
     * “0x28”故障确认恢复，
     * “0x50”测试未完成，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer gpsModelFailure ;

    /**
     * GPS模块故障-发生次数
     */
    private Integer gpsModelFailureCount ;

    /**
     * Gsensor模块故障
     * “0x00”表示故障未发生，
     * “0x20”上次清故障后测试失败，
     * “0x21/0x29”故障已发生但未确认，
     * “0x2B”故障确认发生，
     * “0x2A”故障已恢复但未确认，
     * “0x28”故障确认恢复，
     * “0x50”测试未完成，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer gsensorModelFailure ;

    /**
     * Gsensor模块故障-发生次数
     */
    private Integer gsensorModelFailureCount ;

    /**
     * 备用电池温度过高
     * “0x00”表示故障未发生，
     * “0x20”上次清故障后测试失败，
     * “0x21/0x29”故障已发生但未确认，
     * “0x2B”故障确认发生，
     * “0x2A”故障已恢复但未确认，
     * “0x28”故障确认恢复，
     * “0x50”测试未完成，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer backupBatteryTemperatureHigh ;

    /**
     * 备用电池温度过高-发生次数
     */
    private Integer backupBatteryTemperatureHighCount ;

    /**
     * KL30断开
     * “0x00”表示故障未发生，
     * “0x20”上次清故障后测试失败，
     * “0x21/0x29”故障已发生但未确认，
     * “0x2B”故障确认发生，
     * “0x2A”故障已恢复但未确认，
     * “0x28”故障确认恢复，
     * “0x50”测试未完成，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer KL30Open ;

    /**
     * KL30断开-发生次数
     */
    private Integer KL30OpenCount ;

    /**
     * LTE主集天线开路
     * “0x00”表示故障未发生，
     * “0x20”上次清故障后测试失败，
     * “0x21/0x29”故障已发生但未确认，
     * “0x2B”故障确认发生，
     * “0x2A”故障已恢复但未确认，
     * “0x28”故障确认恢复，
     * “0x50”测试未完成，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer lteMainAntennaOpen ;

    /**
     * LTE主集天线开路-发生次数
     */
    private Integer lteMainAntennaOpenCount ;

    /**
     * LTE主集天线短路
     * “0x00”表示故障未发生，
     * “0x20”上次清故障后测试失败，
     * “0x21/0x29”故障已发生但未确认，
     * “0x2B”故障确认发生，
     * “0x2A”故障已恢复但未确认，
     * “0x28”故障确认恢复，
     * “0x50”测试未完成，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer lteMainAntennaShort ;

    /**
     * LTE主集天线短路-发生次数
     */
    private Integer lteMainAntennaShortCount ;

    /**
     * eSIM卡未连接
     * “0x00”表示故障未发生，
     * “0x20”上次清故障后测试失败，
     * “0x21/0x29”故障已发生但未确认，
     * “0x2B”故障确认发生，
     * “0x2A”故障已恢复但未确认，
     * “0x28”故障确认恢复，
     * “0x50”测试未完成，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer eSimStatus ;

    /**
     * eSIM卡未连接-发生次数
     */
    private Integer eSimStatusCount ;

    /**
     * SRS硬线故障
     * “0x00”表示故障未发生，
     * “0x20”上次清故障后测试失败，
     * “0x21/0x29”故障已发生但未确认，
     * “0x2B”故障确认发生，
     * “0x2A”故障已恢复但未确认，
     * “0x28”故障确认恢复，
     * “0x50”测试未完成，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer srsRigidLine ;

    /**
     * SRS硬线故障-发生次数
     */
    private Integer srsRigidLineCount ;


    public DataPackDtcInfo(DataPackObject object) {
        super(object);
    }


    public Integer getSupplyVoltageHigh() {
        return supplyVoltageHigh;
    }

    public void setSupplyVoltageHigh(Integer supplyVoltageHigh) {
        this.supplyVoltageHigh = supplyVoltageHigh;
    }

    public Integer getSupplyVoltageHighCount() {
        return supplyVoltageHighCount;
    }

    public void setSupplyVoltageHighCount(Integer supplyVoltageHighCount) {
        this.supplyVoltageHighCount = supplyVoltageHighCount;
    }

    public Integer getSupplyVoltageLow() {
        return supplyVoltageLow;
    }

    public void setSupplyVoltageLow(Integer supplyVoltageLow) {
        this.supplyVoltageLow = supplyVoltageLow;
    }

    public Integer getSupplyVoltageLowCount() {
        return supplyVoltageLowCount;
    }

    public void setSupplyVoltageLowCount(Integer supplyVoltageLowCount) {
        this.supplyVoltageLowCount = supplyVoltageLowCount;
    }

    public Integer getGpsAntennaOpen() {
        return gpsAntennaOpen;
    }

    public void setGpsAntennaOpen(Integer gpsAntennaOpen) {
        this.gpsAntennaOpen = gpsAntennaOpen;
    }

    public Integer getGpsAntennaOpenCount() {
        return gpsAntennaOpenCount;
    }

    public void setGpsAntennaOpenCount(Integer gpsAntennaOpenCount) {
        this.gpsAntennaOpenCount = gpsAntennaOpenCount;
    }

    public Integer getGpsAntennaShort() {
        return gpsAntennaShort;
    }

    public void setGpsAntennaShort(Integer gpsAntennaShort) {
        this.gpsAntennaShort = gpsAntennaShort;
    }

    public Integer getGpsAntennaShortCount() {
        return gpsAntennaShortCount;
    }

    public void setGpsAntennaShortCount(Integer gpsAntennaShortCount) {
        this.gpsAntennaShortCount = gpsAntennaShortCount;
    }

    public Integer getBackupBatteryNotConnected() {
        return backupBatteryNotConnected;
    }

    public void setBackupBatteryNotConnected(Integer backupBatteryNotConnected) {
        this.backupBatteryNotConnected = backupBatteryNotConnected;
    }

    public Integer getBackupBatteryNotConnectedCount() {
        return backupBatteryNotConnectedCount;
    }

    public void setBackupBatteryNotConnectedCount(Integer backupBatteryNotConnectedCount) {
        this.backupBatteryNotConnectedCount = backupBatteryNotConnectedCount;
    }

    public Integer getCanCommunicationFailure() {
        return canCommunicationFailure;
    }

    public void setCanCommunicationFailure(Integer canCommunicationFailure) {
        this.canCommunicationFailure = canCommunicationFailure;
    }

    public Integer getCanCommunicationFailureCount() {
        return canCommunicationFailureCount;
    }

    public void setCanCommunicationFailureCount(Integer canCommunicationFailureCount) {
        this.canCommunicationFailureCount = canCommunicationFailureCount;
    }

    public Integer getLteDiversityAntennaOpen() {
        return lteDiversityAntennaOpen;
    }

    public void setLteDiversityAntennaOpen(Integer lteDiversityAntennaOpen) {
        this.lteDiversityAntennaOpen = lteDiversityAntennaOpen;
    }

    public Integer getLteDiversityAntennaOpenCount() {
        return lteDiversityAntennaOpenCount;
    }

    public void setLteDiversityAntennaOpenCount(Integer lteDiversityAntennaOpenCount) {
        this.lteDiversityAntennaOpenCount = lteDiversityAntennaOpenCount;
    }

    public Integer getLteDiversityAntennaShort() {
        return lteDiversityAntennaShort;
    }

    public void setLteDiversityAntennaShort(Integer lteDiversityAntennaShort) {
        this.lteDiversityAntennaShort = lteDiversityAntennaShort;
    }

    public Integer getLteDiversityAntennaShortCount() {
        return lteDiversityAntennaShortCount;
    }

    public void setLteDiversityAntennaShortCount(Integer lteDiversityAntennaShortCount) {
        this.lteDiversityAntennaShortCount = lteDiversityAntennaShortCount;
    }

    public Integer getBackupBatteryEndOfLife() {
        return backupBatteryEndOfLife;
    }

    public void setBackupBatteryEndOfLife(Integer backupBatteryEndOfLife) {
        this.backupBatteryEndOfLife = backupBatteryEndOfLife;
    }

    public Integer getBackupBatteryEndOfLifeCount() {
        return backupBatteryEndOfLifeCount;
    }

    public void setBackupBatteryEndOfLifeCount(Integer backupBatteryEndOfLifeCount) {
        this.backupBatteryEndOfLifeCount = backupBatteryEndOfLifeCount;
    }

    public Integer getGpsModelFailure() {
        return gpsModelFailure;
    }

    public void setGpsModelFailure(Integer gpsModelFailure) {
        this.gpsModelFailure = gpsModelFailure;
    }

    public Integer getGpsModelFailureCount() {
        return gpsModelFailureCount;
    }

    public void setGpsModelFailureCount(Integer gpsModelFailureCount) {
        this.gpsModelFailureCount = gpsModelFailureCount;
    }

    public Integer getGsensorModelFailure() {
        return gsensorModelFailure;
    }

    public void setGsensorModelFailure(Integer gsensorModelFailure) {
        this.gsensorModelFailure = gsensorModelFailure;
    }

    public Integer getGsensorModelFailureCount() {
        return gsensorModelFailureCount;
    }

    public void setGsensorModelFailureCount(Integer gsensorModelFailureCount) {
        this.gsensorModelFailureCount = gsensorModelFailureCount;
    }

    public Integer getBackupBatteryTemperatureHigh() {
        return backupBatteryTemperatureHigh;
    }

    public void setBackupBatteryTemperatureHigh(Integer backupBatteryTemperatureHigh) {
        this.backupBatteryTemperatureHigh = backupBatteryTemperatureHigh;
    }

    public Integer getBackupBatteryTemperatureHighCount() {
        return backupBatteryTemperatureHighCount;
    }

    public void setBackupBatteryTemperatureHighCount(Integer backupBatteryTemperatureHighCount) {
        this.backupBatteryTemperatureHighCount = backupBatteryTemperatureHighCount;
    }

    public Integer getKL30Open() {
        return KL30Open;
    }

    public void setKL30Open(Integer KL30Open) {
        this.KL30Open = KL30Open;
    }

    public Integer getKL30OpenCount() {
        return KL30OpenCount;
    }

    public void setKL30OpenCount(Integer KL30OpenCount) {
        this.KL30OpenCount = KL30OpenCount;
    }

    public Integer getLteMainAntennaOpen() {
        return lteMainAntennaOpen;
    }

    public void setLteMainAntennaOpen(Integer lteMainAntennaOpen) {
        this.lteMainAntennaOpen = lteMainAntennaOpen;
    }

    public Integer getLteMainAntennaOpenCount() {
        return lteMainAntennaOpenCount;
    }

    public void setLteMainAntennaOpenCount(Integer lteMainAntennaOpenCount) {
        this.lteMainAntennaOpenCount = lteMainAntennaOpenCount;
    }

    public Integer getLteMainAntennaShort() {
        return lteMainAntennaShort;
    }

    public void setLteMainAntennaShort(Integer lteMainAntennaShort) {
        this.lteMainAntennaShort = lteMainAntennaShort;
    }

    public Integer getLteMainAntennaShortCount() {
        return lteMainAntennaShortCount;
    }

    public void setLteMainAntennaShortCount(Integer lteMainAntennaShortCount) {
        this.lteMainAntennaShortCount = lteMainAntennaShortCount;
    }

    public Integer geteSimStatus() {
        return eSimStatus;
    }

    public void seteSimStatus(Integer eSimStatus) {
        this.eSimStatus = eSimStatus;
    }

    public Integer geteSimStatusCount() {
        return eSimStatusCount;
    }

    public void seteSimStatusCount(Integer eSimStatusCount) {
        this.eSimStatusCount = eSimStatusCount;
    }

    public Integer getSrsRigidLine() {
        return srsRigidLine;
    }

    public void setSrsRigidLine(Integer srsRigidLine) {
        this.srsRigidLine = srsRigidLine;
    }

    public Integer getSrsRigidLineCount() {
        return srsRigidLineCount;
    }

    public void setSrsRigidLineCount(Integer srsRigidLineCount) {
        this.srsRigidLineCount = srsRigidLineCount;
    }

    @Override
    public String toString() {
        return "DataPackDtcInfo{" +
                "supplyVoltageHigh=" + supplyVoltageHigh +
                ", supplyVoltageHighCount=" + supplyVoltageHighCount +
                ", supplyVoltageLow=" + supplyVoltageLow +
                ", supplyVoltageLowCount=" + supplyVoltageLowCount +
                ", gpsAntennaOpen=" + gpsAntennaOpen +
                ", gpsAntennaOpenCount=" + gpsAntennaOpenCount +
                ", gpsAntennaShort=" + gpsAntennaShort +
                ", gpsAntennaShortCount=" + gpsAntennaShortCount +
                ", backupBatteryNotConnected=" + backupBatteryNotConnected +
                ", backupBatteryNotConnectedCount=" + backupBatteryNotConnectedCount +
                ", canCommunicationFailure=" + canCommunicationFailure +
                ", canCommunicationFailureCount=" + canCommunicationFailureCount +
                ", lteDiversityAntennaOpen=" + lteDiversityAntennaOpen +
                ", lteDiversityAntennaOpenCount=" + lteDiversityAntennaOpenCount +
                ", lteDiversityAntennaShort=" + lteDiversityAntennaShort +
                ", lteDiversityAntennaShortCount=" + lteDiversityAntennaShortCount +
                ", backupBatteryEndOfLife=" + backupBatteryEndOfLife +
                ", backupBatteryEndOfLifeCount=" + backupBatteryEndOfLifeCount +
                ", gpsModelFailure=" + gpsModelFailure +
                ", gpsModelFailureCount=" + gpsModelFailureCount +
                ", gsensorModelFailure=" + gsensorModelFailure +
                ", gsensorModelFailureCount=" + gsensorModelFailureCount +
                ", backupBatteryTemperatureHigh=" + backupBatteryTemperatureHigh +
                ", backupBatteryTemperatureHighCount=" + backupBatteryTemperatureHighCount +
                ", KL30Open=" + KL30Open +
                ", KL30OpenCount=" + KL30OpenCount +
                ", lteMainAntennaOpen=" + lteMainAntennaOpen +
                ", lteMainAntennaOpenCount=" + lteMainAntennaOpenCount +
                ", lteMainAntennaShort=" + lteMainAntennaShort +
                ", lteMainAntennaShortCount=" + lteMainAntennaShortCount +
                ", eSimStatus=" + eSimStatus +
                ", eSimStatusCount=" + eSimStatusCount +
                ", srsRigidLine=" + srsRigidLine +
                ", srsRigidLineCount=" + srsRigidLineCount +
                '}';
    }
}
