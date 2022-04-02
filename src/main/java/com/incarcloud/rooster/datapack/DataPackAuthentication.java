package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 终端鉴权数据
 *
 * @author Aaric, created on 2017-09-01T10:51.
 * @version 2.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackAuthentication extends DataPackObject {

    /**
     * 鉴权码
     */
    private String authCode;

    public DataPackAuthentication(DataPackObject object) {
        super(object);
    }
}
