package com.incarcloud.rooster.datapack;

/**
 * 参数查询结果
 *
 * @author Kong, created on 2018-08-27T15:13.
 * @since 1.2.0-SNAPSHOT
 */
public class DataPackParameter extends DataPackObject {

    /**
     * 参数版本
     */
    private String paramVersion ;
    /**
     * 本地数据存储周期, 单位：天
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

    @Override
    public String toString() {
        return "DataPackParameter{" +
                "paramVersion='" + paramVersion + '\'' +
                ", localDataStorageSeconds=" + localDataStorageSeconds +
                ", remoteSeverHost='" + remoteSeverHost + '\'' +
                ", remoteServerPort=" + remoteServerPort +
                ", platformOverTime=" + platformOverTime +
                ", terminalResponseTime=" + terminalResponseTime +
                ", logintRetrySeconds=" + logintRetrySeconds +
                ", apn='" + apn + '\'' +
                ", publickeyUpdateSeconds=" + publickeyUpdateSeconds +
                ", canReportSeconds=" + canReportSeconds +
                ", headbeatSeconds=" + headbeatSeconds +
                ", dalayCanReportSeconds=" + dalayCanReportSeconds +
                ", dalayHeadbeatSeconds=" + dalayHeadbeatSeconds +
                ", dalayTimeSeconds=" + dalayTimeSeconds +
                ", alarmCanReportSeconds=" + alarmCanReportSeconds +
                ", alarmTimeSeconds=" + alarmTimeSeconds +
                ", smsWhiteList='" + smsWhiteList + '\'' +
                ", publicApn='" + publicApn + '\'' +
                '}';
    }
}
