package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * DataPackCanPeps
 *
 * @author ChenZhao
 * @version 1.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackCanPeps extends DataPackObject {

    /**
     * 遥控器状态
     */
    private Integer rkelockCmd;
    /**
     * 无钥匙进入状态
     */
    private Integer pkelockCmd;
    /**
     * BCM报警提示
     */
    private Integer pepsbcmAlarm;
    /**
     * 仪表报警提示
     */
    private Integer pepsicuAlarm;
    /**
     * ESCL电源状态（电子转向柱锁）
     */
    private Integer pepsEsclpowerEnable;
    /**
     * 整车电源档位
     */
    private Integer syspowMode;
    /**
     * 钥匙位
     */
    private Integer fobIndex;
    /**
     * 启动请求(高压上电请求)
     */
    private Integer crankRequest;
    /**
     * ESCL状态
     */
    private Integer esclStatus;
    /**
     * 钥匙位置
     */
    private Integer fobPosition;
    /**
     * 认证状态
     */
    private Integer authenticationStatus;
    /**
     * 备用钥匙状态
     */
    private Integer spareKeyStatus;
    /**
     * 启动按键状态1
     */
    private Integer ssbSw1;
    /**
     * 启动按键状态2
     */
    private Integer ssbSw2;
    /**
     * 驾驶门状态
     */
    private Integer driverdDoorStatus;
    /**
     * 副驾门状态
     */
    private Integer passDoorSwStatus;
    /**
     * 尾门状态
     */
    private Integer trunksw;
    /**
     * 制动踏板状态
     */
    private Integer brakeSw;
    /**
     * ACC电源状态
     */
    private Integer accFb;
    /**
     * ON电源状态
     */
    private Integer onFb;
    /**
     * ACC控制信号
     */
    private Integer accCtrl;
    /**
     * ON控制信号
     */
    private Integer onCtrl;
    /**
     * ESCL_UNLOCK_FB
     */
    private Integer esclUnlockFb;
    /**
     * ESCL_LOCK_EN
     */
    private Integer esclLockEn;
    /**
     * 车速
     */
    private float vSpeed;
    /**
     * 电机转速
     */
    private Integer eSpeed;

    public DataPackCanPeps(DataPackObject dataPack) {
        super(dataPack);
    }
}
