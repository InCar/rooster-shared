package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 参数设置完成
 *
 * @author Kong, created on 2018-06-15T13:53.
 * @version 1.2.0-SNAPSHOT
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackSettingCompleted extends DataPackObject {

    /**
     * 参数版本
     */
    private String version;

    /**
     * 设置状态
     * 1 - 成功
     * 其他- 失败
     */
    private Integer settingStatus;

    public DataPackSettingCompleted(DataPackObject object) {
        super(object);
    }
}
