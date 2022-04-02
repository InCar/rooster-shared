package com.incarcloud.rooster.cache;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.time.Instant;
import java.util.Date;

/**
 * OTA升级Cache缓存实体
 *
 * @author Aaric, created on 2018-11-07T15:25.
 * @version 2.3.8-SNAPSHOT
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString
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
    private String md5;

    public OtaUpgradeInfo() {
    }

    public OtaUpgradeInfo(String refId, String deviceId, String upgradeVersion, String upgradePackageName, String upgradeUrl, String md5) {
        this.refId = refId;
        this.deviceId = deviceId;
        this.upgradeVersion = upgradeVersion;
        this.upgradePackageName = upgradePackageName;
        this.upgradeUrl = upgradeUrl;
        this.createTime = Date.from(Instant.now());
        this.md5 = md5;
    }
}
