package com.incarcloud.rooster.datapack;

/**
 * @author chenzhao
 * @description 6.7.6 ECALL事件日志上报
 * @date 2021/9/3 5:09 下午
 */
public class DataPackEcallEvent extends DataPackObject {
    /**
     * vin
     */
    private String vin;
    /**
     * ECALL开始时间
     */
    private long startTime;
    /**
     * 通话是否成功,通话是否成功，有效值范围：
     * “0x00”: 是
     * “0x01”: 否
     */
    private int success;
    /**
     * 网络制式，有效值范围：
     * “0x00” 2G,
     * “0x01” 3G,
     * “0x02” 4G,
     * “0x03” 5G,
     * “0x04~0xFE”预留字段“0xFF”表示无效或未获取网络制式信息。
     */
    private int networkType;
    /**
     * 信号强度，单位为dBm，信号强度为负值，上传值为信号强度值的绝对值，有效值范围：1-125
     */
    private int signal;
    /**
     * ecall失败原因
     * 有效值范围：
     * “0x01”: SIM卡不在位
     * “0x02”: 设备未注册
     * "0x03~0xFE”
     * 表示自定义中间状态代码。
     */
    private int ecallFailure;
    /**
     * 车辆是否存在翻滚，有效值范围：
     * 0x00：未检测到翻滚
     * 0x01：检测到翻滚
     */
    private int rolloverDetection;
    /**
     * 车辆碰撞程度检测，有效值范围：
     * 0x00：未检测到Crash
     * 0x01：中度Crash（Medium crash）
     * 0x02：重度Crash（Violent crash）
     * 0x03: 后方Crash（Rear crash）
     */
    private int airbagCrashOrder;

    public DataPackEcallEvent(DataPackObject object) {
        super(object);
    }

    @Override
    public String toString() {
        return "DataPackEcallEvent{" +
                "vin='" + vin + '\'' +
                ", startTime=" + startTime +
                ", success=" + success +
                ", networkType=" + networkType +
                ", signal=" + signal +
                ", ecallFailure=" + ecallFailure +
                ", rolloverDetection=" + rolloverDetection +
                ", airbagCrashOrder=" + airbagCrashOrder +
                '}';
    }

    @Override
    public String getVin() {
        return vin;
    }

    @Override
    public void setVin(String vin) {
        this.vin = vin;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public int getNetworkType() {
        return networkType;
    }

    public void setNetworkType(int networkType) {
        this.networkType = networkType;
    }

    public int getSignal() {
        return signal;
    }

    public void setSignal(int signal) {
        this.signal = signal;
    }

    public int getEcallFailure() {
        return ecallFailure;
    }

    public void setEcallFailure(int ecallFailure) {
        this.ecallFailure = ecallFailure;
    }

    public int getRolloverDetection() {
        return rolloverDetection;
    }

    public void setRolloverDetection(int rolloverDetection) {
        this.rolloverDetection = rolloverDetection;
    }

    public int getAirbagCrashOrder() {
        return airbagCrashOrder;
    }

    public void setAirbagCrashOrder(int airbagCrashOrder) {
        this.airbagCrashOrder = airbagCrashOrder;
    }
}
