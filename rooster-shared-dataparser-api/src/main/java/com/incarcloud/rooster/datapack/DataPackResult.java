package com.incarcloud.rooster.datapack;

import java.util.List;

/**
 * 设备回复下行命令执行结果
 *
 * @author sunjun, created on 2017-06-27T14:05.
 * @since 2.0
 */
public class DataPackResult extends DataPackObject {
    /**
     * 应答名称
     */
    private String resultName;
    /**
     * 应答包ID
     */
    private Integer packId;
    /**
     * 类型
     */
    private Integer resultType;
    /**
     * 集合数据
     */
    private List<Integer> reusltItems;

    /**
     * 错误代码
     */
    private Integer resultCode;

    public DataPackResult(DataPackObject object) {
        super(object);
    }

    public String getResultName() {
        return resultName;
    }

    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    @Override
    public Integer getPackId() {
        return packId;
    }

    @Override
    public void setPackId(Integer packId) {
        this.packId = packId;
    }

    public Integer getResultType() {
        return resultType;
    }

    public void setResultType(Integer resultType) {
        this.resultType = resultType;
    }

    public List<Integer> getReusltItems() {
        return reusltItems;
    }

    public void setReusltItems(List<Integer> reusltItems) {
        this.reusltItems = reusltItems;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    @Override
    public String toString() {
        return "DataPackResult{" +
                "resultName='" + resultName + '\'' +
                ", packId=" + packId +
                ", resultType=" + resultType +
                ", reusltItems=" + reusltItems +
                ", resultCode=" + resultCode +
                '}';
    }
}
