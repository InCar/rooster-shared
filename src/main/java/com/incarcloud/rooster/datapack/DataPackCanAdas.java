package com.incarcloud.rooster.datapack;

/**
 * @author ChenZhao
 * @ClassName: DataPackCanAdas
 * @Description: can ADAS 0x10FF01DF
 * @date 2017-09-14 14:38
 */
public class DataPackCanAdas extends DataPackObject {

    /**
     * 左车道检测
     */
    private Integer leftLaneDetected;
    /**
     * 左车道偏离
     */
    private Integer laneDepartureLeft;
    /**
     * 右车道检测
     */
    private Integer rightLaneDetected;
    /**
     * 右车道偏移
     */
    private Integer laneDpartureRight;
    /**
     * 车辆的测定结果
     */
    private Integer vehicleDecectResult;
    /**
     * 碰撞时间
     */
    private Integer crashTime;
    /**
     * 错误信息
     */
    private Integer errorInfo;
    /**
     * 无效信息
     */
    private Integer invalidInfo;


    public DataPackCanAdas(DataPackObject dataPack) {
        super(dataPack);
    }

    public Integer getLeftLaneDetected() {
        return leftLaneDetected;
    }

    public void setLeftLaneDetected(Integer leftLaneDetected) {
        this.leftLaneDetected = leftLaneDetected;
    }

    public Integer getLaneDepartureLeft() {
        return laneDepartureLeft;
    }

    public void setLaneDepartureLeft(Integer laneDepartureLeft) {
        this.laneDepartureLeft = laneDepartureLeft;
    }

    public Integer getRightLaneDetected() {
        return rightLaneDetected;
    }

    public void setRightLaneDetected(Integer rightLaneDetected) {
        this.rightLaneDetected = rightLaneDetected;
    }

    public Integer getLaneDpartureRight() {
        return laneDpartureRight;
    }

    public void setLaneDpartureRight(Integer laneDpartureRight) {
        this.laneDpartureRight = laneDpartureRight;
    }

    public Integer getVehicleDecectResult() {
        return vehicleDecectResult;
    }

    public void setVehicleDecectResult(Integer vehicleDecectResult) {
        this.vehicleDecectResult = vehicleDecectResult;
    }

    public Integer getCrashTime() {
        return crashTime;
    }

    public void setCrashTime(Integer crashTime) {
        this.crashTime = crashTime;
    }

    public Integer getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(Integer errorInfo) {
        this.errorInfo = errorInfo;
    }

    public Integer getInvalidInfo() {
        return invalidInfo;
    }

    public void setInvalidInfo(Integer invalidInfo) {
        this.invalidInfo = invalidInfo;
    }

    @Override
    public String toString() {
        return "DataPackCanAdas{" +
                "leftLaneDetected=" + leftLaneDetected +
                ", laneDepartureLeft=" + laneDepartureLeft +
                ", rightLaneDetected=" + rightLaneDetected +
                ", laneDpartureRight=" + laneDpartureRight +
                ", vehicleDecectResult=" + vehicleDecectResult +
                ", crashTime=" + crashTime +
                ", errorInfo=" + errorInfo +
                ", invalidInfo=" + invalidInfo +
                '}';
    }
}
