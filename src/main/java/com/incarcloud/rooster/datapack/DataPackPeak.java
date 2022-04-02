package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

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
 * @version 2.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackPeak extends DataPackObject {

    /**
     * 极值数据
     */
    private List<Peak> peakList;

    public DataPackPeak(DataPackObject object) {
        super(object);
    }

    /**
     * 单个极值对象
     */
    @Getter
    @Setter
    @Accessors(chain = true)
    @ToString
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
    }
}
