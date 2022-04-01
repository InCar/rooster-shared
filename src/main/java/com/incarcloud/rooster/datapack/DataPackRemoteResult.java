package com.incarcloud.rooster.datapack;

/**
 * 远控结果（车门锁，尾门锁，中控锁，闪灯，鸣笛，引擎，空调）
 *
 * @author Aaric, created on 2022-03-22T15:51.
 * @version 3.1.0-SNAPSHOT
 */
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

    public DoorCarLock getDoorCarLock() {
        return doorCarLock;
    }

    public void setDoorCarLock(DoorCarLock doorCarLock) {
        this.doorCarLock = doorCarLock;
    }

    public DoorTailLock getDoorTailLock() {
        return doorTailLock;
    }

    public void setDoorTailLock(DoorTailLock doorTailLock) {
        this.doorTailLock = doorTailLock;
    }

    public DoorAllLock getDoorAllLock() {
        return doorAllLock;
    }

    public void setDoorAllLock(DoorAllLock doorAllLock) {
        this.doorAllLock = doorAllLock;
    }

    public FlashLight getFlashLight() {
        return flashLight;
    }

    public void setFlashLight(FlashLight flashLight) {
        this.flashLight = flashLight;
    }

    public Whistle getWhistle() {
        return whistle;
    }

    public void setWhistle(Whistle whistle) {
        this.whistle = whistle;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    /**
     * 车门锁控制结果
     */
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

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getLeftFrontDoorStatus() {
            return leftFrontDoorStatus;
        }

        public void setLeftFrontDoorStatus(int leftFrontDoorStatus) {
            this.leftFrontDoorStatus = leftFrontDoorStatus;
        }

        public int getLeftBackDoorStatus() {
            return leftBackDoorStatus;
        }

        public void setLeftBackDoorStatus(int leftBackDoorStatus) {
            this.leftBackDoorStatus = leftBackDoorStatus;
        }

        public int getRightFrontDoorStatus() {
            return rightFrontDoorStatus;
        }

        public void setRightFrontDoorStatus(int rightFrontDoorStatus) {
            this.rightFrontDoorStatus = rightFrontDoorStatus;
        }

        public int getRightBackDoorStatus() {
            return rightBackDoorStatus;
        }

        public void setRightBackDoorStatus(int rightBackDoorStatus) {
            this.rightBackDoorStatus = rightBackDoorStatus;
        }
    }

    /**
     * 尾门锁控制结果
     */
    public static class DoorTailLock {

        /**
         * 控制结果：0-表示成功，其他异常
         */
        private int status;

        /**
         * 后备箱状态：0x01-开，0x02-关，0xFE-异常，0xFF-无效
         */
        private int trunkStatus;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getTrunkStatus() {
            return trunkStatus;
        }

        public void setTrunkStatus(int trunkStatus) {
            this.trunkStatus = trunkStatus;
        }
    }

    /**
     * 中控锁控制结果
     */
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

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getCentralLockStatus() {
            return centralLockStatus;
        }

        public void setCentralLockStatus(int centralLockStatus) {
            this.centralLockStatus = centralLockStatus;
        }

        public int getLeftFrontDoorStatus() {
            return leftFrontDoorStatus;
        }

        public void setLeftFrontDoorStatus(int leftFrontDoorStatus) {
            this.leftFrontDoorStatus = leftFrontDoorStatus;
        }

        public int getLeftBackDoorStatus() {
            return leftBackDoorStatus;
        }

        public void setLeftBackDoorStatus(int leftBackDoorStatus) {
            this.leftBackDoorStatus = leftBackDoorStatus;
        }

        public int getRightFrontDoorStatus() {
            return rightFrontDoorStatus;
        }

        public void setRightFrontDoorStatus(int rightFrontDoorStatus) {
            this.rightFrontDoorStatus = rightFrontDoorStatus;
        }

        public int getRightBackDoorStatus() {
            return rightBackDoorStatus;
        }

        public void setRightBackDoorStatus(int rightBackDoorStatus) {
            this.rightBackDoorStatus = rightBackDoorStatus;
        }

        public int getTrunkStatus() {
            return trunkStatus;
        }

        public void setTrunkStatus(int trunkStatus) {
            this.trunkStatus = trunkStatus;
        }
    }

    /**
     * 闪灯控制结果
     */
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

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getLeftTurnSignalStatus() {
            return leftTurnSignalStatus;
        }

        public void setLeftTurnSignalStatus(int leftTurnSignalStatus) {
            this.leftTurnSignalStatus = leftTurnSignalStatus;
        }

        public int getRightTurnSignalStatus() {
            return rightTurnSignalStatus;
        }

        public void setRightTurnSignalStatus(int rightTurnSignalStatus) {
            this.rightTurnSignalStatus = rightTurnSignalStatus;
        }
    }

    /**
     * 鸣笛控制结果
     */
    public static class Whistle {

        /**
         * 控制结果：0-表示成功，其他异常
         */
        private int status;

        /**
         * 喇叭状态：0x01-开，0x02-关，0xFE-异常，0xFF-无效
         */
        private int trumpetStatus;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getTrumpetStatus() {
            return trumpetStatus;
        }

        public void setTrumpetStatus(int trumpetStatus) {
            this.trumpetStatus = trumpetStatus;
        }
    }

    /**
     * 引擎控制结果
     */
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

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getAccStatus() {
            return accStatus;
        }

        public void setAccStatus(int accStatus) {
            this.accStatus = accStatus;
        }

        public int getEngineRpm() {
            return engineRpm;
        }

        public void setEngineRpm(int engineRpm) {
            this.engineRpm = engineRpm;
        }
    }

    /**
     * 空调控制结果
     */
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

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getAirConditionerStatus() {
            return airConditionerStatus;
        }

        public void setAirConditionerStatus(int airConditionerStatus) {
            this.airConditionerStatus = airConditionerStatus;
        }

        public int getAirConditionerControlStatus() {
            return airConditionerControlStatus;
        }

        public void setAirConditionerControlStatus(int airConditionerControlStatus) {
            this.airConditionerControlStatus = airConditionerControlStatus;
        }

        public int getAirConditionerCompressorStatus() {
            return airConditionerCompressorStatus;
        }

        public void setAirConditionerCompressorStatus(int airConditionerCompressorStatus) {
            this.airConditionerCompressorStatus = airConditionerCompressorStatus;
        }

        public int getAirConditionerCycleStatus() {
            return airConditionerCycleStatus;
        }

        public void setAirConditionerCycleStatus(int airConditionerCycleStatus) {
            this.airConditionerCycleStatus = airConditionerCycleStatus;
        }
    }
}
