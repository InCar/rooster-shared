package com.incarcloud.rooster.datapack;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * 驾驶员数据
 *
 * @author Aaric, created on 2017-09-01T13:57.
 * @version 2.0
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString(callSuper = true)
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
}
