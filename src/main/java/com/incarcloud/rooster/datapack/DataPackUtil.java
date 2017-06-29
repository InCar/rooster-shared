package com.incarcloud.rooster.datapack;

import io.netty.buffer.ByteBuf;

import java.io.UnsupportedEncodingException;

/**
 * DataPack工具类
 *
 * @author Aaric, created on 2017-06-29T09:39.
 * @since 2.0
 */
public class DataPackUtil {

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
        if(0 < length) {
            byte[] bytes = readBytes(buffer, length);
            if(0x00 == buffer.readByte()) {
                return new String(bytes, "GBK");
            }
        }
        return null;
    }

    private DataPackUtil(){}
}
