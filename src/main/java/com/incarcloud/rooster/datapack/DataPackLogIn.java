package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * DataPackLogIn
 *
 * @author ChenZhao
 * @version 1.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackLogIn extends DataPackObject {

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
     * 登入登出流水号
     */
    private Integer serialNo;

    /**
     * 登录类型
     * 有效值范围：0x01：正常登录；0x02：短信唤醒；0xFE表示异常；0xFF表示无效。
     */
    private int loginOpType;

    /**
     * T-BOX设备号
     */
    private String sn;

    /**
     * AES加密密钥
     */
    private String secretKey;

    /**
     * AES偏移量
     */
    private String secretOffset;

    /**
     * 软件版本号
     */
    private String softwareVersion;

    public DataPackLogIn(DataPackObject dataPack) {
        super(dataPack);
    }
}
