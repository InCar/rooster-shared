package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * DataPackCanBms
 *
 * @author ChenZhao
 * @version 1.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackCanBms extends DataPackObject {
    /**
     * 总电流
     */
    private Float totalCurrent;
    /**
     * 总电压
     */
    private Float totalVoltage;
    /**
     * 外接充电线连接状态
     */
    private Integer isChargerConnected;
    /**
     * CP信号
     */
    private Integer cpSignal;
    /**
     * 总负接触器KS状态
     */
    private Integer ksStatus;
    /**
     * 开关S2状态
     */
    private Integer s2Status;
    /**
     * 与充电机通讯状态
     */
    private Integer isConnectCharger;
    /**
     * 电池包均衡状态
     */
    private Integer isBatteryGroupBalance;
    /**
     * 冷却风扇状态
     */
    private Integer coldFanStatus;
    /**
     * 电池组当前的SOC
     */
    private Integer soc;
    /**
     * 电池组当前状态
     */
    private Integer batteryGroupStatus;
    /**
     * 故障等级
     */
    private Integer errorLevel;
    /**
     * 动力电池报警指示
     */
    private Integer batteryAlarmIndication;
    /**
     * 降功率等级
     */
    private Integer descPowerLevel;
    /**
     * 绝缘超低
     */
    private Integer isInsuLowest;
    /**
     * BMS故障码
     */
    private Integer bmsError;
    /**
     * 最高允许充电端电压
     */
    private Float alowableVoltage;
    /**
     * 最高允许充电电流
     */
    private Float alowableCurrent;
    /**
     * 负载类型
     */
    private Integer loadType;
    /**
     * 加热继电器状态
     */
    private Integer heaterStatus;
    /**
     * 充电次数
     */
    private Integer chargerCount;
    /**
     * 动力电池包10S最大放电功率
     */
    private Integer discharge10SPower;
    /**
     * 动力电池包30S最大放电功率
     */
    private Integer discharge30SPower;
    /**
     * 动力电池包持续最大放电功率
     */
    private Integer dischargeMaximumPower;
    /**
     * 动力电池包最大放电电流限值
     */
    private Integer dischargeMaximumCurrent;
    /**
     * 动力电池包 10S 最大充电功率
     */
    private Integer charge10SPower;
    /**
     * 动力电池包 30S 最大充电功率
     */
    private Integer charge30SPower;
    /**
     * 动力电池包持续最大充电功率
     */
    private Integer chargeMaximumPower;
    /**
     * 动力电池包最大充电电流限值
     */
    private Integer chargeMaximumCurrent;
    /**
     * 单体电压超高-充电-4级
     */
    private Integer sellVolHighestChargerl4;
    /**
     * 单体电压超高-回馈-3级
     */
    private Integer sellVolHighestFbl3;
    /**
     * 单体电压超高-3级
     */
    private Integer sellVolHighestL3;
    /**
     * 总电压超高-充电-4级
     */
    private Integer totalVolHighestChargerl4;
    /**
     * 总电压超高-回馈-3级
     */
    private Integer totalVolHighestFbl3;
    /**
     * 总电压超高-3级
     */
    private Integer totalVolHighestl3;
    /**
     * 单体电压过低-1级降功率
     */
    private Integer sellVolLowerl1;
    /**
     * 单体电压过低-2级降功率
     */
    private Integer sellVolLowerl2;
    /**
     * 单体电压过低-3级降功率
     */
    private Integer sellVolLowerl3;
    /**
     * 总电压过低-1级降功率
     */
    private Integer totalVolLowerl1;
    /**
     * 总电压过低-2级降功率
     */
    private Integer totalVolLowerl2;
    /**
     * 总电压过低-3级降功率
     */
    private Integer totalVolLowerl3;
    /**
     * 单体电压超低-3级
     */
    private Integer sellVolLowestl3;
    /**
     * 单体电压超低-4级
     */
    private Integer sellVolLowestl4;
    /**
     * 单体电压超低-充电
     */
    private Integer sellVolLowestCharger;
    /**
     * 总电压超低-3级
     */
    private Integer totalVolLowestl3;
    /**
     * 总电压超低-4级
     */
    private Integer totalVolLowestl4;
    /**
     * 总电压超低-充电
     */
    private Integer totalVolLowestCharger;
    /**
     * 压差过大-1级降功率
     */
    private Integer volPlusBiggerl1;
    /**
     * 压差过大-2级降功率
     */
    private Integer volPlusBiggerl2;
    /**
     * 压差过大-3级降功率
     */
    private Integer volPlusBiggerl3;
    /**
     * SOC过低-1级降功率
     */
    private Integer socLowerl1;
    /**
     * SOC过低-2级降功率
     */
    private Integer socLowerl2;
    /**
     * SOC过低-3级降功率
     */
    private Integer socLowerl3;
    /**
     * 放电电流过大-1级降功率
     */
    private Integer dischargerCurrentBiggerl1;
    /**
     * 放电电流过大-2级降功率
     */
    private Integer dischargerCurrentBiggerl2;
    /**
     * 放电电流过大-3级降功率
     */
    private Integer dischargerCurrentBiggerl3;
    /**
     * 放电电流超大-3级
     */
    private Integer dischargerCurrentBiggestl3;
    /**
     * 充电电流超大-3级
     */
    private Integer chargerCurrentBiggestl3;
    /**
     * 充电电流超大-4级
     */
    private Integer chargerCurrentBiggestl4;
    /**
     * 回馈电流超大-3级
     */
    private Integer feedbackCurrentBiggestl3;
    /**
     * 回馈电流超大-4级
     */
    private Integer feedbackCurrentBiggestl4;
    /**
     * 温度过高-1级降功率
     */
    private Integer tempratureHigherl1;
    /**
     * 温度过高-2级降功率
     */
    private Integer tempratureHigherl2;
    /**
     * 温度过高-3级降功率
     */
    private Integer tempratureHigherl3;
    /**
     * 温度超高-3级
     */
    private Integer tempratureHighestl3;
    /**
     * 温度超高-4级
     */
    private Integer tempratureHighestl4;
    /**
     * 加热膜温度超高
     */
    private Integer heatMoTempratureHighest;
    /**
     * 温度过低-1级降功率
     */
    private Integer tempLowerl1;
    /**
     * 温度过低-2级降功率
     */
    private Integer tempLowerl2;
    /**
     * 温度过低-3级降功率
     */
    private Integer tempLowerl3;
    /**
     * 温度超低-3级
     */
    private Integer tempLowestl3;
    /**
     * 温差过高1级降功率
     */
    private Integer tempPlusHigherl1;
    /**
     * 温差过高2级降功率
     */
    private Integer tempPlusHigherl2;
    /**
     * 温差过高3级降功率
     */
    private Integer tempPlusHigherl3;
    /**
     * 温升速度过高2级降功率
     */
    private Integer tempRiseSpeedBiggerl2;
    /**
     * 温升速度过高4级降功率
     */
    private Integer tempRiseSpeedBiggestl4;
    /**
     * 绝缘过低1级
     */
    private Integer insuLowl1;
    /**
     * 绝缘过低2级降功率
     */
    private Integer insuLowl2;
    /**
     * 绝缘过低4级
     */
    private Integer insuLowl4;
    /**
     * 充电时间超长
     */
    private Integer chargeTimeLong;
    /**
     * 加热时间超长
     */
    private Integer heatTimeLong;
    /**
     * BMS系统故障
     */
    private Integer bmsSysErr;
    /**
     * 与充电机通信故障
     */
    private Integer chargerNetErr;
    /**
     * 电压采集断开4级
     */
    private Integer volDisconnectl4;
    /**
     * 电压采集断开2级降功率
     */
    private Integer volDisconnectl2;
    /**
     * 温度采集断开-4级
     */
    private Integer tempDisconnectl4;
    /**
     * 温度采集端口-2级降功率
     */
    private Integer tempDisconnectl2;
    /**
     * 加热故障
     */
    private Integer heatErr;
    /**
     * 负极接触器故障：不能闭合
     */
    private Integer negErrClose;
    /**
     * 负极接触器故障：粘连
     */
    private Integer negErrPaste;

    /**
     * DC_DC状态
     */
    private Integer dcdcStatus;
    /**
     * 运行状态
     */
    private Integer runStatus;
    /**
     * SOC过高报警
     */
    private Integer socHigherAlarm;
    /**
     * SOC跳变报警
     */
    private Integer socJumpAlarm;
    /**
     * 可充电储能系统不匹配报警
     */
    private Integer batterySysDismatch;
    /**
     * DC_DC温度报警
     */
    private Integer dcdcTempAlarm;
    /**
     * DC_DC状态报警
     */
    private Integer dcdcStatusAlarm;
    /**
     * 生产厂商代码
     */
    private String batterySupplierCode;
    /**
     * 车载储能装置类型代码
     */
    private Integer batteryTypeCode;
    /**
     * 额定能量
     */
    private Float nominalEnergy;
    /**
     * 额定电压
     */
    private Float nominalVoltage;
    /**
     * 可充电储能系统生产日期
     */
    private String batteryProDate;
    /**
     * 流水号
     */
    private Integer batteryProSn;
    /**
     * 可充电储能系统编码长度
     */
    private Integer batteryCodeLength;
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
}
