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
    private static final String DATE_PATTERN = "yyyyMMddHHmmss";
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
     * 电池数据
     */
    public static final String BATTERYTEMP = "BATTERYTEMP";
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
     * 行为位置数据
     */
    public static final String BEHAVIOR = "BEHAVIOR";

    /**
     * 标识牌识别
     */
    public static final String SIGN_INFO = "SIGN_INFO";


    /**
     * 标识牌类型
     */
    public static final String SIGN_TYPE = "SIGN_TYPE";

    /**
     * 车信号
     */
    public static final String CAR_SIGNALS = "CAR_SIGNALS";

    /**
     * 整车数据
     */
    public static final String CONDITION = "CONDITION";

    /**
     * 心跳数据
     */
    public static final String HEARTBEAT = "HEARTBEAT";
    /**
     * 注册数据
     */
    public static final String REGISTER = "REGISTER";
    /**
     * 注销数据
     */
    public static final String REVOKE = "REVOKE";
    /**
     * 终端鉴权数据
     */
    public static final String AUTHENTICATION = "AUTHENTICATION";
    /**
     * 驾驶员数据
     */
    public static final String DRIVER = "DRIVER";
    /**
     * 多媒体数据
     */
    public static final String MEDIA = "MEDIA";
    /**
     * RSA数据
     */
    public static final String RSA = "RSA";

    /**
     * ADAS数据
     */
    public static final String ADAS = "ADAS";

    /**
     * BCM数据
     */
    public static final String BCM = "BCM";

    /**
     * BMS数据
     */
    public static final String BMS = "BMS";

    /**
     * EPS数据
     */
    public static final String EPS = "EPS";

    /**
     * HVAC数据
     */
    public static final String HVAC = "HVAC";

    /**
     * MC数据
     */
    public static final String MC = "MC";

    /**
     * OBC数据
     */
    public static final String OBC = "OBC";

    /**
     * PEPS数据
     */
    public static final String PEPS = "PEPS";

    /**
     * VMS数据
     */
    public static final String VMS = "VMS";

    /**
     * can模块状态数据
     */
    public static final String STATUS = "STATUS";
    /**
     * 车辆登录数据
     */
    public static final String LOGINOUT = "LOGINOUT";

    /**
     * 获取数据类型
     *
     * @param clazz
     * @return
     */
    public static <T extends DataPackObject> String getDataType(Class<T> clazz) {
        if(null != clazz) {
            if (clazz.equals(DataPackOverview.class)) {
                // 整车数据
                return OVERVIEW;
            }
            if (clazz.equals(DataPackBattery.class)) {
                // 电池数据
                return BATTERY;
            }
            if (clazz.equals(DataPackTemperature.class)) {
	            // 电池温度数据
	            return BATTERYTEMP;
        	}
            if (clazz.equals(DataPackMotor.class)) {
                // 驱动电机数据
                return MOTOR;

            }
            if (clazz.equals(DataPackEngine.class)) {
                // 发动机数据
                return ENGINE;
            }
            if (clazz.equals(DataPackPosition.class)) {
                // 位置数据
                return POSITION;
            }
            if (clazz.equals(DataPackPeak.class)) {
                // 极值数据
                return PEAK;
            }
            if (clazz.equals(DataPackAlarm.class)) {
                // 报警数据
                return ALARM;
            }
            if (clazz.equals(DataPackDevice.class)) {
                // 上报设备信息
                return DEVICE;
            }
            if (clazz.equals(DataPackResult.class)) {
                // 设备回复下行命令执行结果
                return RESULT;
            }
            if (clazz.equals(DataPackBehavior.class)) {
                // 行为位置数据
                return BEHAVIOR;
            }
            if (clazz.equals(DataPackCondition.class)) {
                return CONDITION;
            }
            if (clazz.equals(DataPackSignInfo.class)) {
                return SIGN_INFO;
            }
            if (clazz.equals(DataPackSignType.class)) {
                return SIGN_TYPE;
            }
            if (clazz.equals(DataPackCarSignals.class)) {
                return CAR_SIGNALS;
            }
            if (clazz.equals(DataPackHeartbeat.class)) {
                // 心跳数据
                return HEARTBEAT;
            }
            if (clazz.equals(DataPackRegister.class)) {
                // 注册数据
                return REGISTER;
            }
            if (clazz.equals(DataPackRevoke.class)) {
                // 注销数据
                return REVOKE;
            }
            if (clazz.equals(DataPackAuthentication.class)) {
                // 终端鉴权数据
                return AUTHENTICATION;
            }
            if (clazz.equals(DataPackDriver.class)) {
                // 驾驶员数据
                return DRIVER;
            }
            if (clazz.equals(DataPackMedia.class)) {
                // 多媒体数据
                return MEDIA;
            }
            if (clazz.equals(DataPackRsa.class)) {
                // RSA数据
                return RSA;
            }
            if (clazz.equals(DataPackCanAdas.class)) {
                // ADAS数据
                return ADAS;
            }
            if (clazz.equals(DataPackCanBcm.class)) {
                // BCM数据
                return BCM;
            }
            if (clazz.equals(DataPackCanBms.class)) {
                // BMS数据
                return BMS;
            }
            if (clazz.equals(DataPackCanEps.class)) {
                // EPS数据
                return EPS;
            }
            if (clazz.equals(DataPackCanHvac.class)) {
                // HVAC数据
                return HVAC;
            }
            if (clazz.equals(DataPackCanMc.class)) {
                // MC数据
                return MC;
            }
            if (clazz.equals(DataPackCanObc.class)) {
                // OBC数据
                return OBC;
            }
            if (clazz.equals(DataPackCanPeps.class)) {
                // PEPS数据
                return PEPS;
            }
            if (clazz.equals(DataPackCanVms.class)) {
                // VMS数据
                return VMS;
            }
            if (clazz.equals(DataPackStatus.class)) {
                // CAN STATUS数据
                return STATUS;
            }
            if (clazz.equals(DataPackLogInOut.class)) {
                //车辆登录数据
                return LOGINOUT;
            }
        }
        return null;
    }

    /**
     * 获取数据类型
     *
     * @param dataPackObject
     * @return
     */
    public static String getDataType(DataPackObject dataPackObject) {
        return getDataType(dataPackObject.getClass());
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
        if (BATTERYTEMP.equals(dataType)) {
            // 分发电池温度数据
            return DataPackTemperature.class;
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
            // 设备回复下行命令执行结果
            return DataPackResult.class;
        }

        if (BEHAVIOR.equals(dataType)) {
            // 行为位置数据
            return DataPackBehavior.class;
        }

        if (CONDITION.equals(dataType)) {
            return DataPackCondition.class;
        }

        if (SIGN_INFO.equals(dataType)) {
            return DataPackSignInfo.class;
        }

        if (SIGN_TYPE.equals(dataType)) {
            return DataPackSignType.class;
        }

        if (CAR_SIGNALS.equals(dataType)) {
            return DataPackCarSignals.class;
        }

        if (HEARTBEAT.equals(dataType)) {
            // 心跳数据
            return DataPackHeartbeat.class;
        }
        if (REGISTER.equals(dataType)) {
            // 注册数据
            return DataPackRegister.class;
        }
        if (REVOKE.equals(dataType)) {
            // 注销数据
            return DataPackRevoke.class;
        }
        if (AUTHENTICATION.equals(dataType)) {
            // 终端鉴权数据
            return DataPackAuthentication.class;
        }
        if (DRIVER.equals(dataType)) {
            // 驾驶员数据
            return DataPackDriver.class;
        }
        if (MEDIA.equals(dataType)) {
            // 多媒体数据
            return DataPackMedia.class;
        }
        if (RSA.equals(dataType)) {
            // RSA数据
            return DataPackRsa.class;
        }
        if (ADAS.equals(dataType)) {
            // ADAS数据
            return DataPackCanAdas.class;
        }
        if (BCM.equals(dataType)) {
            // BCM数据
            return DataPackCanBcm.class;
        }
        if (BMS.equals(dataType)) {
            // BMS数据
            return DataPackCanBms.class;
        }
        if (EPS.equals(dataType)) {
            // EPS数据
            return DataPackCanEps.class;
        }
        if (HVAC.equals(dataType)) {
            // HVAC数据
            return DataPackCanHvac.class;
        }
        if (MC.equals(dataType)) {
            // MC数据
            return DataPackCanMc.class;
        }
        if (OBC.equals(dataType)) {
            // OBC数据
            return DataPackCanObc.class;
        }
        if (PEPS.equals(dataType)) {
            // PEPS数据
            return DataPackCanPeps.class;
        }
        if (VMS.equals(dataType)) {
            // VMS
            return DataPackCanVms.class;
        }
        if (STATUS.equals(dataType)) {
            // STATUS数据
            return DataPackStatus.class;
        }
        if (LOGINOUT.equals(dataType)) {
            // LOGINOUT数据
            return DataPackLogInOut.class;
        }

        return null;
    }
/*--------------------------------------------------------------------------------------------------------*/
}
