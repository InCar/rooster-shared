package com.incarcloud.rooster.datapack;

/**
 * 极值数据<br>
 * <i>异常与无效定义：</i><br>
 * <ul>
 *     <li>0xFE-异常，0xFF-无效</li>
 *     <li>0xFF,0xFE-异常，0xFF,0xFF-无效</li>
 * </ul>
 *
 * @author Aaric, created on 2017-06-27T14:05.
 * @since 2.0
 */
public class DataPackPeak extends DataPackObject {

    /**
     * 极值ID
     */
    private Integer peakId;
    /**
     * 极值名称
     */
    private String peakName;
    /**
     * 极值值
     */
    private String peakValue;
    /**
     * 极值单位
     */
    private String peakUnit;
    /**
     * 极值描述
     */
    private String peakDesc;

    public DataPackPeak(DataPackObject object) {
        super(object);
    }

    public Integer getPeakId() {
        return peakId;
    }

    public void setPeakId(Integer peakId) {
        this.peakId = peakId;
    }

    public String getPeakName() {
        return peakName;
    }

    public void setPeakName(String peakName) {
        this.peakName = peakName;
    }

    public String getPeakValue() {
        return peakValue;
    }

    public void setPeakValue(String peakValue) {
        this.peakValue = peakValue;
    }

    public String getPeakUnit() {
        return peakUnit;
    }

    public void setPeakUnit(String peakUnit) {
        this.peakUnit = peakUnit;
    }

    public String getPeakDesc() {
        return peakDesc;
    }

    public void setPeakDesc(String peakDesc) {
        this.peakDesc = peakDesc;
    }

    @Override
    public String toString() {
        return "DataPackPeak{" +
                "peakId=" + peakId +
                ", peakName='" + peakName + '\'' +
                ", peakValue='" + peakValue + '\'' +
                ", peakUnit='" + peakUnit + '\'' +
                ", peakDesc='" + peakDesc + '\'' +
                ", id='" + id + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", packId=" + packId +
                ", protocolName='" + protocolName + '\'' +
                ", protocolVersion='" + protocolVersion + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", tripId=" + tripId +
                ", vid='" + vid + '\'' +
                ", vin='" + vin + '\'' +
                ", detectionDate=" + detectionDate +
                ", _group='" + _group + '\'' +
                ", _name='" + _name + '\'' +
                ", _version='" + _version + '\'' +
                '}';
    }
}
