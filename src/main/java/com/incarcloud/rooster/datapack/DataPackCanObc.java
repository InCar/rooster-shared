package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * DataPackCanObc
 *
 * @author ChenZhao
 * @version 1.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackCanObc extends DataPackObject {

    /**
     * 充电机输出电压
     */
    private Float outVoltage;
    /**
     * 充电机输出电流
     */
    private Float outCurrent;
    /**
     * 硬件故障
     */
    private Integer isHardErr;
    /**
     * 充电机温度状态
     */
    private Integer isTempHigh;
    /**
     * 输入电压状态
     */
    private Integer isVoltageErr;
    /**
     * 启动状态
     */
    private Integer isRunning;
    /**
     * 通信状态
     */
    private Integer isCommected;
    /**
     * 充电准备就绪
     */
    private Integer isReady;
    /**
     * 输入电压
     */
    private Float inVoltage;
    /**
     * 输入电流
     */
    private Float inCurrent;
    /**
     * PEC电压
     */
    private Float pfcVoltage;
    /**
     * 12V电压
     */
    private Float v12Voltage;
    /**
     * 12V电流
     */
    private Float v12Current;
    /**
     * 硬件输出功率等级
     */
    private Float hardOutkwLevel;
    /**
     * 硬件输出电流等级
     */
    private Integer hardOutcurrentLevel;
    /**
     * 温度1
     */
    private Integer temprature1;
    /**
     * 温度2
     */
    private Integer temprature2;
    /**
     * 温度3
     */
    private Integer temprature3;
    /**
     * 风扇状态
     */
    private Integer fanStatus;
    /**
     * 充电状态
     */
    private Integer chargerStatus;
    /**
     * 充电机温度异常监控
     */
    private Integer tempratureError;
    /**
     * 输入欠压1
     */
    private Integer inUpdervoltage1;
    /**
     * 输入欠压2
     */
    private Integer inUpdervoltage2;
    /**
     * 输入过压
     */
    private Integer inOutvoltage;
    /**
     * 高压输出欠压
     */
    private Integer highvolOutUpdervol;
    /**
     * 高压输出过压
     */
    private Integer highvolOutOutdervol;
    /**
     * 输出过流
     */
    private Integer outOutcurrent;
    /**
     * PFC电压异常
     */
    private Integer pfcVolError;
    /**
     * 充电机12V过压异常
     */
    private Integer v12OutvolError;
    /**
     * 充电机12V欠压异常
     */
    private Integer v12UpdervolError;

    public DataPackCanObc(DataPackObject dataPack) {
        super(dataPack);
    }
}
