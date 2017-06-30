package com.incarcloud.rooster.datapack;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * DataPackUtilTest
 *
 * @author Aaric, created on 2017-06-29T09:40.
 * @since 2.0
 */
public class DataPackUtilTest {

    private ByteBuf buffer;

    @Before
    public void begin() {
        byte[] bytes = new byte[]{(byte) 0xFE, 'A', 'B', 'C', 0x00, 'a', 'b', 'c', 0x00};
        buffer = Unpooled.wrappedBuffer(bytes);
    }

    @After
    public void end() {
        buffer.release();
    }

    @Test
    public void testReadInt1() {
        Assert.assertEquals(-2, DataPackUtil.readInt1(buffer));
    }

    @Test
    public void testReadUInt1() {
        Assert.assertEquals(254, DataPackUtil.readUInt1(buffer));
    }

    @Test
    public void testReadBytes() {
        byte[] bytes = DataPackUtil.readBytes(buffer, 2);
        Assert.assertEquals("fe41", ByteBufUtil.hexDump(bytes));
    }

    @Test
    public void testReadInt2() {
        Assert.assertEquals(-447, DataPackUtil.readInt2(buffer));
    }

    @Test
    public void testReadUInt2() {
        Assert.assertEquals(65089, DataPackUtil.readUInt2(buffer));
    }

    @Test
    public void testReadInt4() {
        Assert.assertEquals(-29277629, DataPackUtil.readInt4(buffer));
    }

    @Test
    public void testReadUInt4() {
        Assert.assertEquals(4265689667L, DataPackUtil.readUInt4(buffer));
    }

    @Test
    public void testReadString() throws Exception {
        Assert.assertEquals(-2, DataPackUtil.readInt1(buffer));
        Assert.assertEquals("ABC", DataPackUtil.readString(buffer));
        Assert.assertEquals("abc", DataPackUtil.readString(buffer));
    }
}
