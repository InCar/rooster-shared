package com.incarcloud.rooster.datapack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * 报警参数信息
     */
    public static final Map<Integer,Alarm> alarmMap = new HashMap<Integer,Alarm>(){
        {
            //安全气囊告警
            put(0xE001,new DataPackAlarm.Alarm(0,"COM_ariBagAlarm","安全气囊告警")) ;
            //碰撞告警
            put(0xE002,new DataPackAlarm.Alarm(0,"COM_crashAlarm","碰撞告警")) ;
            //防盗告警
            put(0xE003,new DataPackAlarm.Alarm(0,"COM_antiTheftAlarm","防盗告警")) ;
            //灯光未关闭告警
            put(0xE004,new DataPackAlarm.Alarm(0,"COM_lightNotClosedAlarm","灯光未关闭告警")) ;
            //蓄电池电压异常告警
            put(0xE005,new DataPackAlarm.Alarm(0,"COM_batteryVoltageAlarm","蓄电池电压异常告警")) ;
            //胎压异常告警
            put(0xE006,new DataPackAlarm.Alarm(0,"COM_tirePressureAlarm","胎压异常告警")) ;
        }
    };

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
        
        /**
         * 用户自定义信息
         */
        private String customInfo;

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

        public Alarm(Integer alarmValue, String alarmCode, String alarmName){
            this.alarmValue = String.valueOf(alarmValue) ;
            this.alarmCode = alarmCode ;
            this.alarmName = alarmName ;
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

		/**  
		 * 获取customInfo  
		 * @return customInfo customInfo  
		 */
		public String getCustomInfo() {
			return customInfo;
		}
		

		/**  
		 * 设置customInfo  
		 * @param customInfo customInfo  
		 */
		public void setCustomInfo(String customInfo) {
			this.customInfo = customInfo;
		}
		
    }
}
