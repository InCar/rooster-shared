package com.incarcloud.rooster.util;

import io.netty.buffer.ByteBufUtil;
import org.junit.Assert;
import org.junit.Test;

import javax.crypto.Cipher;
import java.math.BigInteger;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Base64;

/**
 * RsaUtilTest
 *
 * @author Aaric, created on 2018-02-07T15:08.
 * @since 2.1.20-SNAPSHOT
 */
public class RsaUtilTest {

    @Test
    public void testRsa() throws Exception {
        String algorithmName = "RSA";

        // 生成密钥
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(algorithmName);
        keyPairGenerator.initialize(1024);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();

        byte[] privateKeyBytes = privateKey.getEncoded();
        byte[] publicKeyBytes = publicKey.getEncoded();
        System.out.println("第一种方式(字节流): ");
        System.out.println("私钥(要求使用PKCS8生成加解密器): " + ByteBufUtil.hexDump(privateKeyBytes));
        System.out.println("公钥(要求使用X509 生成加解密器): " + ByteBufUtil.hexDump(publicKeyBytes));
        System.out.println("");

        String privateKeyModulus = privateKey.getModulus().toString();
        String privateKeyExponent = privateKey.getPrivateExponent().toString();
        System.out.println("第二种方式(模n和指数e)：");
        System.out.println("私钥模数: " + privateKeyModulus);
        System.out.println("私钥指数: " + privateKeyExponent);
        byte[] publicKeyModulusBytes = publicKey.getModulus().toByteArray();
        byte[] tempPublicKeyModulusBytes = new byte[publicKeyModulusBytes.length - 1];
        System.arraycopy(publicKeyModulusBytes, 1, tempPublicKeyModulusBytes, 0, tempPublicKeyModulusBytes.length);
        long publicKeyExponent = publicKey.getPublicExponent().longValue();
        System.out.println("公钥模数: " + ByteBufUtil.hexDump(publicKeyModulusBytes));
        System.out.println(tempPublicKeyModulusBytes.length);
        System.out.println("公钥指数: " + publicKeyExponent);


        // 加解密测试
        String data = "hello world";

        /*PKCS8EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(privateKeyBytes);*/
        BigInteger privateModulus = new BigInteger(privateKeyModulus);
        BigInteger privateExponent = new BigInteger(privateKeyExponent);
        RSAPrivateKeySpec privateKeySpec = new RSAPrivateKeySpec(privateModulus, privateExponent);
        PrivateKey newPrivateKey = KeyFactory.getInstance(algorithmName).generatePrivate(privateKeySpec);
        Cipher encrypt = Cipher.getInstance(algorithmName);
        encrypt.init(Cipher.ENCRYPT_MODE, newPrivateKey);
        byte[] secret = encrypt.doFinal(data.getBytes());

        /*X509EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(publicKeyBytes);*/
        BigInteger publicModulus = new BigInteger(1, tempPublicKeyModulusBytes);
        BigInteger publicExponent = new BigInteger(String.valueOf(publicKeyExponent));
        RSAPublicKeySpec publicKeySpec = new RSAPublicKeySpec(publicModulus, publicExponent);
        PublicKey newPublicKey = KeyFactory.getInstance(algorithmName).generatePublic(publicKeySpec);
        Cipher decrypt = Cipher.getInstance(algorithmName);
        decrypt.init(Cipher.DECRYPT_MODE, newPublicKey);
        byte[] content = decrypt.doFinal(secret);


        Assert.assertEquals(data, new String(content));
    }

    @Test
    public void testGenerateRsaEntity() throws Exception {
        RsaUtil.RsaEntity rsaEntity = RsaUtil.generateRsaEntity();
        System.out.println(ByteBufUtil.hexDump(rsaEntity.getPrivateKeyBytes()));
        System.out.println(ByteBufUtil.hexDump(rsaEntity.getPublicKeyBytes()));
        System.out.println(ByteBufUtil.hexDump(rsaEntity.getPrivateKeyModulusBytes()));
        System.out.println(ByteBufUtil.hexDump(rsaEntity.getPrivateKeyExponentBytes()));
        System.out.println(ByteBufUtil.hexDump(rsaEntity.getPublicKeyModulusBytes()));
        System.out.println(rsaEntity.getPublicKeyExponent());
    }

    @Test
    public void testEncryptAndDecrypt() throws Exception {
        String content = "hello world";
        byte[] data = content.getBytes();
        byte[] secret;

        RsaUtil.RsaEntity rsaEntity = RsaUtil.generateRsaEntity();

        // 1.测试私钥加密，公钥解密(PKCS8, X509)
        secret = RsaUtil.encryptByRsaPrivate(data, rsaEntity.getPrivateKeyBytes());
        System.out.println("1-" + new String(RsaUtil.decryptByRsaPublic(secret, rsaEntity.getPublicKeyBytes())));

        // 2.测试公钥加密，私钥解密(PKCS8, X509)
        secret = RsaUtil.encryptByRsaPublic(data, rsaEntity.getPublicKeyBytes());
        System.out.println("2-" + new String(RsaUtil.decryptByRsaPrivate(secret, rsaEntity.getPrivateKeyBytes())));

        // 3.测试私钥加密，公钥解密({e,n})
        secret = RsaUtil.encryptByRsaPrivate(data, rsaEntity.getPrivateKeyModulusBytes(), rsaEntity.getPrivateKeyExponentBytes());
        System.out.println("3-" + new String(RsaUtil.decryptByRsaPublic(secret, rsaEntity.getPrivateKeyModulusBytes(), rsaEntity.getPublicKeyExponent())));

        // 4.测试公钥加密，私钥解密({e,n})
        secret = RsaUtil.encryptByRsaPublic(data, rsaEntity.getPrivateKeyModulusBytes(), rsaEntity.getPublicKeyExponent());
        System.out.println("4-" + new String(RsaUtil.decryptByRsaPrivate(secret, rsaEntity.getPrivateKeyModulusBytes(), rsaEntity.getPrivateKeyExponentBytes())));
    }

    private String encodeToString(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes);
    }

    @Test
    public void testEncryptAndDecrypt2() throws Exception {
        String content = "hello world";
        byte[] data = content.getBytes();
        byte[] secret;

        RsaUtil.RsaEntity rsaEntity = RsaUtil.generateRsaEntity();

        // 1.测试私钥加密，公钥解密(PKCS8, X509)
        secret = RsaUtil.encryptByRsaPrivate(data, encodeToString(rsaEntity.getPrivateKeyBytes()));
        System.out.println("1-" + new String(RsaUtil.decryptByRsaPublic(secret, rsaEntity.getPublicKeyBytes())));

        // 2.测试公钥加密，私钥解密(PKCS8, X509)
        secret = RsaUtil.encryptByRsaPublic(data, encodeToString(rsaEntity.getPublicKeyBytes()));
        System.out.println("2-" + new String(RsaUtil.decryptByRsaPrivate(secret, encodeToString(rsaEntity.getPrivateKeyBytes()))));

        // 3.测试私钥加密，公钥解密({e,n})
        secret = RsaUtil.encryptByRsaPrivate(data, encodeToString(rsaEntity.getPrivateKeyModulusBytes()), encodeToString(rsaEntity.getPrivateKeyExponentBytes()));
        System.out.println("3-" + new String(RsaUtil.decryptByRsaPublic(secret, encodeToString(rsaEntity.getPrivateKeyModulusBytes()), rsaEntity.getPublicKeyExponent())));

        // 4.测试公钥加密，私钥解密({e,n})
        secret = RsaUtil.encryptByRsaPublic(data, encodeToString(rsaEntity.getPrivateKeyModulusBytes()), rsaEntity.getPublicKeyExponent());
        System.out.println("4-" + new String(RsaUtil.decryptByRsaPrivate(secret, encodeToString(rsaEntity.getPrivateKeyModulusBytes()), encodeToString(rsaEntity.getPrivateKeyExponentBytes()))));
    }
}
