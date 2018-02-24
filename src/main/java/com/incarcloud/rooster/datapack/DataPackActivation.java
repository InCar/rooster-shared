package com.incarcloud.rooster.datapack;

import java.util.Arrays;

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
	 * RSA公钥{e,n}中的 n, 128位bytes
	 *
	 * @return
	 */
	private byte[] publicKeyModulusBytes;

	/**
	 * RSA公钥{e,n}中的 e
	 *
	 * @return
	 */
	private long publicKeyExponent;

	public DataPackActivation(DataPackObject object) {
		super(object);
	}

	public byte[] getPublicKeyModulusBytes() {
		return publicKeyModulusBytes;
	}

	public void setPublicKeyModulusBytes(byte[] publicKeyModulusBytes) {
		this.publicKeyModulusBytes = publicKeyModulusBytes;
	}

	public long getPublicKeyExponent() {
		return publicKeyExponent;
	}

	public void setPublicKeyExponent(long publicKeyExponent) {
		this.publicKeyExponent = publicKeyExponent;
	}

	public Integer getActivationType() {
		return activationType;
	}

	public void setActivationType(Integer activationType) {
		this.activationType = activationType;
	}

	@Override
	public String toString() {
		return "DataPackActivation{" +
				"activationType=" + activationType +
				", publicKeyModulusBytes=" + Arrays.toString(publicKeyModulusBytes) +
				", publicKeyExponent=" + publicKeyExponent +
				'}';
	}
}
