package com.incarcloud.rooster.datapack;

import io.netty.util.internal.StringUtil;

/**
 * 参数查询结果
 *
 * @author Kong, created on 2018-08-27T15:13.
 * @since 1.2.0-SNAPSHOT
 */
public class DataPackParameter extends DataPackObject {


    // 参数版本
    private String paramVersion ;

    //车载终端本地存储时间周期
    private Integer localDataStorageSeconds ;

    //正常时，CAN信息上报时间周期
    private Integer canReportSeconds ;

    //出现报警时，CAN信息上报时间周期
    private Integer canAlarmReportSeconds ;

    //远程服务与管理平台域名或ip地址
    private String remoteSeverHost ;

    //远程服务与管理平台端口
    private Integer remoteServerPort ;

    //车载终端心跳发送周期
    private Integer headbeatSeconds ;

    //终端应答超时时间
    private Integer terminalResponseTime ;

    //平台应答超时时间
    private Integer platformOverTime ;

    //连续三次登入失败后，到下一次登入的间隔时间
    private Integer logintRetrySeconds ;

    //政府平台域名
    private String platformGovHost ;

    //政府平台端口
    private Integer platformGovPort ;

    //是否处于抽样监测中
    private Integer samplingType ;

    //延时工作模式下，CAN信息上报时间周期
    private Integer canDelayReportSeconds ;

    //延时工作模式下，心跳发送周期
    private Integer delayHeadbeatSeconds ;

    //休眠时，定位信息上报时间周期
    private Integer positionDormantReportSeconds ;

    //充电时，CAN信息上报时间周期
    private Integer canRechargeReportSeconds ;

    //延时时间
    private Integer dalayTimeSeconds ;

    //正常时，定位信息上报时间周期
    private Integer positionReportSeconds ;

    //出现报警时，定位信息上报时间周期
    private Integer positionAlarmReportSeconds ;

    //延时工作模式下，定位信息上报时间周期
    private Integer positionDelayReportSeconds ;

    //充电时，定位信息上报时间周期
    private Integer positionRechargeReportSeconds ;

    //超速报警阀值
    private Integer maxSpeedValue ;

    //租赁平台域名或IP
    private String rentPlatformHost ;

    //租赁平台端口
    private Integer rentPlatformPort ;

    //APN
    private Integer apnType ;

    //PublicKey更新周期
    private Integer publickeyUpdateSeconds ;

    public DataPackParameter(DataPackObject object) {
        super(object);
    }

    public String getParamVersion() {
        return paramVersion;
    }

    public void setParamVersion(String paramVersion) {
        this.paramVersion = paramVersion;
    }

    public Integer getLocalDataStorageSeconds() {
        return localDataStorageSeconds;
    }

    public void setLocalDataStorageSeconds(Integer localDataStorageSeconds) {
        this.localDataStorageSeconds = localDataStorageSeconds;
    }

    public Integer getCanReportSeconds() {
        return canReportSeconds;
    }

    public void setCanReportSeconds(Integer canReportSeconds) {
        this.canReportSeconds = canReportSeconds;
    }

    public Integer getCanAlarmReportSeconds() {
        return canAlarmReportSeconds;
    }

    public void setCanAlarmReportSeconds(Integer canAlarmReportSeconds) {
        this.canAlarmReportSeconds = canAlarmReportSeconds;
    }

    public String getRemoteSeverHost() {
        return remoteSeverHost;
    }

    public void setRemoteSeverHost(String remoteSeverHost) {
        this.remoteSeverHost = remoteSeverHost;
    }

    public Integer getRemoteServerPort() {
        return remoteServerPort;
    }

    public void setRemoteServerPort(Integer remoteServerPort) {
        this.remoteServerPort = remoteServerPort;
    }

    public Integer getHeadbeatSeconds() {
        return headbeatSeconds;
    }

    public void setHeadbeatSeconds(Integer headbeatSeconds) {
        this.headbeatSeconds = headbeatSeconds;
    }

    public Integer getTerminalResponseTime() {
        return terminalResponseTime;
    }

    public void setTerminalResponseTime(Integer terminalResponseTime) {
        this.terminalResponseTime = terminalResponseTime;
    }

    public Integer getPlatformOverTime() {
        return platformOverTime;
    }

    public void setPlatformOverTime(Integer platformOverTime) {
        this.platformOverTime = platformOverTime;
    }

    public Integer getLogintRetrySeconds() {
        return logintRetrySeconds;
    }

    public void setLogintRetrySeconds(Integer logintRetrySeconds) {
        this.logintRetrySeconds = logintRetrySeconds;
    }

    public String getPlatformGovHost() {
        return platformGovHost;
    }

    public void setPlatformGovHost(String platformGovHost) {
        this.platformGovHost = platformGovHost;
    }

    public Integer getPlatformGovPort() {
        return platformGovPort;
    }

    public void setPlatformGovPort(Integer platformGovPort) {
        this.platformGovPort = platformGovPort;
    }

    public Integer getSamplingType() {
        return samplingType;
    }

    public void setSamplingType(Integer samplingType) {
        this.samplingType = samplingType;
    }

    public Integer getCanDelayReportSeconds() {
        return canDelayReportSeconds;
    }

    public void setCanDelayReportSeconds(Integer canDelayReportSeconds) {
        this.canDelayReportSeconds = canDelayReportSeconds;
    }

    public Integer getDelayHeadbeatSeconds() {
        return delayHeadbeatSeconds;
    }

    public void setDelayHeadbeatSeconds(Integer delayHeadbeatSeconds) {
        this.delayHeadbeatSeconds = delayHeadbeatSeconds;
    }

    public Integer getPositionDormantReportSeconds() {
        return positionDormantReportSeconds;
    }

    public void setPositionDormantReportSeconds(Integer positionDormantReportSeconds) {
        this.positionDormantReportSeconds = positionDormantReportSeconds;
    }

    public Integer getCanRechargeReportSeconds() {
        return canRechargeReportSeconds;
    }

    public void setCanRechargeReportSeconds(Integer canRechargeReportSeconds) {
        this.canRechargeReportSeconds = canRechargeReportSeconds;
    }

    public Integer getDalayTimeSeconds() {
        return dalayTimeSeconds;
    }

    public void setDalayTimeSeconds(Integer dalayTimeSeconds) {
        this.dalayTimeSeconds = dalayTimeSeconds;
    }

    public Integer getPositionReportSeconds() {
        return positionReportSeconds;
    }

    public void setPositionReportSeconds(Integer positionReportSeconds) {
        this.positionReportSeconds = positionReportSeconds;
    }

    public Integer getPositionAlarmReportSeconds() {
        return positionAlarmReportSeconds;
    }

    public void setPositionAlarmReportSeconds(Integer positionAlarmReportSeconds) {
        this.positionAlarmReportSeconds = positionAlarmReportSeconds;
    }

    public Integer getPositionDelayReportSeconds() {
        return positionDelayReportSeconds;
    }

    public void setPositionDelayReportSeconds(Integer positionDelayReportSeconds) {
        this.positionDelayReportSeconds = positionDelayReportSeconds;
    }

    public Integer getPositionRechargeReportSeconds() {
        return positionRechargeReportSeconds;
    }

    public void setPositionRechargeReportSeconds(Integer positionRechargeReportSeconds) {
        this.positionRechargeReportSeconds = positionRechargeReportSeconds;
    }

    public Integer getMaxSpeedValue() {
        return maxSpeedValue;
    }

    public void setMaxSpeedValue(Integer maxSpeedValue) {
        this.maxSpeedValue = maxSpeedValue;
    }

    public String getRentPlatformHost() {
        return rentPlatformHost;
    }

    public void setRentPlatformHost(String rentPlatformHost) {
        this.rentPlatformHost = rentPlatformHost;
    }

    public Integer getRentPlatformPort() {
        return rentPlatformPort;
    }

    public void setRentPlatformPort(Integer rentPlatformPort) {
        this.rentPlatformPort = rentPlatformPort;
    }

    public Integer getApnType() {
        return apnType;
    }

    public void setApnType(Integer apnType) {
        this.apnType = apnType;
    }

    public Integer getPublickeyUpdateSeconds() {
        return publickeyUpdateSeconds;
    }

    public void setPublickeyUpdateSeconds(Integer publickeyUpdateSeconds) {
        this.publickeyUpdateSeconds = publickeyUpdateSeconds;
    }
}
