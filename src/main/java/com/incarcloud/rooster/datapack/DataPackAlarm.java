package com.incarcloud.rooster.datapack;

import java.util.List;

/**
 * 报警数据<br>
 * <i>异常与无效定义：</i><br>
 * <ul>
 *     <li>0xFE-异常，0xFF-无效</li>
 *     <li>0xFF,0xFE-异常，0xFF,0xFF-无效</li>
 * </ul>
 *
 * @author Aaric, created on 2017-06-27T14:05.
 * @since 2.0
 */
public class DataPackAlarm extends DataPackObject {

    /**
     * 报警数据
     */
    private List<Alarm> alarmList;
    /**
     * 位置数据
     */
    private DataPackPosition position;

    public DataPackAlarm(DataPackObject object) {
        super(object);
    }

    public List<Alarm> getAlarmList() {
        return alarmList;
    }

    public void setAlarmList(List<Alarm> alarmList) {
        this.alarmList = alarmList;
    }

    public DataPackPosition getPosition() {
        return position;
    }

    public void setPosition(DataPackPosition position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "DataPackAlarm{" +
                "alarmList=" + alarmList +
                ", position=" + position +
                '}';
    }

    /**
     * 单个报警对象
     */
    public static class Alarm {

        /**
         * 报警名称
         */
        private String alarmName;
        /**
         * 故障代码
         */
        private String alarmCode;
        /**
         * 故障属性
         */
        private String alarmValue;
        /**
         * 故障描述
         */
        private String alarmDesc;
        /**
         * 报警等级
         */
        private Integer alarmLevel;
        /**
         * 报警等级描述
         */
        private String alarmLevelDesc;

        public Alarm() {
        }

        public Alarm(String alarmName) {
            this.alarmName = alarmName;
        }

        public Alarm(String alarmName, Integer alarmCode, String alarmDesc) {
            this.alarmName = alarmName;
            this.alarmCode = String.valueOf(alarmCode);
            this.alarmDesc = alarmDesc;
        }

        public String getAlarmName() {
            return alarmName;
        }

        public void setAlarmName(String alarmName) {
            this.alarmName = alarmName;
        }

        public String getAlarmCode() {
            return alarmCode;
        }

        public void setAlarmCode(String alarmCode) {
            this.alarmCode = alarmCode;
        }

        public String getAlarmValue() {
            return alarmValue;
        }

        public void setAlarmValue(String alarmValue) {
            this.alarmValue = alarmValue;
        }

        public String getAlarmDesc() {
            return alarmDesc;
        }

        public void setAlarmDesc(String alarmDesc) {
            this.alarmDesc = alarmDesc;
        }

        public Integer getAlarmLevel() {
            return alarmLevel;
        }

        public void setAlarmLevel(Integer alarmLevel) {
            this.alarmLevel = alarmLevel;
        }

        public String getAlarmLevelDesc() {
            return alarmLevelDesc;
        }

        public void setAlarmLevelDesc(String alarmLevelDesc) {
            this.alarmLevelDesc = alarmLevelDesc;
        }

        @Override
        public String toString() {
            return "Alarm{" +
                    "alarmName='" + alarmName + '\'' +
                    ", alarmCode='" + alarmCode + '\'' +
                    ", alarmValue='" + alarmValue + '\'' +
                    ", alarmDesc='" + alarmDesc + '\'' +
                    ", alarmLevel=" + alarmLevel +
                    ", alarmLevelDesc='" + alarmLevelDesc + '\'' +
                    '}';
        }
    }
}
