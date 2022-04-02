package com.incarcloud.rooster.datapack;

import lombok.ToString;

/**
 * 注销数据<br>
 * 暂无成员属性，表示设备注销
 *
 * @author Aaric, created on 2017-09-01T10:40.
 * @version 2.0
 */
@ToString(callSuper = true)
public class DataPackRevoke extends DataPackObject {

    public DataPackRevoke(DataPackObject object) {
        super(object);
    }
}
