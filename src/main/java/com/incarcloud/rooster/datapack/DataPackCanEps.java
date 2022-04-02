package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * DataPackCanEps
 *
 * @author ChenZhao
 * @version 1.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackCanEps extends DataPackObject {

    /**
     * EPS故障等级
     */
    private Integer errLevel;
    /**
     * EPS工作状态
     */
    private Integer isWork;
    /**
     * EPS助力力矩
     */
    private Float helpMoment;
    /**
     * EPS电机工作电流
     */
    private Float electricity;
    /**
     * 电源电压
     */
    private Float voltage;
    /**
     * EPS传感器故障
     */
    private Integer isSensorErr;
    /**
     * EPS电流异常
     */
    private Integer isCurrentException;
    /**
     * EPS电压过高
     */
    private Integer isVoltageHigher;
    /**
     * EPS温度过高
     */
    private Integer isTempHigher;
    /**
     * EPS电压过低
     */
    private Integer isVoltageLower;
    /**
     * EPS初始化异常
     */
    private Integer isInitException;
    /**
     * EPS电机驱动器故障
     */
    private Integer isDriverErr;
    /**
     * 电机初始化及轮询故障
     */
    private Integer isMotorInitErr;
    /**
     * 角度传感器故障
     */
    private Integer isAngleSensorErr;
    /**
     * CAN控制器故障
     */
    private Integer isCanCtrlErr;
    /**
     * 钥匙位置或车速信号失效
     */
    private Integer isKeyInvalid;
    /**
     * 温度传感器超下限
     */
    private Integer isTempLowerLmt;
    /**
     * 温度传感器超上限
     */
    private Integer isTempUpperLmt;

    public DataPackCanEps(DataPackObject dataPack) {
        super(dataPack);
    }
}
