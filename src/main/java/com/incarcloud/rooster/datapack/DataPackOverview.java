package com.incarcloud.rooster.datapack;

import java.nio.ByteOrder;
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
 * @since 2.0
 */
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
	 * =0110 6 档 =1101 倒档 =1110 自动 D 档 =1111 停车 P 档
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
	 * 电流（V）
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
	private Integer centralLockStatus ;

	/**
	 * 门锁状态
	 * 0x01：开；
	 * 0x02：关，
	 * “0xFE”表示异常，
	 * “0xFF”表示无效。
	 */
	private Integer doorLockStatus ;

	/**
	 * 主驾门锁状态
	 * 0x01：开；
	 * 0x02：关，
	 * “0xFE”表示异常，
	 * “0xFF”表示无效。
	 */
	private Integer driveDoorLockStatus ;

	/**
	 * 副驾门锁状态
	 * 0x01：开；
	 * 0x02：关，
	 * “0xFE”表示异常，
	 * “0xFF”表示无效。
	 */
	private Integer passengerDoorLockStatus ;

	/**
	 * 后门锁状态
	 * 0x01：开；
	 * 0x02：关，
	 * “0xFE”表示异常，
	 * “0xFF”表示无效。
	 */
	private Integer backDoorLockStatus ;

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
	private Integer skylightStatus ;

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
	private Integer dippedHeadlightStatus ;

	/**
	 * 远光灯状态
	 * 0x01：开；
	 * 0x02：关，
	 * “0xFE”表示异常，“0xFF”表示无效。
	 */
	private Integer beanLightStatus ;

	/**
	 * 左转向灯状态
	 * 0x01：开；
	 * 0x02：关，
	 * “0xFE”表示异常，“0xFF”表示无效
	 */
	private Integer leftTurnSignalStatus ;

	/**
	 * 右转向灯状态
	 * 0x01：开；
	 * 0x02：关，
	 * “0xFE”表示异常，“0xFF”表示无效
	 */
	private Integer rightTurnSignalStatus ;

	/**
	 * 危险警示灯状态
	 * 0x01：开；
	 * 0x02：关，
	 * “0xFE”表示异常，“0xFF”表示无效
	 */
	private Integer dangerLightStatus ;

	/**
	 * 前雾灯状态
	 * 0x01：开；
	 * 0x02：关，
	 * “0xFE”表示异常，“0xFF”表示无效
	 */
	private Integer frontFoglightStatus ;

	/**
	 * 后雾灯状态
	 * 0x01：开；
	 * 0x02：关，
	 * “0xFE”表示异常，“0xFF”表示无效
	 */
	private Integer backFoglightStatus ;

	/**
	 * 手刹灯状态
	 * 0x01：开；
	 * 0x02：关，
	 * “0xFE”表示异常，“0xFF”表示无效
	 */
	private Integer handBrakeLampStatus ;

	/**
	 * 脚刹灯状态
	 * 0x01：开；
	 * 0x02：关，
	 * “0xFE”表示异常，“0xFF”表示无效
	 */
	private Integer footBrakeLampStatus ;
	/**
	 * 示宽灯状态
	 * 0x01：开；
	 * 0x02：关，
	 * “0xFE”表示异常，“0xFF”表示无效
	 */
	private Integer widthLampStatus ;

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
	private int oilIndicatorLight ;

	/**
	 * 冷却液温度
	 * 有效值范围：0～250 （数值偏移量40℃）
	 */
	private Integer coolingFluidTemperature ;

	/**
	 * 机油温度
	 * 有效值范围：0～1400 （数值偏移量n/10-40℃，表示-40℃～+100℃），最小计量单元：0.1℃
	 */
	private Float oilTemperature ;

	/**
	 * 发动机转速
	 * 有效值范围：0～65531
	 */
	private Integer engineRpm ;

	/**
	 * 脚刹状态
	 * 0x01：踩下；
	 * 0x02：松开，
	 * “0xFE”表示异常，“0xFF”表示无效。
	 */
	private Integer footBrakeStatus ;

	/**
	 * 手刹状态
	 * 0x01：拉起；
	 * 0x02：未拉起，
	 * “0xFE”表示异常，“0xFF”表示无效。
	 */
	private Integer handBrakeStatus ;

	/**
	 * ACC状态
	 * 0x01：有电；
	 * 0x02：无电，
	 * “0xFE”表示异常，“0xFF”表示无效。
	 */
	private Integer accStatus ;

	/**
	 * 方向盘转角
	 * 有效值范围： 有效值范围：0~8190，（数值偏移量 n/2-2048 deg，表示 -2048 ~ +2047），最小计量单位是：0.5deg
	 */
	private float steeringAngle ;

	/**
	 * 空调状态
	 * 0x01：开；
	 * 0x02：关，
	 * “0xFE”表示异常，“0xFF”表示无效。
	 */
	private Integer airConditionerStatus ;

	/**
	 * 空调控制状态
	 * 0x01：自动；
	 * 0x02：手动，
	 * “0xFE”表示异常，“0xFF”表示无效。
	 */
	private Integer airConditionerControlStatus ;

	/**
	 * 空调压缩机状态
	 * 0x01：开；
	 * 0x02：关，
	 * “0xFE”表示异常，“0xFF”表示无效。
	 */
	private Integer airConditionerCompressorStatus ;

	/**
	 * 空调循环状态
	 * 0x01：内循环；
	 * 0x02：外循环，
	 * “0xFE”表示异常，“0xFF”表示无效。
	 */
	private Integer airConditionerCycleStatus ;



	/**
	 * 空调数据
	 */
	private List<AirConditionerData> airConditionerDatas ;


	public static class AirConditionerData {

		/**
		 * 空调位置
		 * 有效值范围：0~10 （0x00 主空调；0x01左空调；0x02右空调，0x03~0xFD自定义）“0xFE”表示异常，“0xFF”表示无效。
		 */
		private Integer airConditionerPlace ;

		/**
		 * 空调温度
		 * 有效值范围：0～1400 （数值偏移量n/10-40℃，表示-40℃～+100℃），最小计量单元：0.1℃
		 */
		private Float airConditionerTemperature ;

		/**
		 * 空调风量
		 * 有效值范围：0～8，最小计量单元：1档。
		 * “0xFE”表示异常，“0xFF”表示无效。
		 */
		private Integer airConditionerVolume ;

		public Integer getAirConditionerPlace() {
			return airConditionerPlace;
		}

		public void setAirConditionerPlace(Integer airConditionerPlace) {
			this.airConditionerPlace = airConditionerPlace;
		}

		public Float getAirConditionerTemperature() {
			return airConditionerTemperature;
		}

		public void setAirConditionerTemperature(Float airConditionerTemperature) {
			this.airConditionerTemperature = airConditionerTemperature;
		}

		public Integer getAirConditionerVolume() {
			return airConditionerVolume;
		}

		public void setAirConditionerVolume(Integer airConditionerVolume) {
			this.airConditionerVolume = airConditionerVolume;
		}
	}

	/************************** 广三协议新增end ***************************************/

	public DataPackOverview(DataPackObject object) {
		super(object);
	}


	public Integer getCarStatus() {
		return carStatus;
	}

	public void setCarStatus(Integer carStatus) {
		this.carStatus = carStatus;
	}

	public Integer getRunStatus() {
		return runStatus;
	}

	public void setRunStatus(Integer runStatus) {
		this.runStatus = runStatus;
	}

	public float getVehicleSpeed() {
		return vehicleSpeed;
	}

	public void setVehicleSpeed(float vehicleSpeed) {
		this.vehicleSpeed = vehicleSpeed;
	}

	public Integer getClutchStatus() {
		return clutchStatus;
	}

	public void setClutchStatus(Integer clutchStatus) {
		this.clutchStatus = clutchStatus;
	}

	public Integer getBrakeStatus() {
		return brakeStatus;
	}

	public void setBrakeStatus(Integer brakeStatus) {
		this.brakeStatus = brakeStatus;
	}

	public Integer getDriveStatus() {
		return driveStatus;
	}

	public void setDriveStatus(Integer driveStatus) {
		this.driveStatus = driveStatus;
	}

	public Integer getIssueValue() {
		return issueValue;
	}

	public void setIssueValue(Integer issueValue) {
		this.issueValue = issueValue;
	}

	public Float getVoltage() {
		return voltage;
	}

	public void setVoltage(Float voltage) {
		this.voltage = voltage;
	}

	public DataPackPosition getPosition() {
		return position;
	}

	public void setPosition(DataPackPosition position) {
		this.position = position;
	}

	public Integer getRunTime() {
		return runTime;
	}

	public void setRunTime(Integer runTime) {
		this.runTime = runTime;
	}

	public Integer getCurrentMileage() {
		return currentMileage;
	}

	public void setCurrentMileage(Integer currentMileage) {
		this.currentMileage = currentMileage;
	}

	public Float getCurrentAvgOilUsed() {
		return currentAvgOilUsed;
	}

	public void setCurrentAvgOilUsed(Float currentAvgOilUsed) {
		this.currentAvgOilUsed = currentAvgOilUsed;
	}

	public Double getMileage() {
		return mileage;
	}

	public void setMileage(Double mileage) {
		this.mileage = mileage;
	}

	public Float getAvgOilUsed() {
		return avgOilUsed;
	}

	public void setAvgOilUsed(Float avgOilUsed) {
		this.avgOilUsed = avgOilUsed;
	}

	public List<Speed> getSpeedGroup() {
		return speedGroup;
	}

	public void setSpeedGroup(List<Speed> speedGroup) {
		this.speedGroup = speedGroup;
	}

	public Integer getSpeedUpTimes() {
		return speedUpTimes;
	}

	public void setSpeedUpTimes(Integer speedUpTimes) {
		this.speedUpTimes = speedUpTimes;
	}

	public Integer getSpeedDownTimes() {
		return speedDownTimes;
	}

	public void setSpeedDownTimes(Integer speedDownTimes) {
		this.speedDownTimes = speedDownTimes;
	}

	public Integer getSharpTurnTimes() {
		return sharpTurnTimes;
	}

	public void setSharpTurnTimes(Integer sharpTurnTimes) {
		this.sharpTurnTimes = sharpTurnTimes;
	}

	public Integer getSpeedingTime() {
		return speedingTime;
	}

	public void setSpeedingTime(Integer speedingTime) {
		this.speedingTime = speedingTime;
	}

	public Integer getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Float getAvgSpeed() {
		return avgSpeed;
	}

	public void setAvgSpeed(Float avgSpeed) {
		this.avgSpeed = avgSpeed;
	}

	public Float getCurrent() {
		return current;
	}

	public void setCurrent(Float current) {
		this.current = current;
	}

	public Integer getFuelQuantity() {
		return fuelQuantity;
	}

	public void setFuelQuantity(Integer fuelQuantity) {
		this.fuelQuantity = fuelQuantity;
	}

	public Integer getLeftFrontTirePressure() {
		return leftFrontTirePressure;
	}

	public void setLeftFrontTirePressure(Integer leftFrontTirePressure) {
		this.leftFrontTirePressure = leftFrontTirePressure;
	}

	public Integer getRightFrontTirePressure() {
		return rightFrontTirePressure;
	}

	public void setRightFrontTirePressure(Integer rightFrontTirePressure) {
		this.rightFrontTirePressure = rightFrontTirePressure;
	}

	public Integer getLeftRearTirePressure() {
		return leftRearTirePressure;
	}

	public void setLeftRearTirePressure(Integer leftRearTirePressure) {
		this.leftRearTirePressure = leftRearTirePressure;
	}

	public Integer getRightRearTirePressure() {
		return rightRearTirePressure;
	}

	public void setRightRearTirePressure(Integer rightRearTirePressure) {
		this.rightRearTirePressure = rightRearTirePressure;
	}

	public Integer getLeftFrontDoorStatus() {
		return leftFrontDoorStatus;
	}

	public void setLeftFrontDoorStatus(Integer leftFrontDoorStatus) {
		this.leftFrontDoorStatus = leftFrontDoorStatus;
	}

	public Integer getLeftBackDoorStatus() {
		return leftBackDoorStatus;
	}

	public void setLeftBackDoorStatus(Integer leftBackDoorStatus) {
		this.leftBackDoorStatus = leftBackDoorStatus;
	}

	public Integer getRightFrontDoorStatus() {
		return rightFrontDoorStatus;
	}

	public void setRightFrontDoorStatus(Integer rightFrontDoorStatus) {
		this.rightFrontDoorStatus = rightFrontDoorStatus;
	}

	public Integer getRightBackDoorStatus() {
		return rightBackDoorStatus;
	}

	public void setRightBackDoorStatus(Integer rightBackDoorStatus) {
		this.rightBackDoorStatus = rightBackDoorStatus;
	}

	public Integer getCentralLockStatus() {
		return centralLockStatus;
	}

	public void setCentralLockStatus(Integer centralLockStatus) {
		this.centralLockStatus = centralLockStatus;
	}

	public Integer getDoorLockStatus() {
		return doorLockStatus;
	}

	public void setDoorLockStatus(Integer doorLockStatus) {
		this.doorLockStatus = doorLockStatus;
	}

	public Integer getDriveDoorLockStatus() {
		return driveDoorLockStatus;
	}

	public void setDriveDoorLockStatus(Integer driveDoorLockStatus) {
		this.driveDoorLockStatus = driveDoorLockStatus;
	}

	public Integer getPassengerDoorLockStatus() {
		return passengerDoorLockStatus;
	}

	public void setPassengerDoorLockStatus(Integer passengerDoorLockStatus) {
		this.passengerDoorLockStatus = passengerDoorLockStatus;
	}

	public Integer getBackDoorLockStatus() {
		return backDoorLockStatus;
	}

	public void setBackDoorLockStatus(Integer backDoorLockStatus) {
		this.backDoorLockStatus = backDoorLockStatus;
	}

	public Integer getFrontCover() {
		return frontCover;
	}

	public void setFrontCover(Integer frontCover) {
		this.frontCover = frontCover;
	}

	public Integer getTrunkStatus() {
		return trunkStatus;
	}

	public void setTrunkStatus(Integer trunkStatus) {
		this.trunkStatus = trunkStatus;
	}

	public Integer getLeftFrontWindowStatus() {
		return leftFrontWindowStatus;
	}

	public void setLeftFrontWindowStatus(Integer leftFrontWindowStatus) {
		this.leftFrontWindowStatus = leftFrontWindowStatus;
	}

	public Integer getRightFrontWindowStatus() {
		return rightFrontWindowStatus;
	}

	public void setRightFrontWindowStatus(Integer rightFrontWindowStatus) {
		this.rightFrontWindowStatus = rightFrontWindowStatus;
	}

	public Integer getLeftBackWindowStatus() {
		return leftBackWindowStatus;
	}

	public void setLeftBackWindowStatus(Integer leftBackWindowStatus) {
		this.leftBackWindowStatus = leftBackWindowStatus;
	}

	public Integer getRightBackWindowStatus() {
		return rightBackWindowStatus;
	}

	public void setRightBackWindowStatus(Integer rightBackWindowStatus) {
		this.rightBackWindowStatus = rightBackWindowStatus;
	}

	public Integer getSkylightStatus() {
		return skylightStatus;
	}

	public void setSkylightStatus(Integer skylightStatus) {
		this.skylightStatus = skylightStatus;
	}

	public Float getOutsideTemperature() {
		return outsideTemperature;
	}

	public void setOutsideTemperature(Float outsideTemperature) {
		this.outsideTemperature = outsideTemperature;
	}

	public Float getInsideTemperature() {
		return insideTemperature;
	}

	public void setInsideTemperature(Float insideTemperature) {
		this.insideTemperature = insideTemperature;
	}

	public Double getRechargeMileage() {
		return rechargeMileage;
	}

	public void setRechargeMileage(Double rechargeMileage) {
		this.rechargeMileage = rechargeMileage;
	}

	public Integer getDippedHeadlightStatus() {
		return dippedHeadlightStatus;
	}

	public void setDippedHeadlightStatus(Integer dippedHeadlightStatus) {
		this.dippedHeadlightStatus = dippedHeadlightStatus;
	}

	public Integer getBeanLightStatus() {
		return beanLightStatus;
	}

	public void setBeanLightStatus(Integer beanLightStatus) {
		this.beanLightStatus = beanLightStatus;
	}

	public Integer getLeftTurnSignalStatus() {
		return leftTurnSignalStatus;
	}

	public void setLeftTurnSignalStatus(Integer leftTurnSignalStatus) {
		this.leftTurnSignalStatus = leftTurnSignalStatus;
	}

	public Integer getRightTurnSignalStatus() {
		return rightTurnSignalStatus;
	}

	public void setRightTurnSignalStatus(Integer rightTurnSignalStatus) {
		this.rightTurnSignalStatus = rightTurnSignalStatus;
	}

	public Integer getDangerLightStatus() {
		return dangerLightStatus;
	}

	public void setDangerLightStatus(Integer dangerLightStatus) {
		this.dangerLightStatus = dangerLightStatus;
	}

	public Integer getFrontFoglightStatus() {
		return frontFoglightStatus;
	}

	public void setFrontFoglightStatus(Integer frontFoglightStatus) {
		this.frontFoglightStatus = frontFoglightStatus;
	}

	public Integer getBackFoglightStatus() {
		return backFoglightStatus;
	}

	public void setBackFoglightStatus(Integer backFoglightStatus) {
		this.backFoglightStatus = backFoglightStatus;
	}

	public Integer getFootBrakeLampStatus() {
		return footBrakeLampStatus;
	}

	public void setFootBrakeLampStatus(Integer footBrakeLampStatus) {
		this.footBrakeLampStatus = footBrakeLampStatus;
	}

	public Integer getHandBrakeLampStatus() {
		return handBrakeLampStatus;
	}

	public void setHandBrakeLampStatus(Integer handBrakeLampStatus) {
		this.handBrakeLampStatus = handBrakeLampStatus;
	}

	public Integer getWidthLampStatus() {
		return widthLampStatus;
	}

	public void setWidthLampStatus(Integer widthLampStatus) {
		this.widthLampStatus = widthLampStatus;
	}

	public Integer getReadingLampStatus() {
		return readingLampStatus;
	}

	public void setReadingLampStatus(Integer readingLampStatus) {
		this.readingLampStatus = readingLampStatus;
	}

	public int getOilIndicatorLight() {
		return oilIndicatorLight;
	}

	public void setOilIndicatorLight(int oilIndicatorLight) {
		this.oilIndicatorLight = oilIndicatorLight;
	}

	public Integer getCoolingFluidTemperature() {
		return coolingFluidTemperature;
	}

	public void setCoolingFluidTemperature(Integer coolingFluidTemperature) {
		this.coolingFluidTemperature = coolingFluidTemperature;
	}

	public Float getOilTemperature() {
		return oilTemperature;
	}

	public void setOilTemperature(Float oilTemperature) {
		this.oilTemperature = oilTemperature;
	}

	public Integer getEngineRpm() {
		return engineRpm;
	}

	public void setEngineRpm(Integer engineRpm) {
		this.engineRpm = engineRpm;
	}

	public Integer getFootBrakeStatus() {
		return footBrakeStatus;
	}

	public void setFootBrakeStatus(Integer footBrakeStatus) {
		this.footBrakeStatus = footBrakeStatus;
	}

	public Integer getHandBrakeStatus() {
		return handBrakeStatus;
	}

	public void setHandBrakeStatus(Integer handBrakeStatus) {
		this.handBrakeStatus = handBrakeStatus;
	}

	public Integer getAccStatus() {
		return accStatus;
	}

	public void setAccStatus(Integer accStatus) {
		this.accStatus = accStatus;
	}

	public float getSteeringAngle() {
		return steeringAngle;
	}

	public void setSteeringAngle(float steeringAngle) {
		this.steeringAngle = steeringAngle;
	}

	public Integer getAirConditionerStatus() {
		return airConditionerStatus;
	}

	public void setAirConditionerStatus(Integer airConditionerStatus) {
		this.airConditionerStatus = airConditionerStatus;
	}

	public Integer getAirConditionerControlStatus() {
		return airConditionerControlStatus;
	}

	public void setAirConditionerControlStatus(Integer airConditionerControlStatus) {
		this.airConditionerControlStatus = airConditionerControlStatus;
	}

	public Integer getAirConditionerCompressorStatus() {
		return airConditionerCompressorStatus;
	}

	public void setAirConditionerCompressorStatus(Integer airConditionerCompressorStatus) {
		this.airConditionerCompressorStatus = airConditionerCompressorStatus;
	}

	public Integer getAirConditionerCycleStatus() {
		return airConditionerCycleStatus;
	}

	public void setAirConditionerCycleStatus(Integer airConditionerCycleStatus) {
		this.airConditionerCycleStatus = airConditionerCycleStatus;
	}

	public List<AirConditionerData> getAirConditionerDatas() {
		return airConditionerDatas;
	}

	public void setAirConditionerDatas(List<AirConditionerData> airConditionerDatas) {
		this.airConditionerDatas = airConditionerDatas;
	}

	/**
	 * 单个速度信息
	 */
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

		public Integer getSpeed() {
			return speed;
		}

		public void setSpeed(Integer speed) {
			this.speed = speed;
		}

		public Integer getConsumeTime() {
			return consumeTime;
		}

		public void setConsumeTime(Integer consumeTime) {
			this.consumeTime = consumeTime;
		}

		public Integer getTravelDistance() {
			return travelDistance;
		}

		public void setTravelDistance(Integer travelDistance) {
			this.travelDistance = travelDistance;
		}
	}

	@Override
	public String toString() {
		return "DataPackOverview{" +
				"carStatus=" + carStatus +
				", runStatus=" + runStatus +
				", vehicleSpeed=" + vehicleSpeed +
				", clutchStatus=" + clutchStatus +
				", brakeStatus=" + brakeStatus +
				", driveStatus=" + driveStatus +
				", issueValue=" + issueValue +
				", voltage=" + voltage +
				", position=" + position +
				", runTime=" + runTime +
				", currentMileage=" + currentMileage +
				", currentAvgOilUsed=" + currentAvgOilUsed +
				", mileage=" + mileage +
				", avgOilUsed=" + avgOilUsed +
				", speedGroup=" + speedGroup +
				", speedUpTimes=" + speedUpTimes +
				", speedDownTimes=" + speedDownTimes +
				", sharpTurnTimes=" + sharpTurnTimes +
				", speedingTime=" + speedingTime +
				", maxSpeed=" + maxSpeed +
				", avgSpeed=" + avgSpeed +
				", current=" + current +
				", fuelQuantity=" + fuelQuantity +
				", leftFrontTirePressure=" + leftFrontTirePressure +
				", rightFrontTirePressure=" + rightFrontTirePressure +
				", leftRearTirePressure=" + leftRearTirePressure +
				", rightRearTirePressure=" + rightRearTirePressure +
				", leftFrontDoorStatus=" + leftFrontDoorStatus +
				", leftBackDoorStatus=" + leftBackDoorStatus +
				", rightFrontDoorStatus=" + rightFrontDoorStatus +
				", rightBackDoorStatus=" + rightBackDoorStatus +
				", centralLockStatus=" + centralLockStatus +
				", doorLockStatus=" + doorLockStatus +
				", driveDoorLockStatus=" + driveDoorLockStatus +
				", passengerDoorLockStatus=" + passengerDoorLockStatus +
				", backDoorLockStatus=" + backDoorLockStatus +
				", frontCover=" + frontCover +
				", trunkStatus=" + trunkStatus +
				", leftFrontWindowStatus=" + leftFrontWindowStatus +
				", rightFrontWindowStatus=" + rightFrontWindowStatus +
				", leftBackWindowStatus=" + leftBackWindowStatus +
				", rightBackWindowStatus=" + rightBackWindowStatus +
				", skylightStatus=" + skylightStatus +
				", outsideTemperature=" + outsideTemperature +
				", insideTemperature=" + insideTemperature +
				", rechargeMileage=" + rechargeMileage +
				", dippedHeadlightStatus=" + dippedHeadlightStatus +
				", beanLightStatus=" + beanLightStatus +
				", leftTurnSignalStatus=" + leftTurnSignalStatus +
				", rightTurnSignalStatus=" + rightTurnSignalStatus +
				", dangerLightStatus=" + dangerLightStatus +
				", frontFoglightStatus=" + frontFoglightStatus +
				", backFoglightStatus=" + backFoglightStatus +
				", footBrakeLampStatus=" + footBrakeLampStatus +
				", handBrakeLampStatus=" + handBrakeLampStatus +
				", widthLampStatus=" + widthLampStatus +
				", readingLampStatus=" + readingLampStatus +
				", oilIndicatorLight=" + oilIndicatorLight +
				", coolingFluidTemperature=" + coolingFluidTemperature +
				", oilTemperature=" + oilTemperature +
				", engineRpm=" + engineRpm +
				", footBrakeStatus=" + footBrakeStatus +
				", handBrakeStatus=" + handBrakeStatus +
				", accStatus=" + accStatus +
				", steeringAngle=" + steeringAngle +
				", airConditionerStatus=" + airConditionerStatus +
				", airConditionerControlStatus=" + airConditionerControlStatus +
				", airConditionerCompressorStatus=" + airConditionerCompressorStatus +
				", airConditionerCycleStatus=" + airConditionerCycleStatus +
				", airConditionerDatas=" + airConditionerDatas +
				'}';
	}
}
