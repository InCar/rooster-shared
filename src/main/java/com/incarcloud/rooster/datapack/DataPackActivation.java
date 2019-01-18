package com.incarcloud.rooster.datapack;

/**
 * @Title: DataPackActivation.java
 * @Project: rooster-shared-dataparser-api
 * @Package: com.incarcloud.rooster.datapack
 * @Description: tbox激活信息
 * @author: chenz
 * @date: 2017年11月30日 下午2:32:39
 * @version: V1.0
 */
public class DataPackActivation extends DataPackObject {
	/**
	 * 激活
	 */
	public static final int ACTIVATION = 0;
	/**
	 * PublicKey重置
	 */
	public static final int PUBLIC_KEY_RESET = 1;

	/**
	 * 激活类型
	 */
	private Integer activationType;

	/**
	 * T-BOX设备号
	 */
	private String sn ;

	public DataPackActivation(DataPackObject object) {
		super(object);
	}

	public Integer getActivationType() {
		return activationType;
	}

	public void setActivationType(Integer activationType) {
		this.activationType = activationType;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	@Override
	public String toString() {
		return "DataPackActivation{" +
				"activationType=" + activationType +
				", sn='" + sn + '\'' +
				'}';
	}
}
