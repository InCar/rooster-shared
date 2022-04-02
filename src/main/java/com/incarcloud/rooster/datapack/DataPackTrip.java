package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * DataPackTrip
 *
 * @author chenz
 * @version V1.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackTrip extends DataPackObject {

    /**
     * 行程开始位置
     */
    private DataPackPosition startPosition;

    /**
     * 行程结束位置
     */
    private DataPackPosition endPosition;

    /**
     * 行程开始时间
     */
    private Date startTime;
    /**
     * 行程结束时间
     */
    private Date endTime;
    /**
     * 平均油耗<br>
     * 有效值范围： 0～1000，（数值偏移量n/10，表示
     * 0～100升/百公里），最小计量单元：0.1升/百公里，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效。
     */
    private Float oilWearAvg;

    /**
     * 平均车速<br>
     * 有效值范围：0～2200（表示0 km/h～220
     * km/h），最小计量单元：0.1km/h，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效。
     */
    private Float speedAvg;
    /**
     * 最高车速<br>
     * 有效值范围：0～2200（表示0 km/h～220
     * km/h），最小计量单元：0.1km/h，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效。
     */
    private Float speedMax;
    /**
     * 行程时长<br>
     * 有效值范围： 0～500000单位：分钟，“0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer tripDuration;
    /**
     * 行程行驶里程<br>
     * 单位：米/h
     */
    private Integer mileage;
    /**
     * 急加速次数<br>
     * 有效值范围： 0～255单位：次，“0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer rapidAccelerationTimes;
    /**
     * 急减速次数<br>
     * 有效值范围： 0～255单位：次，“0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer rapidDecelerationTimes;
    /**
     * 急转弯次数<br>
     * 有效值范围： 0～255单位：次，“0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer sharpTurnTimes;

    public DataPackTrip(DataPackObject object) {
        super(object);
    }
}
