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
    private Float totalVoltage;// 可充电储能装置电压
    private Integer isChargerConnected; // 外接充电线连接状态
    private Integer cpSignal;// CP信号
    private Integer ksStatus;// 总负接触器KS状态
    private Integer s2Status;// 开关S2状态
    private Integer isConnectCharger; // 与充电机通讯状态
    private Integer isBatteryGroupBalance; // 电池包均衡状态
    private Integer coldFanStatus;// 冷却风扇状态
    private Integer soc;// 电池组当前的SOC
    private Integer batteryGroupStatus;// 电池组当前状态
    private Integer errorLevel;// 故障等级
    private Integer batteryAlarmIndication;// 动力电池报警指示
    private Integer descPowerLevel;// 降功率等级
    private Integer isInsuLowest;// 绝缘超低
    private Integer bmsError;// BMS故障码
    private Float alowableVoltage;// 最高允许充电端电压
    private Float alowableCurrent; // 最高允许充电电流
    private Integer loadType;// 负载类型
    private Integer heaterStatus;// 加热继电器状态
    private Integer chargerCount;// 充电次数
    private Integer discharge10SPower;// 动力电池包10S最大放电功率
    private Integer discharge30SPower;// 动力电池包30S最大放电功率
    private Integer dischargeMaximumPower;// 动力电池包持续最大放电功率
    private Integer dischargeMaximumCurrent; // 动力电池包最大放电电流限值
    private Integer charge10SPower; // 动力电池包 10S 最大充电功率
    private Integer charge30SPower;// 动力电池包 30S 最大充电功率
    private Integer chargeMaximumPower;// 动力电池包持续最大充电功率
    private Integer chargeMaximumCurrent;// 动力电池包最大充电电流限值
    private Integer sellVolHighestChargerl4;// 单体电压超高-充电-4级
    private Integer sellVolHighestFbl3;// 单体电压超高-回馈-3级
    private Integer sellVolHighestL3;// 单体电压超高-3级
    private Integer totalVolHighestChargerl4;// 总电压超高-充电-4级
    private Integer totalVolHighestFbl3;// 总电压超高-回馈-3级
    private Integer totalVolHighestl3;// 总电压超高-3级
    private Integer sellVolLowerl1;// 单体电压过低-1级降功率
    private Integer sellVolLowerl2;// 单体电压过低-2级降功率
    private Integer sellVolLowerl3; // 单体电压过低-3级降功率
    private Integer totalVolLowerl1; // 总电压过低-1级降功率
    private Integer totalVolLowerl2; // 总电压过低-2级降功率
    private Integer totalVolLowerl3; // 总电压过低-3级降功率
    private Integer sellVolLowestl3;// 单体电压超低-3级
    private Integer sellVolLowestl4;// 单体电压超低-4级
    private Integer sellVolLowestCharger;// 单体电压超低-充电
    private Integer totalVolLowestl3;// 总电压超低-3级
    private Integer totalVolLowestl4;// 总电压超低-4级
    private Integer totalVolLowestCharger;// 总电压超低-充电
    private Integer volPlusBiggerl1;// 压差过大-1级降功率
    private Integer volPlusBiggerl2;// 压差过大-2级降功率
    private Integer volPlusBiggerl3; // 压差过大-3级降功率
    private Integer socLowerl1;// SOC过低-1级降功率
    private Integer socLowerl2;// SOC过低-2级降功率
    private Integer socLowerl3;// SOC过低-3级降功率
    private Integer dischargerCurrentBiggerl1;// 放电电流过大-1级降功率
    private Integer dischargerCurrentBiggerl2;// 放电电流过大-2级降功率
    private Integer dischargerCurrentBiggerl3;// 放电电流过大-3级降功率
    private Integer dischargerCurrentBiggestl3;// 放电电流超大-3级
    private Integer chargerCurrentBiggestl3;// 充电电流超大-3级
    private Integer chargerCurrentBiggestl4;// 充电电流超大-4级
    private Integer feedbackCurrentBiggestl3;// 回馈电流超大-3级
    private Integer feedbackCurrentBiggestl4;// 回馈电流超大-4级
    private Integer tempratureHigherl1;// 温度过高-1级降功率
    private Integer tempratureHigherl2;// 温度过高-2级降功率
    private Integer tempratureHigherl3;// 温度过高-3级降功率
    private Integer tempratureHighestl3;// 温度超高-3级
    private Integer tempratureHighestl4;// 温度超高-4级
    private Integer heatMoTempratureHighest; // 加热膜温度超高
    private Integer tempLowerl1; // 温度过低-1级降功率
    private Integer tempLowerl2;// 温度过低-2级降功率
    private Integer tempLowerl3;// 温度过低-3级降功率
    private Integer tempLowestl3;// 温度超低-3级
    private Integer tempPlusHigherl1;// 温差过高1级降功率
    private Integer tempPlusHigherl2;// 温差过高2级降功率
    private Integer tempPlusHigherl3;// 温差过高3级降功率
    private Integer tempRiseSpeedBiggerl2; // 温升速度过高2级降功率
    private Integer tempRiseSpeedBiggestl4; // 温升速度过高4级降功率
    private Integer insuLowl1;// 绝缘过低1级
    private Integer insuLowl2; // 绝缘过低2级降功率
    private Integer insuLowl4;// 绝缘过低4级
    private Integer chargeTimeLong;// 充电时间超长
    private Integer heatTimeLong;// 加热时间超长
    private Integer bmsSysErr;// BMS系统故障
    private Integer chargerNetErr; // 与充电机通信故障
    private Integer volDisconnectl4;// 电压采集断开4级
    private Integer volDisconnectl2;// 电压采集断开2级降功率
    private Integer tempDisconnectl4;// 温度采集断开-4级
    private Integer tempDisconnectl2;// 温度采集端口-2级降功率
    private Integer heatErr; // 加热故障
    private Integer negErrClose;// 负极接触器故障：不能闭合
    private Integer negErrPaste;// 负极接触器故障：粘连


    private Integer dcdcStatus;// DC_DC状态
    private Integer runStatus;// 运行状态
    private Integer socHigherAlarm;// SOC过高报警
    private Integer socJumpAlarm;//SOC跳变报警
    private Integer batterySysDismatch;// 可充电储能系统不匹配报警
    private Integer dcdcTempAlarm;// DC_DC温度报警
    private Integer dcdcStatusAlarm;// DC_DC状态报警
    private String batterySupplierCode;// 生产厂商代码
    private Integer batteryTypeCode;// 车载储能装置类型代码
    private Float nominalEnergy;// 额定能量
    private Float nominalVoltage;// 额定电压
    private String batteryProDate;// 可充电储能系统生产日期
    private Integer batteryProSn;// 流水号
    private Integer batteryCodeLength;// 可充电储能系统编码长度

    /**
     * 最高单体电压
     */
    private Float voltageHighest;
    /**
     * 最高单体电池号
     */
    private Integer voltageHighestNo;
    /**
     * 最低单体电压
     */
    private Float voltageLowest;
    /**
     * 最低单体电池号
     */
    private Integer voltageLowestNo;
    /**
     * 最高温度点温度
     */
    private Integer tempHighest;
    /**
     * 最高温度点电池号
     */
    private Integer tempHighestNo;
    /**
     * 单体电池电压数组
     */
    private Float[] voltage;
    /**
     * 探头温度数组
     */
    private Integer[] temprature;

    public DataPackCanBms(DataPackObject dataPack) {
        super(dataPack);
    }

    public Float getTotalCurrent() {
        return totalCurrent;
    }

    public void setTotalCurrent(Float totalCurrent) {
        this.totalCurrent = totalCurrent;
    }

    public Float getTotalVoltage() {
        return totalVoltage;
    }

    public void setTotalVoltage(Float totalVoltage) {
        this.totalVoltage = totalVoltage;
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

    public Float getVoltageHighest() {
        return voltageHighest;
    }

    public void setVoltageHighest(Float voltageHighest) {
        this.voltageHighest = voltageHighest;
    }

    public Integer getVoltageHighestNo() {
        return voltageHighestNo;
    }

    public void setVoltageHighestNo(Integer voltageHighestNo) {
        this.voltageHighestNo = voltageHighestNo;
    }

    public Float getVoltageLowest() {
        return voltageLowest;
    }

    public void setVoltageLowest(Float voltageLowest) {
        this.voltageLowest = voltageLowest;
    }

    public Integer getVoltageLowestNo() {
        return voltageLowestNo;
    }

    public void setVoltageLowestNo(Integer voltageLowestNo) {
        this.voltageLowestNo = voltageLowestNo;
    }

    public Integer getTempHighest() {
        return tempHighest;
    }

    public void setTempHighest(Integer tempHighest) {
        this.tempHighest = tempHighest;
    }

    public Integer getTempHighestNo() {
        return tempHighestNo;
    }

    public void setTempHighestNo(Integer tempHighestNo) {
        this.tempHighestNo = tempHighestNo;
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
                '}';
    }
}
