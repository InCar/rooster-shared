package com.incarcloud.rooster.datapack;

import java.nio.ByteOrder;
import java.util.Date;

/**
 * @Title: DataPackTrip.java
 * @Project: rooster-shared-dataparser-api
 * @Package: com.incarcloud.rooster.datapack
 * @Description: 车辆行程数据
 * @author: chenz
 * @date: 2017年11月29日 下午1:56:39
 * @version: V1.0
 */
public class DataPackTrip extends DataPackObject {

	/**
	 * 行程开始位置
	 */
	private DataPackPosition startPosition ;

	/**
	 * 行程结束位置
	 */
	private DataPackPosition endPosition ;

	/**
	 * 行程开始时间
	 */
	private Date startTime;
	/**
	 * 行程结束时间
	 */
	private Date endTime;
	/**
	 * 平均油耗<br>
	 * 有效值范围： 0～1000，（数值偏移量n/10，表示
	 * 0～100升/百公里），最小计量单元：0.1升/百公里，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效。
	 */
	private Float oilWearAvg;

	/**
	 * 平均车速<br>
	 * 有效值范围：0～2200（表示0 km/h～220
	 * km/h），最小计量单元：0.1km/h，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效。
	 */
	private Float speedAvg;
	/**
	 * 最高车速<br>
	 * 有效值范围：0～2200（表示0 km/h～220
	 * km/h），最小计量单元：0.1km/h，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效。
	 */
	private Float speedMax;
	/**
	 * 行程时长<br>
	 * 有效值范围： 0～500000单位：分钟，“0xFE”表示异常，“0xFF”表示无效。
	 */
	private Integer tripDuration;
	/**
	 * 行程行驶里程<br>
	 * 单位：米/h
	 */
	private Integer mileage;
	/**
	 * 急加速次数<br>
	 * 有效值范围： 0～255单位：次，“0xFE”表示异常，“0xFF”表示无效。
	 */
	private Integer rapidAccelerationTimes;
	/**
	 * 急减速次数<br>
	 * 有效值范围： 0～255单位：次，“0xFE”表示异常，“0xFF”表示无效。
	 */
	private Integer rapidDecelerationTimes;
	/**
	 * 急转弯次数<br>
	 * 有效值范围： 0～255单位：次，“0xFE”表示异常，“0xFF”表示无效。
	 */
	private Integer sharpTurnTimes;

	public DataPackTrip(DataPackObject object) {
		super(object);
	}

	public DataPackPosition getStartPosition() {
		return startPosition;
	}

	public void setStartPosition(DataPackPosition startPosition) {
		this.startPosition = startPosition;
	}

	public DataPackPosition getEndPosition() {
		return endPosition;
	}

	public void setEndPosition(DataPackPosition endPosition) {
		this.endPosition = endPosition;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public void setOilWearAvg(Float oilWearAvg) {
		this.oilWearAvg = oilWearAvg;
	}

	public Float getOilWearAvg() {
		return oilWearAvg;
	}

	public Float getSpeedAvg() {
		return speedAvg;
	}

	public void setSpeedAvg(Float speedAvg) {
		this.speedAvg = speedAvg;
	}

	public Float getSpeedMax() {
		return speedMax;
	}

	public void setSpeedMax(Float speedMax) {
		this.speedMax = speedMax;
	}

	public Integer getTripDuration() {
		return tripDuration;
	}

	public void setTripDuration(Integer tripDuration) {
		this.tripDuration = tripDuration;
	}

	public Integer getMileage() {
		return mileage;
	}

	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}

	public Integer getRapidAccelerationTimes() {
		return rapidAccelerationTimes;
	}

	public void setRapidAccelerationTimes(Integer rapidAccelerationTimes) {
		this.rapidAccelerationTimes = rapidAccelerationTimes;
	}

	public Integer getRapidDecelerationTimes() {
		return rapidDecelerationTimes;
	}

	public void setRapidDecelerationTimes(Integer rapidDecelerationTimes) {
		this.rapidDecelerationTimes = rapidDecelerationTimes;
	}

	public Integer getSharpTurnTimes() {
		return sharpTurnTimes;
	}

	public void setSharpTurnTimes(Integer sharpTurnTimes) {
		this.sharpTurnTimes = sharpTurnTimes;
	}

	@Override
	public String toString() {
		return "DataPackTrip [startTime=" + startTime + ", endTime=" + endTime + ", oilWearAvg=" + oilWearAvg
				+ ", speedAvg=" + speedAvg + ", speedMax=" + speedMax + ", tripDuration=" + tripDuration + ", mileage="
				+ mileage + ", rapidAccelerationTimes=" + rapidAccelerationTimes + ", rapidDecelerationTimes="
				+ rapidDecelerationTimes + ", sharpTurnTimes=" + sharpTurnTimes + "]";
	}

}
