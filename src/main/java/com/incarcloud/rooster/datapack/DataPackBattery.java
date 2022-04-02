package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 电池数据<br>
 * <i>异常与无效定义：</i><br>
 * <ul>
 * <li>0xFE-异常，0xFF-无效</li>
 * <li>0xFF,0xFE-异常，0xFF,0xFF-无效</li>
 * </ul>
 *
 * @author Aaric, created on 2017-06-27T14:04.
 * @version 2.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackBattery extends DataPackObject {

    /**
     * 动力蓄电池字子系统个数
     * N个动力蓄电池，有效值范围：1～250，“0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer batterySysNumber;
    /**
     * 电池子系统号
     * 有效值范围：1～253
     */
    private Integer batterySysIndex;
    /**
     * 动力蓄电池电压
     * 有效值范围：0～60000（表示 0V～6000V），最小计量单元：0.1V，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效。
     */
    private Float totalVoltage;
    /**
     * 动力蓄电池电流
     * 有效值范围： 0～20000（数值偏移量 1000A，表示-1000A～+1000A），最小计量单元：0.1A，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效。
     */
    private Float totalCurrent;
    /**
     * 单体蓄电池电压值
     * 有效值范围：0～15000（表示 0V～15.000V），最小计量单元：0.001V，
     * 单体蓄电池电压值个数等于本帧单体蓄电池总数 m，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效。
     */
    private List<Float> batteryVoltages;
    /**
     * 单体蓄电池总数
     * N个电池单体，有效值范围：1～65531，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效。
     */
    private Integer batteryNumber;
    /**
     * 本帧起始电池序号
     * 当本帧单体个数超过 200 时，应拆分成多帧数据进行传输，有效值范围：1～65531
     */
    private Integer batteryStartIndex;
    /**
     * 本帧单体电池总数
     * 本帧单体总数 m;有效值范围：1～200
     */
    private Integer batteryPacketNumber;

    public DataPackBattery(DataPackObject dataPack) {
        super(dataPack);
    }
}
