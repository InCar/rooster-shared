package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * RSA数据
 *
 * @author Aaric, created on 2017-09-01T14:40.
 * @version 2.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackRsa extends DataPackObject {

    /**
     * 平台 RSA 公钥{e,n}中的 e
     */
    private Long e;
    /**
     * RSA 公钥{e,n}中的 n
     */
    private byte[] n;

    public DataPackRsa(DataPackObject object) {
        super(object);
    }
}
