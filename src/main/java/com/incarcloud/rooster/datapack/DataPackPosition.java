package com.incarcloud.rooster.datapack;

import java.util.Date;

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
public class DataPackPosition extends DataPackObject {

    /**
     * 经度
     */
    private Double longitude;
    /**
     * 纬度
     */
    private Double latitude;
    /**
     * 方向： 0~360, 正北为 0 度，顺时针旋转, 用字符串（无结束符）表示；如不支持，用“-“替代
     */
    private String direction;

    /**
     * 定位方式：0-无效数据，1-基站定位，2-GPS 定位
     */
    private Integer positioMode;
    /**
     * 定位时间
     */
    private Date positionDate;

    public DataPackPosition(DataPackObject object) {
        super(object);
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

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Integer getPositioMode() {
        return positioMode;
    }

    public void setPositioMode(Integer positioMode) {
        this.positioMode = positioMode;
    }

    public Date getPositionDate() {
        return positionDate;
    }

    public void setPositionDate(Date positionDate) {
        this.positionDate = positionDate;
    }
}
