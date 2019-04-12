package com.incarcloud.rooster.datapack;

/**
 * OTA升级完成
 * Created by Kong on 2018/3/5.
 */
public class DataPackOtaCompleted extends DataPackObject {

    /**
     * 升级状态
     * “0x01”表示成功；
     * “0x02”下载时蓄电池电压过低；
     * “0x03”下载时T-BOX存储空间不足；
     * “0x04”URL格式不正确
     * “0x05”无法连接（）到主机或代理；
     * “0x06”备份上一个版本软件包无法执行下载任务;
     * “0x07”下载升级包失败;
     * “0x08”升级时蓄电池电压低；
     * “0x09”升级时存储空间不足；
     * “0x0A”升级包校验失败；
     * “0x0B”升级包版本错误；
     * “0x0C” 升级失败（安装失败，回滚）；
     * “0x0D” 下载成功（数据包下载完成但还未校验）；
     * “0x81”：T-BOX收到OTA指令应答
     * “0x82”：开始下载OTA升级包
     * “0x0E~0x7F”表示自定义失败状态。
     * “0x83~0xFE”表示自定义中间状态。
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
