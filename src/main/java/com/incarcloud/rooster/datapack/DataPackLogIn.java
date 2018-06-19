package com.incarcloud.rooster.datapack;

/**
 * @author ChenZhao
 * @ClassName: DataPackLogInOut
 * @Description: 车辆登入
 * @date 2017-09-06 14:11
 */
public class DataPackLogIn extends DataPackObject {

	/**
	 * 登录类型：0-登录
	 */
	public static final int LOGIN_TYPE_LOGIN = 0;
	/**
	 * 登录类型：1-登出
	 */
	public static final int LOGIN_TYPE_LOGOUT = 1;

	/**
	 * 登录类型 0 车辆登入 1 车辆登出
	 */
	private Integer loginType;

	/**
	 * 登入登出流水号
	 */
	private Integer serialNo;

	/**
	 * 登录类型
	 * 有效值范围：0x01：正常登录；0x02：短信唤醒；0xFE表示异常；0xFF表示无效。
	 */
	private int loginOpType ;

	/**
	 * T-BOX设备号
	 */
	private String sn ;

	/**
	 * AES加密密钥
	 */
	private String secretKey;

	/**
	 * AES偏移量
	 */
	private String secretOffset ;

	public DataPackLogIn(DataPackObject dataPack) {
		super(dataPack);
	}

	/**
	 * 软件版本号
	 */
	private String softwareVersion;

	public Integer getLoginType() {
		return loginType;
	}

	public void setLoginType(Integer loginType) {
		this.loginType = loginType;
	}

	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	public int getLoginOpType() {
		return loginOpType;
	}

	public void setLoginOpType(int loginOpType) {
		this.loginOpType = loginOpType;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getSecretOffset() {
		return secretOffset;
	}

	public void setSecretOffset(String secretOffset) {
		this.secretOffset = secretOffset;
	}

	public String getSoftwareVersion() {
		return softwareVersion;
	}

	public void setSoftwareVersion(String softwareVersion) {
		this.softwareVersion = softwareVersion;
	}

	@Override
	public String toString() {
		return "DataPackLogIn{" +
				"loginType=" + loginType +
				", serialNo=" + serialNo +
				", loginOpType=" + loginOpType +
				", sn='" + sn + '\'' +
				", secretKey='" + secretKey + '\'' +
				", secretOffset='" + secretOffset + '\'' +
				", softwareVersion='" + softwareVersion + '\'' +
				'}';
	}
}
