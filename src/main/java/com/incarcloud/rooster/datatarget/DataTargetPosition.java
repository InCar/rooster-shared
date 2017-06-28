package com.incarcloud.rooster.datatarget;

/**
 * 位置数据<br>
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
     * 定位状态：<br>
     *     X00-----: 0-有效定位，1-无效定位
     *     0X0-----: 0-北纬，1-南纬
     *     00X-----：0-东经，1-西经
     */
    private Integer positionStatus;
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

    public Integer getPositionStatus() {
        return positionStatus;
    }

    public void setPositionStatus(Integer positionStatus) {
        this.positionStatus = positionStatus;
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
