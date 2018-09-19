package com.incarcloud.rooster.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * 行键工具类
 *
 * @author Aaric
 * @version 2.3.2-SNAPSHOT
 */
public class RowKeyUtil {

    /**
     * BigTable存储数据RowKey规则，行键总共61位，例如：bc3c000LSBAAAAAAZZ000001TRIP###########20180910120000####0001
     *     bc3c     000LSBAAAAAAZZ000001    TRIP###########     20180910120000####       0001
     *     ----     --------------------    ---------------     ------------------       ----
     *   4位Hash值     20位VIN号或者设备号      15位DataPack类型         18位检测时间         4位随机数
     *
     * 4位Hash值：MD5(VIN)，取前4位字符串
     * 18位检测时间：前14位为年月日时分秒，第15位为N表示设备没有上传采集时间，由系统自动加上当前时间作为采集时间
     * 4位随机数：解决同一时间上传一个数据包，里头包含两个告警数据导致数据覆盖的问题
     */
    /**
     * 长度：4位Hash值
     */
    private static final int ROWKEY_HASE_FIXED_SIZE = 4;

    /**
     * 长度：20位VIN号或者设备号
     */
    private static final int ROWKEY_ID_FIXED_SIZE = 20;

    /**
     * 长度：15位DataPack类型
     */
    private static final int ROWKEY_TYPE_FIXED_SIZE = 15;

    /**
     * 长度：18位检测时间
     */
    private static final int ROWKEY_TIME_FIXED_SIZE = 18;

    /**
     * 长度：4位随机数
     */
    private static final int ROWKEY_RANDOM_FIXED_SIZE = 4;

    /**
     * 行键总共61位
     */
    public static final int ROWKEY_LENGTH = ROWKEY_HASE_FIXED_SIZE
            + ROWKEY_ID_FIXED_SIZE
            + ROWKEY_TYPE_FIXED_SIZE
            + ROWKEY_TIME_FIXED_SIZE
            + ROWKEY_RANDOM_FIXED_SIZE;

    /**
     * 生成最小行键填充字符
     */
    public static final char ROWKEY_CHAR_FILL_MIN = '#';

    /**
     * 生成最大行键填充字符
     */
    public static final char ROWKEY_CHAR_FILL_MAX = 'z';

    /**
     * 生成零填充字符
     */
    public static final char ROWKEY_CHAR_FILL_ZERO = '0';

    /**
     * 生成4位Hash值+20位VIN号或者设备号
     *
     * @param vin 车架号
     * @return
     */
    private static String appendVinString(String vin) {
        return StringUtils.left(DigestUtils.md5Hex(vin), ROWKEY_HASE_FIXED_SIZE)
                + StringUtils.leftPad(vin, ROWKEY_ID_FIXED_SIZE, ROWKEY_CHAR_FILL_ZERO);
    }

    /**
     * 生成15位DataPack类型
     *
     * @param type 数据类型
     * @return
     */
    private static String appendTypeString(String type) {
        return StringUtils.rightPad(type, ROWKEY_TYPE_FIXED_SIZE, ROWKEY_CHAR_FILL_MIN);
    }

    /**
     * 生成15位DataPack类型
     *
     * @param time 检测时间
     * @return
     */
    private static String appendTimeString(String time) {
        return StringUtils.rightPad(time, ROWKEY_TIME_FIXED_SIZE, ROWKEY_CHAR_FILL_MIN);
    }

    /**
     * 生产4位随机数，固定"0001"
     *
     * @return
     */
    private static String appendRandomString() {
        return "0001";
    }

    /**
     * 生成追加最小字符串
     *
     * @return
     */
    private static String appendFillMinString() {
        return StringUtils.leftPad("", 2, ROWKEY_CHAR_FILL_MIN);
    }

    /**
     * 生成追加最大字符串
     *
     * @return
     */
    private static String appendFillMaxString() {
        return StringUtils.leftPad("", 2, ROWKEY_CHAR_FILL_MAX);
    }

    /**
     * 生成存储行键字符串
     *
     * @param vin  车架号
     * @param type 数据类型
     * @param time 检测时间
     * @return
     */
    public static String makeRowKey(String vin, String type, String time) {
        return appendVinString(vin) + appendTypeString(type) + appendTimeString(time) + appendRandomString();
    }

    /**
     * 生成最小行键字符串
     *
     * @param vin 车架号
     * @return
     */
    public static String makeMinRowKey(String vin) {
        return appendVinString(vin) + appendFillMinString();
    }

    /**
     * 生成最小行键字符串
     *
     * @param vin  车架号
     * @param type 数据类型
     * @return
     */
    public static String makeMinRowKey(String vin, String type) {
        return appendVinString(vin) + appendTypeString(type) + appendFillMinString();
    }

    /**
     * 生成最小行键字符串
     *
     * @param vin  车架号
     * @param type 数据类型
     * @param time 检测时间
     * @return
     */
    public static String makeMinRowKey(String vin, String type, String time) {
        return appendVinString(vin) + appendTypeString(type) + appendTimeString(time) + appendFillMinString();
    }

    /**
     * 生成最大行键字符串
     *
     * @param vin 车架号
     * @return
     */
    public static String makeMaxRowKey(String vin) {
        return appendVinString(vin) + appendFillMaxString();
    }

    /**
     * 生成最大行键字符串
     *
     * @param vin  车架号
     * @param type 数据类型
     * @return
     */
    public static String makeMaxRowKey(String vin, String type) {
        return appendVinString(vin) + appendTypeString(type) + appendFillMaxString();
    }

    /**
     * 生成最大行键字符串
     *
     * @param vin  车架号
     * @param type 数据类型
     * @param time 检测时间
     * @return
     */
    public static String makeMaxRowKey(String vin, String type, String time) {
        return appendVinString(vin) + appendTypeString(type) + appendTimeString(time) + appendFillMaxString();
    }

    /**
     * 根据rowkey获得datapack类型字符串
     *
     * @param rowKey 行键
     * @return
     */
    public static String getDataPackType(String rowKey) {
        int minSize = ROWKEY_HASE_FIXED_SIZE + ROWKEY_ID_FIXED_SIZE + ROWKEY_TYPE_FIXED_SIZE;
        if (StringUtils.isNotBlank(rowKey) && minSize < rowKey.length()) {
            int startIndex = ROWKEY_HASE_FIXED_SIZE + ROWKEY_ID_FIXED_SIZE;
            return rowKey.substring(startIndex, minSize).replaceAll("#", "");
        }
        return null;
    }
}
