package com.incarcloud.rooster.util;/**
 * Created by fanbeibei on 2017/7/4.
 */

import com.incarcloud.rooster.datapack.DataPack;
import com.incarcloud.rooster.mq.MQMsg;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * @author Fan Beibei
 * @Description: 关于MQMsg的工具类
 * @date 2017/7/4 9:55
 */
public class MQMsgUtil {
    private static org.slf4j.Logger s_logger = LoggerFactory.getLogger(MQMsgUtil.class);


    private MQMsgUtil() {
    }

    /**
     * DataPack转换为MQMsg对象
     *
     * @param dataPack
     * @return
     */
    public static MQMsg convertDataPackToMQMsg(DataPack dataPack) {
        MQMsg mqMsg = new MQMsg();
        mqMsg.setMark(dataPack.getMark());
        mqMsg.setData(dataPack.getDataB64().getBytes());

        return mqMsg;
    }

    /**
     * MQMsg转换为DataPack对象
     *
     * @param mqMsg
     * @return
     */
    public static DataPack convertMQMsgToDataPack(MQMsg mqMsg) {
        String mark = mqMsg.getMark();
        DataPack dataPack = new DataPack(mark.split("\\-")[0], mark.split("\\-")[1], mark.split("\\-")[2]);

        byte[] data = Base64.getDecoder().decode(mqMsg.getDataB64());
        ByteBuf buf = Unpooled.buffer(data.length);
        buf.writeBytes(data);

        dataPack.setBuf(buf);
        return dataPack;
    }


    /**
     * 将消息对象转换为字符串
     *
     * @param msg
     * @return
     */
    public static String convertMQMsgToStr(MQMsg msg) {
        return msg.getMark() + "->" + msg.getDataB64();
    }

    /**
     * 将字符串转换为消息对象
     *
     * @param s
     * @return
     */
    public static MQMsg convertStrToMQMsg(String s) {
        if (null == s || !s.contains("->")) {
            throw new IllegalArgumentException();
        }

        MQMsg msg = new MQMsg();
        msg.setMark(s.split("\\->")[0]);
        msg.setData(Base64.getDecoder().decode(s.split("\\->")[1]));

        return msg;

    }


    /**
     * 字节数组转换为MQMsg对象
     *
     * @param bytes
     * @return
     */
    public static MQMsg convertByteArrayToMQMsg(byte[] bytes) throws UnsupportedEncodingException {
        String s = new String(bytes, "UTF-8");
        return convertStrToMQMsg(s);
    }

    /**
     * MQMsg对象转化为字节数组
     *
     * @param mqMsg
     * @return
     */
    public static byte[] convertMQMsgToByteArray(MQMsg mqMsg) throws UnsupportedEncodingException {
        return convertMQMsgToStr(mqMsg).getBytes("UTF-8");
    }


}
