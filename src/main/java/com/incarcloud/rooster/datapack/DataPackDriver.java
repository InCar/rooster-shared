package com.incarcloud.rooster.datapack;

import java.util.Date;

/**
 * 驾驶员数据
 *
 * @author Aaric, created on 2017-09-01T13:57.
 * @since 2.0
 */
public class DataPackDriver extends DataPackObject {

    /**
     * 状态: 0x01-插入/上班, 0x02-拔出/下班
     */
    private Integer driverICStatus;
    /**
     * 插卡/拔卡时间
     */
    private Date driverICTime;
    /**
     * 读卡结果：0-成功, 1-卡片密钥认证未通过, 2-卡片已被锁定, 3-卡片被拔出, 4-数据校验错误
     */
    private Integer driverICResult;
    /**
     * 驾驶员姓名
     */
    private String driverName;
    /**
     * 从业资格证编码
     */
    private String driverCertCode;
    /**
     * 发证机构名称
     */
    private String driverCertOrganizationName;
    /**
     * 证件有效期
     */
    private Date driverCertExpireDate;

    public DataPackDriver(DataPackObject object) {
        super(object);
    }

    public Integer getDriverICStatus() {
        return driverICStatus;
    }

    public void setDriverICStatus(Integer driverICStatus) {
        this.driverICStatus = driverICStatus;
    }

    public Date getDriverICTime() {
        return driverICTime;
    }

    public void setDriverICTime(Date driverICTime) {
        this.driverICTime = driverICTime;
    }

    public Integer getDriverICResult() {
        return driverICResult;
    }

    public void setDriverICResult(Integer driverICResult) {
        this.driverICResult = driverICResult;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverCertCode() {
        return driverCertCode;
    }

    public void setDriverCertCode(String driverCertCode) {
        this.driverCertCode = driverCertCode;
    }

    public String getDriverCertOrganizationName() {
        return driverCertOrganizationName;
    }

    public void setDriverCertOrganizationName(String driverCertOrganizationName) {
        this.driverCertOrganizationName = driverCertOrganizationName;
    }

    public Date getDriverCertExpireDate() {
        return driverCertExpireDate;
    }

    public void setDriverCertExpireDate(Date driverCertExpireDate) {
        this.driverCertExpireDate = driverCertExpireDate;
    }

    @Override
    public String toString() {
        return "DataPackDriver{" +
                "driverICStatus=" + driverICStatus +
                ", driverICTime=" + driverICTime +
                ", driverICResult=" + driverICResult +
                ", driverName='" + driverName + '\'' +
                ", driverCertCode='" + driverCertCode + '\'' +
                ", driverCertOrganizationName='" + driverCertOrganizationName + '\'' +
                ", driverCertExpireDate=" + driverCertExpireDate +
                '}';
    }
}
