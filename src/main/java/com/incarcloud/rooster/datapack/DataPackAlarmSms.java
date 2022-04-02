package com.incarcloud.rooster.datapack;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

/**
 * 报警短信对象
 *
 * @author Kong, created on 2019-01-30T11:25.
 * @version 2.4.5-SNAPSHOT
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class DataPackAlarmSms {

    /**
     * IMEI
     */
    private String imei;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 报警时间
     */
    private Date alarmTime;

    /**
     * 报警信息
     */
    private List<AlaramData> alaramData;

    @Data
    @Accessors(chain = true)
    public static class AlaramData {

        /**
         * 报警ID
         */
        private Integer alarmId;

        private String alarmCode;

        public AlaramData() {
        }

        public AlaramData(Integer alarmId, String alarmCode) {
            this.alarmId = alarmId;
            this.alarmCode = alarmCode;
        }
    }
}
