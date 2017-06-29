package com.incarcloud.rooster.datatarget;

/**
 * 位置数据<br>
 * <b>无效定位数据不记录，采用WGS-84坐标系</b>
 * <i>异常与无效定义：</i><br>
 * <ul>
 *     <li>0xFE-异常，0xFF-无效</li>
 *     <li>0xFF,0xFE-异常，0xFF,0xFF-无效</li>
 * </ul>
 *
 * @author Aaric, created on 2017-06-27T14:05.
 * @since 2.0
 */
public class DataTargetPosition extends DataTarget {

    /**
     * 经度
     */
    private Double longitude;
    /**
     * 纬度
     */
    private Double latitude;
    /**
     * 方向
     */
    private Float direction;

    public DataTargetPosition() {
    }

    public DataTargetPosition(DataTarget target) {
        super(target);
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Float getDirection() {
        return direction;
    }

    public void setDirection(Float direction) {
        this.direction = direction;
    }
}
