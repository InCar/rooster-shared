package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * DataPackCanHvac
 *
 * @author ChenZhao
 * @version 1.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackCanHvac extends DataPackObject {

    /**
     * 空调启动状态
     */
    private Integer runStatus;
    /**
     * 空调风机档位
     */
    private Integer hvacLevel;
    /**
     * 空调功率
     */
    private Integer power;
    /**
     * 车外温度
     */
    private Float exTemp;
    /**
     * 车内温度
     */
    private Float innerTemp;
    /**
     * 空调风向状态
     */
    private Integer crondDirection;
    /**
     * 空调循环模式状态
     */
    private Integer cirleModel;
    /**
     * 模式电机故障
     */
    private Integer errModel;
    /**
     * 温度电机故障
     */
    private Integer errTemp;
    /**
     * 蒸发器传感器故障
     */
    private Integer errEvalsensor;
    /**
     * 回风温度传感器故障
     */
    private Integer errTempSensor;

    public DataPackCanHvac(DataPackObject dataPack) {
        super(dataPack);
    }
}
