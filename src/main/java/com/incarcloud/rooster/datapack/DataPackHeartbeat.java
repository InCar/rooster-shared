package com.incarcloud.rooster.datapack;

import lombok.ToString;

/**
 * 心跳数据<br>
 * 暂无成员属性，检测设备在/离线
 *
 * @author Aaric, created on 2017-09-01T09:55.
 * @version 2.0
 */
@ToString(callSuper = true)
public class DataPackHeartbeat extends DataPackObject {

    public DataPackHeartbeat(DataPackObject object) {
        super(object);
    }
}
