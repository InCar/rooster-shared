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
     * 数据包ID
     */
    protected int packId;
    /**
     * 协议格式版本
     */
    protected String protocolVersion;
    /**
     * obdCode
     */
    protected String obdCode;
    /**
     * tripId
     */
    protected Integer tripId;
    /**
     * VID
     */
    protected String vid;
    /**
     * VIN
     */
    protected String vin;
    /**
     * 检测时间
     */
    protected Date detectionDate;

    public DataTarget() {
    }

    public DataTarget(String deviceName) {
        this.deviceName = deviceName;
    }

    public DataTarget(DataTarget target) {
        this.id = target.id;
        this.deviceName = target.deviceName;
        this.packId = target.packId;
        this.protocolVersion = target.protocolVersion;
        this.obdCode = target.obdCode;
        this.tripId = target.tripId;
        this.vid = target.vid;
        this.vin = target.vin;
        this.detectionDate = target.detectionDate;
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

    public int getPackId() {
        return packId;
    }

    public void setPackId(int packId) {
        this.packId = packId;
    }

    public String getProtocolVersion() {
        return protocolVersion;
    }

    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public String getObdCode() {
        return obdCode;
    }

    public void setObdCode(String obdCode) {
        this.obdCode = obdCode;
    }

    public Integer getTripId() {
        return tripId;
    }

    public void setTripId(Integer tripId) {
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

    public Date getDetectionDate() {
        return detectionDate;
    }

    public void setDetectionDate(Date detectionDate) {
        this.detectionDate = detectionDate;
    }
}
