package com.incarcloud.rooster.datatarget;

/**
 * 上报设备信息<br>
 * <i>异常与无效定义：</i><br>
 * <ul>
 *     <li>0xFE-异常，0xFF-无效</li>
 *     <li>0xFF,0xFE-异常，0xFF,0xFF-无效</li>
 * </ul>
 *
 * @author Aaric, created on 2017-06-27T14:54.
 * @since 2.0
 */
public class DataTargetDevice extends DataTarget {

    /**
     * 硬盘版本号
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
    private byte diagnoseProgramType;

    public DataTargetDevice() {
    }

    public DataTargetDevice(DataTarget target) {
        super(target);
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

    public byte getDiagnoseProgramType() {
        return diagnoseProgramType;
    }

    public void setDiagnoseProgramType(byte diagnoseProgramType) {
        this.diagnoseProgramType = diagnoseProgramType;
    }
}
