package com.incarcloud.rooster.datapack;

import java.util.List;

/**
 * 极值数据<br>
 * <i>异常与无效定义：</i><br>
 * <ul>
 * <li>0xFE-异常，0xFF-无效</li>
 * <li>0xFF,0xFE-异常，0xFF,0xFF-无效</li>
 * </ul>
 *
 * @author Aaric, created on 2017-06-27T14:05.
 * @since 2.0
 */
public class DataPackPeak extends DataPackObject {

    /**
     * 极值数据
     */
    private List<Peak> peakList;

    public DataPackPeak(DataPackObject object) {
        super(object);
    }

    public List<Peak> getPeakList() {
        return peakList;
    }

    public void setPeakList(List<Peak> peakList) {
        this.peakList = peakList;
    }

    @Override
    public String toString() {
        return "DataPackPeak{" +
                "peakList=" + peakList +
                '}';
    }

    /**
     * 单个极值对象
     */
    public static class Peak {

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

        public Peak() {
        }

        public Peak(Integer peakId, String peakValue) {
            this.peakId = peakId;
            this.peakValue = peakValue;
        }

        public Peak(Integer peakId, String peakName, String peakValue, String peakUnit, String peakDesc) {
            this.peakId = peakId;
            this.peakName = peakName;
            this.peakValue = peakValue;
            this.peakUnit = peakUnit;
            this.peakDesc = peakDesc;
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
            return "Peak{" +
                    "peakId=" + peakId +
                    ", peakName='" + peakName + '\'' +
                    ", peakValue='" + peakValue + '\'' +
                    ", peakUnit='" + peakUnit + '\'' +
                    ", peakDesc='" + peakDesc + '\'' +
                    '}';
        }
    }
}
