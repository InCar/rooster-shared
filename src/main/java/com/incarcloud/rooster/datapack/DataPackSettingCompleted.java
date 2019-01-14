package com.incarcloud.rooster.datapack;

/**
 * 参数设置完成
 *
 * @author Kong, created on 2018-06-15T13:53.
 * @since 1.2.0-SNAPSHOT
 */
public class DataPackSettingCompleted extends DataPackObject{

    /**
     * 参数版本
     */
    private String version ;

    /**
     * 设置状态
     * 1 - 成功
     * 其他- 失败
     */
    private Integer settingStatus ;

    public DataPackSettingCompleted(DataPackObject object){
        super(object);
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getSettingStatus() {
        return settingStatus;
    }

    public void setSettingStatus(Integer settingStatus) {
        this.settingStatus = settingStatus;
    }

    @Override
    public String toString() {
        return "DataPackSettingCompleted{" +
                "version='" + version + '\'' +
                ", settingStatus=" + settingStatus +
                '}';
    }
}
