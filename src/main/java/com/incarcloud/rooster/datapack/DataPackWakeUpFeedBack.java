package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 唤醒回馈
 *
 * @author Kong, created on 2018-06-19T11:37.
 * @version 1.2.0-SNAPSHOT
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackWakeUpFeedBack extends DataPackObject {

    private Integer isSuccess;

    public DataPackWakeUpFeedBack(DataPackObject object) {
        super(object);
    }
}
