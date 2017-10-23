package com.incarcloud.rooster.datapack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChenZhao
 * @ClassName: DataPackStatus
 * @Description: 记录车辆状态以及车载终端状态信息
 * @date 2017-09-07 09:57
 */
public class DataPackStatus extends DataPackObject {
    /**
     * 状态数据
     */
    private List<Status> statusList = new ArrayList<>();

    public List<Status> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<Status> statusList) {
        this.statusList = statusList;
    }

    public DataPackStatus(DataPackObject dataPack) {
        super(dataPack);
    }

    /**
     * 单个状态信息
     */
    public static class Status {

        public Status() {
        }

        public Status(String statusName, String statusValue, String statusDesc) {
            this.statusName = statusName;
            this.statusValue = statusValue;
            this.statusDesc = statusDesc;
        }

        /**
         * 状态名称
         */
        private String statusName;

        /**
         * 状态属性
         */
        private String statusValue;
        /**
         * 状态描述
         */
        private String statusDesc;

        public String getStatusName() {
            return statusName;
        }

        public void setStatusName(String statusName) {
            this.statusName = statusName;
        }

        public String getStatusValue() {
            return statusValue;
        }

        public void setStatusValue(String statusValue) {
            this.statusValue = statusValue;
        }

        public String getStatusDesc() {
            return statusDesc;
        }

        public void setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
        }

        @Override
        public String toString() {
            return "Status{" +
                    "statusName='" + statusName + '\'' +
                    ", statusValue='" + statusValue + '\'' +
                    ", statusDesc='" + statusDesc + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "DataPackStatus{" +
                "statusList=" + statusList +
                '}';
    }
}
