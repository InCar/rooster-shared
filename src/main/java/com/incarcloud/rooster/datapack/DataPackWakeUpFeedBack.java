package com.incarcloud.rooster.datapack;

/**
 * 唤醒回馈
 *
 * @author Kong, created on 2018-06-19T11:37.
 * @since 1.2.0-SNAPSHOT
 */
public class DataPackWakeUpFeedBack extends DataPackObject {

    private Integer isSuccess ;

    public DataPackWakeUpFeedBack(DataPackObject object){
        super(object);
    }

    public Integer getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Integer isSuccess) {
        this.isSuccess = isSuccess;
    }

    @Override
    public String toString() {
        return "DataPackWakeUpFeedBack{" +
                "isSuccess=" + isSuccess +
                '}';
    }
}
