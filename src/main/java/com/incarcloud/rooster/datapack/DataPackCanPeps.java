package com.incarcloud.rooster.datapack;

/**
 * @author ChenZhao
 * @ClassName: DataPackCanPeps
 * @Description: can PEPS 0x08FF01DD
 * @date 2017-09-14 14:06
 */
public class DataPackCanPeps extends DataPackObject {
    private Integer rkelockCmd; // 遥控器状态
    private Integer pkelockCmd; // 无钥匙进入状态
    private Integer pepsbcmAlarm; // BCM报警提示
    private Integer pepsicuAlarm; // 仪表报警提示
    private Integer pepsEsclpowerEnable; // ESCL电源状态（电子转向柱锁）
    private Integer syspowMode; // 整车电源档位
    private Integer fobIndex; // 钥匙位
    private Integer crankRequest; // 启动请求(高压上电请求)
    private Integer esclStatus; // ESCL状态
    private Integer fobPosition; // 钥匙位置
    private Integer authenticationStatus; // 认证状态
    private Integer spareKeyStatus; // 备用钥匙状态
    private Integer ssbSw1; // 启动按键状态1
    private Integer ssbSw2; // 启动按键状态2
    private Integer driverdDoorStatus; // 驾驶门状态
    private Integer passDoorSwStatus; // 副驾门状态
    private Integer trunksw; // 尾门状态
    private Integer brakeSw; // 制动踏板状态
    private Integer accFb; // ACC电源状态
    private Integer onFb; // ON电源状态
    private Integer accCtrl; // ACC控制信号
    private Integer onCtrl; // ON控制信号
    private Integer esclUnlockFb; // ESCL_UNLOCK_FB
    private Integer esclLockEn; // ESCL_LOCK_EN
    private float vSpeed; // 车速
    private Integer eSpeed; // 电机转速


    public DataPackCanPeps(DataPackObject dataPack) {
        super(dataPack);
    }

    @Override
    public String toString() {
        return "DataPackCanPeps{" +
                "rkelockCmd=" + rkelockCmd +
                ", pkelockCmd=" + pkelockCmd +
                ", pepsbcmAlarm=" + pepsbcmAlarm +
                ", pepsicuAlarm=" + pepsicuAlarm +
                ", pepsEsclpowerEnable=" + pepsEsclpowerEnable +
                ", syspowMode=" + syspowMode +
                ", fobIndex=" + fobIndex +
                ", vrankRequest=" + crankRequest +
                ", esclStatus=" + esclStatus +
                ", fobPosition=" + fobPosition +
                ", authenticationStatus=" + authenticationStatus +
                ", spareKeyStatus=" + spareKeyStatus +
                ", ssbSw1=" + ssbSw1 +
                ", ssbSw2=" + ssbSw2 +
                ", driverdDoorStatus=" + driverdDoorStatus +
                ", passDoorSwStatus=" + passDoorSwStatus +
                ", trunksw=" + trunksw +
                ", brakeSw=" + brakeSw +
                ", accFb=" + accFb +
                ", onFb=" + onFb +
                ", accCtrl=" + accCtrl +
                ", onCtrl=" + onCtrl +
                ", esclUnlockFb=" + esclUnlockFb +
                ", esclLockEn=" + esclLockEn +
                ", vSpeed=" + vSpeed +
                ", eSpeed=" + eSpeed +
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

    public Integer getRkelockCmd() {
        return rkelockCmd;
    }

    public void setRkelockCmd(Integer rkelockCmd) {
        this.rkelockCmd = rkelockCmd;
    }

    public Integer getPkelockCmd() {
        return pkelockCmd;
    }

    public void setPkelockCmd(Integer pkelockCmd) {
        this.pkelockCmd = pkelockCmd;
    }

    public Integer getPepsbcmAlarm() {
        return pepsbcmAlarm;
    }

    public void setPepsbcmAlarm(Integer pepsbcmAlarm) {
        this.pepsbcmAlarm = pepsbcmAlarm;
    }

    public Integer getPepsicuAlarm() {
        return pepsicuAlarm;
    }

    public void setPepsicuAlarm(Integer pepsicuAlarm) {
        this.pepsicuAlarm = pepsicuAlarm;
    }

    public Integer getPepsEsclpowerEnable() {
        return pepsEsclpowerEnable;
    }

    public void setPepsEsclpowerEnable(Integer pepsEsclpowerEnable) {
        this.pepsEsclpowerEnable = pepsEsclpowerEnable;
    }

    public Integer getSyspowMode() {
        return syspowMode;
    }

    public void setSyspowMode(Integer syspowMode) {
        this.syspowMode = syspowMode;
    }

    public Integer getFobIndex() {
        return fobIndex;
    }

    public void setFobIndex(Integer fobIndex) {
        this.fobIndex = fobIndex;
    }

    public Integer getCrankRequest() {
        return crankRequest;
    }

    public void setCrankRequest(Integer crankRequest) {
        this.crankRequest = crankRequest;
    }

    public Integer getEsclStatus() {
        return esclStatus;
    }

    public void setEsclStatus(Integer esclStatus) {
        this.esclStatus = esclStatus;
    }

    public Integer getFobPosition() {
        return fobPosition;
    }

    public void setFobPosition(Integer fobPosition) {
        this.fobPosition = fobPosition;
    }

    public Integer getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(Integer authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public Integer getSpareKeyStatus() {
        return spareKeyStatus;
    }

    public void setSpareKeyStatus(Integer spareKeyStatus) {
        this.spareKeyStatus = spareKeyStatus;
    }

    public Integer getSsbSw1() {
        return ssbSw1;
    }

    public void setSsbSw1(Integer ssbSw1) {
        this.ssbSw1 = ssbSw1;
    }

    public Integer getSsbSw2() {
        return ssbSw2;
    }

    public void setSsbSw2(Integer ssbSw2) {
        this.ssbSw2 = ssbSw2;
    }

    public Integer getDriverdDoorStatus() {
        return driverdDoorStatus;
    }

    public void setDriverdDoorStatus(Integer driverdDoorStatus) {
        this.driverdDoorStatus = driverdDoorStatus;
    }

    public Integer getPassDoorSwStatus() {
        return passDoorSwStatus;
    }

    public void setPassDoorSwStatus(Integer passDoorSwStatus) {
        this.passDoorSwStatus = passDoorSwStatus;
    }

    public Integer getTrunksw() {
        return trunksw;
    }

    public void setTrunksw(Integer trunksw) {
        this.trunksw = trunksw;
    }

    public Integer getBrakeSw() {
        return brakeSw;
    }

    public void setBrakeSw(Integer brakeSw) {
        this.brakeSw = brakeSw;
    }

    public Integer getAccFb() {
        return accFb;
    }

    public void setAccFb(Integer accFb) {
        this.accFb = accFb;
    }

    public Integer getOnFb() {
        return onFb;
    }

    public void setOnFb(Integer onFb) {
        this.onFb = onFb;
    }

    public Integer getAccCtrl() {
        return accCtrl;
    }

    public void setAccCtrl(Integer accCtrl) {
        this.accCtrl = accCtrl;
    }

    public Integer getOnCtrl() {
        return onCtrl;
    }

    public void setOnCtrl(Integer onCtrl) {
        this.onCtrl = onCtrl;
    }

    public Integer getEsclUnlockFb() {
        return esclUnlockFb;
    }

    public void setEsclUnlockFb(Integer esclUnlockFb) {
        this.esclUnlockFb = esclUnlockFb;
    }

    public Integer getEsclLockEn() {
        return esclLockEn;
    }

    public void setEsclLockEn(Integer esclLockEn) {
        this.esclLockEn = esclLockEn;
    }

    public float getvSpeed() {
        return vSpeed;
    }

    public void setvSpeed(float vSpeed) {
        this.vSpeed = vSpeed;
    }

    public Integer geteSpeed() {
        return eSpeed;
    }

    public void seteSpeed(Integer eSpeed) {
        this.eSpeed = eSpeed;
    }
}
