package com.incarcloud.rooster.util;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/**
 * RSA加解密工具类
 *
 * @author Aaric, created on 2018-02-08T09:54.
 * @since 2.1.20-SNAPSHOT
 */
public class RsaEncryptUtil {

    /**
     * 算法名称
     */
    public static final String ALGORITHM_NAME = "RSA";

    /**
     * RSA实体
     */
    public interface RsaEntity {

        /**
         * RSA私钥字节数组(要求使用PKCS8生成加解密器)
         *
         * @return
         */
        byte[] privateKeyBytes();

        /**
         * RSA公钥字节数组(要求使用X509 生成加解密器)
         *
         * @return
         */
        byte[] publicKeyBytes();

        /**
         * RSA私钥{e,n}中的 n
         *
         * @return
         */
        byte[] privateKeyModulusBytes();

        /**
         * RSA私钥{e,n}中的 e
         *
         * @return
         */
        byte[] privateKeyExponentBytes();

        /**
         * RSA公钥{e,n}中的 n, 128位bytes
         *
         * @return
         */
        byte[] publicKeyModulusBytes();

        /**
         * RSA公钥{e,n}中的 e
         *
         * @return
         */
        long publicKeyExponent();
    }

    /**
     * 获得一个随机RSA实体对象
     *
     * @return RSA实体
     */
    public static RsaEntity generateRsaEntity() throws NoSuchAlgorithmException {
        // 初始化RSA密钥生成器
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(ALGORITHM_NAME);
        keyPairGenerator.initialize(1024);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // 私钥与公钥
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();

        // 返回RSA实体
        return new RsaEntity() {

            @Override
            public byte[] privateKeyBytes() {
                return privateKey.getEncoded();
            }

            @Override
            public byte[] publicKeyBytes() {
                return publicKey.getEncoded();
            }

            @Override
            public byte[] privateKeyModulusBytes() {
                return privateKey.getModulus().toByteArray();
            }

            @Override
            public byte[] privateKeyExponentBytes() {
                return privateKey.getPrivateExponent().toByteArray();
            }

            @Override
            public byte[] publicKeyModulusBytes() {
                byte[] modulusBytes = publicKey.getModulus().toByteArray();
                byte[] publicKeyModulusBytes = new byte[modulusBytes.length - 1];
                System.arraycopy(modulusBytes, 1, publicKeyModulusBytes, 0, publicKeyModulusBytes.length);
                return publicKeyModulusBytes;
            }

            @Override
            public long publicKeyExponent() {
                return publicKey.getPublicExponent().longValue();
            }
        };
    }
}
