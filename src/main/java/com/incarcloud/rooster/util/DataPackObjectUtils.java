package com.incarcloud.rooster.util;

import com.google.gson.Gson;
import com.incarcloud.rooster.datapack.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Fan Beibei
 * @Description: 描述
 * @date 2017/7/5 14:50
 */
public class DataPackObjectUtils {
    private static final  String DATE_PATTERN = "yyyyMMddHHmmss";
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat(DATE_PATTERN);
    private static Gson gson = GsonFactory.newInstance(DATE_PATTERN, "_group", "_name", "_version", "_buf").createGson();

    /**
     * 最小采集时间
     */
    private static Date minDetectionDate;

    static {
        try {
            minDetectionDate = DATE_FORMAT.parse("19770101000000");
        } catch (ParseException e) {
        }
    }

    private DataPackObjectUtils() {
    }


    /**
     * 判断采集时间是否合法
     *
     * @param detectionDate
     * @return
     */
    public static boolean isLegalDetectionDate(Date detectionDate) {
        if (null == detectionDate || minDetectionDate.compareTo(detectionDate) > 0) {
            return false;
        }

        return true;
    }

    /**
     * 检查并校正数据采集时间
     *
     * @param packObject 数据对象
     * @param reciveTime 数据接收时间（gather服务器接收时间，非设备采集时间）
     * @return 如果用reciveTime重置了数据采集时间（数据不带有采集时间）则返回true，否则返回fasle
     */
    public static boolean checkAndResetIlllegalDetectionDate(DataPackObject packObject, Date reciveTime) {
        if (null == packObject || !isLegalDetectionDate(reciveTime)) {
            throw new IllegalArgumentException();
        }

        if (packObject instanceof DataPackPosition) {
            DataPackPosition position = (DataPackPosition) packObject;
            //对于位置数据，位置时间和采集时间哪个合法用哪个,否则采用接收时间
            if (DataPackObjectUtils.isLegalDetectionDate(position.getPositionTime())) {
                position.setDetectionTime(position.getPositionTime());
            } else if (DataPackObjectUtils.isLegalDetectionDate(position.getDetectionTime())) {
                position.setPositionTime(position.getDetectionTime());
            } else {
                position.setDetectionTime(reciveTime);
                position.setPositionTime(reciveTime);
                return true;
            }
        } else if (!DataPackObjectUtils.isLegalDetectionDate(packObject.getDetectionTime())) {//非位置数据采集时间非法
            packObject.setDetectionTime(reciveTime);
            return true;
        }


        return false;

    }


    /*-------以下两个方法主要是为了统一采集时间和字符串之间的转换，减少由于日期格式不一致的错误的发生--------------*/

    /**
     * 将采集时间转换为字符串
     *
     * @param detectionDate 数据采集时间
     * @return
     */
    public static String convertDetectionDateToString(Date detectionDate) {
        return DATE_FORMAT.format(detectionDate);
    }

    /**
     * 字符串转换为采集时间
     *
     * @param dateStr
     * @return
     */
    public static Date convertStringToDetectionDate(String dateStr) throws ParseException {
        return DATE_FORMAT.parse(dateStr);
    }
    /*--------------------------------------------------------------------------------------------------------*/


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
    /*--------------------------------------------------------------------------------------------------------*/




    /**
     * 获取表名
     *
     * @return
     */
    public static String getTableName(String dataType) {
        return "telemetry";
    }




/*--------------------------------------------------------------------------------------------------------*/
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


    /**
     * 根据数据类型判断是哪种DataPackObject
     *
     * @param dataType
     * @return
     */
    public static Class<? extends DataPackObject> getDataPackObjectClass(String dataType) {

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
/*--------------------------------------------------------------------------------------------------------*/
}
