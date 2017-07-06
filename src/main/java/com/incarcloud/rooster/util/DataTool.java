package com.incarcloud.rooster.util;

import com.incarcloud.rooster.exception.ConversionException;
import io.netty.buffer.ByteBuf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.HashMap;

import static io.netty.buffer.Unpooled.buffer;

/**
 * 工具类
 * Created by sunjun on 2017/7/3.
 */
@Component
public class DataTool {

    private static final String DEFAULT_CHARSET="UTF-8";
    private Logger _logger = LoggerFactory.getLogger(DataTool.class);

    public static byte[] getIpBytes(String ip){
        //IP地址转换  192.168.1.1读出 00 00 C0 A8 01 01
        String[] ips=ip.split("\\.");
        byte[] bytes = new byte[]{(byte)0,(byte)0,(byte)Integer.parseInt(ips[0]),(byte)Integer.parseInt(ips[1]),(byte)Integer.parseInt(ips[2]),(byte)Integer.parseInt(ips[3])};
        return bytes;
    }

    public static String getBinaryStrFromByte(byte b){
        //将byte转换层二进制字符串 (byte)170  ->> 10101010
        String result ="";
        byte a = b;
        for (int i = 0; i < 8; i++)
        {
            byte c=a;
            a=(byte)(a>>1);
            a=(byte)(a<<1);
            if(a==c){
                result="0"+result;
            }else{
                result="1"+result;
            }
            a=(byte)(a>>1);
        }
        return result;
    }

    public static String bytes2hex(byte[] bArray) {
        //字节数据转16进制字符串
        StringBuffer sb = new StringBuffer(bArray.length);
        String sTemp;
        for (int i = 0; i < bArray.length; i++) {
            sTemp = Integer.toHexString(0xFF & bArray[i]);
            if (sTemp.length() < 2)
                sb.append(0);
            sb.append(sTemp.toUpperCase());
        }
        return getSpaceHex(sb.toString());
    }

    public static String getLengthString(String str,int length){
        //将给定字符串右补空格为定长字符串
        if(str==null){
            return str;
        }
        if(str.length()>=length){
            return str;
        }
        while (str.length()<length){
            str=str+" ";
        }
        return str;
    }

    public static String getLengthBytesString(String str,int length) {
        //将给定字符串右补空格为定长字符串
        if (str == null) {
            return str;
        }
        try {
            if (str.getBytes("UTF-8").length >= length) {
                return str;
            }
            while (str.getBytes("UTF-8").length < length) {
                str = str + " ";
            }
        }catch (UnsupportedEncodingException e){e.printStackTrace();}
            return str;

    }

    public static char[] getBitsFrom2Byte(byte[]  bytes){
        String a=new String(getBitsFromByte(bytes[0])) + new String(getBitsFromByte(bytes[1]));
        return a.toCharArray();
    }

    public static char[] getBitsFrom3Byte(byte[]  bytes){
        String a=new String(getBitsFromByte(bytes[0])) + new String(getBitsFromByte(bytes[1]) + new String(getBitsFromByte(bytes[2])));
        return a.toCharArray();
    }
    public static char[] getBitsFromInteger(int value){
        //双字节转二进制
        char[] array=new char[16];
        for (int j = 15; j >= 0; j--)
        {
            if (((1 << j) & value) != 0)
            {
                array[15-j]='1';
            }
            else
            {
                array[15-j]='0';
            }
        }
        return array;
    }
    public static char[] getBitsFromLong(long value){
        //4字节转二进制
        char[] array=new char[32];
        for (int j = 31; j >= 0; j--)
        {
            if (((1 << j) & value) != 0)
            {
                array[31-j]='1';
            }
            else
            {
                array[31-j]='0';
            }
        }
        return array;
    }

    public static char[] getBitsFromShort(short a){
        //取包含8个数字的数组
        String binStr=getBinaryStrFromByte((byte)a);
        return binStr.toCharArray();
    }
    public static char[] getBitsFromByte(Byte a){
        //取包含8个数字的数组
        String binStr=getBinaryStrFromByte(a);
        return binStr.toCharArray();
    }


    public  static String getSpaceHex(String str){
        //将不带空格的16进制字符串加上空格
        String re="";
        String regex = "(.{2})";
        re = str.replaceAll (regex, "$1 ");
        return re;
    }

    public static byte[] getBytesFromHexString(String str){

        return getBytesFromByteBuf(getByteBuf(str));
    }

    public static ByteBuf getByteBuf(String str){
        //根据16进制字符串得到ByteBuf对象(netty)
        ByteBuf bb=buffer(1024);

        String[] command=str.split(" ");
        byte[] abc=new byte[command.length];
        for(int i=0;i<command.length;i++){
            abc[i]=Integer.valueOf(command[i],16).byteValue();
        }
        bb.writeBytes(abc);
        return bb;
    }


    public  static byte[] getBytesFromByteBuf(ByteBuf buf){
        //基于netty
        byte[] result = new byte[buf.readableBytes()];
        buf.readBytes(result, 0, buf.readableBytes());
        return result;
    }

    public static byte[] getBytesFromByteBuf(ByteBuf buf, int len){
        //基于netty
        byte[] result = new byte[len];
        buf.readBytes(result, 0, len);
        return result;
    }

    /**
     * 读出字符串，去掉末尾的0
     * @param dis
     * @return
     */
    public static String readStringZero(DataInputStream dis){
        String sb = "";
        try {
            while(dis!= null){
                byte b= dis.readByte();
                if(b!='\000' && b!=','){//','=0x2C  '\000'=0x00
                    char c = (char) (b&0xFF);
                    String temp = String.valueOf(c);
                    sb = sb+temp;
                } else{
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new ConversionException("无法读出以0结尾的字符串");
        }
        return sb;
    }
    public static String readStringZero(ByteBuf bb) {
        String sb = "";
        try {
            while(bb!= null){
                byte b= bb.readByte();
                if(b!='\000' && b!=','){//','=0x2C  '\000'=0x00
                    char c = (char) (b&0xFF);
                    String temp = String.valueOf(c);
                    sb = sb+temp;
                } else{
                    break;
                }
            }
        } catch (Exception e ){
            e.printStackTrace();
            throw new ConversionException("无法读出以0结尾的字符串");
        }
        return sb;
    }

    /**
     * 写入字符串，末尾补0
     * @param str   字符串
     */
    public static void writeStringZero(DataOutputStream dos, String str, boolean addZero){
        try {
            byte[] strBytes = str.getBytes(DEFAULT_CHARSET);
            dos.write(strBytes);
            if(addZero){
                dos.writeByte(0x00);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new ConversionException("字符串"+str+"0无法转换成byte数组");
        }
    }
    public static void writeStringZero(ByteBuffer bb, String str, boolean addZero){
        try {
            byte[] strBytes = str.getBytes(DEFAULT_CHARSET);
            bb.put(strBytes);
            if(addZero){
                bb.put((byte) 0x00);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new ConversionException("字符串"+str+"0无法转换成byte数组");
        }
    }
    public static void writeStringZero(ByteBuf bb, String str, boolean addZero) {
        try {
            byte[] strBytes = str.getBytes(DEFAULT_CHARSET);
            bb.writeBytes(strBytes);
            if(addZero){
                bb.writeByte((byte) 0x00);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new ConversionException("字符串"+str+"0无法转换成byte数组");
        }
    }

    public static byte[] mergeBytes(byte[] byte_1, byte[] byte_2) {
        byte[] byte_3 = new byte[byte_1.length + byte_2.length];
        System.arraycopy(byte_1, 0, byte_3, 0, byte_1.length);
        System.arraycopy(byte_2, 0, byte_3, byte_1.length, byte_2.length);
        return byte_3;
    }

}
