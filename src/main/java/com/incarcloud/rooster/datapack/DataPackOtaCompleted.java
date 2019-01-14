package com.incarcloud.rooster.datapack;

/**
 * OTA升级完成
 * Created by Kong on 2018/3/5.
 */
public class DataPackOtaCompleted extends DataPackObject {

    /**
     * 升级状态
     * 1-成功
     * 2-下载升级包失败
     * 3-升级包校验失败
     * 4-升级包版本错误
     */
    private Integer upgradeStatus ;
    /**
     * 目标软件版本
     */
    private String version ;

    /**
     * 升级之前软件版本
     */
    private String oldVersion ;

    public DataPackOtaCompleted(DataPackObject object){
        super(object);
    }

    public Integer getUpgradeStatus() {
        return upgradeStatus;
    }

    public void setUpgradeStatus(Integer upgradeStatus) {
        this.upgradeStatus = upgradeStatus;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getOldVersion() {
        return oldVersion;
    }

    public void setOldVersion(String oldVersion) {
        this.oldVersion = oldVersion;
    }

    @Override
    public String toString() {
        return "DataPackOtaCompleted{" +
                "upgradeStatus=" + upgradeStatus +
                ", version='" + version + '\'' +
                ", oldVersion='" + oldVersion + '\'' +
                '}';
    }
}
