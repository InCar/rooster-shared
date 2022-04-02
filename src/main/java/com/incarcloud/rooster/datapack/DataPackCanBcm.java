package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * DataPackCanBcm
 *
 * @author ChenZhao
 * @version 1.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackCanBcm extends DataPackObject {

    /**
     * BCM运行状态
     */
    private Integer runStatus;
    /**
     * BCM故障等级
     */
    private Integer errLevel;
    /**
     * 脚刹状态
     */
    private Integer brakeStatus;
    /**
     * 手刹是否拉起
     */
    private Integer handbrakeStatus;
    /**
     * 碰撞是否发生
     */
    private Integer iscrash;
    /**
     * 12V电压档位
     */
    private Integer dc12Level;
    /**
     * 中央门锁是否开
     */
    private Integer centerLockStatus;
    /**
     * 12V蓄电池电压
     */
    private Float dc12Voltage;
    /**
     * 转向灯故障状态
     */
    private Integer errTurnLight;
    /**
     * 左前玻璃升降输出状态
     */
    private Integer leftWinOutStatus;
    /**
     * 右前玻璃升降输出状态
     */
    private Integer rightWinOutStatus;
    /**
     * 后挡风玻璃加热是否开
     */
    private Integer backWinIsHeat;
    /**
     * 左玻璃状态
     */
    private Integer leftWinStatus;
    /**
     * 左玻璃状态
     */
    private Integer rightWinStatus;
    /**
     * 远光灯是否开
     */
    private Integer isRemoteLightOn;
    /**
     * 近光灯是否开
     */
    private Integer isNeerLightOn;
    /**
     * 前雾灯是否开
     */
    private Integer isFrontFogOn;
    /**
     * 后雾灯是否开
     */
    private Integer isBackFogOn;
    /**
     * 昼间行车灯是否开
     */
    private Integer isDrvLightOn;
    /**
     * 转向灯转向方向
     */
    private Integer turnLightOn;
    /**
     * 背光灯（小灯）是否开
     */
    private Integer isSmallLightOn;
    /**
     * 市内阅读灯是否开
     */
    private Integer isReadLightOn;
    /**
     * 制动灯是否开
     */
    private Integer isBrakeLightOn;
    /**
     * 位置灯是否开
     */
    private Integer isPosLightOn;
    /**
     * 倒车灯是否开
     */
    private Integer isReverseLightOn;
    /**
     * 防盗报警状态指示
     */
    private Integer alarmStatus;
    /**
     * 后背门锁状态
     */
    private Integer backDoorLockStatus;
    /**
     * 左前门锁是否锁止
     */
    private Integer leftDoorLockStatus;
    /**
     * 右前门门锁是否锁止
     */
    private Integer rightDoorLockStatus;
    /**
     * BCM_ARMSTATUS
     */
    private Integer bcmArmStatus;
    /**
     * BCM_ESCLPOWERSUPPLY
     */
    private Integer bcmEsclPowerSupply;
    /**
     * 左前门钥匙是否插入
     */
    private Integer isLeftDoorKeyIn;
    /**
     * 安全带是否扣上
     */
    private Integer safetyBeltStatus;
    /**
     * 左前门是否关上
     */
    private Integer isLeftDoorClose;
    /**
     * 右前门是否关上
     */
    private Integer isRightDoorClose;
    /**
     * 紧急灯是否开
     */
    private Integer isEmergecyLightOn;
    /**
     * 雨刮状态
     */
    private Integer wiperStatus;
    /**
     * 前雨刮是否开
     */
    private Integer isWiperStatus;
    /**
     * 前舱盖是否开
     */
    private Integer isFrontHoodOn;
    /**
     * 后背门是否开
     */
    private Integer isBackDoorOn;
    /**
     * 喇叭是否开
     */
    private Integer isHornOn;
    /**
     * 遥控钥匙电池电量是否低（PEPS指令）
     */
    private Integer isKeyVoltageLow;
    /**
     * 非法入侵状态
     */
    private Integer isBrakeStatus;

    public DataPackCanBcm(DataPackObject dataPack) {
        super(dataPack);
    }
}
