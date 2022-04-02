package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 整车数据<br>
 * <i>异常与无效定义：</i><br>
 * <ul>
 * <li>0xFE-异常，0xFF-无效</li>
 * <li>0xFF,0xFE-异常，0xFF,0xFF-无效</li>
 * </ul>
 *
 * @author Aaric, created on 2017-06-27T14:04.
 * @version 2.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
public class DataPackOverview extends DataPackObject {

    /**
     * <i>车辆状态</i><br>
     * <ul>
     * <li>0x01-启动(keyon)</li>
     * <li>0x02-运行(run)</li>
     * <li>0x03-熄火(keyoff)</li>
     * <li>0x04-其他状态</li>
     * <li>0xFE：表示异常</li>
     * <li>0xFF：表示无效</li>
     * </ul>
     */
    private Integer carStatus;

    /**
     * 运行模式 0x01: 纯电； 0x02：混动； 0x03：燃油； 0xFE 表示异常； 0xFF 表示无效
     */
    private Integer runStatus;
    /**
     * 实时车速 有效值范围： 0～2200（表示 0 km/h～220
     * km/h），最小计量单元：0.1km/h，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效。
     */
    private float vehicleSpeed;
    /**
     * 档位 bit0-bit3 =0000 空档 =0001 1 档 =0010 2 档 =0011 3 档 =0100 4 档 =0101 5 档
     * =0110 6 档 =1101 L档 =1011 S档 =1100 倒档 =1110 自动 D 档 =1111 停车 P 档
     */
    private Integer clutchStatus;
    /**
     * 制动状态 bit4 1：制动有效 0：制动无效
     */
    private Integer brakeStatus;

    /**
     * 驱动状态 bit5 1：驱动有效 0：驱动无效
     */
    private Integer driveStatus;
    /**
     * 绝缘电阻 有效范围 0~60000（表示 0KΩ~60000KΩ），最小计量单元： 1KΩ；“0xFF,0xFF”表示无效
     */
    private Integer issueValue;
    /*
     * ===========================电动车部分end======================================
     * ===
     */
    /**
     * 电压（V）
     */
    private Float voltage;
    /**
     * 位置信息
     */
    private DataPackPosition position;
    /**
     * 本次发动机运行时间(秒)
     */
    private Integer runTime;
    /**
     * 本次行驶距离(米)
     */
    private Integer currentMileage;
    /**
     * 本次平均油耗(0.01L/100km)<br>
     * /100F转Float
     */
    private Float currentAvgOilUsed;
    /**
     * 累计行驶里程(km)
     */
    private Double mileage;
    /**
     * 累计平均油耗(0.01L/100km) /100F转Float
     */
    private Float avgOilUsed;
    /**
     * 本行程车速分组统计
     */
    private List<Speed> speedGroup;
    /**
     * 本次急加速次数
     */
    private Integer speedUpTimes;
    /**
     * 本次急减速次数
     */
    private Integer speedDownTimes;
    /**
     * 本次急转向次数
     */
    private Integer sharpTurnTimes;
    /**
     * 本次时速超速行驶时间(秒)
     */
    private Integer speedingTime;
    /**
     * 最高车速(km/h)
     */
    private Integer maxSpeed;

    /************************** 广三协议新增start ***************************************/
    /**
     * 平均车速<br>
     * 有效值范围： 0～2200（表示 0 km/h～220 km/h）<br>
     * 最小计量单元：0.1km/h<br>
     * 0xFF,0xFE表示异常<br>
     * 0xFF,0xFF表示无效<br>
     */
    private Float avgSpeed;
    /**
     * 电流（A）
     */
    private Float current;
    /**
     * 燃油量<br>
     * 有效值范围：0～250，最小计量单元：1升<br>
     * “0xFE”表示异常<br>
     * “0xFF”表示无效<br>
     */
    private Integer fuelQuantity;

    /**
     * 左前轮胎压<br>
     * 有效值范围：0～250，最小计量单元：kpa，“0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer leftFrontTirePressure;

    /**
     * 右前轮胎压<br>
     * 有效值范围：0～250，最小计量单元：kpa，“0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer rightFrontTirePressure;

    /**
     * 左后轮胎压<br>
     * 有效值范围：0～250，最小计量单元：kpa，“0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer leftRearTirePressure;

    /**
     * 右后轮胎压<br>
     * 有效值范围：0～250，最小计量单元：kpa，“0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer rightRearTirePressure;
    /**
     * <i>左前门状态<i><br>
     * <ul>
     * <li>0x01：开</li>
     * <li>0x02：关</li>
     * <li>“0xFE”表示异常，“0xFF”表示无效</li>
     * </ul>
     */
    private Integer leftFrontDoorStatus;

    /**
     * 左后门状态
     * <ul>
     * <li>0x01：开</li>
     * <li>0x02：关</li>
     * <li>“0xFE”表示异常，“0xFF”表示无效</li>
     * </ul>
     */
    private Integer leftBackDoorStatus;

    /**
     * 右前门状态
     * <ul>
     * <li>0x01：开</li>
     * <li>0x02：关</li>
     * <li>“0xFE”表示异常，“0xFF”表示无效</li>
     * </ul>
     */
    private Integer rightFrontDoorStatus;

    /**
     * 右后门状态
     * <ul>
     * <li>0x01：开</li>
     * <li>0x02：关</li>
     * <li>“0xFE”表示异常，“0xFF”表示无效</li>
     * </ul>
     */
    private Integer rightBackDoorStatus;

    /**
     * 中控锁状态
     * 0x01：开；
     * 0x02：关，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer centralLockStatus;

    /**
     * 门锁状态
     * 0x01：开；
     * 0x02：关，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer doorLockStatus;

    /**
     * 主驾门锁状态
     * 0x01：开；
     * 0x02：关，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer driveDoorLockStatus;

    /**
     * 副驾门锁状态
     * 0x01：开；
     * 0x02：关，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer passengerDoorLockStatus;

    /**
     * 后门锁状态
     * 0x01：开；
     * 0x02：关，
     * “0xFE”表示异常，
     * “0xFF”表示无效。
     */
    private Integer backDoorLockStatus;

    /**
     * 前盖状态
     * <ul>
     * <li>0x01：开</li>
     * <li>0x02：关</li>
     * <li>“0xFE”表示异常，“0xFF”表示无效</li>
     * </ul>
     */
    private Integer frontCover;
    /**
     * 后备箱状态
     * <ul>
     * <li>0x01：开</li>
     * <li>0x02：关</li>
     * <li>“0xFE”表示异常，“0xFF”表示无效</li>
     * </ul>
     */
    private Integer trunkStatus;

    /**
     * 左前窗状态
     * <ul>
     * <li>0x01：开</li>
     * <li>0x02：关</li>
     * <li>“0xFE”表示异常，“0xFF”表示无效</li>
     * </ul>
     */
    private Integer leftFrontWindowStatus;

    /**
     * 右前窗状态
     * <ul>
     * <li>0x01：开</li>
     * <li>0x02：关</li>
     * <li>“0xFE”表示异常，“0xFF”表示无效</li>
     * </ul>
     */
    private Integer rightFrontWindowStatus;

    /**
     * 左后窗状态
     * <ul>
     * <li>0x01：开</li>
     * <li>0x02：关</li>
     * <li>“0xFE”表示异常，“0xFF”表示无效</li>
     * </ul>
     */
    private Integer leftBackWindowStatus;

    /**
     * 右后窗状态
     * <ul>
     * <li>0x01：开</li>
     * <li>0x02：关</li>
     * <li>“0xFE”表示异常，“0xFF”表示无效</li>
     * </ul>
     */
    private Integer rightBackWindowStatus;

    /**
     * 天窗状态
     * 0x01：开；
     * 0x02：关；
     * 0x03： 半开，
     * “0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer skylightStatus;

    /**
     * 车外温度<br>
     * 有效值范围：0～1400 （数值偏移量n/10-40℃，表示-40℃～+100℃）<br>
     * 最小计量单元：1℃<br>
     * “0xFE”表示异常，“0xFF”表示无效<br>
     */
    private Float outsideTemperature;

    /**
     * 车内温度<br>
     * 有效值范围：0～1400 （数值偏移量n/10-40℃，表示-40℃～+100℃）<br>
     * 最小计量单元：1℃<br>
     * “0xFE”表示异常，“0xFF”表示无效<br>
     */
    private Float insideTemperature;

    /**
     * 续航里程 有效值范围：0～9999999（表示0km～999999.9km），最小计量单元：0.1km。<br>
     * 单位：公里<br>
     * 0xFF,0xFE 表示异常<br>
     * 0xFF,0xFF 表示无效<br>
     */
    private Double rechargeMileage;

    /**
     * 近光灯状态
     * 0x01：开；
     * 0x02：关，
     * “0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer dippedHeadlightStatus;

    /**
     * 远光灯状态
     * 0x01：开；
     * 0x02：关，
     * “0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer beanLightStatus;

    /**
     * 左转向灯状态
     * 0x01：开；
     * 0x02：关，
     * “0xFE”表示异常，“0xFF”表示无效
     */
    private Integer leftTurnSignalStatus;

    /**
     * 右转向灯状态
     * 0x01：开；
     * 0x02：关，
     * “0xFE”表示异常，“0xFF”表示无效
     */
    private Integer rightTurnSignalStatus;

    /**
     * 危险警示灯状态
     * 0x01：开；
     * 0x02：关，
     * “0xFE”表示异常，“0xFF”表示无效
     */
    private Integer dangerLightStatus;

    /**
     * 前雾灯状态
     * 0x01：开；
     * 0x02：关，
     * “0xFE”表示异常，“0xFF”表示无效
     */
    private Integer frontFoglightStatus;

    /**
     * 后雾灯状态
     * 0x01：开；
     * 0x02：关，
     * “0xFE”表示异常，“0xFF”表示无效
     */
    private Integer backFoglightStatus;

    /**
     * 手刹灯状态
     * 0x01：开；
     * 0x02：关，
     * “0xFE”表示异常，“0xFF”表示无效
     */
    private Integer handBrakeLampStatus;

    /**
     * 脚刹灯状态
     * 0x01：开；
     * 0x02：关，
     * “0xFE”表示异常，“0xFF”表示无效
     */
    private Integer footBrakeLampStatus;
    /**
     * 示宽灯状态
     * 0x01：开；
     * 0x02：关，
     * “0xFE”表示异常，“0xFF”表示无效
     */
    private Integer widthLampStatus;

    /**
     * 阅读灯状态<br>
     * 0x01：开<br>
     * 0x02：关<br>
     * “0xFE”表示异常<br>
     * “0xFF”表示无效<br>
     */
    private Integer readingLampStatus;

    /**
     * 机油油量指示灯<br>
     * 0x01：开<br>
     * 0x02：关<br>
     * “0xFE”表示异常<br>
     * “0xFF”表示无效<br>
     */
    private int oilIndicatorLight;

    /**
     * 冷却液温度
     * 有效值范围：0～250 （数值偏移量40℃）
     */
    private Integer coolingFluidTemperature;

    /**
     * 机油温度
     * 有效值范围：0～1400 （数值偏移量n/10-40℃，表示-40℃～+100℃），最小计量单元：0.1℃
     */
    private Float oilTemperature;

    /**
     * 发动机转速
     * 有效值范围：0～65531
     */
    private Integer engineRpm;

    /**
     * 脚刹状态
     * 0x01：踩下；
     * 0x02：松开，
     * “0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer footBrakeStatus;

    /**
     * 手刹状态
     * 0x01：拉起；
     * 0x02：未拉起，
     * “0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer handBrakeStatus;

    /**
     * ACC状态
     * 0x01：有电；
     * 0x02：无电，
     * “0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer accStatus;

    /**
     * 方向盘转角
     * 有效值范围： 有效值范围：0~8190，（数值偏移量 n/2-2048 deg，表示 -2048 ~ +2047），最小计量单位是：0.5deg
     */
    private float steeringAngle;

    /**
     * GPS天线状态
     * 有效值范围：0x01 短路，0x02 开路，0x03 正常，“0xFE”表示异常，“0xFF”表示无效
     */
    private Integer gpsAntennaStatus;

    /**
     * LTE天线主集状态
     * 有效值范围：01:LTE外置天线主集短路  10:LTE外置天线主集正常  11:LTE外置天线主集开路
     */
    private int lteMainStatus;

    /**
     * LTE天线分集状态
     * 有效值范围：01:LTE外置天线分集短路  10:LTE外置天线分集正常  11:LTE外置天线分集开路
     */
    private int lteDiversityStatus;

    /**
     * 空调状态
     * 0x01：开；
     * 0x02：关，
     * “0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer airConditionerStatus;

    /**
     * 空调控制状态
     * 0x01：自动；
     * 0x02：手动，
     * “0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer airConditionerControlStatus;

    /**
     * 空调压缩机状态
     * 0x01：开；
     * 0x02：关，
     * “0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer airConditionerCompressorStatus;

    /**
     * 空调循环状态
     * 0x01：内循环；
     * 0x02：外循环，
     * “0xFE”表示异常，“0xFF”表示无效。
     */
    private Integer airConditionerCycleStatus;


    /**
     * 空调数据
     */
    private List<AirConditionerData> airConditionerDatas;

    @Getter
    @Setter
    @Accessors(chain = true)
    @ToString
    public static class AirConditionerData {

        /**
         * 空调位置
         * 有效值范围：0~10 （0x00 主空调；0x01左空调；0x02右空调，0x03~0xFD自定义）“0xFE”表示异常，“0xFF”表示无效。
         */
        private Integer airConditionerPlace;

        /**
         * 空调温度
         * 有效值范围：0～1400 （数值偏移量n/10-40℃，表示-40℃～+100℃），最小计量单元：0.1℃
         */
        private Float airConditionerTemperature;

        /**
         * 空调风量
         * 有效值范围：0～8，最小计量单元：1档。
         * “0xFE”表示异常，“0xFF”表示无效。
         */
        private Integer airConditionerVolume;
    }

    /************************** 广三协议新增end ***************************************/

    public DataPackOverview(DataPackObject object) {
        super(object);
    }

    /**
     * 单个速度信息
     */
    @Getter
    @Setter
    @Accessors(chain = true)
    @ToString
    public static class Speed {

        /**
         * 设置速度值(km/h)
         */
        private Integer speed;
        /**
         * 时间小计(秒)
         */
        private Integer consumeTime;
        /**
         * 距离小计(米)
         */
        private Integer travelDistance;

        public Speed() {
        }

        public Speed(Integer speed, Integer consumeTime, Integer travelDistance) {
            this.speed = speed;
            this.consumeTime = consumeTime;
            this.travelDistance = travelDistance;
        }
    }
}
