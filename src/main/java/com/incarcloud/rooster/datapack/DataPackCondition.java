package com.incarcloud.rooster.datapack;/**
 * Created by fanbeibei on 2017/8/29.
 */

import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Fan Beibei
 * @Description: 车身数据
 * @date 2017/8/29 11:05
 */
public class DataPackCondition extends DataPackObject{


    private List<CarCondition> conditionList;
    public DataPackCondition(DataPackObject object) {
        super(object);
    }

    public List<CarCondition> getConditionList() {
        return conditionList;
    }

    public void setConditionList(List<CarCondition> conditionList) {
        this.conditionList = conditionList;
    }

    @Override
    public String toString() {
        return "DataPackCondition{" +
                "conditionList=" + conditionList +
                '}';
    }

    /**
     * 车身各部件的状态
     */
    public static class CarCondition<T> {
        /**
         * 状态名称
         */
        private String conditionName;
        /**
         * 状态值
         */
        private T conditionValue;

        /**
         * 原始数据
         */
        private String base64Data;
        /**
         * 描述
         */
        private String desc;

        public CarCondition() {
        }

        public CarCondition(String conditionName, T conditionValue, String desc) {
            this.conditionName = conditionName;
            this.conditionValue = conditionValue;
            this.desc = desc;
        }

        public CarCondition(String conditionName, T conditionValue, String desc, byte[] data) {
            this.conditionName = conditionName;
            this.conditionValue = conditionValue;
            this.desc = desc;
            this.base64Data = Base64.getEncoder().encodeToString(data);
        }

        /**
         * 获取原始数据
         *
         * @return
         */
        public byte[] getData(){
            return Base64.getDecoder().decode(base64Data);
        }


        public void setBase64Data(String base64Data) {
            this.base64Data = base64Data;
        }

        public String getBase64Data() {
            return base64Data;
        }

        public String getConditionName() {
            return conditionName;
        }

        public T getConditionValue() {
            return conditionValue;
        }

        public String getDesc() {
            return desc;
        }

        public void setConditionName(String conditionName) {
            this.conditionName = conditionName;
        }

        public void setConditionValue(T conditionValue) {
            this.conditionValue = conditionValue;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }


    private static Map<String, String> descMap = new HashMap<>();

    /**
     * 获取状态数据的描述
     */
    public static String getConditionDesc(String conditionName) {
        return descMap.get(conditionName);
    }


    /**
     * 钥匙状态
     */
    public static final String CONDITIONNAME_KEYSTATUS = "key_status";
    /**
     * 点火开关
     */
    public static final String CONDITIONNAME_FIRESWITCH = "fire_switch";
    /**
     * 档位状态
     */
    public static final String CONDITIONNAME_GEARSTATUS = "gear_status";
    /**
     * 防盗监控
     */
    public static final String CONDITIONNAME_ANTI_THEFT_MONITOR = "anti_theft_monitor";
    /**
     * 档位状态（吉利金刚）
     */
    public static final String CONDITIONNAME_GEARSTATUS_GEELY_JG = "gearstatus_GEELY_JG";
    /**
     * 车锁
     */
    public static final String CONDITIONNAME_LOCK = "lock";
    /**
     * 车门
     */
    public static final String CONDITIONNAME_DOOR = "door";
    /**
     * 车灯
     */
    public static final String CONDITIONNAME_LIGHT = "light";
    /**
     * 故障灯
     */
    public static final String CONDITIONNAME_TROUBLE_LIGHT = "trouble_light";
    /**
     * 车窗状态
     */
    public static final String CONDITIONNAME_WINDOW = "window";
    /**
     * 安全带
     */
    public static final String CONDITIONNAME_SAFETY_BELT = "safety_belt";
    /**
     * 空调
     */
    public static final String CONDITIONNAME_AIR_CONDITIONER = "air_conditioner";
    /**
     * 其它
     */
    public static final String CONDITIONNAME_OTHER = "other";
    /**
     * 剩余油量
     */
    public static final String CONDITIONNAME_OIL_REMAIN = "oil_remain";
    /**
     * 仪表里程
     */
    public static final String CONDITIONNAME_ODOMETER_NUM = "odometer_num";
    /**
     * VIN码
     */
    public static final String CONDITIONNAME_VIN = "vin";
    /**
     * 转速
     */
    public static final String CONDITIONNAME_ROTATE_SPEED = "rotate_speed";
    /**
     * 车速
     */
    public static final String CONDITIONNAME_SPEED = "speed";
    /**
     * 续航里程
     */
    public static final String CONDITIONNAME_NEDC = "NEDC";
    /**
     * 平均油耗
     */
    public static final String CONDITIONNAME_AVE_FUEL_CONSUMPTION = "ave_fuel_consumption";
    /**
     * 瞬时油耗
     */
    public static final String CONDITIONNAME_INSTANT_FUEL_CONSUMPTION = "instant_fuel_consumption";
    /**
     * 行驶时间
     */
    public static final String CONDITIONNAME_RUN_TIME = "run_time";
    /**
     * 方向盘转角
     */
    public static final String CONDITIONNAME_WHEEL_CORNER = "wheel_corner";
    /**
     * 轮速 10m/h（10米/小时）
     */
    public static final String CONDITIONNAME_TYRE_SPEED = "tyre_speed";
    /**
     * 胎压
     */
    public static final String CONDITIONNAME_TYRE_PRESSURE = "tyre_pressure";
    /**
     * 动力电压
     */
    public static final String CONDITIONNAME_POWER_VOLTAGE = "power_voltage";
    /**
     * 动力电流
     */
    public static final String CONDITIONNAME_POWER_ELECTRICITY = "power_electricity";
    /**
     * 电池电压
     */
    public static final String CONDITIONNAME_BATTERY_VOLTAGE = "battery_voltage";
    /**
     * 剩余电量
     */
    public static final String CONDITIONNAME_ELECTRIC_REMIAN = "electric_remian";
    /**
     * 油门位置
     */
    public static final String CONDITIONNAME_GAUN_POSITION = "gaun_position";
    /**
     * 尾门开度
     */
    public static final String CONDITIONNAME_TAIL_OPEN = "tail_open";
    /**
     * 刹车踏板力度
     */
    public static final String CONDITIONNAME_BRAKE_FORCE = "brake_force";
    /**
     * 节气门开度
     */
    public static final String CONDITIONNAME_THROTTLE_VALVE = "throttle_valve";
    /**
     * 刹车踏板状态
     */
    public static final String CONDITIONNAME_BRAKE_STATUS = "brake_status";
    /**
     * 助刹状态
     */
    public static final String CONDITIONNAME_VICE_BRAKE_STATUS = "vice_brake_status";
    /**
     * 油门状态
     */
    public static final String CONDITIONNAME_ACCELERATOR_STATUS = "accelerator_status";
    /**
     * 雨刮器状态
     */
    public static final String CONDITIONNAME_WINDSCREEN_WIPER = "windscreen_wiper";
    /**
     * 充电枪状态
     */
    public static final String CONDITIONNAME_EV_CHARGER = "EV_Charger";
    /**
     * 充电状态
     */
    public static final String CONDITIONNAME_CHARGER_STATUS = "charger_status";
    /**
     * 行驶状态（方向）
     */
    public static final String CONDITIONNAME_RUN_STATUS = "run_status";
    /**
     * 升窗档次
     */
    public static final String CONDITIONNAME_WINDOW_LIFT_LEVEL = "window_lift_level";
    /**
     * 就绪状态
     */
    public static final String CONDITIONNAME_READY_STATUS = "ready_status";
    /**
     * 保养状态
     */
    public static final String CONDITIONNAME_UPKEEP_STATUS = "upkeep_status";
    /**
     * 空调风扇档次
     */
    public static final String CONDITIONNAME_AIR_CONDITIONER_FAN_LEVEL = "air_conditioner_fan_level";
    /**
     * 自定义透传数据
     */
    public static final String CONDITIONNAME_COSTOM_DATA = "costom_data";

    static {
        descMap.put(CONDITIONNAME_KEYSTATUS, "钥匙状态");
        descMap.put(CONDITIONNAME_FIRESWITCH, "点火开关");
        descMap.put(CONDITIONNAME_GEARSTATUS, "档位状态");
        descMap.put(CONDITIONNAME_ANTI_THEFT_MONITOR, "防盗监控");
        descMap.put(CONDITIONNAME_GEARSTATUS_GEELY_JG, "档位状态（吉利金刚）");
        descMap.put(CONDITIONNAME_LOCK, "车锁");
        descMap.put(CONDITIONNAME_DOOR, "车门");
        descMap.put(CONDITIONNAME_LIGHT, "车灯");
        descMap.put(CONDITIONNAME_TROUBLE_LIGHT, "故障灯");
        descMap.put(CONDITIONNAME_WINDOW, "车窗状态");
        descMap.put(CONDITIONNAME_SAFETY_BELT, "安全带");
        descMap.put(CONDITIONNAME_AIR_CONDITIONER, "空调");
        descMap.put(CONDITIONNAME_OTHER, "其它");
        descMap.put(CONDITIONNAME_OIL_REMAIN, "剩余油量");
        descMap.put(CONDITIONNAME_ODOMETER_NUM, "仪表里程(单位 ：公里)");
        descMap.put(CONDITIONNAME_VIN, "VIN码");
        descMap.put(CONDITIONNAME_ROTATE_SPEED, "转速(转/分)");
        descMap.put(CONDITIONNAME_SPEED, "车速(10米/小时)");
        descMap.put(CONDITIONNAME_NEDC, "续航里程");
        descMap.put(CONDITIONNAME_AVE_FUEL_CONSUMPTION, "平均油耗");
        descMap.put(CONDITIONNAME_INSTANT_FUEL_CONSUMPTION, "瞬时油耗");
        descMap.put(CONDITIONNAME_RUN_TIME, "行驶时间(单位 ：分)");
        descMap.put(CONDITIONNAME_WHEEL_CORNER, "方向盘转角,单位 ：0.1度（-5400，+ 5400）");
        descMap.put(CONDITIONNAME_TYRE_SPEED, "轮速 10m/h（10米/小时）");
        descMap.put(CONDITIONNAME_TYRE_PRESSURE, "胎压(单位 ：0.1bar)");
        descMap.put(CONDITIONNAME_POWER_VOLTAGE, "动力电压(单位 ：0.1V)");
        descMap.put(CONDITIONNAME_POWER_ELECTRICITY, "动力电流(单位 ：0.1A)");
        descMap.put(CONDITIONNAME_BATTERY_VOLTAGE, "电池电压(单位 ：0.1V)");
        descMap.put(CONDITIONNAME_ELECTRIC_REMIAN, "剩余电量,百分比（单位：1）");
        descMap.put(CONDITIONNAME_GAUN_POSITION, "油门位置,百分比（单位：1）");
        descMap.put(CONDITIONNAME_TAIL_OPEN, "尾门开度,百分比（单位：1）");
        descMap.put(CONDITIONNAME_BRAKE_FORCE, "刹车踏板力度,百分比（单位：1）");
        descMap.put(CONDITIONNAME_THROTTLE_VALVE, "节气门开度,百分比（单位：1）");
        descMap.put(CONDITIONNAME_BRAKE_STATUS, "刹车踏板状态");
        descMap.put(CONDITIONNAME_VICE_BRAKE_STATUS, "助刹状态");
        descMap.put(CONDITIONNAME_ACCELERATOR_STATUS, "油门状态");

        descMap.put(CONDITIONNAME_WINDSCREEN_WIPER, "雨刮器状态");
        descMap.put(CONDITIONNAME_EV_CHARGER, "充电枪状态");
        descMap.put(CONDITIONNAME_CHARGER_STATUS, "充电状态");
        descMap.put(CONDITIONNAME_RUN_STATUS, "行驶状态（方向）");
        descMap.put(CONDITIONNAME_WINDOW_LIFT_LEVEL, "升窗档次");
        descMap.put(CONDITIONNAME_READY_STATUS, "就绪状态");
        descMap.put(CONDITIONNAME_UPKEEP_STATUS, "保养状态");
        descMap.put(CONDITIONNAME_AIR_CONDITIONER_FAN_LEVEL, "空调风扇档次");
        descMap.put(CONDITIONNAME_COSTOM_DATA, "自定义透传数据");
    }




}
