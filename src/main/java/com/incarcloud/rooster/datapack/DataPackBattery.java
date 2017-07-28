package com.incarcloud.rooster.datapack;

import java.util.List;

/**
 * 电池数据<br>
 * <i>异常与无效定义：</i><br>
 * <ul>
 *     <li>0xFE-异常，0xFF-无效</li>
 *     <li>0xFF,0xFE-异常，0xFF,0xFF-无效</li>
 * </ul>
 *
 * @author Aaric, created on 2017-06-27T14:04.
 * @since 2.0
 */
public class DataPackBattery extends DataPackObject {

    /**
     * 燃料电池电压（最小计量单元0.1V）
     */
    private Integer voltage;
    /**
     * 燃料电池电流（最小计量单元0.1A）
     */
    private Integer current;
    /**
     * 燃料消耗率（最小计量单元0.01kg/100km）
     */
    private Integer consumptionRate;
    /**
     * 燃料电池温度探针总数
     */
    private Integer probeTotal;
    /**
     * 探针温度值（最小计量单位1℃）
     */
    private List<Integer> probeTemperatures;
    /**
     * 氢系统中最高温度（最小计量单位0.1℃）
     */
    private Integer hydrogenSystemMaxTemperature;
    /**
     * 氢系统中最高温度探针代号
     */
    private Integer hydrogenSystemMaxTemperatureProbeCode;
    /**
     * 氢气最高浓度（最小计量单位1mg/kg）
     */
    private Integer hydrogenMaxConcentration;
    /**
     * 氢气最高浓度传感器代号
     */
    private Integer hydrogenMaxConcentrationSensorCode;
    /**
     * 氢气最高压力（最小计量单位0.1MPa）
     */
    private Integer hydrogenMaxPressure;
    /**
     * 氢气最高压力传感器代号
     */
    private Integer hydrogenMaxPressureSensorCode;
    /**
     * 最高DC/DC状态：0x01-工作，0x02-断开
     */
    private Integer dcdcStatus;

    public DataPackBattery(DataPackObject object) {
        super(object);
    }

    public Integer getVoltage() {
        return voltage;
    }

    public void setVoltage(Integer voltage) {
        this.voltage = voltage;
    }

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getConsumptionRate() {
        return consumptionRate;
    }

    public void setConsumptionRate(Integer consumptionRate) {
        this.consumptionRate = consumptionRate;
    }

    public Integer getProbeTotal() {
        return probeTotal;
    }

    public void setProbeTotal(Integer probeTotal) {
        this.probeTotal = probeTotal;
    }

    public List<Integer> getProbeTemperatures() {
        return probeTemperatures;
    }

    public void setProbeTemperatures(List<Integer> probeTemperatures) {
        this.probeTemperatures = probeTemperatures;
    }

    public Integer getHydrogenSystemMaxTemperature() {
        return hydrogenSystemMaxTemperature;
    }

    public void setHydrogenSystemMaxTemperature(Integer hydrogenSystemMaxTemperature) {
        this.hydrogenSystemMaxTemperature = hydrogenSystemMaxTemperature;
    }

    public Integer getHydrogenSystemMaxTemperatureProbeCode() {
        return hydrogenSystemMaxTemperatureProbeCode;
    }

    public void setHydrogenSystemMaxTemperatureProbeCode(Integer hydrogenSystemMaxTemperatureProbeCode) {
        this.hydrogenSystemMaxTemperatureProbeCode = hydrogenSystemMaxTemperatureProbeCode;
    }

    public Integer getHydrogenMaxConcentration() {
        return hydrogenMaxConcentration;
    }

    public void setHydrogenMaxConcentration(Integer hydrogenMaxConcentration) {
        this.hydrogenMaxConcentration = hydrogenMaxConcentration;
    }

    public Integer getHydrogenMaxConcentrationSensorCode() {
        return hydrogenMaxConcentrationSensorCode;
    }

    public void setHydrogenMaxConcentrationSensorCode(Integer hydrogenMaxConcentrationSensorCode) {
        this.hydrogenMaxConcentrationSensorCode = hydrogenMaxConcentrationSensorCode;
    }

    public Integer getHydrogenMaxPressure() {
        return hydrogenMaxPressure;
    }

    public void setHydrogenMaxPressure(Integer hydrogenMaxPressure) {
        this.hydrogenMaxPressure = hydrogenMaxPressure;
    }

    public Integer getHydrogenMaxPressureSensorCode() {
        return hydrogenMaxPressureSensorCode;
    }

    public void setHydrogenMaxPressureSensorCode(Integer hydrogenMaxPressureSensorCode) {
        this.hydrogenMaxPressureSensorCode = hydrogenMaxPressureSensorCode;
    }

    public Integer getDcdcStatus() {
        return dcdcStatus;
    }

    public void setDcdcStatus(Integer dcdcStatus) {
        this.dcdcStatus = dcdcStatus;
    }

    @Override
    public String toString() {
        return "DataPackBattery{" +
                "voltage=" + voltage +
                ", current=" + current +
                ", consumptionRate=" + consumptionRate +
                ", probeTotal=" + probeTotal +
                ", probeTemperatures=" + probeTemperatures +
                ", hydrogenSystemMaxTemperature=" + hydrogenSystemMaxTemperature +
                ", hydrogenSystemMaxTemperatureProbeCode=" + hydrogenSystemMaxTemperatureProbeCode +
                ", hydrogenMaxConcentration=" + hydrogenMaxConcentration +
                ", hydrogenMaxConcentrationSensorCode=" + hydrogenMaxConcentrationSensorCode +
                ", hydrogenMaxPressure=" + hydrogenMaxPressure +
                ", hydrogenMaxPressureSensorCode=" + hydrogenMaxPressureSensorCode +
                ", dcdcStatus=" + dcdcStatus +
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
