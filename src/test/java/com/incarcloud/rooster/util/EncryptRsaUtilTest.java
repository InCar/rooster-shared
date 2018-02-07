package com.incarcloud.rooster.util;

import io.netty.buffer.ByteBufUtil;
import org.junit.Test;

import javax.crypto.Cipher;
import java.math.BigInteger;
import java.security.*;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;

/**
 * EncryptRsaUtilTest
 *
 * @author Aaric, created on 2018-02-07T15:08.
 * @since 2.1.20-SNAPSHOT
 */
public class EncryptRsaUtilTest {

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
        System.out.println("privateKeyBytes: " + ByteBufUtil.hexDump(privateKeyBytes));
        System.out.println("publicKeyBytes:  " + ByteBufUtil.hexDump(publicKeyBytes));

        String privateKeyModulus = privateKey.getModulus().toString();
        String privateKeyExponent = privateKey.getPrivateExponent().toString();
        System.out.println("privateKeyModulus:  " + privateKeyModulus);
        System.out.println("privateKeyExponent: " + privateKeyExponent);
        String publicKeyModulus = publicKey.getModulus().toString();
        String publicKeyExponent = publicKey.getPublicExponent().toString();
        System.out.println("publicKeyModulus:   " + publicKeyModulus);
        System.out.println("publicKeyExponent:  " + publicKeyExponent);


        // 加解密测试
        String data = "hello world";

        /*PKCS8EncodedKeySpec privateKeySpec = new PKCS8EncodedKeySpec(privateKeyBytes);*/
        BigInteger privateModulus = new BigInteger(privateKeyModulus);
        BigInteger privateExponent = new BigInteger(privateKeyExponent);
        RSAPrivateKeySpec privateKeySpec = new RSAPrivateKeySpec(privateModulus, privateExponent);
        PrivateKey newPrivateKey = KeyFactory.getInstance(algorithmName).generatePrivate(privateKeySpec);
        Cipher encrypt = Cipher.getInstance(algorithmName);
        encrypt.init(Cipher.ENCRYPT_MODE, newPrivateKey);
        byte[] secert = encrypt.doFinal(data.getBytes());

        /*X509EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(publicKeyBytes);*/
        BigInteger publicModulus = new BigInteger(publicKeyModulus);
        BigInteger publicExponent = new BigInteger(publicKeyExponent);
        RSAPublicKeySpec publicKeySpec = new RSAPublicKeySpec(publicModulus, publicExponent);
        PublicKey newPublicKey = KeyFactory.getInstance(algorithmName).generatePublic(publicKeySpec);
        Cipher decrypt = Cipher.getInstance(algorithmName);
        decrypt.init(Cipher.DECRYPT_MODE, newPublicKey);
        byte[] content = decrypt.doFinal(secert);
        System.out.println(new String(content));
    }
}
