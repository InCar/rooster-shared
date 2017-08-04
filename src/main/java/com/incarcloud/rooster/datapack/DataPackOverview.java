package com.incarcloud.rooster.datapack;

import java.util.List;

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
    private Integer carStatus;
    /**
     * 电压（V）
     */
    private Float voltage;
    /**
     * 位置信息
     */
    private DataPackPosition position;
    /**
     * 本次发动机运行时间(秒)
     */
    private Integer runTime;
    /**
     * 本次行驶距离(米)
     */
    private Integer currentMileage;
    /**
     * 本次平均油耗(0.01L/100km)<br>
     *     /100F转Float
     */
    private Float currentAvgOilUsed;
    /**
     * 累计行驶里程(km)
     */
    private Integer mileage;
    /**
     * 累计平均油耗(0.01L/100km)
     *     /100F转Float
     */
    private Float avgOilUsed;
    /**
     * 本行程车速分组统计
     */
    private List<Speed> speedGroup;
    /**
     * 本次急加速次数
     */
    private Integer speedUpTimes;
    /**
     * 本次急减速次数
     */
    private Integer speedDownTimes;
    /**
     * 本次急转向次数
     */
    private Integer sharpTurnTimes;
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

    public Integer getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(Integer carStatus) {
        this.carStatus = carStatus;
    }

    public Float getVoltage() {
        return voltage;
    }

    public void setVoltage(Float voltage) {
        this.voltage = voltage;
    }

    public DataPackPosition getPosition() {
        return position;
    }

    public void setPosition(DataPackPosition position) {
        this.position = position;
    }

    public Integer getRunTime() {
        return runTime;
    }

    public void setRunTime(Integer runTime) {
        this.runTime = runTime;
    }

    public Integer getCurrentMileage() {
        return currentMileage;
    }

    public void setCurrentMileage(Integer currentMileage) {
        this.currentMileage = currentMileage;
    }

    public Float getCurrentAvgOilUsed() {
        return currentAvgOilUsed;
    }

    public void setCurrentAvgOilUsed(Float currentAvgOilUsed) {
        this.currentAvgOilUsed = currentAvgOilUsed;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Float getAvgOilUsed() {
        return avgOilUsed;
    }

    public void setAvgOilUsed(Float avgOilUsed) {
        this.avgOilUsed = avgOilUsed;
    }

    public List<Speed> getSpeedGroup() {
        return speedGroup;
    }

    public void setSpeedGroup(List<Speed> speedGroup) {
        this.speedGroup = speedGroup;
    }

    public Integer getSpeedUpTimes() {
        return speedUpTimes;
    }

    public void setSpeedUpTimes(Integer speedUpTimes) {
        this.speedUpTimes = speedUpTimes;
    }

    public Integer getSpeedDownTimes() {
        return speedDownTimes;
    }

    public void setSpeedDownTimes(Integer speedDownTimes) {
        this.speedDownTimes = speedDownTimes;
    }

    public Integer getSharpTurnTimes() {
        return sharpTurnTimes;
    }

    public void setSharpTurnTimes(Integer sharpTurnTimes) {
        this.sharpTurnTimes = sharpTurnTimes;
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
                "carStatus=" + carStatus +
                ", voltage=" + voltage +
                ", position=" + position +
                ", runTime=" + runTime +
                ", currentMileage=" + currentMileage +
                ", currentAvgOilUsed=" + currentAvgOilUsed +
                ", mileage=" + mileage +
                ", avgOilUsed=" + avgOilUsed +
                ", speedGroup=" + speedGroup +
                ", speedUpTimes=" + speedUpTimes +
                ", speedDownTimes=" + speedDownTimes +
                ", sharpTurnTimes=" + sharpTurnTimes +
                ", speedingTime=" + speedingTime +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    /**
     * 单个速度信息
     */
    public static class Speed {

        /**
         * 设置速度值(km/h)
         */
        private Integer speed;
        /**
         * 时间小计(秒)
         */
        private Integer consumeTime;
        /**
         * 距离小计(米)
         */
        private Integer travelDistance;

        public Speed() {
        }

        public Speed(Integer speed, Integer consumeTime, Integer travelDistance) {
            this.speed = speed;
            this.consumeTime = consumeTime;
            this.travelDistance = travelDistance;
        }

        public Integer getSpeed() {
            return speed;
        }

        public void setSpeed(Integer speed) {
            this.speed = speed;
        }

        public Integer getConsumeTime() {
            return consumeTime;
        }

        public void setConsumeTime(Integer consumeTime) {
            this.consumeTime = consumeTime;
        }

        public Integer getTravelDistance() {
            return travelDistance;
        }

        public void setTravelDistance(Integer travelDistance) {
            this.travelDistance = travelDistance;
        }
    }
}
