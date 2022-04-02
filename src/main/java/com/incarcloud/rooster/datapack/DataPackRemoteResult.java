package com.incarcloud.rooster.datapack;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 远控结果（车门锁，尾门锁，中控锁，闪灯，鸣笛，引擎，空调）
 *
 * @author Aaric, created on 2022-03-22T15:51.
 * @version 3.1.0-SNAPSHOT
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackRemoteResult extends DataPackObject {

    /**
     * 车门锁
     */
    private DoorCarLock doorCarLock;

    /**
     * 尾门锁
     */
    private DoorTailLock doorTailLock;

    /**
     * 中控锁
     */
    private DoorAllLock doorAllLock;

    /**
     * 闪灯
     */
    private FlashLight flashLight;

    /**
     * 鸣笛
     */
    private Whistle whistle;

    /**
     * 引擎
     */
    private Engine engine;

    /**
     * 空调
     */
    private AirConditioner airConditioner;

    public DataPackRemoteResult(DataPackObject object) {
        super(object);
    }

    /**
     * 车门锁控制结果
     */
    @Data
    @Accessors(chain = true)
    public static class DoorCarLock {

        /**
         * 控制结果：0-表示成功，其他异常
         */
        private int status;

        /**
         * 左前门状态：0x01-开，0x02-关，0xFE-异常，0xFF-无效
         */
        private int leftFrontDoorStatus;

        /**
         * 左后门状态：0x01-开，0x02-关，0xFE-异常，0xFF-无效
         */
        private int leftBackDoorStatus;

        /**
         * 右前门状态：0x01-开，0x02-关，0xFE-异常，0xFF-无效
         */
        private int rightFrontDoorStatus;

        /**
         * 右后门状态：0x01-开，0x02-关，0xFE-异常，0xFF-无效
         */
        private int rightBackDoorStatus;
    }

    /**
     * 尾门锁控制结果
     */
    @Data
    @Accessors(chain = true)
    public static class DoorTailLock {

        /**
         * 控制结果：0-表示成功，其他异常
         */
        private int status;

        /**
         * 后备箱状态：0x01-开，0x02-关，0xFE-异常，0xFF-无效
         */
        private int trunkStatus;
    }

    /**
     * 中控锁控制结果
     */
    @Data
    @Accessors(chain = true)
    public static class DoorAllLock {

        /**
         * 控制结果：0-表示成功，其他异常
         */
        private int status;

        /**
         * 中控锁状态：0x01-开，0x02-关，0xFE-异常，0xFF-无效
         */
        private int centralLockStatus;

        /**
         * 左前门状态：0x01-开，0x02-关，0xFE-异常，0xFF-无效
         */
        private int leftFrontDoorStatus;

        /**
         * 左后门状态：0x01-开，0x02-关，0xFE-异常，0xFF-无效
         */
        private int leftBackDoorStatus;

        /**
         * 右前门状态：0x01-开，0x02-关，0xFE-异常，0xFF-无效
         */
        private int rightFrontDoorStatus;

        /**
         * 右后门状态：0x01-开，0x02-关，0xFE-异常，0xFF-无效
         */
        private int rightBackDoorStatus;

        /**
         * 后备箱状态：0x01-开，0x02-关，0xFE-异常，0xFF-无效
         */
        private int trunkStatus;
    }

    /**
     * 闪灯控制结果
     */
    @Data
    @Accessors(chain = true)
    public static class FlashLight {

        /**
         * 控制结果：0-表示成功，其他异常
         */
        private int status;

        /**
         * 左转向灯状态：0x01-开，0x02-关，0xFE-异常，0xFF-无效
         */
        private int leftTurnSignalStatus;

        /**
         * 右转向灯状态：0x01-开，0x02-关，0xFE-异常，0xFF-无效
         */
        private int rightTurnSignalStatus;
    }

    /**
     * 鸣笛控制结果
     */
    @Data
    @Accessors(chain = true)
    public static class Whistle {

        /**
         * 控制结果：0-表示成功，其他异常
         */
        private int status;

        /**
         * 喇叭状态：0x01-开，0x02-关，0xFE-异常，0xFF-无效
         */
        private int trumpetStatus;
    }

    /**
     * 引擎控制结果
     */
    @Data
    @Accessors(chain = true)
    public static class Engine {

        /**
         * 控制结果：0-表示成功，其他异常
         */
        private int status;

        /**
         * ACC状态：0x00-IGN_LOCK（acc lock），0x01-IGN_OFF（acc off），0x02-IGN_ACC（给部分电器供电），0x03-IGN_OFF_ACC（引擎熄火且给所有电器供电），0x04-IGN_RUN（引擎运行），0x05-IGN_START（引擎打火），0x06-IGN_SNA（无效），0xFE-异常，0xFF-无效
         */
        private int accStatus;

        /**
         * 发动机转速，有效值范围：0～65531
         */
        private int engineRpm;
    }

    /**
     * 空调控制结果
     */
    @Data
    @Accessors(chain = true)
    public static class AirConditioner {

        /**
         * 控制结果：0-表示成功，其他异常
         */
        private int status;

        /**
         * 空调状态：0x01-开，0x02-关，0xFE-异常，0xFF-无效
         */
        private int airConditionerStatus;

        /**
         * 空调控制状态：0x01-自动，0x02-手动，0xFE-异常，0xFF-无效
         */
        private int airConditionerControlStatus;

        /**
         * 空调压缩机状态：0x01-开，0x02-关，0xFE-异常，0xFF-无效
         */
        private int airConditionerCompressorStatus;

        /**
         * 空调循环状态：0x01-内循环，0x02-外循环，0xFE-异常，0xFF-无效
         */
        private int airConditionerCycleStatus;
    }
}
