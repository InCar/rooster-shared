package com.incarcloud.rooster.gather.cmd;/**
 * Created by fanbeibei on 2017/7/7.
 */

/**
 * @author Fan Beibei
 * @Description: 下发给车辆的命令类型
 * @date 2017/7/7 17:24
 */
public enum CommandType {

    /**
     * 开车门
     */
    OPEN_DOOR,
    /**
     * 关车门 D2S
     */
    CLOSE_DOOR,
    /**
     * 远程后备箱解锁 D2S
     */
    BACK_DOOR_UNLOCK,
    /**
     * 远程寻车（车辆鸣笛、闪灯） D2S
     */
    FIND_CAR,
    /**
     * 左前车窗控制-上升 D2S
     */
    LEFT_WIN_UP,
    /**
     * 左前车窗控制-下降 D2S
     */
    LEFT_WIN_DOWN,
    /**
     * 右前车窗控制-上升 D2S
     */
    RIGHT_WIN_UP,
    /**
     * 右前车窗控制下降 D2S
     */
    RIGHT_WIN_DOWN,
    /**
     * 空调系统制热控制-开启 D2S
     */
    COND_HEAT_OPEN,
    /**
     * 空调系统制热控制-关闭 D2S
     */
    COND_HEAT_CLOSE,
    /**
     * 空调系统制冷控制-开启 D2S
     */
    COND_COLD_OPEN,
    /**
     * 空调系统制冷控制-关闭 D2S
     */
    COND_COLD_CLOSE,
    /**
     * 车辆动力通断控制-动力导通
     */
    VEHICLE_POWER_ON,
    /**
     * 车辆动力通断控制-动力断开
     */
    VEHICLE_POWER_OFF,
    /**
     * 小灯控制 D2S
     */
    LITTLE_LIGHT_ON,
    /**
     * 小灯控制 D2S
     */
    LITTLE_LIGHT_OFF,
    /**
     * 车机唤醒 D2S
     */
    TBOX_WAKE_UP,
    /**
     * 车机关闭 D2S
     */
    TBOX_POWER_OFF,
    /**
     * 终端升级 D2S
     */
    TBOX_UPDATE,
    /**
     * 报警参数查询 D2S
     */
    ALARM_PARAM_QUERY,//报警参数查询
    /**
     * 报警参数设置 D2S
     */
    ALARM_PARAM_SET,
    /**
     * 获取车辆运行数据 D2S
     */
    GET_RUN_INFO,

    /**
     * 开空调
     */
    START_AIR_CONDITIONER,

    /**
     * 开双闪
     */
    FLASH_LIGHTS_ON,
    /**
     * 补发数据包
     */
    REISSUE_PACK,
    /**
     * 设置终端参数
     */
    SET_PARAMS,
    /**
     * 查询终端参数
     */
    QUERY_PARAMS,
    /**
     * 查询指定终端参数
     */
    QUERY_CUSTOM_PARAMS,
    /**
     * 终端控制
     */
    TERMINAL_CONTROL,
    /**
     * 查询终端属性
     */
    QUERY_ALL_ATTRS,
    /**
     * 下发终端升级包
     */
    UPGRADE,
    /**
     * 位置信息查询
     */
    QUERY_POSITION,
    /**
     * 临时位置跟踪控制
     */
    TRACKING_POSITION,
    /**
     * 人工确认报警消息
     */
    CONFIRM_ALARM,
    /**
     * 文本信息下发
     */
    SEND_TEXT,
    /**
     * 事件设置
     */
    SET_EVENT,
    /**
     * 提问下发
     */
    QUIZ,
    /**
     * 信息点播菜单设置
     */
    SET_INFO_DEMAND_MENU,
    /**
     * 信息服务
     */
    INFO_SERVICE,
    /**
     * 电话回拨
     */
    PHONE_DIAL,
    /**
     * 设置电话本
     */
    SET_PHONE_LIST,
    /**
     * 车辆控制
     */
    VEHICLE_CONTROL,
    /**
     * 设置圆形区域
     */
    SET_AREA_CIRCULAR,
    /**
     * 删除圆形区域
     */
    DELETE_AREA_CIRCULAR,
    /**
     * 设置矩形区域
     */
    SET_AREA_RECTANGLE,
    /**
     * 删除矩形区域
     */
    DELETE_AREA_RECTANGLE,
    /**
     * 设置多边形区域
     */
    SET_AREA_POLYGON,
    /**
     * 删除多边形区域
     */
    DELETE_AREA_POLYGON,
    /**
     * 设置路线
     */
    SET_LINE,
    /**
     * 删除路线
     */
    DELETE_LINE,
    /**
     * 上报驾驶员身份信息请求
     */
    SEND_DRIVER_ID,
    /**
     * 摄像头立即拍摄命令
     */
    TAKE_PHOTO,
    /**
     * 存储多媒体数据检索
     */
    QUERY_MEDIA,
    /**
     * 存储多媒体数据上传命令
     */
    UPDATE_MEDIA,
    /**
     * 录音开始命令
     */
    SOUND_RECORDING,
    /**
     * 单条存储多媒体数据检索上传命令
     */
    UPDATE_SINGLE_MEDIA,
    /**
     * RSA 公钥
     */
    RSA,
    /**
     * OTA升级
     */
    OTA,

    /**
     * 远程诊断
     */
    DIAGNOSIS,

    /**
     * 请求车辆运行数据
     */
    REQUEST_VEHICLE_DATA,

    /**
     * 异常唤醒
     */
    ABNORMAL_WAKE_UP

}
