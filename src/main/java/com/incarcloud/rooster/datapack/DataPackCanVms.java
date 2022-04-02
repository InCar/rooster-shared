package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * DataPackCanVms
 *
 * @author ChenZhao
 * @version 1.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackCanVms extends DataPackObject {

    /**
     * 电机当前状态
     */
    private Integer motorStatus;
    /**
     * 电机温度是否过高
     */
    private Integer isMotorTempHigh;
    /**
     * 电机控制器温度是否过高
     */
    private Integer isMotorControlerTempHigh;
    /**
     * 电机控制器是否故障
     */
    private Integer isMotorControlerErr;
    /**
     * 电机直流母线电压
     */
    private Float voltageRange;
    /**
     * 加速踏板开度
     */
    private Integer aprRate;
    /**
     * 动力输出报警提示
     */
    private Integer outAlarmInfoNumber;
    /**
     * 电池组电流
     */
    private Float batteryGroupCurrent;
    /**
     * 电池组电压
     */
    private Float batteryGroupVoltage;
    /**
     * 剩余电量
     */
    private Integer leaveBattery;
    /**
     * 车速
     */
    private Float speed;
    /**
     * 电机系统温度
     */
    private Integer motorSysTemp;
    /**
     * 档位信息
     */
    private Integer gearStatus;
    /**
     * 钥匙位置信息
     */
    private Integer keyPos;
    /**
     * 车辆降功率运行状态
     */
    private Integer lowPowerStatus;
    /**
     * 空调使能
     */
    private Integer isAirconOpen;
    /**
     * PEPS认真状态
     */
    private Integer pepsStatus;
    /**
     * READY信号
     */
    private Integer isReady;
    /**
     * 接触器控制指令
     */
    private Integer contactorControlCommand;
    /**
     * 工作模式
     */
    private Integer workType;
    /**
     * 档位
     */
    private Integer gear;
    /**
     * 制动状态
     */
    private Integer brakStatus;
    /**
     * 电源控制
     */
    private Integer powerCtrl;
    /**
     * 降功率等级
     */
    private Integer deratStatus;
    /**
     * 点火钥匙位置信息
     */
    private Integer keyPosition;
    /**
     * 外接充电线连接状态
     */
    private Integer outchargelineConStatus;
    /**
     * 与充电机通讯状态
     */
    private Integer tochargeConStatus;
    /**
     * 车型类别
     */
    private Integer carType;
    /**
     * GPRS总正接触器锁止指令
     */
    private Integer gprsLockCommand;
    /**
     * 电池SOC
     */
    private Integer vmsSoc;

    public DataPackCanVms(DataPackObject dataPack) {
        super(dataPack);
    }
}
