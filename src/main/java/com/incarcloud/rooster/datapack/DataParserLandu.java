package com.incarcloud.rooster.datapack;

import com.incarcloud.rooster.dispatch.DataPackTarget;
import io.netty.buffer.ByteBuf;

import java.util.List;

/**
 * DataParserLandu-测试完毕删除
 *
 * @author Aaric, created on 2017-06-27T18:12.
 * @since 1.0-SNAPSHOT
 */
public class DataParserLandu implements IDataParser {

    static {
        /**
         * 解析器版本控制
         */
        DataParserManager.register("china-landu-2.05", DataParserLandu.class);
        DataParserManager.register("china-landu-3.08", DataParserLandu.class);
    }

    @Override
    public List<DataPack> extract(ByteBuf buffer) {
        return null;
    }

    @Override
    public ByteBuf createResponse(DataPack requestPack, ERespReason reason) {
        return null;
    }

    @Override
    public void destroyResponse(ByteBuf responseBuf) {

    }

    @Override
    public List<DataPackTarget> extractBody(DataPack dataPack) {
        return null;
    }
}
