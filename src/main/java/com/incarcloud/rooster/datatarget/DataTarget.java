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
    protected Integer packId;
    /**
     * 协议格式名称
     */
    protected String protocolName;
    /**
     * 协议格式版本
     */
    protected String protocolVersion;
    /**
     * 设备ID
     */
    protected String deviceId;
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
        this.protocolName = target.protocolName;
        this.protocolVersion = target.protocolVersion;
        this.deviceId = target.deviceId;
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

    public Integer getPackId() {
        return packId;
    }

    public void setPackId(Integer packId) {
        this.packId = packId;
    }

    public String getProtocolName() {
        return protocolName;
    }

    public void setProtocolName(String protocolName) {
        this.protocolName = protocolName;
    }

    public String getProtocolVersion() {
        return protocolVersion;
    }

    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
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

    public Date getDetectionDate() {
        return detectionDate;
    }

    public void setDetectionDate(Date detectionDate) {
        this.detectionDate = detectionDate;
    }

    @Override
    public String toString() {
        return "DataTarget{" +
                "id='" + id + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", packId=" + packId +
                ", protocolName='" + protocolName + '\'' +
                ", protocolVersion='" + protocolVersion + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", tripId=" + tripId +
                ", vid='" + vid + '\'' +
                ", vin='" + vin + '\'' +
                ", detectionDate=" + detectionDate +
                '}';
    }
}
