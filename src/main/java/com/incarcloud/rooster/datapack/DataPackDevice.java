package com.incarcloud.rooster.datapack;

/**
 * 上报设备数据<br>
 * <i>异常与无效定义：</i><br>
 * <ul>
 *     <li>0xFE-异常，0xFF-无效</li>
 *     <li>0xFF,0xFE-异常，0xFF,0xFF-无效</li>
 * </ul>
 *
 * @author Aaric, created on 2017-06-27T14:54.
 * @since 2.0
 */
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

    public String getHardwareVersion() {
        return hardwareVersion;
    }

    public void setHardwareVersion(String hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
    }

    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public Integer getDiagnoseProgramType() {
        return diagnoseProgramType;
    }

    public void setDiagnoseProgramType(Integer diagnoseProgramType) {
        this.diagnoseProgramType = diagnoseProgramType;
    }

    public Integer getInitCode() {
        return initCode;
    }

    public void setInitCode(Integer initCode) {
        this.initCode = initCode;
    }

    public Integer getSoftwareTypeId() {
        return softwareTypeId;
    }

    public void setSoftwareTypeId(Integer softwareTypeId) {
        this.softwareTypeId = softwareTypeId;
    }

    public Integer getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(Integer terminalType) {
        this.terminalType = terminalType;
    }

    public String getTerminalMakerId() {
        return terminalMakerId;
    }

    public void setTerminalMakerId(String terminalMakerId) {
        this.terminalMakerId = terminalMakerId;
    }

    public String getTerminalModel() {
        return terminalModel;
    }

    public void setTerminalModel(String terminalModel) {
        this.terminalModel = terminalModel;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getTerminalSIMICCID() {
        return terminalSIMICCID;
    }

    public void setTerminalSIMICCID(String terminalSIMICCID) {
        this.terminalSIMICCID = terminalSIMICCID;
    }

    public Boolean getSupportGPS() {
        return supportGPS;
    }

    public void setSupportGPS(Boolean supportGPS) {
        this.supportGPS = supportGPS;
    }

    public Boolean getSupportBeidou() {
        return supportBeidou;
    }

    public void setSupportBeidou(Boolean supportBeidou) {
        this.supportBeidou = supportBeidou;
    }

    public Boolean getSupportGlonass() {
        return supportGlonass;
    }

    public void setSupportGlonass(Boolean supportGlonass) {
        this.supportGlonass = supportGlonass;
    }

    public Boolean getSupportGalileo() {
        return supportGalileo;
    }

    public void setSupportGalileo(Boolean supportGalileo) {
        this.supportGalileo = supportGalileo;
    }

    public Boolean getSupportGPRS() {
        return supportGPRS;
    }

    public void setSupportGPRS(Boolean supportGPRS) {
        this.supportGPRS = supportGPRS;
    }

    public Boolean getSupportCMDA() {
        return supportCMDA;
    }

    public void setSupportCMDA(Boolean supportCMDA) {
        this.supportCMDA = supportCMDA;
    }

    public Boolean getSupportTDSCDMA() {
        return supportTDSCDMA;
    }

    public void setSupportTDSCDMA(Boolean supportTDSCDMA) {
        this.supportTDSCDMA = supportTDSCDMA;
    }

    public Boolean getSupportWCDMA() {
        return supportWCDMA;
    }

    public void setSupportWCDMA(Boolean supportWCDMA) {
        this.supportWCDMA = supportWCDMA;
    }

    public Boolean getSupportCDMA2000() {
        return supportCDMA2000;
    }

    public void setSupportCDMA2000(Boolean supportCDMA2000) {
        this.supportCDMA2000 = supportCDMA2000;
    }

    public Boolean getSupportTDLTE() {
        return supportTDLTE;
    }

    public void setSupportTDLTE(Boolean supportTDLTE) {
        this.supportTDLTE = supportTDLTE;
    }

    @Override
    public String toString() {
        return "DataPackDevice{" +
                "hardwareVersion='" + hardwareVersion + '\'' +
                ", firmwareVersion='" + firmwareVersion + '\'' +
                ", softwareVersion='" + softwareVersion + '\'' +
                ", diagnoseProgramType=" + diagnoseProgramType +
                ", initCode=" + initCode +
                ", softwareTypeId=" + softwareTypeId +
                ", terminalType=" + terminalType +
                ", terminalMakerId='" + terminalMakerId + '\'' +
                ", terminalModel='" + terminalModel + '\'' +
                ", terminalId='" + terminalId + '\'' +
                ", terminalSIMICCID='" + terminalSIMICCID + '\'' +
                ", supportGPS=" + supportGPS +
                ", supportBeidou=" + supportBeidou +
                ", supportGlonass=" + supportGlonass +
                ", supportGalileo=" + supportGalileo +
                ", supportGPRS=" + supportGPRS +
                ", supportCMDA=" + supportCMDA +
                ", supportTDSCDMA=" + supportTDSCDMA +
                ", supportWCDMA=" + supportWCDMA +
                ", supportCDMA2000=" + supportCDMA2000 +
                ", supportTDLTE=" + supportTDLTE +
                '}';
    }
}
