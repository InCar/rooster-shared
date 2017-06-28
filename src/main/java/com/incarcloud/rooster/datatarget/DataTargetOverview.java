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
     * 车辆状态：0x01-启动，0x02-熄火，0x03-其他状态
     */
    private Integer vehicleStatus;
    /**
     * 充电状态：0x01-停车充电，0x02-行驶充电，0x03-未充电状态，0x04-充电完成，
     */
    private Integer chargeStatus;
    /**
     * 运行模式：0x01-纯电，0x02-混动，0x03-燃油
     */
    private Integer runningMode;
    /**
     * 车速（最小计量单元0.1km/h）
     */
    private Integer speed;
    /**
     * 累计里程（最小计量单元0.1km）
     */
    private Integer mileageTotal;
    /**
     * 总电压（最小计量单元0.1V）
     */
    private Integer voltageTotal;
    /**
     * 总电流（0.1A）
     */
    private Integer currentTotal;
    /**
     * SOC（最小计量单位1%）
     */
    private Integer soc;
    /**
     * DC-DC状态
     */
    private Integer dcdcStatus;
    /**
     * 档位（国标见附录A中A.1）
     */
    private Integer stalls;
    /**
     * 绝缘电阻（最小计量单元1kΩ）
     */
    private Integer resistanceValue;

    public DataTargetOverview() {
    }

    public DataTargetOverview(DataTarget target) {
        super(target);
    }

    public Integer getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(Integer vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public Integer getChargeStatus() {
        return chargeStatus;
    }

    public void setChargeStatus(Integer chargeStatus) {
        this.chargeStatus = chargeStatus;
    }

    public Integer getRunningMode() {
        return runningMode;
    }

    public void setRunningMode(Integer runningMode) {
        this.runningMode = runningMode;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getMileageTotal() {
        return mileageTotal;
    }

    public void setMileageTotal(Integer mileageTotal) {
        this.mileageTotal = mileageTotal;
    }

    public Integer getVoltageTotal() {
        return voltageTotal;
    }

    public void setVoltageTotal(Integer voltageTotal) {
        this.voltageTotal = voltageTotal;
    }

    public Integer getCurrentTotal() {
        return currentTotal;
    }

    public void setCurrentTotal(Integer currentTotal) {
        this.currentTotal = currentTotal;
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

    public Integer getStalls() {
        return stalls;
    }

    public void setStalls(Integer stalls) {
        this.stalls = stalls;
    }

    public Integer getResistanceValue() {
        return resistanceValue;
    }

    public void setResistanceValue(Integer resistanceValue) {
        this.resistanceValue = resistanceValue;
    }
}
