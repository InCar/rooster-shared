package com.incarcloud.rooster.datapack;

import java.util.List;

/**
 * 整车数据<br>
 * <i>异常与无效定义：</i><br>
 * <ul>
 * <li>0xFE-异常，0xFF-无效</li>
 * <li>0xFF,0xFE-异常，0xFF,0xFF-无效</li>
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

    /*===========================电动车部分start=========================================*/
    /**
     * 充电状态
     * 0x01： 停车充电； 0x02： 行驶充电； 0x03： 未充电状态， 0x04： 充电完成；“0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer chargeStatus;
    /**
     * 运行模式
     * 0x01: 纯电； 0x02：混动； 0x03：燃油； 0xFE 表示异常； 0xFF 表示无效
     */
    private Integer runStatus;
    /**
     * 实时车速
     * 有效值范围： 0～2200（表示 0 km/h～220 km/h），最小计量单元：0.1km/h，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效。
     */
    private float vehicleSpeed;
    /**
     * 总电流
     * 有效值范围： 0～20000（偏移量 1000A，表示-1000A～+1000A），最小计量单元： 0.1A，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效。
     */
    private Float totalCurrent;
    /**
     * SOC
     * 有效值范围： 0～100（表示 0%～100%），最小计量单元： 1%，“0xFE”表示异常，“0xFF”表示无效
     */
    private Integer soc;
    /**
     * DC-DC 状态
     * 0x01： 工作； 0x02： 断开，“0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer dcdcStatus;
    /**
     * 档位 bit0-bit3
     * =0000 空档
     * =0001 1 档
     * =0010 2 档
     * =0011 3 档
     * =0100 4 档
     * =0101 5 档
     * =0110 6 档
     * =1101 倒档
     * =1110 自动 D 档
     * =1111 停车 P 档
     */
    private Integer clutchStatus;
    /**
     * 制动状态
     * bit4 1：制动有效 0：制动无效
     * bit5 1：驱动有效 0：驱动无效
     */
    private Integer driveBrakeStatus;
    /**
     * 绝缘电阻
     * 有效范围 0~60000（表示 0KΩ~60000KΩ），最小计量单元： 1KΩ；“0xFF,0xFF”表示无效
     */
    private Integer issueValue;
     /*===========================电动车部分end=========================================*/
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
     * /100F转Float
     */
    private Float currentAvgOilUsed;
    /**
     * 累计行驶里程(km)
     */
    private Double mileage;
    /**
     * 累计平均油耗(0.01L/100km)
     * /100F转Float
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

    @Override
    public String toString() {
        return "DataPackOverview{" +
                "carStatus=" + carStatus +
                ", chargeStatus=" + chargeStatus +
                ", runStatus=" + runStatus +
                ", vehicleSpeed=" + vehicleSpeed +
                ", totalCurrent=" + totalCurrent +
                ", soc=" + soc +
                ", dcdcStatus=" + dcdcStatus +
                ", clutchStatus=" + clutchStatus +
                ", driveBrakeStatus=" + driveBrakeStatus +
                ", issueValue=" + issueValue +
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
                ", id='" + id + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", packId=" + packId +
                ", protocolName='" + protocolName + '\'' +
                ", protocolVersion='" + protocolVersion + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", tripId=" + tripId +
                ", vid='" + vid + '\'' +
                ", vin='" + vin + '\'' +
                ", license='" + license + '\'' +
                ", subPackTotal=" + subPackTotal +
                ", subPackIndex=" + subPackIndex +
                ", encryptName='" + encryptName + '\'' +
                ", detectionTime=" + detectionTime +
                ", _group='" + _group + '\'' +
                ", _name='" + _name + '\'' +
                ", _version='" + _version + '\'' +
                ", receiveTime=" + receiveTime +
                '}';
    }

    public Integer getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(Integer carStatus) {
        this.carStatus = carStatus;
    }

    public Integer getChargeStatus() {
        return chargeStatus;
    }

    public void setChargeStatus(Integer chargeStatus) {
        this.chargeStatus = chargeStatus;
    }

    public Integer getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
    }

    public float getVehicleSpeed() {
        return vehicleSpeed;
    }

    public void setVehicleSpeed(float vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }

    public Float getTotalCurrent() {
        return totalCurrent;
    }

    public void setTotalCurrent(Float totalCurrent) {
        this.totalCurrent = totalCurrent;
    }

    public Integer getSoc() {
        return soc;
    }

    public void setSoc(Integer soc) {
        this.soc = soc;
    }

    public Integer getDcdcStatus() {
        return dcdcStatus;
    }

    public void setDcdcStatus(Integer dcdcStatus) {
        this.dcdcStatus = dcdcStatus;
    }

    public Integer getClutchStatus() {
        return clutchStatus;
    }

    public void setClutchStatus(Integer clutchStatus) {
        this.clutchStatus = clutchStatus;
    }

    public Integer getDriveBrakeStatus() {
        return driveBrakeStatus;
    }

    public void setDriveBrakeStatus(Integer driveBrakeStatus) {
        this.driveBrakeStatus = driveBrakeStatus;
    }

    public Integer getIssueValue() {
        return issueValue;
    }

    public void setIssueValue(Integer issueValue) {
        this.issueValue = issueValue;
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

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
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
