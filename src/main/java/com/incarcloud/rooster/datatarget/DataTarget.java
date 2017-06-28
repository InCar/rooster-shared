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
    protected String identifer;
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

    public DataTarget(String identifer, String tripId, String vid, String vin, Date receiveDate) {
        this.identifer = identifer;
        this.tripId = tripId;
        this.vid = vid;
        this.vin = vin;
        this.receiveDate = receiveDate;
    }

    public DataTarget(DataTarget target) {
        this.identifer = target.identifer;
        this.tripId = target.tripId;
        this.vid = target.vid;
        this.vin = target.vin;
        this.receiveDate = target.receiveDate;
    }

    public String getIdentifer() {
        return identifer;
    }

    public void setIdentifer(String identifer) {
        this.identifer = identifer;
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
