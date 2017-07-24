package com.incarcloud.rooster.datapack;

import java.util.List;

/**
 * 数据集合
 *
 * @author sunjun, created on 2017-06-27T14:05.
 * @since 2.0
 */
public class DataPackSet extends DataPackObject {

    /**
     * 极值集合
     */
    private List<?> dataTargetList;

    public DataPackSet(DataPackObject target) {
        super(target);
    }

    public List<?> getDataTargetList() {
        return dataTargetList;
    }

    public void setDataTargetList(List<?> dataTargetList) {
        this.dataTargetList = dataTargetList;
    }
}
