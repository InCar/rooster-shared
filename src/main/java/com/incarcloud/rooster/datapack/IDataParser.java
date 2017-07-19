package com.incarcloud.rooster.datapack;

import io.netty.buffer.ByteBuf;

import java.util.List;

/**
 * @ClassName: IDataParser
 * @Description: 数据包解析器
 * @author Xiong Guanghua
 * @date 2017年6月2日 下午6:19:25
 * 
 */
public interface IDataParser {
	/**
	 * 抽取出完整有效的数据包,并从buffer丢弃掉已经解析或无用的字节
	 * 
	 * @param buffer
	 *            二进制数据包
	 * @return
	 */
	List<DataPack> extract(ByteBuf buffer);

	/**
	 * 
	 * 创建应答数据包
	 * 
	 * @param requestPack
	 *            请求包
	 * @param reason
	 *            应答原因
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

}
