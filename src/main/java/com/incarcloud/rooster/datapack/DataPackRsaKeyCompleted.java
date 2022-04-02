package com.incarcloud.rooster.datapack;

import lombok.ToString;

/**
 * 公钥更新完成数据
 *
 * @author Aaric, created on 2018-07-11T19:35.
 * @version 2.2.6-SNAPSHOT
 */
@ToString(callSuper = true)
public class DataPackRsaKeyCompleted extends DataPackObject {

    public DataPackRsaKeyCompleted(DataPackObject object) {
        super(object);
    }
}
