package com.incarcloud.rooster.security;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import java.util.Base64;

/**
 * AES加解密工具类
 *
 * @author Aaric, created on 2018-02-09T09:51.
 * @since 2.1.20-SNAPSHOT
 */
public class AesUtil {

    /**
     * 算法名称
     * 加解密算法/模式/填充方式
     */
    private static final String ALGORITHM_NAME = "AES/CBC/PKCS5Padding";

    /**
     * 算法名称
     */
    private static final String ALGORITHM = "AES";

    /**
     * 生成AES密钥
     *
     * @return
     */
    public static byte[] generateAesSecret() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(ALGORITHM);
        keyGenerator.init(128, new SecureRandom());
        SecretKey secretKey = keyGenerator.generateKey();
        return secretKey.getEncoded();
    }

    /**
     * AES加密内容
     *
     * @param data           待加密内容
     * @param secretKeyBytes 128位AES密钥
     * @param ivParameter    CBC模式-16位密钥
     * @return
     * @throws Exception
     */
    public static byte[] encrypt(byte[] data, byte[] secretKeyBytes, byte[] ivParameter) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(secretKeyBytes, ALGORITHM);
        //使用CBC模式，需要一个向量iv，可增加加密算法的强度
        IvParameterSpec ivSpec = new IvParameterSpec(ivParameter);
        Cipher cipher = Cipher.getInstance(ALGORITHM_NAME);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
        return cipher.doFinal(data);
    }

    /**
     * AES加密内容
     *
     * @param data            待加密内容
     * @param secretKeyString 128位AES密钥字符串(Base64编码)
     * @param ivParameter     CBC模式-16位密钥
     * @return
     * @throws Exception
     */
    public static byte[] encrypt(byte[] data, String secretKeyString, String ivParameter) throws Exception {
        return encrypt(data, decodeBase64String(secretKeyString), ivParameter.getBytes());
    }

    /**
     * AES解密内容
     *
     * @param secret         加密内容
     * @param secretKeyBytes 128位AES密钥
     * @param ivParameter    CBC模式-16位密钥
     * @return
     * @throws Exception
     */
    public static byte[] decrypt(byte[] secret, byte[] secretKeyBytes, byte[] ivParameter) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(secretKeyBytes, ALGORITHM);
        IvParameterSpec ivSpec = new IvParameterSpec(ivParameter);
        Cipher cipher = Cipher.getInstance(ALGORITHM_NAME);
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
        return cipher.doFinal(secret);
    }

    /**
     * AES解密内容
     *
     * @param secret          加密内容
     * @param secretKeyString 128位AES密钥字符串(Base64编码)
     * @param ivParameter     CBC模式-16位密钥
     * @return
     * @throws Exception
     */
    public static byte[] decrypt(byte[] secret, String secretKeyString, String ivParameter) throws Exception {
        return decrypt(secret, decodeBase64String(secretKeyString), ivParameter.getBytes());
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
