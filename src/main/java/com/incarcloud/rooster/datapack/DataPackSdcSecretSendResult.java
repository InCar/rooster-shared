package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 短信解析对象
 *
 * @author Kong, created on 2019-07-01T16:22.
 * @version 1.0.0-SNAPSHOT
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackSdcSecretSendResult extends DataPackObject{

    /**
     * 处理是否成功
     * 成功返回：0
     * 异常返回：1~254表示不同的错误
     */
    private Integer res;


    public DataPackSdcSecretSendResult(DataPackObject object) {
        super(object);
    }
}
