package com.incarcloud.rooster.mq;

import com.incarcloud.rooster.datapack.ERespReason;
import com.incarcloud.rooster.security.RsaUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Base64;

/**
 * Rsa激活信息MQ发送实体
 *
 * @author Aaric, created on 2019-01-17T11:45.
 * @version 2.4.3-SNAPSHOT
 */
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class RsaActivationMsg {

    /**
     * 设备ID，例如：IMEI
     */
    private String deviceId;

    /**
     * 设备编号，例如：T-BOX SN
     */
    private String deviceCode;

    /**
     * 车架号
     */
    private String vin;

    /**
     * RSA私钥模数
     */
    private String rsaPrivateModulus;

    /**
     * RSA私钥指数
     */
    private String rsaPrivateExponent;

    /**
     * RSA公钥模数
     */
    private String rsaPublicModulus;

    /**
     * RSA公钥指数
     */
    private int rsaPublicExponent;

    /**
     * 激活类型
     *
     * @see ERespReason 应答原因
     */
    private String resultType = ERespReason.OK.toString();

    /**
     * 异常描述
     */
    private String resultException;

    public RsaActivationMsg() {
    }

    public RsaActivationMsg(String deviceId) throws Exception {
        this.deviceId = deviceId;

        // 设置RSA实体信息
        setRsaEntity(RsaUtil.generateRsaEntity());
    }

    /**
     * 设置RSA实体信息
     *
     * @param rsaEntity RSA实体
     */
    public void setRsaEntity(RsaUtil.RsaEntity rsaEntity) {
        if (null == rsaEntity) {
            throw new IllegalArgumentException("rsaEntity is null");
        }
        this.rsaPrivateModulus = Base64.getEncoder().encodeToString(rsaEntity.getPrivateKeyModulusBytes());
        this.rsaPrivateExponent = Base64.getEncoder().encodeToString(rsaEntity.getPrivateKeyExponentBytes());
        this.rsaPublicModulus = Base64.getEncoder().encodeToString(rsaEntity.getPublicKeyModulusBytes());
        this.rsaPublicExponent = Long.valueOf(rsaEntity.getPublicKeyExponent()).intValue();
    }
}
