package com.incarcloud.rooster.datatarget;

/**
 * 整车数据<br>
 * <i>异常与无效定义：</i><br>
 * <ul>
 *     <li>0xFE-异常，0xFF-无效</li>
 *     <li>0xFF,0xFE-异常，0xFF,0xFF-无效</li>
 * </ul>
 *
 * @author Aaric, created on 2017-06-27T14:04.
 * @since 2.0
 */
public class DataTargetOverview extends DataTarget {

    /**
     * 车辆状态：0x01-发动机点火时，0x02-发动机运行中，0x03-发动机熄火时，0x04-发动机熄火后，0x05-车辆不能检测
     */
    private Integer status;
    /**
     * 车速（km/h）
     */
    private Float speed;
    /**
     * 当前行程行驶距离(m)
     */
    private Integer travelDistance;
    /**
     * 电压（V）
     */
    private Float voltage;

    public DataTargetOverview() {
    }

    public DataTargetOverview(DataTarget target) {
        super(target);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public Integer getTravelDistance() {
        return travelDistance;
    }

    public void setTravelDistance(Integer travelDistance) {
        this.travelDistance = travelDistance;
    }

    public Float getVoltage() {
        return voltage;
    }

    public void setVoltage(Float voltage) {
        this.voltage = voltage;
    }
}
