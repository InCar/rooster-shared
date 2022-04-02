package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 数据基类<br>
 *
 * @author Aaric, created on 2017-06-27T13:51.
 * @version 2.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString
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
     * 数据包ID(JTT808:消息流水号)
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
     * 车牌号
     */
    protected String license;

    /**
     * 消息包信息-总数
     */
    protected Integer subPackTotal;

    /**
     * 消息包信息-包序号
     */
    protected Integer subPackIndex;

    /**
     * 加密方式：例如RSA
     */
    protected String encryptName;

    /**
     * 检测时间
     */
    protected Date detectionTime;

    public DataPackObject(DataPack dataPack) {
        super(dataPack._group, dataPack._name, dataPack._version);
        this.protocolName = dataPack._name;
        this.protocolVersion = dataPack._version;
        this.receiveTime = dataPack.receiveTime;
    }

    public DataPackObject(DataPackObject object) {
        super(object._group, object._name, object._version);
        this.receiveTime = object.receiveTime;
        this.id = object.id;
        this.deviceName = object.deviceName;
        this.packId = object.packId;
        this.protocolName = object.protocolName;
        this.protocolVersion = object.protocolVersion;
        this.deviceId = object.deviceId;
        this.tripId = object.tripId;
        this.vid = object.vid;
        this.vin = object.vin;
        this.license = object.license;
        this.subPackTotal = object.subPackTotal;
        this.subPackIndex = object.subPackIndex;
        this.encryptName = object.encryptName;
        this.detectionTime = object.detectionTime;
    }
}
