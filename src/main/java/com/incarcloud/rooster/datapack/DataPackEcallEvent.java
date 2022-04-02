package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * DataPackEcallEvent
 *
 * @author chenzhao
 * @version 2.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackEcallEvent extends DataPackObject {

    /**
     * iccid
     */
    private String iccid;

    /**
     * ECALL开始时间
     */
    private long startTime;
    /**
     * 通话是否成功,通话是否成功，有效值范围：
     * “0x00”: 是
     * “0x01”: 否
     */
    private int success;
    /**
     * 网络制式，有效值范围：
     * “0x00” 2G,
     * “0x01” 3G,
     * “0x02” 4G,
     * “0x03” 5G,
     * “0x04~0xFE”预留字段“0xFF”表示无效或未获取网络制式信息。
     */
    private int networkType;
    /**
     * 信号强度，单位为dBm，信号强度为负值，上传值为信号强度值的绝对值，有效值范围：1-125
     */
    private int signal;
    /**
     * ecall失败原因
     * 有效值范围：
     * “0x01”: SIM卡不在位
     * “0x02”: 设备未注册
     * "0x03~0xFE”
     * 表示自定义中间状态代码。
     */
    private int ecallFailure;
    /**
     * 车辆是否存在翻滚，有效值范围：
     * 0x00：未检测到翻滚
     * 0x01：检测到翻滚
     */
    private int rolloverDetection;
    /**
     * 车辆碰撞程度检测，有效值范围：
     * 0x00：未检测到Crash
     * 0x01：中度Crash（Medium crash）
     * 0x02：重度Crash（Violent crash）
     * 0x03: 后方Crash（Rear crash）
     */
    private int airbagCrashOrder;

    public DataPackEcallEvent(DataPackObject object) {
        super(object);
    }
}
