package com.incarcloud.rooster.datatarget;

import java.util.Date;

/**
 * 数据基类
 *
 * @author Aaric, created on 2017-06-27T13:51.
 * @since 2.0
 */
public class DataTarget {

    /**
     * 唯一识别码（国标建议传输车辆数据采用车辆VIN）
     */
    protected String identifer;
    /**
     * 车辆识别码
     */
    protected String vin;
    /**
     * 接收时间
     */
    protected Date receiveDate;
}
