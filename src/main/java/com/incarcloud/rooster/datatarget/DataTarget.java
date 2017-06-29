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
     * tripId
     */
    protected String tripId;
    /**
     * VID
     */
    protected String vid;
    /**
     * 车辆识别码
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

    public DataTarget(String id, String deviceName, String tripId, String vid, String vin, Date receiveDate) {
        this.id = id;
        this.deviceName = deviceName;
        this.tripId = tripId;
        this.vid = vid;
        this.vin = vin;
        this.receiveDate = receiveDate;
    }

    public DataTarget(DataTarget target) {
        this.deviceName = target.deviceName;
        this.id = target.id;
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

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
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
