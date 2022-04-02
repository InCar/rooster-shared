package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * DataPackLogOut
 *
 * @author ChenZhao
 * @version 1.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackLogOut extends DataPackObject {

    /**
     * 登录类型：0-登录
     */
    public static final int LOGIN_TYPE_LOGIN = 0;
    /**
     * 登录类型：1-登出
     */
    public static final int LOGIN_TYPE_LOGOUT = 1;

    /**
     * 登录类型 0 车辆登入 1 车辆登出
     */
    private Integer loginType;
    /**
     * 可充电储能子系统数
     */
    private Integer sysNumber;
    /**
     * 可充电储能系统编码长度
     */
    private Integer codeLength;
    /**
     * 可充电储能系统编码
     */
    private String sysCode;
    /**
     * 登入登出流水号
     */
    private Integer serialNo;

    /**
     * 加密密钥
     */
    private String securityKey;

    /**
     * 软件版本号
     */
    private String softwareVersion;

    public DataPackLogOut(DataPackObject dataPack) {
        super(dataPack);
    }
}
