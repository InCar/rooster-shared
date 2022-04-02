package com.incarcloud.rooster.datapack;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

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
 * @version 2.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
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

    /**
     * 报警参数信息
     */
    private static Map<Integer, Alarm> alarmMap = new HashMap<Integer, Alarm>() {
        {
            //安全气囊报警
            put(0xE001, new Alarm(0, "COM_ALARM_ARIBAG", "安全气囊报警"));
            //碰撞报警
            put(0xE002, new Alarm(0, "COM_ALARM_CRASH", "碰撞报警"));
            //防盗报警
            put(0xE003, new Alarm(0, "COM_ALARM_ANTITHEFT", "防盗报警"));
            //灯光未关闭报警
            put(0xE004, new Alarm(0, "COM_ALARM_LIGHTNOTCLOSED", "灯光未关闭报警"));
            //蓄电池电压异常报警
            put(0xE005, new Alarm(0, "COM_ALARM_BATTERYVOLTAGE", "蓄电池电压异常报警"));
            //胎压异常报警
            put(0xE006, new Alarm(0, "COM_ALARM_TIREPRESSURE", "胎压异常报警"));
            //机油压力报警
            put(0xE007, new Alarm(0, "COM_ALARM_OILPRESSURE", "机油压力报警"));
            //油量指示报警
            put(0xE008, new Alarm(0, "COM_ALARM_FUELQUANTITYINDICATING", "油量指示报警"));
        }
    };

    public static Map<Integer, Alarm> getAlarmMap() {
        return alarmMap;
    }

    /**
     * 单个报警对象
     */
    @Data
    @Accessors(chain = true)
    public static class Alarm {

        /**
         * 报警名称
         */
        private String alarmName;
        /**
         * 报警代码
         */
        private String alarmCode;
        /**
         * 报警属性
         */
        private String alarmValue;
        /**
         * 报警描述
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

        public Alarm(Integer alarmValue, String alarmCode, String alarmName) {
            this.alarmValue = String.valueOf(alarmValue);
            this.alarmCode = alarmCode;
            this.alarmName = alarmName;
        }
    }
}
