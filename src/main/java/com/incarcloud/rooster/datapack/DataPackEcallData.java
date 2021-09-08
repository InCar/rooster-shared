package com.incarcloud.rooster.datapack;

/**
 * @author chenzhao
 * @description 6.7.5 ecall数据
 * @date 2021/9/3 5:03 下午
 */
public class DataPackEcallData extends DataPackObject {
    /**
     * vin
     */
    private String vin;
    /**
     * 报警类型，有效值范围：
     * “0x00”：自动触发
     * “0x01”：人工触发
     */
    private int alarmType;
    /**
     * 见6.7.1.2定位数据“状态位定义”说明
     */
    private int positionType;
    /**
     * 经度 以度为单位的纬度值乘以10的6次方，精确到百万分之一度
     */
    private double longitude;
    /**
     * 纬度 以度为单位的纬度值乘以10的6次方，精确到百万分之一度
     */
    private double latitude;

    public DataPackEcallData(DataPackObject object) {
        super(object);
    }

    @Override
    public String toString() {
        return "DataPackEcallData{" +
                "vin='" + vin + '\'' +
                ", alarmType=" + alarmType +
                ", positionType=" + positionType +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
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

    public int getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(int alarmType) {
        this.alarmType = alarmType;
    }

    public int getPositionType() {
        return positionType;
    }

    public void setPositionType(int positionType) {
        this.positionType = positionType;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
