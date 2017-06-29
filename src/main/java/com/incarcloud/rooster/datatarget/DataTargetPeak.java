package com.incarcloud.rooster.datatarget;

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
public class DataTargetPeak extends DataTarget {

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

    public DataTargetPeak() {
    }

    public DataTargetPeak(DataTarget target) {
        super(target);
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
}
