package com.incarcloud.rooster.datapack;

import lombok.ToString;

/**
 * 公钥更新请求数据
 *
 * @author Kong, created on 2018-07-11T18:55.
 * @version 2.2.6-SNAPSHOT
 */
@ToString(callSuper = true)
public class DataPackRsaKeyRequest extends DataPackObject {

    public DataPackRsaKeyRequest(DataPackObject object) {
        super(object);
    }
}
