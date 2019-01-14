package com.incarcloud.rooster.datapack;

/**
 * 报警参数设置完成
 *
 * @author Kong, created on 2018-06-15T13:53.
 * @since 1.2.0-SNAPSHOT
 */
public class DataPackAlarmSettingCompleted extends DataPackObject{

    /**
     * 设置状态
     * 1 - 成功
     * 其他- 失败
     */
    private Integer settingStatus ;

    public DataPackAlarmSettingCompleted(DataPackObject object){
        super(object);
    }

    public Integer getSettingStatus() {
        return settingStatus;
    }

    public void setSettingStatus(Integer settingStatus) {
        this.settingStatus = settingStatus;
    }
}
