package com.incarcloud.rooster.datatarget;

import java.util.Date;

/**
 * 数据基类<br>
 *
 * @author Aaric, created on 2017-06-27T13:51.
 * @since 2.0
 */
public class DataTarget {

    /**
     * 唯一识别码（国标建议传输车辆数据采用车辆VIN）
     */
    protected String id;
    /**
     * 采集设备名称
     */
    protected String deviceName;
    /**
     * obdCode
     */
    protected String obdCode;
    /**
     * tripId
     */
    protected Long tripId;
    /**
     * VID
     */
    protected String vid;
    /**
     * VIN
     */
    protected String vin;
    /**
     * 接收时间
     */
    protected Date receiveDate;

    public DataTarget() {
    }

    public DataTarget(String deviceName) {
        this.deviceName = deviceName;
    }

    public DataTarget(DataTarget target) {
        this.id = target.id;
        this.deviceName = target.deviceName;
        this.obdCode = target.obdCode;
        this.tripId = target.tripId;
        this.vid = target.vid;
        this.vin = target.vin;
        this.receiveDate = target.receiveDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getObdCode() {
        return obdCode;
    }

    public void setObdCode(String obdCode) {
        this.obdCode = obdCode;
    }

    public Long getTripId() {
        return tripId;
    }

    public void setTripId(Long tripId) {
        this.tripId = tripId;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }
}
