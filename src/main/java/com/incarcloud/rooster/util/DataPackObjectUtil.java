package com.incarcloud.rooster.util;

import com.google.gson.Gson;
import com.incarcloud.rooster.datapack.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.lang3.time.DateFormatUtils;

/**
 * DataPackObject工具类
 *
 * @author Aaric, updated on 2018-09-06T15:27.
 * @version 2.3.0-SNAPSHOT
 */
public class DataPackObjectUtil {

    /**
     * 时间格式化
     */
    public static final String DATE_PATTERN = "yyyyMMddHHmmss";
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat(DATE_PATTERN);

    /**
     * JSON工具类
     */
    private static Gson gson = GsonFactory
            .newInstance(DATE_PATTERN, "_group", "_name", "_version", "_buf")
            .createGson();

    /**
     * 私有构造函数，不准许创建对象
     */
    private DataPackObjectUtil() {
    }

    /**
     * 判断检测时间是否合法，比当前时间晚1个月或者早30分钟视为无效
     *
     * @param detectionTime 检测时间
     * @return
     */
    public static boolean isLegalDetectionDate(Date detectionTime) {
        // 无检测时间
        if (null == detectionTime) {
            return true;
        }

        // 比当前时间晚1个月视为无效
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -1);
        if (cal.getTime().compareTo(detectionTime) > 0) {
            return true;
        }

        // 比当前时间早30分钟视为无效
        cal = Calendar.getInstance();
        cal.add(Calendar.MINUTE, 30);
        if (cal.getTime().compareTo(detectionTime) < 0) {
            return true;
        }

        // 其他情况合法
        return false;
    }

    /**
     * 检查并校正数据检测时间
     *
     * @param dataPackObject 车辆数据对象
     * @param receiveTime    网关接收时间（gather服务器接收时间，非设备检测时间）
     * @return 如果用receiveTime重置了数据检测时间（数据不带有检测时间）则返回true，否则返回false
     */
    @Deprecated
    public static boolean checkAndResetIllegalDetectionTime(DataPackObject dataPackObject, Date receiveTime) {
        // 校验参数合法性
        if (null == dataPackObject || !isLegalDetectionDate(receiveTime)) {
            throw new IllegalArgumentException("required params is null");
        }

        // 补发位置数据特殊处理
        if (dataPackObject instanceof DataPackPosition) {
            DataPackPosition position = (DataPackPosition) dataPackObject;
            // 对于位置数据，位置时间和采集时间哪个合法用哪个，否则采用接收时间
            if (DataPackObjectUtil.isLegalDetectionDate(position.getDetectionTime())) {
                position.setDetectionTime(receiveTime);
            } else if (DataPackObjectUtil.isLegalDetectionDate(position.getPositionTime())) {
                position.setPositionTime(receiveTime);
            } else {
                position.setDetectionTime(receiveTime);
                position.setPositionTime(receiveTime);
            }
            return true;
        } else if (!DataPackObjectUtil.isLegalDetectionDate(dataPackObject.getDetectionTime())) {
            // 非位置数据采集时间非法
            dataPackObject.setDetectionTime(receiveTime);
            return true;
        }

        return false;
    }

    /*-------以下两个方法主要是为了统一采集时间和字符串之间的转换，减少由于日期格式不一致的错误的发生--------------*/

    /**
     * 将检测时间转换为字符串
     *
     * @param detectionTime 数据检测时间
     * @return
     */
    public static String convertDetectionTimeToString(Date detectionTime) {
        //return DATE_FORMAT.format(detectionTime);
        return DateFormatUtils.format(detectionTime, DATE_PATTERN);
    }

    /**
     * 字符串转换为检测时间
     *
     * @param detectionTimeString 时间字符串
     * @return
     */
    public static Date convertStringToDetectionTime(String detectionTimeString) throws ParseException {
        return DATE_FORMAT.parse(detectionTimeString);
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
     * 车辆行程数据
     */
    public static final String TRIP = "TRIP";

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
     * 激活数据
     */
    public static final String ACTIVATION = "ACTIVATION";

    /**
     * 车辆登录数据
     */
    public static final String LOGIN = "LOGIN";

    /**
     * 车辆登出数据
     */
    public static final String LOGOUT = "LOGOUT";

    /**
     * OTA升级完成
     */
    public static final String OTACOMPLETED = "OTACOMPLETED";

    /**
     * 故障诊断
     */
    public static final String FAULT = "FAULT";

    /**
     * 公钥更新请求
     */
    public static final String RSAKEYREQUEST = "RSAKEYREQUEST";

    /**
     * 公钥更新完成
     */
    public static final String RSAKEYCOMPLETED = "RSAKEYCOMPLETED";

    /**
     * 参数设置完成
     */
    public static final String SETCOMPLETED = "SETCOMPLETED";

    /**
     * 报警参数设置完成
     */
    public static final String ALARMCOMPLETED = "ALARMCOMPLETED" ;

    /**
     * 唤醒回馈
     */
    public static final String WAKEUPFEEDBACK = "WAKEUPFEEDBACK";

    /**
     * 参数查询结果
     */
    public static final String PARAMETERQUERY = "PARAMETERQUERY";

    /**
     * T-BOX DTC信息
     */
    public static final String DTCINFOMATION = "DTCINFOMATION" ;

    /**
     * T-BOX DID信息
     */
    public static final String DIDINFOMATION = "DIDINFOMATION" ;

    /**
     * 获取数据类型
     *
     * @param clazz
     * @return
     */
    public static <T extends DataPackObject> String getDataType(Class<T> clazz) {
        if (null != clazz) {
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
            if (clazz.equals(DataPackActivation.class)) {
                //激活数据
                return ACTIVATION;
            }
            if (clazz.equals(DataPackLogIn.class)) {
                // 车辆登录数据
                return LOGIN;
            }
            if (clazz.equals(DataPackLogOut.class)) {
                // 车辆登出数据
                return LOGOUT;
            }
            if (clazz.equals(DataPackTrip.class)) {
                // 车辆登录数据
                return TRIP;
            }
            if (clazz.equals(DataPackOtaCompleted.class)) {
                // OTA升级完成
                return OTACOMPLETED;
            }
            if (clazz.equals(DataPackFault.class)) {
                // 故障诊断
                return FAULT;
            }
            if (clazz.equals(DataPackRsaKeyRequest.class)) {
                // 公钥更新请求
                return RSAKEYREQUEST;
            }
            if (clazz.equals(DataPackRsaKeyCompleted.class)) {
                // 公钥更新完成
                return RSAKEYCOMPLETED;
            }
            if (clazz.equals(DataPackSettingCompleted.class)) {
                // 参数设置完成
                return SETCOMPLETED;
            }
            if (clazz.equals(DataPackAlarmSettingCompleted.class)) {
                // 报警参数设置完成
                return ALARMCOMPLETED ;
            }
            if (clazz.equals(DataPackWakeUpFeedBack.class)) {
                // 唤醒回馈
                return WAKEUPFEEDBACK;
            }
            if (clazz.equals(DataPackParameter.class)) {
                // 参数查询
                return PARAMETERQUERY;
            }
            if (clazz.equals(DataPackDtcInfo.class)) {
                // T-BOX DTC 信息
                return DTCINFOMATION ;
            }
            if (clazz.equals(DataPackDidInfo.class)) {
                // T-BOX DID 信息
                return DIDINFOMATION ;
            }
        }
        return null;
    }

    /**
     * 获取数据类型
     *
     * @param dataPackObject 数据对象
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
        if (ACTIVATION.equals(dataType)) {
            // 激活数据
            return DataPackActivation.class;
        }
        if (LOGIN.equals(dataType)) {
            // LOGIN数据
            return DataPackLogIn.class;
        }
        if (LOGOUT.equals(dataType)) {
            // LOGOUT数据
            return DataPackLogOut.class;
        }
        if (TRIP.equals(dataType)) {
            // 车辆行程数据
            return DataPackTrip.class;
        }
        if (OTACOMPLETED.equals(dataType)) {
            // OTA升级完成
            return DataPackOtaCompleted.class;
        }
        if (FAULT.equals(dataType)) {
            // 故障诊断
            return DataPackFault.class;
        }
        if (RSAKEYREQUEST.equals(dataType)) {
            // 公钥更新请求
            return DataPackRsaKeyRequest.class;
        }
        if (RSAKEYCOMPLETED.equals(dataType)) {
            // 公钥更新完成
            return DataPackRsaKeyCompleted.class;
        }
        if (SETCOMPLETED.equals(dataType)) {
            // 参数设置完成
            return DataPackSettingCompleted.class;
        }
        if (ALARMCOMPLETED.equals(dataType)) {
            // 报警参数设置完成
            return DataPackAlarmSettingCompleted.class ;
        }
        if (WAKEUPFEEDBACK.equals(dataType)) {
            // 唤醒回馈
            return DataPackWakeUpFeedBack.class;
        }
        if (PARAMETERQUERY.equals(dataType)) {
            // 参数查询
            return DataPackParameter.class;
        }
        if (DTCINFOMATION.equals(dataType)) {
            // T-BOX DTC 信息
            return DataPackDtcInfo.class ;
        }
        if (DIDINFOMATION.equals(dataType)) {
            // T-BOX DID 信息
            return DataPackDidInfo.class ;
        }
        return null;
    }
    /*--------------------------------------------------------------------------------------------------------*/
}
