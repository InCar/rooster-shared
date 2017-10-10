package com.incarcloud.rooster.datapack;

/**
 * @author ChenZhao
 * @ClassName: DataPackCanBcm
 * @Description: can BCM 0x0CFF00DC 0x0CFF01DC
 * @date 2017-09-14 11:19
 */
public class DataPackCanBcm extends DataPackObject {

    private Integer runStatus; // BCM运行状态
    private Integer errLevel; // BCM故障等级
    private Integer brakeStatus; // 脚刹状态
    private Integer handbrakeStatus; // 手刹是否拉起
    private Integer iscrash; // 碰撞是否发生
    private Integer dc12Level; // 12V电压档位
    private Integer centerLockStatus;
    private Float dc12Voltage; // 12V蓄电池电压
    private Integer errTurnLight; // 转向灯故障状态
    private Integer leftWinOutStatus; // 左前玻璃升降输出状态
    private Integer rightWinOutStatus; // 右前玻璃升降输出状态
    private Integer backWinIsHeat; // 后挡风玻璃加热是否开
    private Integer leftWinStatus; // 左玻璃状态
    private Integer rightWinStatus; // 左玻璃状态
    private Integer isRemoteLightOn; // 远光灯是否开
    private Integer isNeerLightOn; // 近光灯是否开
    private Integer isFrontFogOn; // 前雾灯是否开
    private Integer isBackFogOn; // 后雾灯是否开
    private Integer isDrvLightOn; // 昼间行车灯是否开
    private Integer turnLightOn; // 转向灯转向方向
    private Integer isSmallLightOn; // 背光灯（小灯）是否开
    private Integer isReadLightOn; // 市内阅读灯是否开
    private Integer isBrakeLightOn; // 制动灯是否开
    private Integer isPosLightOn; // 位置灯是否开
    private Integer isReverseLightOn; // 倒车灯是否开
    private Integer alarmStatus; // 防盗报警状态指示
    private Integer backDoorLockStatus; // 后背门锁状态
    private Integer leftDoorLockStatus; // 左前门锁是否锁止
    private Integer rightDoorLockStatus; // 右前门门锁是否锁止
    private Integer bcmArmStatus; // BCM_ARMSTATUS
    private Integer bcmEsclPowerSupply; // BCM_ESCLPOWERSUPPLY
    private Integer isLeftDoorKeyIn;
    private Integer safetyBeltStatus; // 安全带是否扣上
    private Integer isLeftDoorClose; // 左前门是否关上
    private Integer isRightDoorClose; // 右前门是否关上
    private Integer isEmergecyLightOn; // 紧急灯是否开
    private Integer wiperStatus; // 雨刮状态
    private Integer isWiperStatus; // 前雨刮是否开
    private Integer isFrontHoodOn; // 前舱盖是否开
    private Integer isBackDoorOn; // 后背门是否开
    private Integer isHornOn; // 喇叭是否开
    private Integer isKeyVoltageLow; // 遥控钥匙电池电量是否低（PEPS指令）
    private Integer isBrakeStatus; // 非法入侵状态

    public DataPackCanBcm(DataPack dataPack) {
        super(dataPack);
    }

    @Override
    public String toString() {
        return "DataPackCanBcm{" +
                "runStatus=" + runStatus +
                ", errLevel=" + errLevel +
                ", brakeStatus=" + brakeStatus +
                ", handbrakeStatus=" + handbrakeStatus +
                ", iscrash=" + iscrash +
                ", dc12Level=" + dc12Level +
                ", centerLockStatus=" + centerLockStatus +
                ", dc12Voltage=" + dc12Voltage +
                ", errTurnLight=" + errTurnLight +
                ", leftWinOutStatus=" + leftWinOutStatus +
                ", rightWinOutStatus=" + rightWinOutStatus +
                ", backWinIsHeat=" + backWinIsHeat +
                ", leftWinStatus=" + leftWinStatus +
                ", rightWinStatus=" + rightWinStatus +
                ", isRemoteLightOn=" + isRemoteLightOn +
                ", isNeerLightOn=" + isNeerLightOn +
                ", isFrontFogOn=" + isFrontFogOn +
                ", isBackFogOn=" + isBackFogOn +
                ", isDrvLightOn=" + isDrvLightOn +
                ", turnLightOn=" + turnLightOn +
                ", isSmallLightOn=" + isSmallLightOn +
                ", isReadLightOn=" + isReadLightOn +
                ", isBrakeLightOn=" + isBrakeLightOn +
                ", isPosLightOn=" + isPosLightOn +
                ", isReverseLightOn=" + isReverseLightOn +
                ", alarmStatus=" + alarmStatus +
                ", backDoorLockStatus=" + backDoorLockStatus +
                ", leftDoorLockStatus=" + leftDoorLockStatus +
                ", rightDoorLockStatus=" + rightDoorLockStatus +
                ", bcmArmStatus=" + bcmArmStatus +
                ", bcmEsclPowerSupply=" + bcmEsclPowerSupply +
                ", isLeftDoorKeyIn=" + isLeftDoorKeyIn +
                ", safetyBeltStatus=" + safetyBeltStatus +
                ", isLeftDoorClose=" + isLeftDoorClose +
                ", isRightDoorClose=" + isRightDoorClose +
                ", isEmergecyLightOn=" + isEmergecyLightOn +
                ", wiperStatus=" + wiperStatus +
                ", isWiperStatus=" + isWiperStatus +
                ", isFrontHoodOn=" + isFrontHoodOn +
                ", isBackDoorOn=" + isBackDoorOn +
                ", isHornOn=" + isHornOn +
                ", isKeyVoltageLow=" + isKeyVoltageLow +
                ", isBrakeStatus=" + isBrakeStatus +
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

    public Integer getRunStatus() {
        return runStatus;
    }

    public void setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
    }

    public Integer getErrLevel() {
        return errLevel;
    }

    public void setErrLevel(Integer errLevel) {
        this.errLevel = errLevel;
    }

    public Integer getBrakeStatus() {
        return brakeStatus;
    }

    public void setBrakeStatus(Integer brakeStatus) {
        this.brakeStatus = brakeStatus;
    }

    public Integer getHandbrakeStatus() {
        return handbrakeStatus;
    }

    public void setHandbrakeStatus(Integer handbrakeStatus) {
        this.handbrakeStatus = handbrakeStatus;
    }

    public Integer getIscrash() {
        return iscrash;
    }

    public void setIscrash(Integer iscrash) {
        this.iscrash = iscrash;
    }

    public Integer getDc12Level() {
        return dc12Level;
    }

    public void setDc12Level(Integer dc12Level) {
        this.dc12Level = dc12Level;
    }

    public Integer getCenterLockStatus() {
        return centerLockStatus;
    }

    public void setCenterLockStatus(Integer centerLockStatus) {
        this.centerLockStatus = centerLockStatus;
    }

    public Float getDc12Voltage() {
        return dc12Voltage;
    }

    public void setDc12Voltage(Float dc12Voltage) {
        this.dc12Voltage = dc12Voltage;
    }

    public Integer getErrTurnLight() {
        return errTurnLight;
    }

    public void setErrTurnLight(Integer errTurnLight) {
        this.errTurnLight = errTurnLight;
    }

    public Integer getLeftWinOutStatus() {
        return leftWinOutStatus;
    }

    public void setLeftWinOutStatus(Integer leftWinOutStatus) {
        this.leftWinOutStatus = leftWinOutStatus;
    }

    public Integer getRightWinOutStatus() {
        return rightWinOutStatus;
    }

    public void setRightWinOutStatus(Integer rightWinOutStatus) {
        this.rightWinOutStatus = rightWinOutStatus;
    }

    public Integer getBackWinIsHeat() {
        return backWinIsHeat;
    }

    public void setBackWinIsHeat(Integer backWinIsHeat) {
        this.backWinIsHeat = backWinIsHeat;
    }

    public Integer getLeftWinStatus() {
        return leftWinStatus;
    }

    public void setLeftWinStatus(Integer leftWinStatus) {
        this.leftWinStatus = leftWinStatus;
    }

    public Integer getRightWinStatus() {
        return rightWinStatus;
    }

    public void setRightWinStatus(Integer rightWinStatus) {
        this.rightWinStatus = rightWinStatus;
    }

    public Integer getIsRemoteLightOn() {
        return isRemoteLightOn;
    }

    public void setIsRemoteLightOn(Integer isRemoteLightOn) {
        this.isRemoteLightOn = isRemoteLightOn;
    }

    public Integer getIsNeerLightOn() {
        return isNeerLightOn;
    }

    public void setIsNeerLightOn(Integer isNeerLightOn) {
        this.isNeerLightOn = isNeerLightOn;
    }

    public Integer getIsFrontFogOn() {
        return isFrontFogOn;
    }

    public void setIsFrontFogOn(Integer isFrontFogOn) {
        this.isFrontFogOn = isFrontFogOn;
    }

    public Integer getIsBackFogOn() {
        return isBackFogOn;
    }

    public void setIsBackFogOn(Integer isBackFogOn) {
        this.isBackFogOn = isBackFogOn;
    }

    public Integer getIsDrvLightOn() {
        return isDrvLightOn;
    }

    public void setIsDrvLightOn(Integer isDrvLightOn) {
        this.isDrvLightOn = isDrvLightOn;
    }

    public Integer getTurnLightOn() {
        return turnLightOn;
    }

    public void setTurnLightOn(Integer turnLightOn) {
        this.turnLightOn = turnLightOn;
    }

    public Integer getIsSmallLightOn() {
        return isSmallLightOn;
    }

    public void setIsSmallLightOn(Integer isSmallLightOn) {
        this.isSmallLightOn = isSmallLightOn;
    }

    public Integer getIsReadLightOn() {
        return isReadLightOn;
    }

    public void setIsReadLightOn(Integer isReadLightOn) {
        this.isReadLightOn = isReadLightOn;
    }

    public Integer getIsBrakeLightOn() {
        return isBrakeLightOn;
    }

    public void setIsBrakeLightOn(Integer isBrakeLightOn) {
        this.isBrakeLightOn = isBrakeLightOn;
    }

    public Integer getIsPosLightOn() {
        return isPosLightOn;
    }

    public void setIsPosLightOn(Integer isPosLightOn) {
        this.isPosLightOn = isPosLightOn;
    }

    public Integer getIsReverseLightOn() {
        return isReverseLightOn;
    }

    public void setIsReverseLightOn(Integer isReverseLightOn) {
        this.isReverseLightOn = isReverseLightOn;
    }

    public Integer getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(Integer alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public Integer getBackDoorLockStatus() {
        return backDoorLockStatus;
    }

    public void setBackDoorLockStatus(Integer backDoorLockStatus) {
        this.backDoorLockStatus = backDoorLockStatus;
    }

    public Integer getLeftDoorLockStatus() {
        return leftDoorLockStatus;
    }

    public void setLeftDoorLockStatus(Integer leftDoorLockStatus) {
        this.leftDoorLockStatus = leftDoorLockStatus;
    }

    public Integer getRightDoorLockStatus() {
        return rightDoorLockStatus;
    }

    public void setRightDoorLockStatus(Integer rightDoorLockStatus) {
        this.rightDoorLockStatus = rightDoorLockStatus;
    }

    public Integer getBcmArmStatus() {
        return bcmArmStatus;
    }

    public void setBcmArmStatus(Integer bcmArmStatus) {
        this.bcmArmStatus = bcmArmStatus;
    }

    public Integer getBcmEsclPowerSupply() {
        return bcmEsclPowerSupply;
    }

    public void setBcmEsclPowerSupply(Integer bcmEsclPowerSupply) {
        this.bcmEsclPowerSupply = bcmEsclPowerSupply;
    }

    public Integer getIsLeftDoorKeyIn() {
        return isLeftDoorKeyIn;
    }

    public void setIsLeftDoorKeyIn(Integer isLeftDoorKeyIn) {
        this.isLeftDoorKeyIn = isLeftDoorKeyIn;
    }

    public Integer getSafetyBeltStatus() {
        return safetyBeltStatus;
    }

    public void setSafetyBeltStatus(Integer safetyBeltStatus) {
        this.safetyBeltStatus = safetyBeltStatus;
    }

    public Integer getIsLeftDoorClose() {
        return isLeftDoorClose;
    }

    public void setIsLeftDoorClose(Integer isLeftDoorClose) {
        this.isLeftDoorClose = isLeftDoorClose;
    }

    public Integer getIsRightDoorClose() {
        return isRightDoorClose;
    }

    public void setIsRightDoorClose(Integer isRightDoorClose) {
        this.isRightDoorClose = isRightDoorClose;
    }

    public Integer getIsEmergecyLightOn() {
        return isEmergecyLightOn;
    }

    public void setIsEmergecyLightOn(Integer isEmergecyLightOn) {
        this.isEmergecyLightOn = isEmergecyLightOn;
    }

    public Integer getWiperStatus() {
        return wiperStatus;
    }

    public void setWiperStatus(Integer wiperStatus) {
        this.wiperStatus = wiperStatus;
    }

    public Integer getIsWiperStatus() {
        return isWiperStatus;
    }

    public void setIsWiperStatus(Integer isWiperStatus) {
        this.isWiperStatus = isWiperStatus;
    }

    public Integer getIsFrontHoodOn() {
        return isFrontHoodOn;
    }

    public void setIsFrontHoodOn(Integer isFrontHoodOn) {
        this.isFrontHoodOn = isFrontHoodOn;
    }

    public Integer getIsBackDoorOn() {
        return isBackDoorOn;
    }

    public void setIsBackDoorOn(Integer isBackDoorOn) {
        this.isBackDoorOn = isBackDoorOn;
    }

    public Integer getIsHornOn() {
        return isHornOn;
    }

    public void setIsHornOn(Integer isHornOn) {
        this.isHornOn = isHornOn;
    }

    public Integer getIsKeyVoltageLow() {
        return isKeyVoltageLow;
    }

    public void setIsKeyVoltageLow(Integer isKeyVoltageLow) {
        this.isKeyVoltageLow = isKeyVoltageLow;
    }

    public Integer getIsBrakeStatus() {
        return isBrakeStatus;
    }

    public void setIsBrakeStatus(Integer isBrakeStatus) {
        this.isBrakeStatus = isBrakeStatus;
    }
}
