package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * DataPackStatus
 *
 * @author ChenZhao
 * @version 1.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackStatus extends DataPackObject {
    /**
     * 状态数据
     */
    private List<Status> statusList = new ArrayList<>();

    public DataPackStatus(DataPackObject dataPack) {
        super(dataPack);
    }

    /**
     * 单个状态信息
     */
    @Getter
    @Setter
    @Accessors(chain = true)
    @ToString
    public static class Status {

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

        public Status() {
        }

        public Status(String statusName, String statusValue, String statusDesc) {
            this.statusName = statusName;
            this.statusValue = statusValue;
            this.statusDesc = statusDesc;
        }
    }
}
