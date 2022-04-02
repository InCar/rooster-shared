package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * DataPackEcallData
 *
 * @author chenzhao
 * @version 2.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackEcallData extends DataPackObject {

    /**
     * 报警类型，有效值范围：
     * “0x00”：自动触发
     * “0x01”：人工触发
     */
    private int alarmType;
    /**
     * 见6.7.1.2定位数据“状态位定义”说明
     */
    private int positionType;
    /**
     * 经度 以度为单位的纬度值乘以10的6次方，精确到百万分之一度
     */
    private double longitude;
    /**
     * 纬度 以度为单位的纬度值乘以10的6次方，精确到百万分之一度
     */
    private double latitude;

    public DataPackEcallData(DataPackObject object) {
        super(object);
    }
}
