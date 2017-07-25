package com.incarcloud.rooster.util;

import com.google.gson.Gson;
import com.incarcloud.rooster.datapack.*;

/**
 * @author Fan Beibei
 * @Description: 描述
 * @date 2017/7/5 14:50
 */
public class DataPackObjectUtils {
    private static Gson gson = GsonFactory.newInstance("yyyyMMddHHmmssSSS").createGson();

    private DataPackObjectUtils(){}

    /**
     * 转换为json字符串
     * @param target
     * @return
     */
    public static  String  toJson(DataPackObject target){
        return  gson.toJson(target);
    }

    /**
     * json转换为DataTarget对象
     * @param json
     * @return
     */
    public static DataPackObject fromJson(String json){
        return  gson.fromJson(json,DataPackObject.class);
    }

    /**
     * 获取表名
     *
     * @return
     */
    public static  String  getTableName(String dataType){
        return "maxus_tbox";
    }

    public  static String  getDataType(DataPackObject dataPackObject){
        if(dataPackObject instanceof DataPackOverview) {
            // 分发整车数据
            return "OVERVIEW";
        } else if(dataPackObject instanceof DataPackBattery) {
            // 分发电池数据
            return "BATTERY";
        } else if(dataPackObject instanceof DataPackMotor) {
            // 分发驱动电机数据
            return "MOTOR";

        } else if(dataPackObject instanceof DataPackEngine) {
            // 分发发动机数据
            return "ENGINE";
        } else if(dataPackObject instanceof DataPackPosition) {
            // 分发位置数据
            return "POSITION";
        } else if(dataPackObject instanceof DataPackPeak) {
            // 分发极值数据
            return "PEAK";
        } else if(dataPackObject instanceof DataPackAlarm) {
            // 分发报警数据
            return "ALARM";
        } else if(dataPackObject instanceof DataPackDevice) {
            // 分发上报设备信息
            return "DEVICE";
        }else if (dataPackObject instanceof  DataPackSet){

        }
        else if (dataPackObject instanceof  DataPackResult){

        }

        return null;
    }
}
