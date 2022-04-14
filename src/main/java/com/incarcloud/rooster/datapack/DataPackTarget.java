package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import lombok.experimental.SuperBuilder;

/**
 * 数据提取包
 *
 * @author Aaric, created on 2017-06-27T13:47.
 * @version 2.0
 */
@SuperBuilder
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackTarget {

    /**
     * 数据对象
     */
    private DataPackObject dataPackObject;
    /**
     * 消息内容（如果为空，忽略）
     */
    private String msg;

    public DataPackTarget(DataPackObject dataPackObject) {
        this.dataPackObject = dataPackObject;
    }

    public DataPackTarget(DataPackObject dataPackObject, String msg) {
        this.dataPackObject = dataPackObject;
        this.msg = msg;
    }
}
