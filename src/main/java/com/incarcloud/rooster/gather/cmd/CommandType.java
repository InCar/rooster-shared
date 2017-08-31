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
    QUERY_ALL_PARAMS,
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
    DELETE_LINE
}
