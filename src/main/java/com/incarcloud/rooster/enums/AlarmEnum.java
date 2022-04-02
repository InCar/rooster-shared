package com.incarcloud.rooster.enums;

/**
 * AlarmEnum
 *
 * @author acemma
 * @version 1.0
 */
public enum AlarmEnum {

    COM_ALARM_ARIBAG(0xE001, "COM_ALARM_ARIBAG", "安全气囊报警"),
    COM_ALARM_CRASH(0xE002, "COM_ALARM_CRASH", "碰撞报警"),
    COM_ALARM_ANTITHEFT(0xE003, "COM_ALARM_ANTITHEFT", "防盗报警"),
    COM_ALARM_LIGHTNOTCLOSED(0xE004, "COM_ALARM_LIGHTNOTCLOSED", "灯光未关闭报警"),
    COM_ALARM_BATTERYVOLTAGE(0xE005, "COM_ALARM_BATTERYVOLTAGE", "蓄电池电压异常报警"),
    COM_ALARM_TIREPRESSURE(0xE006, "COM_ALARM_TIREPRESSURE", "胎压异常报警"),
    COM_ALARM_OILPRESSURE(0xE007, "COM_ALARM_OILPRESSURE", "机油压力报警"),
    COM_ALARM_FUELQUANTITYINDICATING(0xE008, "COM_ALARM_FUELQUANTITYINDICATING", "油量指示报警"),
    COM_ALARM_BACKUPBATTERYENDOFLIFE(0xE009, "COM_ALARM_BACKUPBATTERYENDOFLIFE", "备用电池寿命末期报警");

    private Integer id;

    private String alarmCode;

    private String alarmName;

    AlarmEnum(Integer id, String alarmCode, String alarmName) {
        this.id = id;
        this.alarmCode = alarmCode;
        this.alarmName = alarmName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlarmCode() {
        return alarmCode;
    }

    public void setAlarmCode(String alarmCode) {
        this.alarmCode = alarmCode;
    }

    public String getAlarmName() {
        return alarmName;
    }

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    public static AlarmEnum getById(Integer id) {
        for (AlarmEnum faultEnum : AlarmEnum.values()) {
            if (faultEnum.id.equals(id)) {
                return faultEnum;
            }
        }
        return null;
    }

    public static AlarmEnum getByCode(String code) {
        for (AlarmEnum faultEnum : AlarmEnum.values()) {
            if (faultEnum.alarmCode.equals(code)) {
                return faultEnum;
            }
        }
        return null;
    }
}
