package com.incarcloud.rooster.gather.cmd;

/**
 * 下发给车辆的命令类型
 *
 * @author Fan Beibei
 * @version 1.0
 */
public enum CommandType {
    /**
     * 0x14-公钥下发
     */
    RSA,
    /**
     * 0x20-参数查询命令
     */
    PARAMS_QUERY,
    /**
     * 0x21-参数设置命令
     */
    PARAMS_SET,
    /**
     * 0x23-OTA升级
     */
    OTA,
    /**
     * 0x30-自诊断DTC信息查询
     */
    DIAGNOSIS_DTC,
    /**
     * 0x31-自诊断DID信息查询
     */
    DIAGNOSIS_DID,
    /**
     * 0x84-报警参数查询
     */
    ALARM_PARAM_QUERY,
    /**
     * 0x85-报警参数设置
     */
    ALARM_PARAM_SET,
    /**
     * 0x86-平台请求车辆运行信息
     */
    VEHICLE_DATA_REQUEST,
    /**
     * 0x87-远程诊断（故障）
     */
    DIAGNOSIS,
    /**
     * 0x88-TBox异常唤醒回馈
     */
    TBOX_WAKE_UP_ERROR,
    /**
     * 0x89-TBox日志上报
     */
    TBOX_UPLOAD_LOG,
    /**
     * 0x83-车辆控制（0x01-车门锁控制）
     */
    VEHICLE_CTRL_DOOR_CAR_LOCK,
    /**
     * 0x83-车辆控制（0x02-尾门锁控制）
     */
    VEHICLE_CTRL_DOOR_TAIL_LOCK,
    /**
     * 0x83-车辆控制（0x03-中控锁控制）
     */
    VEHICLE_CTRL_DOOR_ALL_LOCK,
    /**
     * 0x83-车辆控制（0x04-闪灯控制）
     */
    VEHICLE_CTRL_FLASH_LIGHT,
    /**
     * 0x83-车辆控制（0x05-鸣笛控制）
     */
    VEHICLE_CTRL_WHISTLE,
    /**
     * 0x83-车辆控制（0x06-引擎控制）
     */
    VEHICLE_CTRL_ENGINE,
    /**
     * 0x83-车辆控制（0x07-空调控制）
     */
    VEHICLE_CTRL_AIR_CONDITIONER,
    /**
     * 0x8A-SDC密钥下发
     */
    SDC_SECRET_KEY_SEND
}
