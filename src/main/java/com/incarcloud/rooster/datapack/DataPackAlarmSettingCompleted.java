package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 报警参数设置完成
 *
 * @author Kong, created on 2018-06-15T13:53.
 * @version 1.2.0-SNAPSHOT
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackAlarmSettingCompleted extends DataPackObject {

    /**
     * 设置状态
     * 1 - 成功
     * 其他- 失败
     */
    private Integer settingStatus;

    public DataPackAlarmSettingCompleted(DataPackObject object) {
        super(object);
    }
}
