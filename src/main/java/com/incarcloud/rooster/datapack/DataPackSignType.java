package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * DataPackSignType
 *
 * @author Fan Beibei
 * @version 1.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackSignType extends DataPackObject {

    /**
     * signTypeD1
     */
    private Integer signTypeD1;
    /**
     * supplementarySignTypeD1
     */
    private Integer supplementarySignTypeD1;
    /**
     * signTypeD2
     */
    private Integer signTypeD2;
    /**
     * supplementarySignTypeD2
     */
    private Integer supplementarySignTypeD2;
    /**
     * signTypeD3
     */
    private Integer signTypeD3;
    /**
     * supplementarySignTypeD3
     */
    private Integer supplementarySignTypeD3;
    /**
     * signTypeD4
     */
    private Integer signTypeD4;
    /**
     * supplementarySignTypeD4
     */
    private Integer supplementarySignTypeD4;

    public DataPackSignType(DataPackObject object) {
        super(object);
    }
}
