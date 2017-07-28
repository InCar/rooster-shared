package com.incarcloud.rooster.datapack;

/**
 * 驱动电机数据<br>
 * <i>异常与无效定义：</i><br>
 * <ul>
 *     <li>0xFE-异常，0xFF-无效</li>
 *     <li>0xFF,0xFE-异常，0xFF,0xFF-无效</li>
 * </ul>
 *
 * @author Aaric, created on 2017-06-27T14:04.
 * @since 2.0
 */
public class DataPackMotor extends DataPackObject {

    /**
     * 驱动电机个数
     */
    private Integer motorTotal;
    /**
     * 驱动电机序号
     */
    private Integer motorSeq;
    /**
     * 驱动电机状态：0x01-耗电，0x02-发电，0x03-关闭状态，0x04-准备状态
     */
    private Integer motorStatus;
    /**
     * 驱动电机控制器温度（最小计量单位1℃）
     */
    private Integer controllerTemperature;
    /**
     * 驱动电机转速（最小计量单位1r/min）
     */
    private Integer speed;
    /**
     * 驱动电机转矩（最小计量单位0.1N·m）
     */
    private Integer torque;
    /**
     * 驱动电机温度（最小计量单位1℃）
     */
    private Integer motorTemperature;
    /**
     * 电机控制器输入电压（最小计量单元0.1V）
     */
    private Integer controllerInputVoltage;
    /**
     * 电机控制器直流母线电流（最小计量单位0.1A）
     */
    private Integer controllerDirectCurrent;

    public DataPackMotor(DataPackObject object) {
        super(object);
    }

    public Integer getMotorTotal() {
        return motorTotal;
    }

    public void setMotorTotal(Integer motorTotal) {
        this.motorTotal = motorTotal;
    }

    public Integer getMotorSeq() {
        return motorSeq;
    }

    public void setMotorSeq(Integer motorSeq) {
        this.motorSeq = motorSeq;
    }

    public Integer getMotorStatus() {
        return motorStatus;
    }

    public void setMotorStatus(Integer motorStatus) {
        this.motorStatus = motorStatus;
    }

    public Integer getControllerTemperature() {
        return controllerTemperature;
    }

    public void setControllerTemperature(Integer controllerTemperature) {
        this.controllerTemperature = controllerTemperature;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getTorque() {
        return torque;
    }

    public void setTorque(Integer torque) {
        this.torque = torque;
    }

    public Integer getMotorTemperature() {
        return motorTemperature;
    }

    public void setMotorTemperature(Integer motorTemperature) {
        this.motorTemperature = motorTemperature;
    }

    public Integer getControllerInputVoltage() {
        return controllerInputVoltage;
    }

    public void setControllerInputVoltage(Integer controllerInputVoltage) {
        this.controllerInputVoltage = controllerInputVoltage;
    }

    public Integer getControllerDirectCurrent() {
        return controllerDirectCurrent;
    }

    public void setControllerDirectCurrent(Integer controllerDirectCurrent) {
        this.controllerDirectCurrent = controllerDirectCurrent;
    }


    @Override
    public String toString() {
        return "DataPackMotor{" +
                "motorTotal=" + motorTotal +
                ", motorSeq=" + motorSeq +
                ", motorStatus=" + motorStatus +
                ", controllerTemperature=" + controllerTemperature +
                ", speed=" + speed +
                ", torque=" + torque +
                ", motorTemperature=" + motorTemperature +
                ", controllerInputVoltage=" + controllerInputVoltage +
                ", controllerDirectCurrent=" + controllerDirectCurrent +
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
