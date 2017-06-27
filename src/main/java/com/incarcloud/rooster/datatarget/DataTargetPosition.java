package com.incarcloud.rooster.datatarget;

/**
 * 位置数据
 *
 * @author Aaric, created on 2017-06-27T14:05.
 * @since 2.0
 */
public class DataTargetPosition extends DataTarget {

    /**
     * 经度
     */
    private double longitude;
    /**
     * 纬度
     */
    private double latitude;
    /**
     * 方向
     */
    private double direction;
    /**
     * 定位状态
     */
    private int status;

    public DataTargetPosition(double longitude, double latitude, double direction, int status) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.direction = direction;
        this.status = status;
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

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
