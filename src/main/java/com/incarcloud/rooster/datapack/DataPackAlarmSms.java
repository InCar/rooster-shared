package com.incarcloud.rooster.datapack;

import java.util.Date;
import java.util.List;

/**
 * 报警短信对象
 *
 * @author Kong, created on 2019-01-30T11:25.
 * @since 2.4.5-SNAPSHOT
 */
public class DataPackAlarmSms {

    /**
     * IMEI
     */
    private String imei ;

    /**
     * 经度
     */
    private Double longitude ;

    /**
     * 纬度
     */
    private Double latitude ;

    /**
     * 报警时间
     */
    private Date alarmTime ;

    /**
     * 报警信息
     */
    private List<AlaramData> alaramData ;

    public static class AlaramData {

        /**
         * 报警ID
         */
        private Integer alarmId ;

        private String alarmCode ;

        public AlaramData(){

        }

        public AlaramData(Integer alarmId, String alarmCode){
            this.alarmId = alarmId ;
            this.alarmCode = alarmCode ;
        }

        public Integer getAlarmId() {
            return alarmId;
        }

        public void setAlarmId(Integer alarmId) {
            this.alarmId = alarmId;
        }

        public String getAlarmCode() {
            return alarmCode;
        }

        public void setAlarmCode(String alarmCode) {
            this.alarmCode = alarmCode;
        }
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Date getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(Date alarmTime) {
        this.alarmTime = alarmTime;
    }

    public List<AlaramData> getAlaramData() {
        return alaramData;
    }

    public void setAlaramData(List<AlaramData> alaramData) {
        this.alaramData = alaramData;
    }
}
