package com.incarcloud.rooster.datapack;

import io.netty.buffer.ByteBuf;

import java.util.List;

/**
 * 数据包解析器
 * 
 * @author 熊广化
 *
 */
public interface IDataParser {
	/**
	 * 抽取出完整有效的数据包,并从buffer丢弃掉已经解析或无用的字节
	 * 
	 * @param buffer
	 * @return
	 */
	List<DataPack> extract(ByteBuf buffer);

	/**
	 * 创建应答数据包
	 * 
	 * @param requestPack 请求数据包
	 * @param reason 应答原因
	 * @return
	 */
	ByteBuf createResponse(DataPack requestPack, ERespReason reason);

	/**
	 * 销毁应答数据包
	 * 
	 * @param responseBuf 
	 */
	void destroyResponse(ByteBuf responseBuf);
}
