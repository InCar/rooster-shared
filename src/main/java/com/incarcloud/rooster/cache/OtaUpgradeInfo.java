package com.incarcloud.rooster.cache;

import java.time.Instant;
import java.util.Date;

/**
 * OTA升级Cache缓存实体
 *
 * @author Aaric, created on 2018-11-07T15:25.
 * @since 2.3.8-SNAPSHOT
 */
public class OtaUpgradeInfo {

    /**
     * 业务ID
     */
    private String refId;

    /**
     * 设备ID
     */
    private String deviceId;

    /**
     * 升级版本
     */
    private String upgradeVersion;

    /**
     * 升级包文件名
     */
    private String upgradePackageName;

    /**
     * 升级地址
     */
    private String upgradeUrl;

    /**
     * 下发升级时间
     */
    private Date createTime;

    /**
     * md5值
     */
    private String md5 ;

    public OtaUpgradeInfo() {
    }

    public OtaUpgradeInfo(String refId, String deviceId, String upgradeVersion, String upgradePackageName, String upgradeUrl, String md5) {
        this.refId = refId;
        this.deviceId = deviceId;
        this.upgradeVersion = upgradeVersion;
        this.upgradePackageName = upgradePackageName;
        this.upgradeUrl = upgradeUrl;
        this.createTime = Date.from(Instant.now());
        this.md5 = md5 ;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getUpgradeVersion() {
        return upgradeVersion;
    }

    public void setUpgradeVersion(String upgradeVersion) {
        this.upgradeVersion = upgradeVersion;
    }

    public String getUpgradePackageName() {
        return upgradePackageName;
    }

    public void setUpgradePackageName(String upgradePackageName) {
        this.upgradePackageName = upgradePackageName;
    }

    public String getUpgradeUrl() {
        return upgradeUrl;
    }

    public void setUpgradeUrl(String upgradeUrl) {
        this.upgradeUrl = upgradeUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }
}
