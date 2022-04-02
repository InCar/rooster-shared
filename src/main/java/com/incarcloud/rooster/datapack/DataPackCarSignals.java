package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * DataPackCarSignals
 *
 * @author Fan Beibei
 * @version 1.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackCarSignals extends DataPackObject {

    /**
     * 远光灯
     */
    private Integer hightBeam;
    /**
     * 近光灯
     */
    private Integer lowBeam;
    /**
     * 雨刮
     */
    private Integer wipers;
    /**
     * 右转向灯
     */
    private Integer rightSignal;
    /**
     * 左转向灯
     */
    private Integer leftSignal;
    /**
     * 刹车灯
     */
    private Integer brakeSignal;
    /**
     * 车速
     */
    private Integer speend;
    /**
     * wipersAvailable
     */
    private Integer wipersAvailable;
    /**
     * hightBeamAvailable
     */
    private Integer hightBeamAvailable;
    /**
     * lowBeamAvailable
     */
    private Integer lowBeamAvailable;
    /**
     * speendAvailable
     */
    private Integer speendAvailable;

    public DataPackCarSignals(DataPackObject object) {
        super(object);
    }
}
