package com.incarcloud.rooster.datatarget;

import java.util.List;

/**
 * 极值数据<br>
 * <i>异常与无效定义：</i><br>
 * <ul>
 *     <li>0xFE-异常，0xFF-无效</li>
 *     <li>0xFF,0xFE-异常，0xFF,0xFF-无效</li>
 * </ul>
 *
 * @author sunjun, created on 2017-06-27T14:05.
 * @since 2.0
 */
public class DataTargetSet extends DataTarget {

    /**
     * 极值集合
     */
    private List<DataTargetPeak> dataTargetPeakList;

    public DataTargetSet() {
    }

    public DataTargetSet(DataTarget target) {
        super(target);
    }

    public List<DataTargetPeak> getDataTargetPeakList() {
        return dataTargetPeakList;
    }

    public void setDataTargetPeakList(List<DataTargetPeak> dataTargetPeakList) {
        this.dataTargetPeakList = dataTargetPeakList;
    }
}
