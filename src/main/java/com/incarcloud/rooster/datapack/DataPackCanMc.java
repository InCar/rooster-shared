package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * DataPackCanMc
 *
 * @author ChenZhao
 * @version 1.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
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
}
