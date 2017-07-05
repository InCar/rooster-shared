package com.incarcloud.rooster.datatarget;

import java.util.List;

/**
 * 数据集合
 *
 * @author sunjun, created on 2017-06-27T14:05.
 * @since 2.0
 */
public class DataTargetSet extends DataTarget {

    /**
     * 极值集合
     */
    private List<?> dataTargetList;

    public DataTargetSet() {
    }

    public DataTargetSet(DataTarget target) {
        super(target);
    }

    public List<?> getDataTargetList() {
        return dataTargetList;
    }

    public void setDataTargetList(List<?> dataTargetList) {
        this.dataTargetList = dataTargetList;
    }
}
