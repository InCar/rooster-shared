package com.incarcloud.rooster.data;

import com.incarcloud.rooster.datapack.DataPackEcallData;
import lombok.Data;

import java.util.Date;

@Data
public class ECallAlarm {
    private String imei;
    /**
     * 车架号码
     */
    private String vin;
    /**
     * 报警类型(0自动|1人工)
     */
    private int alarmType;
    /**
     * 经度
     */
    private double longitude;
    /**
     * 纬度
     */
    private double latitude;
    /**
     * 数据采集时间
     */
    private Date detectionTime;
    /**
     * 来源类型(0 报文 1 短信)
     */
    private int sourceType;
    /**
     * 数据接收时间
     */
    private Date receiveTime;
    /**
     * 定位状态(0:有效|1无效)
     */
    private int positionType;

    public ECallAlarm() {
    }

    public ECallAlarm(DataPackEcallData dataPackEcallData) {
        this.imei = dataPackEcallData.getDeviceId();
        this.vin = dataPackEcallData.getVin();
        this.alarmType = dataPackEcallData.getAlarmType();
        this.longitude = dataPackEcallData.getLongitude();
        this.latitude = dataPackEcallData.getLatitude();
        this.detectionTime = dataPackEcallData.getDetectionTime();
        this.sourceType = 0;
        this.receiveTime = dataPackEcallData.getReceiveTime();
        this.positionType = dataPackEcallData.getPositionType();
    }
}
