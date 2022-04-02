package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 驱动电机数据<br>
 * <i>异常与无效定义：</i><br>
 * <ul>
 *     <li>0xFE-异常，0xFF-无效</li>
 *     <li>0xFF,0xFE-异常，0xFF,0xFF-无效</li>
 * </ul>
 *
 * @author Aaric, created on 2017-06-27T14:04.
 * @version 2.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackMotor extends DataPackObject {

    /**
     * 驱动电机个数
     */
    private Integer motorTotal;
    /**
     * 驱动电机序号
     */
    private Integer motorSeq;
    /**
     * 驱动电机状态：0x01-耗电，0x02-发电，0x03-关闭状态，0x04-准备状态
     */
    private Integer motorStatus;
    /**
     * 驱动电机控制器温度（最小计量单位1℃）
     */
    private Integer controllerTemperature;
    /**
     * 驱动电机转速（最小计量单位1r/min）
     */
    private Integer speed;
    /**
     * 驱动电机转矩（最小计量单位0.1N·m）
     */
    private Float torque;
    /**
     * 驱动电机温度（最小计量单位1℃）
     */
    private Integer motorTemperature;
    /**
     * 电机控制器输入电压（最小计量单元0.1V）
     */
    private Float controllerInputVoltage;
    /**
     * 电机控制器直流母线电流（最小计量单位0.1A）
     */
    private Float controllerDirectCurrent;

    public DataPackMotor(DataPackObject object) {
        super(object);
    }
}
