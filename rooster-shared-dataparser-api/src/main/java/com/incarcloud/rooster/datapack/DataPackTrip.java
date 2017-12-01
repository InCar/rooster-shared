package com.incarcloud.rooster.datapack;

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
	 * 行程开始时间
	 */
	private long startTime;
	/**
	 * 行程结束时间
	 */
	private long endTime;
	/**
	 * 平均油耗<br>
	 * 有效值范围： 0～1000，（数值偏移量n/10，表示
	 * 0～100升/百公里），最小计量单元：0.1升/百公里，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效。
	 */
	private float oilWearAvg;

	/**
	 * 平均车速<br>
	 * 有效值范围： 0～1000单位：公里/小时，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效
	 */
	private Integer speedAvg;
	/**
	 * 最高车速<br>
	 * 有效值范围： 0～1000单位：公里/小时，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效
	 */
	private Integer speedMax;
	/**
	 * 行程时长<br>
	 * 有效值范围： 0～500000单位：分钟，“0xFE”表示异常，“0xFF”表示无效。
	 */
	private Integer tripDuration;
	/**
	 * 行程行驶里程<br>
	 * 有效值范围： 0～100000单位：公里，“0xFF,0xFE”表示异常，“0xFF,0xFF”表示无效
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

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public float getOilWearAvg() {
		return oilWearAvg;
	}

	public void setOilWearAvg(float oilWearAvg) {
		this.oilWearAvg = oilWearAvg;
	}

	public Integer getSpeedAvg() {
		return speedAvg;
	}

	public void setSpeedAvg(Integer speedAvg) {
		this.speedAvg = speedAvg;
	}

	public Integer getSpeedMax() {
		return speedMax;
	}

	public void setSpeedMax(Integer speedMax) {
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
