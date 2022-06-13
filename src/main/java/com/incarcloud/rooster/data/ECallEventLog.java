package com.incarcloud.rooster.data;

import com.incarcloud.rooster.datapack.DataPackEcallEvent;
import lombok.Data;

import java.util.Date;

@Data
public class ECallEventLog {
    private String imei;
    /**
     * 车架号码
     */
    private String vin;

    /**
     * SIM卡ICCID信息
     */
    private String iccid;

    /**
     * ECALL开始时间
     */
    private Date startTime;

    /**
     * ECALL通话是否成功(0:是|1:否)
     */
    private int isSuccess;

    /**
     * 网络制式(0:2G|1:3G|2:4G|3:5G)
     */
    private int networkType;

    /**
     * 信号强度(单位dBm)
     */
    private int signal;

    /**
     * ECALL失败原因(1:SIM卡不在位|2:设备未注册|4~254:预留字段|255:无效)
     */
    private int ecallFailure;

    /**
     * 车辆是否存在翻滚(0:否|1:是)
     */
    private int rolloverDetection;

    /**
     * 车辆碰撞程度检测(0:未检测到|1:中度|2:重度|3:后方)
     */
    private int airbagCrashOrder;
    /**
     * 数据接收时间
     */
    private Date receiveTime;
    /**
     * 数据采集时间
     */
    private Date detectionTime;

    public ECallEventLog() {
    }

    public ECallEventLog(DataPackEcallEvent dataPackEcallEvent) {
        this.imei = dataPackEcallEvent.getDeviceId();
        this.vin = dataPackEcallEvent.getVin();
        this.iccid = dataPackEcallEvent.getIccid();
        this.startTime = new Date(dataPackEcallEvent.getStartTime());
        this.isSuccess = dataPackEcallEvent.getSuccess();
        this.networkType = dataPackEcallEvent.getNetworkType();
        this.signal = dataPackEcallEvent.getSignal();
        this.ecallFailure = dataPackEcallEvent.getEcallFailure();
        this.rolloverDetection = dataPackEcallEvent.getRolloverDetection();
        this.airbagCrashOrder = dataPackEcallEvent.getAirbagCrashOrder();
        this.receiveTime=dataPackEcallEvent.getReceiveTime();
        this.detectionTime=dataPackEcallEvent.getDetectionTime();

    }

}
