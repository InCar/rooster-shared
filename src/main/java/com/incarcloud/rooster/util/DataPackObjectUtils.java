package com.incarcloud.rooster.util;

import com.google.gson.Gson;
import com.incarcloud.rooster.datapack.*;

/**
 * @author Fan Beibei
 * @Description: 描述
 * @date 2017/7/5 14:50
 */
public class DataPackObjectUtils {
    private static Gson gson = GsonFactory.newInstance("yyyyMMddHHmmssSSS", "_group", "_name", "_version", "_buf").createGson();

    private DataPackObjectUtils() {
    }

    /**
     * 转换为json字符串
     *
     * @param target
     * @return
     */
    public static String toJson(DataPackObject target) {
        return gson.toJson(target);
    }

    /**
     * json转换为DataTarget对象
     *
     * @param json
     * @return
     */
    public static <T extends DataPackObject> T fromJson(String json, Class<T> clazz) {
        return gson.fromJson(json, clazz);
    }

    /**
     * 获取表名
     *
     * @return
     */
    public static String getTableName(String dataType) {
        return "telemetry";
    }


    /**
     * 整车数据
     */
    public static final String OVERVIEW = "OVERVIEW";
    /**
     * 电池数据
     */
    public static final String BATTERY = "BATTERY";
    /**
     * 驱动电机数据
     */
    public static final String MOTOR = "MOTOR";
    /**
     * 发动机数据
     */
    public static final String ENGINE = "ENGINE";
    /**
     * 位置数据
     */
    public static final String POSITION = "POSITION";
    /**
     * 极值数据
     */
    public static final String PEAK = "PEAK";
    /**
     * 报警数据
     */
    public static final String ALARM = "ALARM";
    /**
     * 上报设备信息
     */
    public static final String DEVICE = "DEVICE";
    /**
     * 设备回复下行命令执行结果
     */
    public static final String RESULT = "RESULT";


    /**
     * 获取数据类型
     *
     * @param dataPackObject
     * @return
     */
    public static String getDataType(DataPackObject dataPackObject) {
        if (dataPackObject instanceof DataPackOverview) {
            // 整车数据
            return OVERVIEW;
        }
        if (dataPackObject instanceof DataPackBattery) {
            // 电池数据
            return BATTERY;
        }
        if (dataPackObject instanceof DataPackMotor) {
            // 驱动电机数据
            return MOTOR;

        }
        if (dataPackObject instanceof DataPackEngine) {
            // 发动机数据
            return ENGINE;
        }
        if (dataPackObject instanceof DataPackPosition) {
            // 位置数据
            return POSITION;
        }
        if (dataPackObject instanceof DataPackPeak) {
            // 极值数据
            return PEAK;
        }
        if (dataPackObject instanceof DataPackAlarm) {
            // 报警数据
            return ALARM;
        }
        if (dataPackObject instanceof DataPackDevice) {
            // 上报设备信息
            return DEVICE;
        }

        if (dataPackObject instanceof DataPackResult) {
            //设备回复下行命令执行结果
            return RESULT;
        }

        return null;
    }


    public static Class<?> getDataPackObjectClass(String dataType) {

        if (OVERVIEW.equals(dataType)) {
            // 分发整车数据
            return DataPackOverview.class;
        }

        if (BATTERY.equals(dataType)) {
            // 分发电池数据
            return DataPackBattery.class;
        }
        if (MOTOR.equals(dataType)) {
            // 分发驱动电机数据
            return DataPackMotor.class;

        }
        if (ENGINE.equals(dataType)) {
            // 分发发动机数据
            return DataPackEngine.class;
        }
        if (POSITION.equals(dataType)) {
            // 分发位置数据
            return DataPackPosition.class;
        }
        if (PEAK.equals(dataType)) {
            // 分发极值数据
            return DataPackPeak.class;
        }
        if (ALARM.equals(dataType)) {
            // 分发报警数据
            return DataPackAlarm.class;
        }
        if (DEVICE.equals(dataType)) {
            // 分发上报设备信息
            return DataPackDevice.class;
        }

        if (RESULT.equals(dataType)) {
            //设备回复下行命令执行结果
            return DataPackResult.class;
        }

        return null;
    }

}