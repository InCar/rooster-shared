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
     * DataPack集合（例如极值集合）
     */
    private List<?> dataPackList;

    public DataPackSet(DataPackObject object) {
        super(object);
    }

    public List<?> getDataPackList() {
        return dataPackList;
    }

    public void setDataPackList(List<?> dataPackList) {
        this.dataPackList = dataPackList;
    }
}
