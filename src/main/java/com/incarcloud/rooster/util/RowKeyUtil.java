package com.incarcloud.rooster.util;/**
 * Created by fanbeibei on 2017/7/4.
 */

import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author Fan Beibei
 * @Description: 行键工具类
 * @date 2017/7/4 17:00
 */
public class RowKeyUtil {

    // 固定32个字符,用来补充长度不足的字串
    private static final String c_sharp32 = "################################";
    private static final String c_zero32 = "00000000000000000000000000000000";

    private static final DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");

    /**
     * 生成数据区的主键列值 规则：MD5(ID)前4位+车辆VIN码(20位)+数据类型(15位)+创建时间(17位)
     *
     * @param vin 车辆vin码
     * @param dataType 数据类型
     * @param receiveTime 数据上传时间
     * @return
     */
    public static String makeRowKey(String vin, String dataType, String receiveTime) {
        if (StringUtil.isBlank(vin)) {
            throw new IllegalArgumentException("param error");
        }

        return String.format("%s%s%s%s", MD5Util.calcMd5(vin).substring(0, 4),
                prependForceLen(vin, 20), appendForceLen(dataType, 15),
                appendForceLen(receiveTime, 17));
    }


    /**
     * 追加#方式强制字符串长度
     *
     * @param value
     * @param len
     * @return
     */
    public static String appendForceLen(String value, int len) {

        if (value == null)
            value = "";

        if (value.length() == len)
            return value;
        else if (value.length() > len)
            return value.substring(0, len);
        else {
            // 为了提高性能,不太长的字符串不使用StringBuilder来补足
            int lenPad = len - value.length();
            if (lenPad <= c_sharp32.length()) {
                return value + c_sharp32.substring(0, lenPad);
            } else {
                StringBuilder sbX = new StringBuilder(len);
                sbX.append(value);
                sbX.setLength(len);
                for (int i = value.length(); i < len; i++)
                    sbX.setCharAt(i, '#');
                return sbX.toString();
            }
        }
    }

    /**
     * 前面添0方式强制字符串长度,用于将整形ID补充为等长字符串且不影响按大小排序
     *
     * @param value
     * @param len
     * @return
     */
    public static String prependForceLen(String value, int len) {

        if (value == null)
            value = "";

        if (value.length() == len)
            return value;
        else if (value.length() > len)
            return value.substring(0, len);
        else {
            // 为了提高性能,不太长的字符串不使用StringBuilder来补足
            int lenPad = len - value.length();
            if (lenPad <= c_zero32.length()) {
                return c_zero32.substring(0, lenPad) + value;
            } else {
                int sbXlen = len - value.length();
                StringBuilder sbX = new StringBuilder(sbXlen);
                sbX.setLength(sbXlen);

                for (int i = 0; i < sbXlen; i++)
                    sbX.setCharAt(i, '0');
                sbX.append(value);
                return sbX.toString();
            }
        }
    }

    public static void main(String[] args) {

        // String s = prependForceLen("123456789",64);
//		String s = appendForceLen("123456789", 18);
//		System.out.println(s.length() + "位:" + s);
//
//		System.out.println(dtFormat.format(LocalDateTime.now()));

//		System.out.println(makeSecondIndexPk("USER_NAME", "MIKE", "3fcdINCAR_USER#00000001492526612447"));

//        System.out.println(makeDataPk("123456789"));


    }

}