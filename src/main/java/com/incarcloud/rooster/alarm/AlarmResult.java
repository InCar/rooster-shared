package com.incarcloud.rooster.alarm;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 报警结果
 *
 * @author Aaric, created on 2020-06-03T15:10.
 * @version 1.2.0-SNAPSHOT
 */
@Data
public class AlarmResult {

    /**
     * 设备号
     */
    private String deviceId;

    /**
     * 车架号
     */
    private String vin;

    /**
     * 协议名称，即DataParserXxx.PROTOCOL_NAME，例如：jtt808, ic
     */
    private String protocolName;

    /**
     * 经度
     */
    private Double longitude;
    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 报警类型集合
     *
     * @-see Constants.Jtt808AlarmType jtt808协议报警类型（暂无支持）
     * @-see Constants.IcAlarmType ic协议报警类型
     */
    @Deprecated
    private List<String> alarmTypes;

    /**
     * 报警类型集合<br>
     * 报警Map结构说明：<br>
     * <ul>
     *     <li>key：报警类型</li>
     *     <li>value：false-关闭，true-触发</li>
     * </ul>
     *
     * @-see Constants.GmmcAlarmType gmmc协议报警类型（常量）
     * @—see Constants.Jtt808AlarmType jtt808协议报警类型（暂无支持）
     */
    private Map<String, Boolean> alarmTypeMap;

    /**
     * 检测时间
     */
    private Long detectionTime;

    public AlarmResult() {
    }

    public AlarmResult(String deviceId, String protocolName) {
        this.deviceId = deviceId;
        this.protocolName = protocolName;
    }
}
