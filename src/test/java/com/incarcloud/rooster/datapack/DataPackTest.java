package com.incarcloud.rooster.datapack;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class DataPackTest {
    private static Logger s_logger = LoggerFactory.getLogger(DataPackTest.class);

    @Test
    public void markFormat(){
        DataPack pack = new DataPack("x", "y", "1.2.3");
        Assert.assertEquals("Mark format", "x-y-1.2.3", pack.getMark());
    }

    @Test
    public void base64Data(){
        DataPack pack = new DataPack("x", "y", "1.2.3");
        ByteBuf buf = Unpooled.wrappedBuffer(new byte[]{ 0x23, 0x23 });
        pack.setBuf(buf);
        Assert.assertEquals("Data in base64 string", "IyM=", pack.getDataB64());
        pack.freeBuf();
        buf.release();

        Assert.assertEquals(0, buf.refCnt());
    }

    @Test
    public void Any4DataParserTest(){
        ByteBuf buf = Unpooled.wrappedBuffer(new byte[]{
                0x23, 0x23, 0x23, 0x23,
                0x24, 0x24, 0x24, 0x24,
                0x25, 0x25, 0x25
        });

        IDataParser parser = new Any4DataParser();
        List<DataPack> listPacks = parser.extract(buf);

        Assert.assertEquals(2, listPacks.size());
        Assert.assertEquals(3, buf.readableBytes());

        for(DataPack pack:listPacks){
            pack.freeBuf();
        }

        buf.release();

        Assert.assertEquals(0, buf.refCnt());
    }
}
