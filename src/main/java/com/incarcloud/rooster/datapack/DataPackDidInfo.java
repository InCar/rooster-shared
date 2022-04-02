package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 自诊断DID信息
 *
 * @author Kong, created on 2019-01-04T16:51.
 * @version 1.2.0-SNAPSHOT
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackDidInfo extends DataPackObject {

    /**
     * 软件版本号
     */
    private String softVersionNo;

    /**
     * 硬件版本号
     */
    private String hardwareVersionNo;

    /**
     * 零件号
     */
    private String partNumber;

    /**
     * 车型标记
     * 0-ZC
     * 1-RE
     * 2-NS
     */
    private Integer vehicleModel;

    /**
     * IMEI
     */
    private String imei;

    /**
     * T-BOX SN
     */
    private String sn;

    /**
     * ICCID
     */
    private String iccid;

    /**
     * TSP登录状态
     * 0-未连接
     * 1-连接
     */
    private Integer loginStatus;

    /**
     * T-BOX激活状态
     * 0-未激活
     * 1-激活
     */
    private Integer activationStatus;

    /**
     * DA连接状态
     * 0-未连接
     * 1-连接
     */
    private Integer daConntectStatus;

    /**
     * RSSI
     */
    private Integer rssi;

    /**
     * 公网拨号状态
     * 0-失败
     * 1-成功
     */
    private Integer publicDialStatus;

    /**
     * 私网拨号状态
     * 0-失败
     * 1-成功
     */
    private Integer privateDialStatus;

    /**
     * MPU最近一次重启时间
     */
    private Date mpuLatestRestartTime;

    /**
     * ACC状态
     * 0-ACC OFF
     * 1-ACC ON
     */
    private Integer accStatus;

    /**
     * 网络接入PLMN标识
     * PLMN : 46000~46020
     */
    private Integer plmnFlag;

    /**
     * 网络注册状态
     * 0-失败
     * 1-成功
     */
    private Integer wlanRegisteredStatus;

    /**
     * 网络拒绝原因
     * 网络拒接原因码 0---0xFFFF
     */
    private Integer wlanRefusedReason;

    /**
     * GPS定位信息
     */
    private DataPackPosition position;

    /**
     * 系统时间
     */
    private Date systemTime;

    /**
     * 最近一次公网连接时间
     */
    private Date latestPublicConnectTime;

    /**
     * MPU当前工作时间（单位：秒）
     */
    private Long mpuCurrentTime;

    /**
     * MCU当前工作时间（单位：秒）
     */
    private Long mcuCurrentTime;

    /**
     * 电源电压
     */
    private Float powerVoltage;

    /**
     * 备用电池电压
     */
    private Float standbyPowerVoltage;

    /**
     * MPU最近一次重启原因
     * 0x00:WatchDog_NG
     * 0x01:WLAN_Dial_NG
     * 0x02:WLAN_DialLookUp_NG
     * 0x03:DM_Timeout_By_TRC
     * 0x04:DM_USB_NG
     * 0x05:DM_NG
     * 0x06:DM_WLAN_NG
     * 0x07:WLAN_IOCTL_NG
     * 其他：预留
     */
    private Integer mpuLastestRestartReason;

    /**
     * MCU重启次数
     */
    private Integer mcuRestartCount;

    /**
     * MPU休眠条件状态
     * SC_BLOCK 0-允许休眠，1- 阻塞休眠
     */
    private Integer mpuScBlockStatus;

    /**
     * MPU休眠条件状态
     * DM_BLOCK 0-允许休眠，1- 阻塞休眠
     */
    private Integer mpuDmBlockStatus;

    /**
     * MPU休眠条件状态
     * CM_BLOCK 0-允许休眠，1- 阻塞休眠
     */
    private Integer mpuCmBlockStatus;

    /**
     * MPU休眠条件状态
     * MCUA_BLOCK 0-允许休眠，1- 阻塞休眠
     */
    private Integer mpuMcuaBlockStatus;

    /**
     * MPU休眠条件状态
     * UP_BLOCK 0-允许休眠，1- 阻塞休眠
     */
    private Integer mpuUpBlockStatus;

    /**
     * MPU休眠条件状态
     * CS_BLOCK 0-允许休眠，1- 阻塞休眠
     */
    private Integer mpuCsBlockStatus;

    /**
     * MCU休眠条件状态-ACC
     * 0-ACC OFF
     * 1-ACC ON
     */
    private Integer mcuDormancyAccStatus;

    /**
     * MCU休眠条件状态-CAN
     * 0-CAN睡眠
     * 1-CAN工作
     */
    private Integer mcuDormancyCanStatus;

    /**
     * MCU休眠条件状态-MPU
     * 0-MPU睡眠
     * 1-MPU工作
     */
    private Integer mcuDormancyMPUStatus;

    /**
     * MCU休眠条件状态
     * 0-已超时
     * 1-超时等待中
     */
    private Integer mcuDormancyStatus;

    /**
     * MPU RTC唤醒周期（单位：秒）
     */
    private Integer mpuRtcWakeUpCycle;

    /**
     * MCU最近一次唤醒时间（单位：秒）
     */
    private Integer mcuLatestWakeUpTime;

    public DataPackDidInfo(DataPackObject object) {
        super(object);
    }
}
