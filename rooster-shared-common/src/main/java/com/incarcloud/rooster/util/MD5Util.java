package com.incarcloud.rooster.util;

import org.apache.commons.codec.binary.Hex;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 生成MD5的工具类
 * 
 * @author Fanbeibei
 *
 */
public class MD5Util {
	private static MessageDigest s_md5;

	/**
	 * 获取MD5编码
	 * @param value
	 * @return
	 */
	public static String calcMd5(String value) {

		try {
			if (s_md5 == null) {
				s_md5 = MessageDigest.getInstance("MD5");
			}

			byte[] md5 = s_md5.digest(value.getBytes("utf-8"));
			return Hex.encodeHexString(md5);
		} catch (NoSuchAlgorithmException ex) {
			// ignore
		} catch (UnsupportedEncodingException ex) {
			// ignore
		}

		return null;
	}
}
