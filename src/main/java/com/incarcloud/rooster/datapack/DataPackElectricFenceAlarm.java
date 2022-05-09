package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.nio.ByteOrder;
import java.util.Date;

/**
 * 电子围栏设置
 *
 * @version 1.0.0-SNAPSHOT
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackElectricFenceAlarm extends DataPackObject{

    /**
     * 电子围栏id
     */
    private int electricFenceId;

    /**
     * 报警类型
     */
    private int alarmType;

    /**
     * 报警时刻报文时间
     */
    private Date alarmTime;

    /**
     * 报警时刻报文经度
     */
    private double lng;

    /**
     * 报警时刻报文纬度
     */
    private double lat;


    public DataPackElectricFenceAlarm(DataPackObject object) {
        super(object);
    }
}
