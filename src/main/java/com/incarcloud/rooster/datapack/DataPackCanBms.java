package com.incarcloud.rooster.datapack;

import java.util.Arrays;

/**
 * @author ChenZhao
 * @ClassName: DataPackCanBms
 * @Description: can BMS  0x18C0EFF4 0x18C0EEF4 0x10C000F4 0x14C000F4 0x18C000F4 0x1CC000F4 0x1CC007F4 0x1CC008F4
 * 0x18FF00F4 0x18FF05F4 0x04C000F4 0x08C000F4 0x1806E5F4 0x18FF01F4 0x18FF02F4
 * @date 2017-09-14 14:44
 */
public class DataPackCanBms extends DataPackObject {
    private Float totalCurrent;//总电流
    private Float totalVoltage;
    private Integer isChargerConnected;
    private Integer cpSignal;
    private Integer ksStatus;
    private Integer s2Status;
    private Integer isConnectCharger;
    private Integer isBatteryGroupBalance;
    private Integer coldFanStatus;
    private Integer soc;
    private Integer batteryGroupStatus;
    private Integer errorLevel;
    private Integer batteryAlarmIndication;
    private Integer descPowerLevel;
    private Integer isInsuLowest;
    private Integer bmsError;
    private Float alowableVoltage;
    private Float alowableCurrent;
    private Integer loadType;
    private Integer heaterStatus;
    private Integer chargerCount;
    private Integer discharge10SPower;
    private Integer discharge30SPower;
    private Integer dischargeMaximumPower;
    private Integer dischargeMaximumCurrent;
    private Integer charge10SPower;
    private Integer charge30SPower;
    private Integer chargeMaximumPower;
    private Integer chargeMaximumCurrent;
    private Integer sellVolHighestChargerl4;
    private Integer sellVolHighestFbl3;
    private Integer sellVolHighestL3;
    private Integer totalVolHighestChargerl4;
    private Integer totalVolHighestFbl3;
    private Integer totalVolHighestl3;
    private Integer sellVolLowerl1;
    private Integer sellVolLowerl2;
    private Integer sellVolLowerl3;
    private Integer totalVolLowerl1;
    private Integer totalVolLowerl2;
    private Integer totalVolLowerl3;
    private Integer sellVolLowestl3;
    private Integer sellVolLowestl4;
    private Integer sellVolLowestCharger;
    private Integer totalVolLowestl3;
    private Integer totalVolLowestl4;
    private Integer totalVolLowestCharger;
    private Integer volPlusBiggerl1;
    private Integer volPlusBiggerl2;
    private Integer volPlusBiggerl3;
    private Integer socLowerl1;
    private Integer socLowerl2;
    private Integer socLowerl3;
    private Integer dischargerCurrentBiggerl1;
    private Integer dischargerCurrentBiggerl2;
    private Integer dischargerCurrentBiggerl3;
    private Integer dischargerCurrentBiggestl3;
    private Integer chargerCurrentBiggestl3;
    private Integer chargerCurrentBiggestl4;
    private Integer feedbackCurrentBiggestl3;
    private Integer feedbackCurrentBiggestl4;
    private Integer tempratureHigherl1;
    private Integer tempratureHigherl2;
    private Integer tempratureHigherl3;
    private Integer tempratureHighestl3;
    private Integer tempratureHighestl4;
    private Integer heatMoTempratureHighest;
    private Integer tempLowerl1;
    private Integer tempLowerl2;
    private Integer tempLowerl3;
    private Integer tempLowestl3;
    private Integer tempPlusHigherl1;
    private Integer tempPlusHigherl2;
    private Integer tempPlusHigherl3;
    private Integer tempRiseSpeedBiggerl2;
    private Integer tempRiseSpeedBiggestl4;
    private Integer insuLowl1;
    private Integer insuLowl2;
    private Integer insuLowl4;
    private Integer chargeTimeLong;
    private Integer heatTimeLong;
    private Integer bmsSysErr;
    private Integer chargerNetErr;
    private Integer volDisconnectl4;
    private Integer volDisconnectl2;
    private Integer tempDisconnectl4;
    private Integer tempDisconnectl2;
    private Integer heatErr;
    private Integer negErrClose;
    private Integer negErrPaste;


    private Integer dcdcStatus;
    private Integer runStatus;
    private Integer socHigherAlarm;
    private Integer socJumpAlarm;
    private Integer batterySysDismatch;
    private Integer dcdcTempAlarm;
    private Integer dcdcStatusAlarm;
    private String batterySupplierCode;
    private Integer batteryTypeCode;
    private Float nominalEnergy;
    private Float nominalVoltage;
    private String batteryProDate;
    private Integer batteryProSn;
    private Integer batteryCodeLength;

    private float voltageHighest;//最高单体电压
    private int voltageHighestNo;//最高单体电池号
    private float voltageLowest;//最低单体电压
    private int voltageLowestNo;//最低单体电池号
    private int tempHighest;// 最高温度点温度
    private int tempHighestNo;//最高温度点电池号
    private Float[] voltage; // 单体电池电压数组
    private Integer[] temprature; // 探头温度数组

    public static void main(String[] args) {
        DataPackCanBms bms = new DataPackCanBms(new DataPackObject(new DataPack("1", "2", "3")));




    }

    @Override
    public String toString() {
        return "DataPackCanBms{" +
                "totalCurrent=" + totalCurrent +
                ", totalVoltage=" + totalVoltage +
                ", isChargerConnected=" + isChargerConnected +
                ", cpSignal=" + cpSignal +
                ", ksStatus=" + ksStatus +
                ", s2Status=" + s2Status +
                ", isConnectCharger=" + isConnectCharger +
                ", isBatteryGroupBalance=" + isBatteryGroupBalance +
                ", coldFanStatus=" + coldFanStatus +
                ", soc=" + soc +
                ", batteryGroupStatus=" + batteryGroupStatus +
                ", errorLevel=" + errorLevel +
                ", batteryAlarmIndication=" + batteryAlarmIndication +
                ", descPowerLevel=" + descPowerLevel +
                ", isInsuLowest=" + isInsuLowest +
                ", bmsError=" + bmsError +
                ", alowableVoltage=" + alowableVoltage +
                ", alowableCurrent=" + alowableCurrent +
                ", loadType=" + loadType +
                ", heaterStatus=" + heaterStatus +
                ", chargerCount=" + chargerCount +
                ", discharge10SPower=" + discharge10SPower +
                ", discharge30SPower=" + discharge30SPower +
                ", dischargeMaximumPower=" + dischargeMaximumPower +
                ", dischargeMaximumCurrent=" + dischargeMaximumCurrent +
                ", charge10SPower=" + charge10SPower +
                ", charge30SPower=" + charge30SPower +
                ", chargeMaximumPower=" + chargeMaximumPower +
                ", chargeMaximumCurrent=" + chargeMaximumCurrent +
                ", sellVolHighestChargerl4=" + sellVolHighestChargerl4 +
                ", sellVolHighestFbl3=" + sellVolHighestFbl3 +
                ", sellVolHighestL3=" + sellVolHighestL3 +
                ", totalVolHighestChargerl4=" + totalVolHighestChargerl4 +
                ", totalVolHighestFbl3=" + totalVolHighestFbl3 +
                ", totalVolHighestl3=" + totalVolHighestl3 +
                ", sellVolLowerl1=" + sellVolLowerl1 +
                ", sellVolLowerl2=" + sellVolLowerl2 +
                ", sellVolLowerl3=" + sellVolLowerl3 +
                ", totalVolLowerl1=" + totalVolLowerl1 +
                ", totalVolLowerl2=" + totalVolLowerl2 +
                ", totalVolLowerl3=" + totalVolLowerl3 +
                ", sellVolLowestl3=" + sellVolLowestl3 +
                ", sellVolLowestl4=" + sellVolLowestl4 +
                ", sellVolLowestCharger=" + sellVolLowestCharger +
                ", totalVolLowestl3=" + totalVolLowestl3 +
                ", totalVolLowestl4=" + totalVolLowestl4 +
                ", totalVolLowestCharger=" + totalVolLowestCharger +
                ", volPlusBiggerl1=" + volPlusBiggerl1 +
                ", volPlusBiggerl2=" + volPlusBiggerl2 +
                ", volPlusBiggerl3=" + volPlusBiggerl3 +
                ", socLowerl1=" + socLowerl1 +
                ", socLowerl2=" + socLowerl2 +
                ", socLowerl3=" + socLowerl3 +
                ", dischargerCurrentBiggerl1=" + dischargerCurrentBiggerl1 +
                ", dischargerCurrentBiggerl2=" + dischargerCurrentBiggerl2 +
                ", dischargerCurrentBiggerl3=" + dischargerCurrentBiggerl3 +
                ", dischargerCurrentBiggestl3=" + dischargerCurrentBiggestl3 +
                ", chargerCurrentBiggestl3=" + chargerCurrentBiggestl3 +
                ", chargerCurrentBiggestl4=" + chargerCurrentBiggestl4 +
                ", feedbackCurrentBiggestl3=" + feedbackCurrentBiggestl3 +
                ", feedbackCurrentBiggestl4=" + feedbackCurrentBiggestl4 +
                ", tempratureHigherl1=" + tempratureHigherl1 +
                ", tempratureHigherl2=" + tempratureHigherl2 +
                ", tempratureHigherl3=" + tempratureHigherl3 +
                ", tempratureHighestl3=" + tempratureHighestl3 +
                ", tempratureHighestl4=" + tempratureHighestl4 +
                ", heatMoTempratureHighest=" + heatMoTempratureHighest +
                ", tempLowerl1=" + tempLowerl1 +
                ", tempLowerl2=" + tempLowerl2 +
                ", tempLowerl3=" + tempLowerl3 +
                ", tempLowestl3=" + tempLowestl3 +
                ", tempPlusHigherl1=" + tempPlusHigherl1 +
                ", tempPlusHigherl2=" + tempPlusHigherl2 +
                ", tempPlusHigherl3=" + tempPlusHigherl3 +
                ", tempRiseSpeedBiggerl2=" + tempRiseSpeedBiggerl2 +
                ", tempRiseSpeedBiggestl4=" + tempRiseSpeedBiggestl4 +
                ", insuLowl1=" + insuLowl1 +
                ", insuLowl2=" + insuLowl2 +
                ", insuLowl4=" + insuLowl4 +
                ", chargeTimeLong=" + chargeTimeLong +
                ", heatTimeLong=" + heatTimeLong +
                ", bmsSysErr=" + bmsSysErr +
                ", chargerNetErr=" + chargerNetErr +
                ", volDisconnectl4=" + volDisconnectl4 +
                ", volDisconnectl2=" + volDisconnectl2 +
                ", tempDisconnectl4=" + tempDisconnectl4 +
                ", tempDisconnectl2=" + tempDisconnectl2 +
                ", heatErr=" + heatErr +
                ", negErrClose=" + negErrClose +
                ", negErrPaste=" + negErrPaste +
                ", dcdcStatus=" + dcdcStatus +
                ", runStatus=" + runStatus +
                ", socHigherAlarm=" + socHigherAlarm +
                ", socJumpAlarm=" + socJumpAlarm +
                ", batterySysDismatch=" + batterySysDismatch +
                ", dcdcTempAlarm=" + dcdcTempAlarm +
                ", dcdcStatusAlarm=" + dcdcStatusAlarm +
                ", batterySupplierCode='" + batterySupplierCode + '\'' +
                ", batteryTypeCode=" + batteryTypeCode +
                ", nominalEnergy=" + nominalEnergy +
                ", nominalVoltage=" + nominalVoltage +
                ", batteryProDate='" + batteryProDate + '\'' +
                ", batteryProSn=" + batteryProSn +
                ", batteryCodeLength=" + batteryCodeLength +
                ", voltageHighest=" + voltageHighest +
                ", voltageHighestNo=" + voltageHighestNo +
                ", voltageLowest=" + voltageLowest +
                ", voltageLowestNo=" + voltageLowestNo +
                ", tempHighest=" + tempHighest +
                ", tempHighestNo=" + tempHighestNo +
                ", voltage=" + Arrays.toString(voltage) +
                ", temprature=" + Arrays.toString(temprature) +
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

    public Float[] getVoltage() {
        return voltage;
    }

    public void setVoltage(Float[] voltage) {
        this.voltage = voltage;
    }

    public Integer[] getTemprature() {
        return temprature;
    }

    public void setTemprature(Integer[] temprature) {
        this.temprature = temprature;
    }

    public DataPackCanBms(DataPack dataPack) {
        super(dataPack);
    }

    public float getVoltageHighest() {
        return voltageHighest;
    }

    public void setVoltageHighest(float voltageHighest) {
        this.voltageHighest = voltageHighest;
    }

    public int getVoltageHighestNo() {
        return voltageHighestNo;
    }

    public void setVoltageHighestNo(int voltageHighestNo) {
        this.voltageHighestNo = voltageHighestNo;
    }

    public float getVoltageLowest() {
        return voltageLowest;
    }

    public void setVoltageLowest(float voltageLowest) {
        this.voltageLowest = voltageLowest;
    }

    public int getVoltageLowestNo() {
        return voltageLowestNo;
    }

    public void setVoltageLowestNo(int voltageLowestNo) {
        this.voltageLowestNo = voltageLowestNo;
    }

    public int getTempHighest() {
        return tempHighest;
    }

    public void setTempHighest(int tempHighest) {
        this.tempHighest = tempHighest;
    }

    public int getTempHighestNo() {
        return tempHighestNo;
    }

    public void setTempHighestNo(int tempHighestNo) {
        this.tempHighestNo = tempHighestNo;
    }

    public Float getTotalCurrent() {
        return totalCurrent;
    }

    public void setTotalCurrent(Float totalCurrent) {
        this.totalCurrent = totalCurrent;
    }

    public Integer getIsChargerConnected() {
        return isChargerConnected;
    }

    public void setIsChargerConnected(Integer isChargerConnected) {
        this.isChargerConnected = isChargerConnected;
    }

    public Integer getCpSignal() {
        return cpSignal;
    }

    public void setCpSignal(Integer cpSignal) {
        this.cpSignal = cpSignal;
    }

    public Integer getKsStatus() {
        return ksStatus;
    }

    public void setKsStatus(Integer ksStatus) {
        this.ksStatus = ksStatus;
    }

    public Integer getS2Status() {
        return s2Status;
    }

    public void setS2Status(Integer s2Status) {
        this.s2Status = s2Status;
    }

    public Integer getIsConnectCharger() {
        return isConnectCharger;
    }

    public void setIsConnectCharger(Integer isConnectCharger) {
        this.isConnectCharger = isConnectCharger;
    }

    public Integer getIsBatteryGroupBalance() {
        return isBatteryGroupBalance;
    }

    public void setIsBatteryGroupBalance(Integer isBatteryGroupBalance) {
        this.isBatteryGroupBalance = isBatteryGroupBalance;
    }

    public Integer getColdFanStatus() {
        return coldFanStatus;
    }

    public void setColdFanStatus(Integer coldFanStatus) {
        this.coldFanStatus = coldFanStatus;
    }

    public Integer getSoc() {
        return soc;
    }

    public void setSoc(Integer soc) {
        this.soc = soc;
    }

    public Integer getBatteryGroupStatus() {
        return batteryGroupStatus;
    }

    public void setBatteryGroupStatus(Integer batteryGroupStatus) {
        this.batteryGroupStatus = batteryGroupStatus;
    }

    public Integer getErrorLevel() {
        return errorLevel;
    }

    public void setErrorLevel(Integer errorLevel) {
        this.errorLevel = errorLevel;
    }

    public Integer getBatteryAlarmIndication() {
        return batteryAlarmIndication;
    }

    public void setBatteryAlarmIndication(Integer batteryAlarmIndication) {
        this.batteryAlarmIndication = batteryAlarmIndication;
    }

    public Integer getDescPowerLevel() {
        return descPowerLevel;
    }

    public void setDescPowerLevel(Integer descPowerLevel) {
        this.descPowerLevel = descPowerLevel;
    }

    public Integer getIsInsuLowest() {
        return isInsuLowest;
    }

    public void setIsInsuLowest(Integer isInsuLowest) {
        this.isInsuLowest = isInsuLowest;
    }

    public Integer getBmsError() {
        return bmsError;
    }

    public void setBmsError(Integer bmsError) {
        this.bmsError = bmsError;
    }

    public Float getAlowableVoltage() {
        return alowableVoltage;
    }

    public void setAlowableVoltage(Float alowableVoltage) {
        this.alowableVoltage = alowableVoltage;
    }

    public Float getAlowableCurrent() {
        return alowableCurrent;
    }

    public void setAlowableCurrent(Float alowableCurrent) {
        this.alowableCurrent = alowableCurrent;
    }

    public Integer getLoadType() {
        return loadType;
    }

    public void setLoadType(Integer loadType) {
        this.loadType = loadType;
    }

    public Integer getHeaterStatus() {
        return heaterStatus;
    }

    public void setHeaterStatus(Integer heaterStatus) {
        this.heaterStatus = heaterStatus;
    }

    public Integer getChargerCount() {
        return chargerCount;
    }

    public void setChargerCount(Integer chargerCount) {
        this.chargerCount = chargerCount;
    }

    public Integer getDischarge10SPower() {
        return discharge10SPower;
    }

    public void setDischarge10SPower(Integer discharge10SPower) {
        this.discharge10SPower = discharge10SPower;
    }

    public Integer getDischarge30SPower() {
        return discharge30SPower;
    }

    public void setDischarge30SPower(Integer discharge30SPower) {
        this.discharge30SPower = discharge30SPower;
    }

    public Integer getDischargeMaximumPower() {
        return dischargeMaximumPower;
    }

    public void setDischargeMaximumPower(Integer dischargeMaximumPower) {
        this.dischargeMaximumPower = dischargeMaximumPower;
    }

    public Integer getDischargeMaximumCurrent() {
        return dischargeMaximumCurrent;
    }

    public void setDischargeMaximumCurrent(Integer dischargeMaximumCurrent) {
        this.dischargeMaximumCurrent = dischargeMaximumCurrent;
    }

    public Integer getCharge10SPower() {
        return charge10SPower;
    }

    public void setCharge10SPower(Integer charge10SPower) {
        this.charge10SPower = charge10SPower;
    }

    public Integer getCharge30SPower() {
        return charge30SPower;
    }

    public void setCharge30SPower(Integer charge30SPower) {
        this.charge30SPower = charge30SPower;
    }

    public Integer getChargeMaximumPower() {
        return chargeMaximumPower;
    }

    public void setChargeMaximumPower(Integer chargeMaximumPower) {
        this.chargeMaximumPower = chargeMaximumPower;
    }

    public Integer getChargeMaximumCurrent() {
        return chargeMaximumCurrent;
    }

    public void setChargeMaximumCurrent(Integer chargeMaximumCurrent) {
        this.chargeMaximumCurrent = chargeMaximumCurrent;
    }

    public Integer getSellVolHighestChargerl4() {
        return sellVolHighestChargerl4;
    }

    public void setSellVolHighestChargerl4(Integer sellVolHighestChargerl4) {
        this.sellVolHighestChargerl4 = sellVolHighestChargerl4;
    }

    public Integer getSellVolHighestFbl3() {
        return sellVolHighestFbl3;
    }

    public void setSellVolHighestFbl3(Integer sellVolHighestFbl3) {
        this.sellVolHighestFbl3 = sellVolHighestFbl3;
    }

    public Integer getSellVolHighestL3() {
        return sellVolHighestL3;
    }

    public void setSellVolHighestL3(Integer sellVolHighestL3) {
        this.sellVolHighestL3 = sellVolHighestL3;
    }

    public Integer getTotalVolHighestChargerl4() {
        return totalVolHighestChargerl4;
    }

    public void setTotalVolHighestChargerl4(Integer totalVolHighestChargerl4) {
        this.totalVolHighestChargerl4 = totalVolHighestChargerl4;
    }

    public Integer getTotalVolHighestFbl3() {
        return totalVolHighestFbl3;
    }

    public void setTotalVolHighestFbl3(Integer totalVolHighestFbl3) {
        this.totalVolHighestFbl3 = totalVolHighestFbl3;
    }

    public Integer getTotalVolHighestl3() {
        return totalVolHighestl3;
    }

    public void setTotalVolHighestl3(Integer totalVolHighestl3) {
        this.totalVolHighestl3 = totalVolHighestl3;
    }

    public Integer getSellVolLowerl1() {
        return sellVolLowerl1;
    }

    public void setSellVolLowerl1(Integer sellVolLowerl1) {
        this.sellVolLowerl1 = sellVolLowerl1;
    }

    public Integer getSellVolLowerl2() {
        return sellVolLowerl2;
    }

    public void setSellVolLowerl2(Integer sellVolLowerl2) {
        this.sellVolLowerl2 = sellVolLowerl2;
    }

    public Integer getSellVolLowerl3() {
        return sellVolLowerl3;
    }

    public void setSellVolLowerl3(Integer sellVolLowerl3) {
        this.sellVolLowerl3 = sellVolLowerl3;
    }

    public Integer getTotalVolLowerl1() {
        return totalVolLowerl1;
    }

    public void setTotalVolLowerl1(Integer totalVolLowerl1) {
        this.totalVolLowerl1 = totalVolLowerl1;
    }

    public Integer getTotalVolLowerl2() {
        return totalVolLowerl2;
    }

    public void setTotalVolLowerl2(Integer totalVolLowerl2) {
        this.totalVolLowerl2 = totalVolLowerl2;
    }

    public Integer getTotalVolLowerl3() {
        return totalVolLowerl3;
    }

    public void setTotalVolLowerl3(Integer totalVolLowerl3) {
        this.totalVolLowerl3 = totalVolLowerl3;
    }

    public Integer getSellVolLowestl3() {
        return sellVolLowestl3;
    }

    public void setSellVolLowestl3(Integer sellVolLowestl3) {
        this.sellVolLowestl3 = sellVolLowestl3;
    }

    public Integer getSellVolLowestl4() {
        return sellVolLowestl4;
    }

    public void setSellVolLowestl4(Integer sellVolLowestl4) {
        this.sellVolLowestl4 = sellVolLowestl4;
    }

    public Integer getSellVolLowestCharger() {
        return sellVolLowestCharger;
    }

    public void setSellVolLowestCharger(Integer sellVolLowestCharger) {
        this.sellVolLowestCharger = sellVolLowestCharger;
    }

    public Integer getTotalVolLowestl3() {
        return totalVolLowestl3;
    }

    public void setTotalVolLowestl3(Integer totalVolLowestl3) {
        this.totalVolLowestl3 = totalVolLowestl3;
    }

    public Integer getTotalVolLowestl4() {
        return totalVolLowestl4;
    }

    public void setTotalVolLowestl4(Integer totalVolLowestl4) {
        this.totalVolLowestl4 = totalVolLowestl4;
    }

    public Integer getTotalVolLowestCharger() {
        return totalVolLowestCharger;
    }

    public void setTotalVolLowestCharger(Integer totalVolLowestCharger) {
        this.totalVolLowestCharger = totalVolLowestCharger;
    }

    public Integer getVolPlusBiggerl1() {
        return volPlusBiggerl1;
    }

    public void setVolPlusBiggerl1(Integer volPlusBiggerl1) {
        this.volPlusBiggerl1 = volPlusBiggerl1;
    }

    public Integer getVolPlusBiggerl2() {
        return volPlusBiggerl2;
    }

    public void setVolPlusBiggerl2(Integer volPlusBiggerl2) {
        this.volPlusBiggerl2 = volPlusBiggerl2;
    }

    public Integer getVolPlusBiggerl3() {
        return volPlusBiggerl3;
    }

    public void setVolPlusBiggerl3(Integer volPlusBiggerl3) {
        this.volPlusBiggerl3 = volPlusBiggerl3;
    }

    public Integer getSocLowerl1() {
        return socLowerl1;
    }

    public void setSocLowerl1(Integer socLowerl1) {
        this.socLowerl1 = socLowerl1;
    }

    public Integer getSocLowerl2() {
        return socLowerl2;
    }

    public void setSocLowerl2(Integer socLowerl2) {
        this.socLowerl2 = socLowerl2;
    }

    public Integer getSocLowerl3() {
        return socLowerl3;
    }

    public void setSocLowerl3(Integer socLowerl3) {
        this.socLowerl3 = socLowerl3;
    }

    public Integer getDischargerCurrentBiggerl1() {
        return dischargerCurrentBiggerl1;
    }

    public void setDischargerCurrentBiggerl1(Integer dischargerCurrentBiggerl1) {
        this.dischargerCurrentBiggerl1 = dischargerCurrentBiggerl1;
    }

    public Integer getDischargerCurrentBiggerl2() {
        return dischargerCurrentBiggerl2;
    }

    public void setDischargerCurrentBiggerl2(Integer dischargerCurrentBiggerl2) {
        this.dischargerCurrentBiggerl2 = dischargerCurrentBiggerl2;
    }

    public Integer getDischargerCurrentBiggerl3() {
        return dischargerCurrentBiggerl3;
    }

    public void setDischargerCurrentBiggerl3(Integer dischargerCurrentBiggerl3) {
        this.dischargerCurrentBiggerl3 = dischargerCurrentBiggerl3;
    }

    public Integer getDischargerCurrentBiggestl3() {
        return dischargerCurrentBiggestl3;
    }

    public void setDischargerCurrentBiggestl3(Integer dischargerCurrentBiggestl3) {
        this.dischargerCurrentBiggestl3 = dischargerCurrentBiggestl3;
    }

    public Integer getChargerCurrentBiggestl3() {
        return chargerCurrentBiggestl3;
    }

    public void setChargerCurrentBiggestl3(Integer chargerCurrentBiggestl3) {
        this.chargerCurrentBiggestl3 = chargerCurrentBiggestl3;
    }

    public Integer getChargerCurrentBiggestl4() {
        return chargerCurrentBiggestl4;
    }

    public void setChargerCurrentBiggestl4(Integer chargerCurrentBiggestl4) {
        this.chargerCurrentBiggestl4 = chargerCurrentBiggestl4;
    }

    public Integer getFeedbackCurrentBiggestl3() {
        return feedbackCurrentBiggestl3;
    }

    public void setFeedbackCurrentBiggestl3(Integer feedbackCurrentBiggestl3) {
        this.feedbackCurrentBiggestl3 = feedbackCurrentBiggestl3;
    }

    public Integer getFeedbackCurrentBiggestl4() {
        return feedbackCurrentBiggestl4;
    }

    public void setFeedbackCurrentBiggestl4(Integer feedbackCurrentBiggestl4) {
        this.feedbackCurrentBiggestl4 = feedbackCurrentBiggestl4;
    }

    public Integer getTempratureHigherl1() {
        return tempratureHigherl1;
    }

    public void setTempratureHigherl1(Integer tempratureHigherl1) {
        this.tempratureHigherl1 = tempratureHigherl1;
    }

    public Integer getTempratureHigherl2() {
        return tempratureHigherl2;
    }

    public void setTempratureHigherl2(Integer tempratureHigherl2) {
        this.tempratureHigherl2 = tempratureHigherl2;
    }

    public Integer getTempratureHigherl3() {
        return tempratureHigherl3;
    }

    public void setTempratureHigherl3(Integer tempratureHigherl3) {
        this.tempratureHigherl3 = tempratureHigherl3;
    }

    public Integer getTempratureHighestl3() {
        return tempratureHighestl3;
    }

    public void setTempratureHighestl3(Integer tempratureHighestl3) {
        this.tempratureHighestl3 = tempratureHighestl3;
    }

    public Integer getTempratureHighestl4() {
        return tempratureHighestl4;
    }

    public void setTempratureHighestl4(Integer tempratureHighestl4) {
        this.tempratureHighestl4 = tempratureHighestl4;
    }

    public Integer getHeatMoTempratureHighest() {
        return heatMoTempratureHighest;
    }

    public void setHeatMoTempratureHighest(Integer heatMoTempratureHighest) {
        this.heatMoTempratureHighest = heatMoTempratureHighest;
    }

    public Integer getTempLowerl1() {
        return tempLowerl1;
    }

    public void setTempLowerl1(Integer tempLowerl1) {
        this.tempLowerl1 = tempLowerl1;
    }

    public Integer getTempLowerl2() {
        return tempLowerl2;
    }

    public void setTempLowerl2(Integer tempLowerl2) {
        this.tempLowerl2 = tempLowerl2;
    }

    public Integer getTempLowerl3() {
        return tempLowerl3;
    }

    public void setTempLowerl3(Integer tempLowerl3) {
        this.tempLowerl3 = tempLowerl3;
    }

    public Integer getTempLowestl3() {
        return tempLowestl3;
    }

    public void setTempLowestl3(Integer tempLowestl3) {
        this.tempLowestl3 = tempLowestl3;
    }

    public Integer getTempPlusHigherl1() {
        return tempPlusHigherl1;
    }

    public void setTempPlusHigherl1(Integer tempPlusHigherl1) {
        this.tempPlusHigherl1 = tempPlusHigherl1;
    }

    public Integer getTempPlusHigherl2() {
        return tempPlusHigherl2;
    }

    public void setTempPlusHigherl2(Integer tempPlusHigherl2) {
        this.tempPlusHigherl2 = tempPlusHigherl2;
    }

    public Integer getTempPlusHigherl3() {
        return tempPlusHigherl3;
    }

    public void setTempPlusHigherl3(Integer tempPlusHigherl3) {
        this.tempPlusHigherl3 = tempPlusHigherl3;
    }

    public Integer getTempRiseSpeedBiggerl2() {
        return tempRiseSpeedBiggerl2;
    }

    public void setTempRiseSpeedBiggerl2(Integer tempRiseSpeedBiggerl2) {
        this.tempRiseSpeedBiggerl2 = tempRiseSpeedBiggerl2;
    }

    public Integer getTempRiseSpeedBiggestl4() {
        return tempRiseSpeedBiggestl4;
    }

    public void setTempRiseSpeedBiggestl4(Integer tempRiseSpeedBiggestl4) {
        this.tempRiseSpeedBiggestl4 = tempRiseSpeedBiggestl4;
    }

    public Integer getInsuLowl1() {
        return insuLowl1;
    }

    public void setInsuLowl1(Integer insuLowl1) {
        this.insuLowl1 = insuLowl1;
    }

    public Integer getInsuLowl2() {
        return insuLowl2;
    }

    public void setInsuLowl2(Integer insuLowl2) {
        this.insuLowl2 = insuLowl2;
    }

    public Integer getInsuLowl4() {
        return insuLowl4;
    }

    public void setInsuLowl4(Integer insuLowl4) {
        this.insuLowl4 = insuLowl4;
    }

    public Integer getChargeTimeLong() {
        return chargeTimeLong;
    }

    public void setChargeTimeLong(Integer chargeTimeLong) {
        this.chargeTimeLong = chargeTimeLong;
    }

    public Integer getHeatTimeLong() {
        return heatTimeLong;
    }

    public void setHeatTimeLong(Integer heatTimeLong) {
        this.heatTimeLong = heatTimeLong;
    }

    public Integer getBmsSysErr() {
        return bmsSysErr;
    }

    public void setBmsSysErr(Integer bmsSysErr) {
        this.bmsSysErr = bmsSysErr;
    }

    public Integer getChargerNetErr() {
        return chargerNetErr;
    }

    public void setChargerNetErr(Integer chargerNetErr) {
        this.chargerNetErr = chargerNetErr;
    }

    public Integer getVolDisconnectl4() {
        return volDisconnectl4;
    }

    public void setVolDisconnectl4(Integer volDisconnectl4) {
        this.volDisconnectl4 = volDisconnectl4;
    }

    public Integer getVolDisconnectl2() {
        return volDisconnectl2;
    }

    public void setVolDisconnectl2(Integer volDisconnectl2) {
        this.volDisconnectl2 = volDisconnectl2;
    }

    public Integer getTempDisconnectl4() {
        return tempDisconnectl4;
    }

    public void setTempDisconnectl4(Integer tempDisconnectl4) {
        this.tempDisconnectl4 = tempDisconnectl4;
    }

    public Integer getTempDisconnectl2() {
        return tempDisconnectl2;
    }

    public void setTempDisconnectl2(Integer tempDisconnectl2) {
        this.tempDisconnectl2 = tempDisconnectl2;
    }

    public Integer getHeatErr() {
        return heatErr;
    }

    public void setHeatErr(Integer heatErr) {
        this.heatErr = heatErr;
    }

    public Integer getNegErrClose() {
        return negErrClose;
    }

    public void setNegErrClose(Integer negErrClose) {
        this.negErrClose = negErrClose;
    }

    public Integer getNegErrPaste() {
        return negErrPaste;
    }

    public void setNegErrPaste(Integer negErrPaste) {
        this.negErrPaste = negErrPaste;
    }

    public Float getTotalVoltage() {
        return totalVoltage;
    }

    public void setTotalVoltage(Float totalVoltage) {
        this.totalVoltage = totalVoltage;
    }

    public Integer getDcdcStatus() {
        return dcdcStatus;
    }

    public void setDcdcStatus(Integer dcdcStatus) {
        this.dcdcStatus = dcdcStatus;
    }

    public Integer getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
    }

    public Integer getSocHigherAlarm() {
        return socHigherAlarm;
    }

    public void setSocHigherAlarm(Integer socHigherAlarm) {
        this.socHigherAlarm = socHigherAlarm;
    }

    public Integer getSocJumpAlarm() {
        return socJumpAlarm;
    }

    public void setSocJumpAlarm(Integer socJumpAlarm) {
        this.socJumpAlarm = socJumpAlarm;
    }

    public Integer getBatterySysDismatch() {
        return batterySysDismatch;
    }

    public void setBatterySysDismatch(Integer batterySysDismatch) {
        this.batterySysDismatch = batterySysDismatch;
    }

    public Integer getDcdcTempAlarm() {
        return dcdcTempAlarm;
    }

    public void setDcdcTempAlarm(Integer dcdcTempAlarm) {
        this.dcdcTempAlarm = dcdcTempAlarm;
    }

    public Integer getDcdcStatusAlarm() {
        return dcdcStatusAlarm;
    }

    public void setDcdcStatusAlarm(Integer dcdcStatusAlarm) {
        this.dcdcStatusAlarm = dcdcStatusAlarm;
    }

    public String getBatterySupplierCode() {
        return batterySupplierCode;
    }

    public void setBatterySupplierCode(String batterySupplierCode) {
        this.batterySupplierCode = batterySupplierCode;
    }

    public Integer getBatteryTypeCode() {
        return batteryTypeCode;
    }

    public void setBatteryTypeCode(Integer batteryTypeCode) {
        this.batteryTypeCode = batteryTypeCode;
    }

    public Float getNominalEnergy() {
        return nominalEnergy;
    }

    public void setNominalEnergy(Float nominalEnergy) {
        this.nominalEnergy = nominalEnergy;
    }

    public Float getNominalVoltage() {
        return nominalVoltage;
    }

    public void setNominalVoltage(Float nominalVoltage) {
        this.nominalVoltage = nominalVoltage;
    }

    public String getBatteryProDate() {
        return batteryProDate;
    }

    public void setBatteryProDate(String batteryProDate) {
        this.batteryProDate = batteryProDate;
    }

    public Integer getBatteryProSn() {
        return batteryProSn;
    }

    public void setBatteryProSn(Integer batteryProSn) {
        this.batteryProSn = batteryProSn;
    }

    public Integer getBatteryCodeLength() {
        return batteryCodeLength;
    }

    public void setBatteryCodeLength(Integer batteryCodeLength) {
        this.batteryCodeLength = batteryCodeLength;
    }
}
