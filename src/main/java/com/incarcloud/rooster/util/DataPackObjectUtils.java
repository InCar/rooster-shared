package com.incarcloud.rooster.util;

import com.google.gson.Gson;
import com.incarcloud.rooster.datapack.*;

/**
 * @author Fan Beibei
 * @Description: 描述
 * @date 2017/7/5 14:50
 */
public class DataPackObjectUtils {
    private static Gson gson = GsonFactory.newInstance("yyyyMMddHHmmssSSS","_group","_name","_version").createGson();

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
    public static DataPackObject fromJson(String json) {
        return gson.fromJson(json, DataPackObject.class);
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
     * 获取数据类型
     *
     * @param dataPackObject
     * @return
     */
    public static String getDataType(DataPackObject dataPackObject) {
        if (dataPackObject instanceof DataPackOverview) {
            // 分发整车数据
            return "OVERVIEW";
        }
        if (dataPackObject instanceof DataPackBattery) {
            // 分发电池数据
            return "BATTERY";
        }
        if (dataPackObject instanceof DataPackMotor) {
            // 分发驱动电机数据
            return "MOTOR";

        }
        if (dataPackObject instanceof DataPackEngine) {
            // 分发发动机数据
            return "ENGINE";
        }
        if (dataPackObject instanceof DataPackPosition) {
            // 分发位置数据
            return "POSITION";
        }
        if (dataPackObject instanceof DataPackPeak) {
            // 分发极值数据
            return "PEAK";
        }
        if (dataPackObject instanceof DataPackAlarm) {
            // 分发报警数据
            return "ALARM";
        }
        if (dataPackObject instanceof DataPackDevice) {
            // 分发上报设备信息
            return "DEVICE";
        }
        if (dataPackObject instanceof DataPackSet) {
            //数据集合
            return "PACKLIST";
        }

        if (dataPackObject instanceof DataPackResult) {
            //设备回复下行命令执行结果
            return "RESULT";
        }

        return null;
    }


    public static Class<?> getDataPackObjectClass(String dataType) {

        if ("OVERVIEW".equals(dataType)) {
            // 分发整车数据
            return DataPackOverview.class;
        }

        if ("BATTERY".equals(dataType)) {
            // 分发电池数据
            return DataPackBattery.class;
        }
        if ("MOTOR".equals(dataType)) {
            // 分发驱动电机数据
            return DataPackMotor.class;

        }
        if ("ENGINE".equals(dataType)) {
            // 分发发动机数据
            return DataPackEngine.class;
        }
        if ("POSITION".equals(dataType)) {
            // 分发位置数据
            return DataPackPosition.class;
        }
        if ("PEAK".equals(dataType)) {
            // 分发极值数据
            return DataPackPeak.class;
        }
        if ("ALARM".equals(dataType)) {
            // 分发报警数据
            return DataPackAlarm.class;
        }
        if ("DEVICE".equals(dataType)) {
            // 分发上报设备信息
            return DataPackDevice.class;
        }
        if ("PACKLIST".equals(dataType)) {
            //数据集合
            return DataPackSet.class;
        }
        if ("RESULT".equals(dataType)) {
            //设备回复下行命令执行结果
            return DataPackResult.class;
        }

        return null;
    }

}
