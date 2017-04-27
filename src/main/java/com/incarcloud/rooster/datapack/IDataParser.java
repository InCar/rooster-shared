package com.incarcloud.rooster.datapack;

import io.netty.buffer.ByteBuf;

import java.util.List;

public interface IDataParser {
     // 抽取出完整有效的数据包,并从buffer丢弃掉已经解析或无用的字节
     List<DataPack> extract(ByteBuf buffer);
}


