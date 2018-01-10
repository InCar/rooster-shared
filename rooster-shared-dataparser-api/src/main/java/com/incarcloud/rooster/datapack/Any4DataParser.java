package com.incarcloud.rooster.datapack;

import io.netty.buffer.ByteBuf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// 演示性质的DataParser,任意4个字节就解析成功
public class Any4DataParser implements IDataParser {

    static {
        /**
         * 声明数据包版本与解析器类关系
         */
        DataParserManager.register("incar-any4-1.0.0", Any4DataParser.class);
    }

    @Override
    public List<DataPack> extract(ByteBuf buffer){
        List<DataPack> listPacks = new ArrayList<>();

        while(buffer != null && buffer.readableBytes() >= 4){
            DataPack pack = new DataPack("incar", "any4", "1.0.0");
            ByteBuf buf = buffer.slice(0, 4);
            pack.setBuf(buf);
            listPacks.add(pack);

            buffer.skipBytes(4);
        }

        return listPacks;
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

    @Override
    public Map<String, Object> getMetaData(ByteBuf buffer) {
        return null;
    }

    @Override
    public void setPublicKey(String publicKey) {

    }

    @Override
    public String getPublicKey() {
        return null;
    }
}
