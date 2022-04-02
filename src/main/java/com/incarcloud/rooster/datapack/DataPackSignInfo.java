package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * DataPackSignInfo
 *
 * @author Fan Beibei
 * @version 1.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackSignInfo extends DataPackObject {

    /**
     * signType
     */
    private Integer signType;
    /**
     * supplementarySignType
     */
    private Integer supplementarySignType;
    /**
     * signPosX
     */
    private Integer signPosX;
    /**
     * signPosY
     */
    private Integer signPosY;
    /**
     * signPosZ
     */
    private Integer signPosZ;
    /**
     * filterType
     */
    private Integer filterType;

    public DataPackSignInfo(DataPackObject object) {
        super(object);
    }
}
