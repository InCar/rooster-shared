package com.incarcloud.rooster.datapack;

import io.netty.buffer.ByteBuf;

import java.util.List;
import java.util.Map;

/**
 * @author Xiong Guanghua
 * @ClassName: IDataParser
 * @Description: 数据包解析器
 * @date 2017年6月2日 下午6:19:25
 */
public interface IDataParser {

    /**
     * 抽取出完整有效的数据包,并从buffer丢弃掉已经解析或无用的字节
     *
     * @param buffer 二进制数据包（InHandler对象中的累积缓冲的buffer）
     * @return 如果数据包被加密，返回解密后的数据包
     */
    List<DataPack> extract(ByteBuf buffer);

    /**
     * 创建应答数据包
     *
     * @param requestPack 请求包
     * @param reason      应答原因
     * @return
     */
    ByteBuf createResponse(DataPack requestPack, ERespReason reason);

    /**
     * 销毁应答数据包
     *
     * @param responseBuf 应答数据（二进制）
     */
    void destroyResponse(ByteBuf responseBuf);

    /**
     * 解析数据包完整消息体
     *
     * @param dataPack 数据包
     * @return
     */
    List<DataPackTarget> extractBody(DataPack dataPack);

    /**
     * 解析数据包获取vin/设备号/协议
     *
     * @param buffer 数据包（完整的数据包）
     * @return {
     * protocol： 协议
     * algorithm: 加密算法，例如RSA, AES...(null-表示数据包未使用任何加密算法)
     * deviceId： 设备ID(必须)
     * vin: 车辆标识(非必须，但激活和登陆必须传值)
     * }
     */
    Map<String, Object> getMetaData(ByteBuf buffer);

    /**
     * 设置私钥字符串（平台传递给解析器）
     *
     * @param n RSA私钥{e,n}中的 n
     * @param e RSA私公钥{e,n}中的 e
     */
    void setPrivateKey(byte[] n, byte[] e);

    /**
     * 设置公钥字符串（平台传递给解析器）
     *
     * @param n RSA公钥{e,n}中的 n
     * @param e RSA公钥{e,n}中的 e
     */
    void setPublicKey(byte[] n, long e);

    /**
     * 获得安全码,使用AES加密算法(存储到Redis,用于命令下发)
     *
     * @return
     */
    byte[] getSecurityKey();
}
