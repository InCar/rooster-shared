package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 上报设备数据<br>
 * <i>异常与无效定义：</i><br>
 * <ul>
 *     <li>0xFE-异常，0xFF-无效</li>
 *     <li>0xFF,0xFE-异常，0xFF,0xFF-无效</li>
 * </ul>
 *
 * @author Aaric, created on 2017-06-27T14:54.
 * @version 2.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackDevice extends DataPackObject {

    /**
     * 硬件版本号
     */
    private String hardwareVersion;
    /**
     * 固件版本号
     */
    private String firmwareVersion;
    /**
     * 软件版本号
     */
    private String softwareVersion;
    /**
     * 诊断程序类型(LANDU)：0xFF 表示通用 OBDII 诊断程序，其他值待定义
     */
    private Integer diagnoseProgramType;
    /**
     * 恢复出厂设置序号
     */
    private Integer initCode;
    /**
     * 软件类别ID
     */
    private Integer softwareTypeId;

    /**
     * 终端类型
     */
    private Integer terminalType;
    /**
     * 制造商 ID
     */
    private String terminalMakerId;
    /**
     * 终端型号
     */
    private String terminalModel;
    /**
     * 终端 ID
     */
    private String terminalId;
    /**
     * 终端 SIM 卡 ICCID
     */
    private String terminalSIMICCID;

    /**
     * 是否支持 GPS 定位
     */
    private Boolean supportGPS;
    /**
     * 是否支持北斗定位
     */
    private Boolean supportBeidou;
    /**
     * 是否支持 GLONASS 定位
     */
    private Boolean supportGlonass;
    /**
     * 是否支持 Galileo 定位
     */
    private Boolean supportGalileo;
    /**
     * 是否支持GPRS通信
     */
    private Boolean supportGPRS;
    /**
     * 是否支持CDMA通信
     */
    private Boolean supportCMDA;
    /**
     * 是否支持TD-SCDMA通信
     */
    private Boolean supportTDSCDMA;
    /**
     * 是否支持WCDMA通信
     */
    private Boolean supportWCDMA;
    /**
     * 是否支持CDMA2000通信
     */
    private Boolean supportCDMA2000;
    /**
     * 是否支持TD-LTE通信
     */
    private Boolean supportTDLTE;

    public DataPackDevice(DataPackObject object) {
        super(object);
    }
}
