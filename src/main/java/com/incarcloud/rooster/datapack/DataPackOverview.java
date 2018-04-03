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
	 * 车辆状态：0x01-发动机点火时，0x02-发动机运行中，0x03-发动机熄火时，0x04-发动机熄火后，0x05-车辆不能检测
	 */
	private Integer carStatus;

	/*
	 * ===========================电动车部分start====================================
	 * =====
	 */
	/**
	 * 充电状态 0x01： 停车充电； 0x02： 行驶充电； 0x03： 未充电状态， 0x04：
	 * 充电完成；“0xFE”表示异常，“0xFF”表示无效。
	 */
	private Integer chargeStatus;
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
	 * 总电流 有效值范围： 0～20000（偏移量 1000A，表示-1000A～+1000A），最小计量单元：
	 * 0.1A，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效。
	 */
	private Float totalCurrent;
	/**
	 * SOC 有效值范围： 0～100（表示 0%～100%），最小计量单元： 1%，“0xFE”表示异常，“0xFF”表示无效
	 */
	private Integer soc;
	/**
	 * DC-DC 状态 0x01： 工作； 0x02： 断开，“0xFE”表示异常，“0xFF”表示无效。
	 */
	private Integer dcdcStatus;
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
	 * 车外温度<br>
	 * 有效值范围：0～250 （数值偏移量40℃，表示-40℃～+210℃）<br>
	 * 最小计量单元：1℃<br>
	 * “0xFE”表示异常，“0xFF”表示无效<br>
	 */
	private Integer outsideTemperature;

	/**
	 * 车内温度<br>
	 * 有效值范围：0～250 （数值偏移量40℃，表示-40℃～+210℃）<br>
	 * 最小计量单元：1℃<br>
	 * “0xFE”表示异常，“0xFF”表示无效<br>
	 */
	private Integer insideTemperature;

	/**
	 * 续航里程 有效值范围： 0～20000<br>
	 * 单位：公里<br>
	 * 0xFF,0xFE 表示异常<br>
	 * 0xFF,0xFF 表示无效<br>
	 */
	private Integer rechargeMileage;

	/**
	 * 车灯状态<br>
	 * 0x01：开<br>
	 * 0x02：关<br>
	 * “0xFE”表示异常<br>
	 * “0xFF”表示无效<br>
	 */
	private Integer lightStatus;

	/**
	 * 冷却液温度
	 * 有效值范围：0～250 （数值偏移量40℃）
	 */
	private int coolingFluidTemperature ;

	/**
	 * 机油温度
	 * 有效值范围：0～250 （数值偏移量40℃）
	 */
	private int oilTemperature ;

	/**
	 * 发动机转速
	 * 有效值范围：0～65531
	 */
	private int engineRpm ;

	/************************** 广三协议新增end ***************************************/

	public DataPackOverview(DataPackObject object) {
		super(object);
	}


	public Integer getLightStatus() {
		return lightStatus;
	}

	public void setLightStatus(Integer lightStatus) {
		this.lightStatus = lightStatus;
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

	public Integer getOutsideTemperature() {
		return outsideTemperature;
	}

	public void setOutsideTemperature(Integer outsideTemperature) {
		this.outsideTemperature = outsideTemperature;
	}

	public Integer getInsideTemperature() {
		return insideTemperature;
	}

	public void setInsideTemperature(Integer insideTemperature) {
		this.insideTemperature = insideTemperature;
	}

	public Integer getRechargeMileage() {
		return rechargeMileage;
	}

	public void setRechargeMileage(Integer rechargeMileage) {
		this.rechargeMileage = rechargeMileage;
	}

	public Integer getCarStatus() {
		return carStatus;
	}

	public void setCarStatus(Integer carStatus) {
		this.carStatus = carStatus;
	}

	public Integer getChargeStatus() {
		return chargeStatus;
	}

	public void setChargeStatus(Integer chargeStatus) {
		this.chargeStatus = chargeStatus;
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

	public Float getTotalCurrent() {
		return totalCurrent;
	}

	public void setTotalCurrent(Float totalCurrent) {
		this.totalCurrent = totalCurrent;
	}

	public Integer getSoc() {
		return soc;
	}

	public void setSoc(Integer soc) {
		this.soc = soc;
	}

	public Integer getDcdcStatus() {
		return dcdcStatus;
	}

	public void setDcdcStatus(Integer dcdcStatus) {
		this.dcdcStatus = dcdcStatus;
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

	public int getCoolingFluidTemperature() {
		return coolingFluidTemperature;
	}

	public void setCoolingFluidTemperature(int coolingFluidTemperature) {
		this.coolingFluidTemperature = coolingFluidTemperature;
	}

	public int getOilTemperature() {
		return oilTemperature;
	}

	public void setOilTemperature(int oilTemperature) {
		this.oilTemperature = oilTemperature;
	}

	public int getEngineRpm() {
		return engineRpm;
	}

	public void setEngineRpm(int engineRpm) {
		this.engineRpm = engineRpm;
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
				", chargeStatus=" + chargeStatus +
				", runStatus=" + runStatus +
				", vehicleSpeed=" + vehicleSpeed +
				", totalCurrent=" + totalCurrent +
				", soc=" + soc +
				", dcdcStatus=" + dcdcStatus +
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
				", frontCover=" + frontCover +
				", trunkStatus=" + trunkStatus +
				", leftFrontWindowStatus=" + leftFrontWindowStatus +
				", rightFrontWindowStatus=" + rightFrontWindowStatus +
				", leftBackWindowStatus=" + leftBackWindowStatus +
				", rightBackWindowStatus=" + rightBackWindowStatus +
				", outsideTemperature=" + outsideTemperature +
				", insideTemperature=" + insideTemperature +
				", rechargeMileage=" + rechargeMileage +
				", lightStatus=" + lightStatus +
				", coolingFluidTemperature=" + coolingFluidTemperature +
				", oilTemperature=" + oilTemperature +
				", engineRpm=" + engineRpm +
				'}';
	}
}
