package com.incarcloud.rooster.util;

import io.netty.buffer.ByteBuf;

import java.io.UnsupportedEncodingException;
import java.util.regex.Pattern;

/**
 * DataPack工具类(readXXX方法均是调用ByteBuf的readXXX方法，会移动ByteBuf的读指针)
 *
 * @author Aaric, created on 2017-06-29T09:39.
 * @since 2.0
 */
public class DataPackUtil {

    /**
     * 默认字符集GBK常量字符串
     */
    public static final String DEFAULT_CHARSET_GBK = "GBK";

    /**
     * 默认字符集UTF-8常量字符串
     */
    public static final String DEFAULT_CHARSET_UTF8 = "UTF-8";

    /**
     * 读取1byte有符号整型
     *
     * @param buffer ByteBuf
     * @return integer
     */
    public static int readInt1(ByteBuf buffer) {
        if(null == buffer) {
            throw new IllegalArgumentException("buffer is null");
        }
        return buffer.readByte();
    }

    /**
     * 读取1byte无符号整型
     *
     * @param buffer ByteBuf
     * @return integer
     */
    public static int readUInt1(ByteBuf buffer) {
        if(null == buffer) {
            throw new IllegalArgumentException("buffer is null");
        }
        return buffer.readByte() & 0xFF;
    }

    /**
     * 读取指定长度的字节数组
     *
     * @param buffer ByteBuf
     * @param length length
     * @return
     */
    public static byte[] readBytes(ByteBuf buffer, int length) {
        if(null == buffer) {
            throw new IllegalArgumentException("buffer is null");
        }
        if(1 > length) {
            throw new IllegalArgumentException("length can't be less than 1");
        }
        byte[] bytes = new byte[length];
        buffer.readBytes(bytes);
        return bytes;
    }

    /**
     * 读取2byte有符号整型
     *
     * @param buffer ByteBuf
     * @return integer
     */
    public static int readInt2(ByteBuf buffer) {
        if(null == buffer) {
            throw new IllegalArgumentException("buffer is null");
        }
        byte[] bytes = readBytes(buffer, 2);
        return bytes[0] << 8 | (bytes[1] & 0XFF);
    }

    /**
     * 读取2byte无符号整型
     *
     * @param buffer ByteBuf
     * @return integer
     */
    public static int readUInt2(ByteBuf buffer) {
        if(null == buffer) {
            throw new IllegalArgumentException("buffer is null");
        }
        byte[] bytes = readBytes(buffer, 2);
        return (bytes[0] & 0xFF) << 8 | (bytes[1] & 0XFF);
    }

    /**
     * 读取4byte有符号整型
     *
     * @param buffer ByteBuf
     * @return integer
     */
    public static int readInt4(ByteBuf buffer) {
        if(null == buffer) {
            throw new IllegalArgumentException("buffer is null");
        }
        byte[] bytes = readBytes(buffer, 4);
        return bytes[0] << 24
                | (bytes[1] & 0xFF) << 16
                | (bytes[2] & 0xFF) << 8
                | (bytes[3] & 0xFF);
    }

    /**
     * 读取4byte无符号整型
     *
     * @param buffer ByteBuf
     * @return long
     */
    public static long readUInt4(ByteBuf buffer) {
        if(null == buffer) {
            throw new IllegalArgumentException("buffer is null");
        }
        byte[] bytes = readBytes(buffer, 4);
        return (bytes[0] & 0xFFL) << 24
                | (bytes[1] & 0xFF) << 16
                | (bytes[2] & 0xFF) << 8
                | (bytes[3] & 0xFF);
    }

    /**
     * 读取7个字节无符号整数
     *
     * @param buffer
     * @return
     */
    public static long readUInt7(ByteBuf buffer){

        byte [] bytes = readBytes(buffer,7);

        return 0 | (bytes[0] & 0xFFL) << 48
                | (bytes[1] & 0xFFL) << 40
                | (bytes[2] & 0xFFL) << 32
                | (bytes[3] & 0xFFL) << 24
                | (bytes[4] & 0xFFL) << 16
                | (bytes[5] & 0xFF) << 8
                | (bytes[6] & 0xFF) ;
    }

    /**
     * 读取以"0x00"结束的字符串
     *
     * @param buffer ByteBuf
     * @return gbk string
     */
    public static String readString(ByteBuf buffer) throws UnsupportedEncodingException {
        if(null == buffer) {
            throw new IllegalArgumentException("buffer is null");
        }
        int offset = buffer.readerIndex();
        while (0x00 != buffer.getByte(offset) && offset < buffer.writerIndex()) {
            offset++;
        }
        int length = offset - buffer.readerIndex();
        if(0 == length) {
            if(0x00 == buffer.readByte()) {
                return "";
            }
        } else if(0 < length) {
            byte[] bytes = readBytes(buffer, length);
            if(0x00 == buffer.readByte()) {
                return new String(bytes, DEFAULT_CHARSET_GBK);
            }
        }
        return null;
    }

    /**
     * 读取指定长度BCD码字符串数据<br>
     *     使用复合BCD码，一个字节表示2个十进制数字
     *
     * @param buffer ByteBuf
     * @param length 指定长度
     * @return
     */
    public static String readBCD(ByteBuf buffer, int length) {
        if(null == buffer) {
            throw new IllegalArgumentException("buffer is null");
        }
        if(0 < length) {
            int number;
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < length; i++) {
                number = readUInt1(buffer);
                stringBuffer.append(number >> 4 & 0x0F);
                stringBuffer.append(number & 0x0F);
            }
            return stringBuffer.toString();
        }
        return null;
    }

    /**
     * 获得整型数值的字节码信息<br>
     *     高位在前，低位在后
     *
     * @param integer 数值
     * @param length 字节数组长度，取值1,2,4
     * @return
     */
    public static byte[] getIntegerBytes(int integer, int length) {
        if(1 > length || 4 < length) {
            throw new IllegalArgumentException("the length is bigger than 0 or less than 4");
        }
        byte[] returnBytes = new byte[length];
        for (int i = 0; i < length; i++) {
            returnBytes[length - i - 1] = (byte) ((integer >> (8 * i)) & 0xFF);
        }
        return returnBytes;
    }

    /**
     * 获得复合BCD码字符串的字节码信息<br>
     *     复合BCD码字符：一个字节表示2个数字
     *
     * @param number 复合BCD码字符串，字符串长度必须是偶数
     * @return
     */
    public static byte[] getBCDBytes(String number) {
        if(null == number) {
            throw new IllegalArgumentException("number is null");
        }
        if(0 != number.length()%2) {
            throw new IllegalArgumentException("the length of number is odd");
        }
        if(Pattern.matches("\\\\b*", number)) {
            throw new IllegalArgumentException("number is not bcd string");
        }
        byte[] returnBytes = new byte[number.length()/2];
        for (int i = 0; i < number.length(); i = i + 2) {
            returnBytes[i / 2] = Integer.valueOf(number.charAt(i)  + "" + number.charAt(i + 1), 16).byteValue();
        }
        return returnBytes;
    }

    protected DataPackUtil(){}
}
