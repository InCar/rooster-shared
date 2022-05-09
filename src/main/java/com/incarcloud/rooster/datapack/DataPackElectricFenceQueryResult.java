package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.nio.ByteOrder;

/**
 * 电子围栏设置
 *
 * @version 1.0.0-SNAPSHOT
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackElectricFenceQueryResult extends DataPackObject{

    /**
     * 电子围栏id
     */
    private int electricFenceId;

    /**
     * 中心点经度
     */
    private double lng;

    /**
     * 中心点纬度
     */
    private double lat;

    /**
     * 半径
     */
    private int radius;


    public DataPackElectricFenceQueryResult(DataPackObject object) {
        super(object);
    }
}
