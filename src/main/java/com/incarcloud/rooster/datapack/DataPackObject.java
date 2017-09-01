package com.incarcloud.rooster.datapack;

import java.util.Date;

/**
 * 数据基类<br>
 *
 * @author Aaric, created on 2017-06-27T13:51.
 * @since 2.0
 */
public class DataPackObject extends DataPack {

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
    protected Date detectionTime;

    /**
     * 数据接收时间
     */
//    protected Date receiveTime;

    public DataPackObject(DataPack dataPack) {
        super(dataPack._group, dataPack._name, dataPack._version);
    }

    public DataPackObject(DataPackObject object) {
        super(object._group, object._name, object._version);
        this.id = object.id;
        this.deviceName = object.deviceName;
        this.packId = object.packId;
        this.protocolName = object.protocolName;
        this.protocolVersion = object.protocolVersion;
        this.deviceId = object.deviceId;
        this.tripId = object.tripId;
        this.vid = object.vid;
        this.vin = object.vin;
        this.detectionTime = object.detectionTime;
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

    public Date getDetectionTime() {
        return detectionTime;
    }

    public void setDetectionTime(Date detectionTime) {
        this.detectionTime = detectionTime;
    }

//    public Date getReceiveTime() {
//        return receiveTime;
//    }
//
//    public void setReceiveTime(Date receiveTime) {
//        this.receiveTime = receiveTime;
//    }


    @Override
    public String toString() {
        return "DataPackObject{" +
                "id='" + id + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", packId=" + packId +
                ", protocolName='" + protocolName + '\'' +
                ", protocolVersion='" + protocolVersion + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", tripId=" + tripId +
                ", vid='" + vid + '\'' +
                ", vin='" + vin + '\'' +
                ", detectionTime=" + detectionTime +
                ", receiveTime=" + receiveTime +
                '}';
    }
}
