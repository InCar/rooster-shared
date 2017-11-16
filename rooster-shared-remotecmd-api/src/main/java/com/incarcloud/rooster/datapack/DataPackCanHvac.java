package com.incarcloud.rooster.datapack;

/**
 * @author ChenZhao
 * @ClassName: DataPackCanHvac
 * @Description: can hvac数据 0x1CFF00DE 0x1CFF01DE
 * @date 2017-09-14 10:12
 */
public class DataPackCanHvac extends DataPackObject {

    /**
     * 空调启动状态
     */
    private Integer runStatus;
    /**
     * 空调风机档位
     */
    private Integer hvacLevel;
    /**
     * 空调功率
     */
    private Integer power;
    /**
     * 车外温度
     */
    private Float exTemp;
    /**
     * 车内温度
     */
    private Float innerTemp;
    /**
     * 空调风向状态
     */
    private Integer crondDirection;
    /**
     * 空调循环模式状态
     */
    private Integer cirleModel;
    /**
     * 模式电机故障
     */
    private Integer errModel;
    /**
     * 温度电机故障
     */
    private Integer errTemp;
    /**
     * 蒸发器传感器故障
     */
    private Integer errEvalsensor;
    /**
     * 回风温度传感器故障
     */
    private Integer errTempSensor;

    public DataPackCanHvac(DataPackObject dataPack) {
        super(dataPack);
    }

    public Integer getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
    }

    public Integer getHvacLevel() {
        return hvacLevel;
    }

    public void setHvacLevel(Integer hvacLevel) {
        this.hvacLevel = hvacLevel;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public float getExTemp() {
        return exTemp;
    }

    public void setExTemp(float exTemp) {
        this.exTemp = exTemp;
    }

    public float getInnerTemp() {
        return innerTemp;
    }

    public void setInnerTemp(float innerTemp) {
        this.innerTemp = innerTemp;
    }

    public Integer getCrondDirection() {
        return crondDirection;
    }

    public void setCrondDirection(Integer crondDirection) {
        this.crondDirection = crondDirection;
    }

    public Integer getCirleModel() {
        return cirleModel;
    }

    public void setCirleModel(Integer cirleModel) {
        this.cirleModel = cirleModel;
    }

    public Integer getErrModel() {
        return errModel;
    }

    public void setErrModel(Integer errModel) {
        this.errModel = errModel;
    }

    public Integer getErrTemp() {
        return errTemp;
    }

    public void setErrTemp(Integer errTemp) {
        this.errTemp = errTemp;
    }

    public Integer getErrEvalsensor() {
        return errEvalsensor;
    }

    public void setErrEvalsensor(Integer errEvalsensor) {
        this.errEvalsensor = errEvalsensor;
    }

    public Integer getErrTempSensor() {
        return errTempSensor;
    }

    public void setErrTempSensor(Integer errTempSensor) {
        this.errTempSensor = errTempSensor;
    }

    public void setExTemp(Float exTemp) {
        this.exTemp = exTemp;
    }

    public void setInnerTemp(Float innerTemp) {
        this.innerTemp = innerTemp;
    }

    @Override
    public String toString() {
        return "DataPackCanHvac{" +
                "runStatus=" + runStatus +
                ", hvacLevel=" + hvacLevel +
                ", power=" + power +
                ", exTemp=" + exTemp +
                ", innerTemp=" + innerTemp +
                ", crondDirection=" + crondDirection +
                ", cirleModel=" + cirleModel +
                ", errModel=" + errModel +
                ", errTemp=" + errTemp +
                ", errEvalsensor=" + errEvalsensor +
                ", errTempSensor=" + errTempSensor +
                '}';
    }
}
