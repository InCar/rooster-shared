package com.incarcloud.rooster.cache;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 报警参数设置
 *
 * @author Kong, created on 2019-01-15T10:23.
 * @version 2.4.1-SNAPSHOT
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class AlarmParamSetting {

    /**
     * IMEI
     */
    private String imei;

    /**
     * 报警参数版本
     */
    private String alarmVersion;

    /**
     * 超速报警阈值
     */
    private Integer overspeed;

    /**
     * 超速报警关系 0：等于，1：大于，2，小于
     */
    private Integer overspeedRelation;

    /**
     * 冷却液报警阈值
     */
    private Integer coolingFluid;

    /**
     * 冷却液关系 0：等于，1：大于，2，小于
     */
    private Integer coolingFluidRelation;

    /**
     * 蓄电池电压最小阈值
     */
    private Integer batteryMinVoltage;

    /**
     * 蓄电池电压最小关系 0：等于，1：大于，2，小于
     */
    private Integer batteryMinVoltageRelation;

    /**
     * 蓄电池电压最大阈值
     */
    private Integer batteryMaxVoltage;

    /**
     * 蓄电池电压最大关系 0：等于，1：大于，2，小于
     */
    private Integer batteryMaxVoltageRelation;
}
