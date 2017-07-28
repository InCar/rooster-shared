package com.incarcloud.rooster.datapack;

import java.util.Arrays;

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
public class DataPackOverview extends DataPackObject {

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
    /**
     * 发动机运行时间(秒)
     */
    private Integer engineRunningTime;
    /**
     * 本次平均油耗(0.01L/100km) 不支持用0xFFFF表示
     */
    private Float averageFuelConsumption;
    /**
     * 累计行驶里程(km)
     */
    private Integer totalTravelDistance;
    /**
     * 累计平均油耗(0.01L/km) 不支持用0xFFFF表示
     */
    private Float totalAverageFuelConsumption;
    /**
     * 设置的速度值(km/h)
     */
    private Integer[] speedSet;
    /**
     * 时间小计(秒)
     */
    private Integer[] subTotalTime;
    /**
     * 距离小计(m)
     */
    private Integer[] subTotalDistance;
    /**
     * 本次急加速次数
     */
    private Integer suddenUp;
    /**
     * 本次急减速次数
     */
    private Integer suddenDec;
    /**
     * 本次急转向次数
     */
    private Integer suddenTurn;
    /**
     * 本次时速超速行驶时间(秒)
     */
    private Integer speedingTime;
    /**
     * 最高车速(km/h)
     */
    private Integer maxSpeed;

    public DataPackOverview(DataPackObject object) {
        super(object);
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

    public Integer[] getSpeedSet() {
        return speedSet;
    }

    public void setSpeedSet(Integer[] speedSet) {
        this.speedSet = speedSet;
    }

    public Integer getEngineRunningTime() {
        return engineRunningTime;
    }

    public void setEngineRunningTime(Integer engineRunningTime) {
        this.engineRunningTime = engineRunningTime;
    }

    public Float getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public void setAverageFuelConsumption(Float averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public Integer getTotalTravelDistance() {
        return totalTravelDistance;
    }

    public void setTotalTravelDistance(Integer totalTravelDistance) {
        this.totalTravelDistance = totalTravelDistance;
    }

    public Float getTotalAverageFuelConsumption() {
        return totalAverageFuelConsumption;
    }

    public void setTotalAverageFuelConsumption(Float totalAverageFuelConsumption) {
        this.totalAverageFuelConsumption = totalAverageFuelConsumption;
    }

    public Integer[] getSubTotalTime() {
        return subTotalTime;
    }

    public void setSubTotalTime(Integer[] subTotalTime) {
        this.subTotalTime = subTotalTime;
    }

    public Integer[] getSubTotalDistance() {
        return subTotalDistance;
    }

    public void setSubTotalDistance(Integer[] subTotalDistance) {
        this.subTotalDistance = subTotalDistance;
    }

    public Integer getSuddenUp() {
        return suddenUp;
    }

    public void setSuddenUp(Integer suddenUp) {
        this.suddenUp = suddenUp;
    }

    public Integer getSuddenDec() {
        return suddenDec;
    }

    public void setSuddenDec(Integer suddenDec) {
        this.suddenDec = suddenDec;
    }

    public Integer getSuddenTurn() {
        return suddenTurn;
    }

    public void setSuddenTurn(Integer suddenTurn) {
        this.suddenTurn = suddenTurn;
    }

    public Integer getSpeedingTime() {
        return speedingTime;
    }

    public void setSpeedingTime(Integer speedingTime) {
        this.speedingTime = speedingTime;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "DataPackOverview{" +
                "status=" + status +
                ", speed=" + speed +
                ", travelDistance=" + travelDistance +
                ", voltage=" + voltage +
                ", engineRunningTime=" + engineRunningTime +
                ", averageFuelConsumption=" + averageFuelConsumption +
                ", totalTravelDistance=" + totalTravelDistance +
                ", totalAverageFuelConsumption=" + totalAverageFuelConsumption +
                ", speedSet=" + Arrays.toString(speedSet) +
                ", subTotalTime=" + Arrays.toString(subTotalTime) +
                ", subTotalDistance=" + Arrays.toString(subTotalDistance) +
                ", suddenUp=" + suddenUp +
                ", suddenDec=" + suddenDec +
                ", suddenTurn=" + suddenTurn +
                ", speedingTime=" + speedingTime +
                ", maxSpeed=" + maxSpeed +
                ", id='" + id + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", packId=" + packId +
                ", protocolName='" + protocolName + '\'' +
                ", protocolVersion='" + protocolVersion + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", tripId=" + tripId +
                ", vid='" + vid + '\'' +
                ", vin='" + vin + '\'' +
                ", detectionDate=" + detectionDate +
                ", _group='" + _group + '\'' +
                ", _name='" + _name + '\'' +
                ", _version='" + _version + '\'' +
                '}';
    }
}
