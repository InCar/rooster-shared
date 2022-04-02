package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * DataPackCanVersion
 *
 * @author ChenZhao
 * @version 1.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackCanVersion extends DataPackObject {

    /**
     * ID
     */
    private Integer canId;
    /**
     * 模块名称
     */
    private String canModelName;
    /**
     * 版本信息
     */
    private String version;

    public DataPackCanVersion(DataPackObject dataPack) {
        super(dataPack);
    }
}
