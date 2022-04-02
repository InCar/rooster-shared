package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * DataPackCanAdas
 *
 * @author ChenZhao
 * @version 1.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackCanAdas extends DataPackObject {

    /**
     * 左车道检测
     */
    private Integer leftLaneDetected;
    /**
     * 左车道偏离
     */
    private Integer laneDepartureLeft;
    /**
     * 右车道检测
     */
    private Integer rightLaneDetected;
    /**
     * 右车道偏移
     */
    private Integer laneDpartureRight;
    /**
     * 车辆的测定结果
     */
    private Integer vehicleDecectResult;
    /**
     * 碰撞时间
     */
    private Integer crashTime;
    /**
     * 错误信息
     */
    private Integer errorInfo;
    /**
     * 无效信息
     */
    private Integer invalidInfo;


    public DataPackCanAdas(DataPackObject dataPack) {
        super(dataPack);
    }
}
