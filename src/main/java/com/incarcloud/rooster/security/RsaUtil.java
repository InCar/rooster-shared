package com.incarcloud.rooster.security;

import javax.crypto.Cipher;
import java.math.BigInteger;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

/**
 * RSA加解密工具类
 *
 * @author Aaric, created on 2018-02-08T09:54.
 * @since 2.1.20-SNAPSHOT
 */
public class RsaUtil {

    /**
     * RSA实体
     */
    public interface RsaEntity {

        /**
         * 算法名称
         */
        String ALGORITHM_NAME = "RSA";

        /**
         * RSA私钥字节数组(要求使用PKCS8生成加解密器)
         *
         * @return
         */
        byte[] getPrivateKeyBytes();

        /**
         * RSA公钥字节数组(要求使用X509 生成加解密器)
         *
         * @return
         */
        byte[] getPublicKeyBytes();

        /**
         * RSA私钥{e,n}中的 n
         *
         * @return
         */
        byte[] getPrivateKeyModulusBytes();

        /**
         * RSA私钥{e,n}中的 e
         *
         * @return
         */
        byte[] getPrivateKeyExponentBytes();

        /**
         * RSA公钥{e,n}中的 n, 128位bytes
         *
         * @return
         */
        byte[] getPublicKeyModulusBytes();

        /**
         * RSA公钥{e,n}中的 e
         *
         * @return
         */
        long getPublicKeyExponent();
    }

    /**
     * 获得一个随机RSA实体对象
     *
     * @return RSA实体
     */
    public static RsaEntity generateRsaEntity() throws NoSuchAlgorithmException {
        // 初始化RSA密钥生成器
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(RsaEntity.ALGORITHM_NAME);
        keyPairGenerator.initialize(1024);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // 私钥与公钥
        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();

        // 返回RSA实体
        return new RsaEntity() {

            @Override
            public byte[] getPrivateKeyBytes() {
                return privateKey.getEncoded();
            }

            @Override
            public byte[] getPublicKeyBytes() {
                return publicKey.getEncoded();
            }

            @Override
            public byte[] getPrivateKeyModulusBytes() {
                return privateKey.getModulus().toByteArray();
            }

            @Override
            public byte[] getPrivateKeyExponentBytes() {
                return privateKey.getPrivateExponent().toByteArray();
            }

            @Override
            public byte[] getPublicKeyModulusBytes() {
                byte[] modulusBytes = publicKey.getModulus().toByteArray();
                byte[] publicKeyModulusBytes = new byte[modulusBytes.length - 1];
                System.arraycopy(modulusBytes, 1, publicKeyModulusBytes, 0, publicKeyModulusBytes.length);
                return publicKeyModulusBytes;
            }

            @Override
            public long getPublicKeyExponent() {
                return publicKey.getPublicExponent().longValue();
            }
        };
    }

    /**
     * RSA私钥加密内容
     *
     * @param data            待加密内容
     * @param privateKeyBytes RSA私钥内容
     * @return
     * @throws Exception
     */
    public static byte[] encryptByRsaPrivate(byte[] data, byte[] privateKeyBytes) throws Exception {
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(privateKeyBytes);
        PrivateKey privateKey = KeyFactory.getInstance(RsaEntity.ALGORITHM_NAME).generatePrivate(keySpec);
        Cipher encrypt = Cipher.getInstance(RsaEntity.ALGORITHM_NAME);
        encrypt.init(Cipher.ENCRYPT_MODE, privateKey);
        return encrypt.doFinal(data);
    }

    /**
     * RSA私钥加密内容
     *
     * @param data             待加密内容
     * @param privateKeyString RSA私钥字符串(Base64编码)
     * @return
     * @throws Exception
     */
    public static byte[] encryptByRsaPrivate(byte[] data, String privateKeyString) throws Exception {
        return encryptByRsaPrivate(data, decodeBase64String(privateKeyString));
    }

    /**
     * RSA私钥加密内容
     *
     * @param data                    待加密内容
     * @param privateKeyModulusBytes  RSA私钥模数
     * @param privateKeyExponentBytes RSA私钥指数
     * @return
     * @throws Exception
     */
    public static byte[] encryptByRsaPrivate(byte[] data, byte[] privateKeyModulusBytes, byte[] privateKeyExponentBytes) throws Exception {
        BigInteger privateModulus = new BigInteger(privateKeyModulusBytes);
        BigInteger privateExponent = new BigInteger(privateKeyExponentBytes);
        RSAPrivateKeySpec keySpec = new RSAPrivateKeySpec(privateModulus, privateExponent);
        PrivateKey privateKey = KeyFactory.getInstance(RsaEntity.ALGORITHM_NAME).generatePrivate(keySpec);
        Cipher encrypt = Cipher.getInstance(RsaEntity.ALGORITHM_NAME);
        encrypt.init(Cipher.ENCRYPT_MODE, privateKey);
        return encrypt.doFinal(data);
    }

    /**
     * RSA私钥加密内容
     *
     * @param data                     待加密内容
     * @param privateKeyModulusString  RSA私钥模数字符串(Base64编码)
     * @param privateKeyExponentString RSA私钥指数字符串(Base64编码)
     * @return
     * @throws Exception
     */
    public static byte[] encryptByRsaPrivate(byte[] data, String privateKeyModulusString, String privateKeyExponentString) throws Exception {
        return encryptByRsaPrivate(data, decodeBase64String(privateKeyModulusString), decodeBase64String(privateKeyExponentString));
    }

    /**
     * RSA公钥加密内容
     *
     * @param data           RSA待加密内容
     * @param publicKeyBytes RSA公钥内容
     * @return
     * @throws Exception
     */
    public static byte[] encryptByRsaPublic(byte[] data, byte[] publicKeyBytes) throws Exception {
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(publicKeyBytes);
        PublicKey publicKey = KeyFactory.getInstance(RsaEntity.ALGORITHM_NAME).generatePublic(keySpec);
        Cipher encrypt = Cipher.getInstance(RsaEntity.ALGORITHM_NAME);
        encrypt.init(Cipher.ENCRYPT_MODE, publicKey);
        return encrypt.doFinal(data);
    }

    /**
     * RSA公钥加密内容
     *
     * @param data            RSA待加密内容
     * @param publicKeyString RSA公钥字符串(Base64编码)
     * @return
     * @throws Exception
     */
    public static byte[] encryptByRsaPublic(byte[] data, String publicKeyString) throws Exception {
        return encryptByRsaPublic(data, decodeBase64String(publicKeyString));
    }

    /**
     * RSA公钥加密内容
     *
     * @param data                  待加密内容
     * @param publicKeyModulusBytes RSA公钥模数
     * @param publicKeyExponent     RSA公钥指数
     * @return
     * @throws Exception
     */
    public static byte[] encryptByRsaPublic(byte[] data, byte[] publicKeyModulusBytes, long publicKeyExponent) throws Exception {
        BigInteger publicModulus = new BigInteger(1, publicKeyModulusBytes);
        BigInteger publicExponent = new BigInteger(String.valueOf(publicKeyExponent));
        RSAPublicKeySpec keySpec = new RSAPublicKeySpec(publicModulus, publicExponent);
        PublicKey publicKey = KeyFactory.getInstance(RsaEntity.ALGORITHM_NAME).generatePublic(keySpec);
        Cipher encrypt = Cipher.getInstance(RsaEntity.ALGORITHM_NAME);
        encrypt.init(Cipher.ENCRYPT_MODE, publicKey);
        return encrypt.doFinal(data);
    }

    /**
     * RSA公钥加密内容
     *
     * @param data                   待加密内容
     * @param publicKeyModulusString RSA公钥模数字符串(Base64编码)
     * @param publicKeyExponent      RSA公钥指数
     * @return
     * @throws Exception
     */
    public static byte[] encryptByRsaPublic(byte[] data, String publicKeyModulusString, long publicKeyExponent) throws Exception {
        return encryptByRsaPublic(data, decodeBase64String(publicKeyModulusString), publicKeyExponent);
    }

    /**
     * RSA私钥解密内容
     *
     * @param secret          加密内容
     * @param privateKeyBytes RSA私钥内容
     * @return
     * @throws Exception
     */
    public static byte[] decryptByRsaPrivate(byte[] secret, byte[] privateKeyBytes) throws Exception {
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(privateKeyBytes);
        PrivateKey publicKey = KeyFactory.getInstance(RsaEntity.ALGORITHM_NAME).generatePrivate(keySpec);
        Cipher decrypt = Cipher.getInstance(RsaEntity.ALGORITHM_NAME);
        decrypt.init(Cipher.DECRYPT_MODE, publicKey);
        return decrypt.doFinal(secret);
    }

    /**
     * RSA私钥解密内容
     *
     * @param secret           加密内容
     * @param privateKeyString RSA私钥字符串(Base64编码)
     * @return
     * @throws Exception
     */
    public static byte[] decryptByRsaPrivate(byte[] secret, String privateKeyString) throws Exception {
        return decryptByRsaPrivate(secret, decodeBase64String(privateKeyString));
    }

    /**
     * RSA私钥解密内容
     *
     * @param secret                  加密内容
     * @param privateKeyModulusBytes  RSA私钥模数
     * @param privateKeyExponentBytes RSA私钥指数
     * @return
     * @throws Exception
     */
    public static byte[] decryptByRsaPrivate(byte[] secret, byte[] privateKeyModulusBytes, byte[] privateKeyExponentBytes) throws Exception {
        BigInteger privateModulus = new BigInteger(1, privateKeyModulusBytes);
        BigInteger privateExponent = new BigInteger(privateKeyExponentBytes);
        RSAPrivateKeySpec keySpec = new RSAPrivateKeySpec(privateModulus, privateExponent);
        PrivateKey privateKey = KeyFactory.getInstance(RsaEntity.ALGORITHM_NAME).generatePrivate(keySpec);
        Cipher decrypt = Cipher.getInstance(RsaEntity.ALGORITHM_NAME);
        decrypt.init(Cipher.DECRYPT_MODE, privateKey);
        return decrypt.doFinal(secret);
    }

    /**
     * RSA私钥解密内容
     *
     * @param secret                   加密内容
     * @param privateKeyModulusString  RSA私钥模数字符串(Base64编码)
     * @param privateKeyExponentString RSA私钥指数字符串(Base64编码)
     * @return
     * @throws Exception
     */
    public static byte[] decryptByRsaPrivate(byte[] secret, String privateKeyModulusString, String privateKeyExponentString) throws Exception {
        return decryptByRsaPrivate(secret, decodeBase64String(privateKeyModulusString), decodeBase64String(privateKeyExponentString));
    }

    /**
     * RSA公钥解密内容
     *
     * @param secret         加密内容
     * @param publicKeyBytes RSA公钥内容
     * @return
     * @throws Exception
     */
    public static byte[] decryptByRsaPublic(byte[] secret, byte[] publicKeyBytes) throws Exception {
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(publicKeyBytes);
        PublicKey publicKey = KeyFactory.getInstance(RsaEntity.ALGORITHM_NAME).generatePublic(keySpec);
        Cipher decrypt = Cipher.getInstance(RsaEntity.ALGORITHM_NAME);
        decrypt.init(Cipher.DECRYPT_MODE, publicKey);
        return decrypt.doFinal(secret);
    }

    /**
     * RSA公钥解密内容
     *
     * @param secret          加密内容
     * @param publicKeyString RSA公钥字符串(Base64编码)
     * @return
     * @throws Exception
     */
    public static byte[] decryptByRsaPublic(byte[] secret, String publicKeyString) throws Exception {
        return decryptByRsaPublic(secret, decodeBase64String(publicKeyString));
    }

    /**
     * RSA公钥解密内容
     *
     * @param secret                加密内容
     * @param publicKeyModulusBytes RSA公钥模数
     * @param publicKeyExponent     RSA公钥指数
     * @return
     * @throws Exception
     */
    public static byte[] decryptByRsaPublic(byte[] secret, byte[] publicKeyModulusBytes, long publicKeyExponent) throws Exception {
        BigInteger publicModulus = new BigInteger(1, publicKeyModulusBytes);
        BigInteger publicExponent = new BigInteger(String.valueOf(publicKeyExponent));
        RSAPublicKeySpec keySpec = new RSAPublicKeySpec(publicModulus, publicExponent);
        PublicKey publicKey = KeyFactory.getInstance(RsaEntity.ALGORITHM_NAME).generatePublic(keySpec);
        Cipher decrypt = Cipher.getInstance(RsaEntity.ALGORITHM_NAME);
        decrypt.init(Cipher.DECRYPT_MODE, publicKey);
        return decrypt.doFinal(secret);
    }

    /**
     * RSA公钥解密内容
     *
     * @param secret                 加密内容
     * @param publicKeyModulusString RSA公钥模数字符串(Base64编码)
     * @param publicKeyExponent      RSA公钥指数
     * @return
     * @throws Exception
     */
    public static byte[] decryptByRsaPublic(byte[] secret, String publicKeyModulusString, long publicKeyExponent) throws Exception {
        return decryptByRsaPublic(secret, decodeBase64String(publicKeyModulusString), publicKeyExponent);
    }

    /**
     * 加密字符串为字节数组
     *
     * @param content 字符串(Base64编码)
     * @return
     */
    private static byte[] decodeBase64String(String content) {
        return Base64.getDecoder().decode(content);
    }
}
