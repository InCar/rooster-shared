package com.incarcloud.rooster.cache;

/**
 * 参数设置
 *
 * @author Kong, created on 2019-01-15T10:23.
 * @since 2.4.1-SNAPSHOT
 */
public class DeviceParamSetting {

    /**
     * IMEI
     */
    private String imei ;

    /**
     * 参数版本
     */
    private String paramVersion ;

    /**
     * 本地数据存储周期，单位：天
     */
    private Integer localDataStorageSeconds ;

    /**
     * TSP平台地址
     */
    private String remoteSeverHost ;

    /**
     * TSP平台通讯端口
     */
    private Integer remoteServerPort ;

    /**
     * TSP平台应答超时时间,单位:秒
     */
    private Integer platformOverTime;

    /**
     * 终端应答超时时间,单位:秒
     */
    private Integer terminalResponseTime;

    /**
     * 终端登入失败再次登录时间间隔,单位:秒
     */
    private Integer logintRetrySeconds;

    /**
     * APN
     */
    private String apn;

    /**
     * PublicKey更新周期,单位:天
     */
    private Integer publickeyUpdateSeconds;

    /**
     * 正常模式整车数据上报周期,单位:秒
     */
    private Integer canReportSeconds;

    /**
     *正常模式心跳数据上报周期,单位:秒
     */
    private Integer headbeatSeconds;

    /**
     * 延时模式整车数据上报周期,单位:秒
     */
    private Integer dalayCanReportSeconds;

    /**
     *延时模式心跳数据上报周期,单位:秒
     */
    private Integer dalayHeadbeatSeconds;

    /**
     * 延时模式车辆数据上报持续时长,单位:分钟
     */
    private Integer dalayTimeSeconds;

    /**
     * 报警模式整车数据上报周期,单位:秒
     */
    private Integer alarmCanReportSeconds;

    /**
     * 报警模式整车数据上报持续时长,单位: 秒
     */
    private Integer alarmTimeSeconds;

    /**
     * 短信白名单
     */
    private String smsWhiteList ;

    /**
     * 公网APN
     */
    private String publicApn ;

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
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

    public Integer getPlatformOverTime() {
        return platformOverTime;
    }

    public void setPlatformOverTime(Integer platformOverTime) {
        this.platformOverTime = platformOverTime;
    }

    public Integer getTerminalResponseTime() {
        return terminalResponseTime;
    }

    public void setTerminalResponseTime(Integer terminalResponseTime) {
        this.terminalResponseTime = terminalResponseTime;
    }

    public Integer getLogintRetrySeconds() {
        return logintRetrySeconds;
    }

    public void setLogintRetrySeconds(Integer logintRetrySeconds) {
        this.logintRetrySeconds = logintRetrySeconds;
    }

    public String getApn() {
        return apn;
    }

    public void setApn(String apn) {
        this.apn = apn;
    }

    public Integer getPublickeyUpdateSeconds() {
        return publickeyUpdateSeconds;
    }

    public void setPublickeyUpdateSeconds(Integer publickeyUpdateSeconds) {
        this.publickeyUpdateSeconds = publickeyUpdateSeconds;
    }

    public Integer getCanReportSeconds() {
        return canReportSeconds;
    }

    public void setCanReportSeconds(Integer canReportSeconds) {
        this.canReportSeconds = canReportSeconds;
    }

    public Integer getHeadbeatSeconds() {
        return headbeatSeconds;
    }

    public void setHeadbeatSeconds(Integer headbeatSeconds) {
        this.headbeatSeconds = headbeatSeconds;
    }

    public Integer getDalayCanReportSeconds() {
        return dalayCanReportSeconds;
    }

    public void setDalayCanReportSeconds(Integer dalayCanReportSeconds) {
        this.dalayCanReportSeconds = dalayCanReportSeconds;
    }

    public Integer getDalayHeadbeatSeconds() {
        return dalayHeadbeatSeconds;
    }

    public void setDalayHeadbeatSeconds(Integer dalayHeadbeatSeconds) {
        this.dalayHeadbeatSeconds = dalayHeadbeatSeconds;
    }

    public Integer getDalayTimeSeconds() {
        return dalayTimeSeconds;
    }

    public void setDalayTimeSeconds(Integer dalayTimeSeconds) {
        this.dalayTimeSeconds = dalayTimeSeconds;
    }

    public Integer getAlarmCanReportSeconds() {
        return alarmCanReportSeconds;
    }

    public void setAlarmCanReportSeconds(Integer alarmCanReportSeconds) {
        this.alarmCanReportSeconds = alarmCanReportSeconds;
    }

    public Integer getAlarmTimeSeconds() {
        return alarmTimeSeconds;
    }

    public void setAlarmTimeSeconds(Integer alarmTimeSeconds) {
        this.alarmTimeSeconds = alarmTimeSeconds;
    }

    public String getSmsWhiteList() {
        return smsWhiteList;
    }

    public void setSmsWhiteList(String smsWhiteList) {
        this.smsWhiteList = smsWhiteList;
    }

    public String getPublicApn() {
        return publicApn;
    }

    public void setPublicApn(String publicApn) {
        this.publicApn = publicApn;
    }
}
