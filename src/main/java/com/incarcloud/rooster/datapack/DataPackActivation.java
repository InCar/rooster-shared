package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * tbox激活信息
 *
 * @author chenz
 * @version 1.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackActivation extends DataPackObject {
    /**
     * 激活
     */
    public static final int ACTIVATION = 0;
    /**
     * PublicKey重置
     */
    public static final int PUBLIC_KEY_RESET = 1;

    /**
     * 激活类型
     */
    private Integer activationType;

    /**
     * T-BOX设备号
     */
    private String sn;

    public DataPackActivation(DataPackObject object) {
        super(object);
    }
}
