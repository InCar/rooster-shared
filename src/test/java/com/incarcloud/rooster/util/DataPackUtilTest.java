package com.incarcloud.rooster.util;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.util.ReferenceCountUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.DatatypeConverter;

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

    @Test
    public void testReadBCD() {
        ByteBuf buffer = Unpooled.wrappedBuffer(new byte[]{0x02, 0x00, 0x00, 0x00, 0x00, 0x15});
        Assert.assertEquals("020000000015", DataPackUtil.readBCD(buffer, 6));
        ReferenceCountUtil.release(buffer);
    }

    @Test
    public void testGetIntegerBytes() {
        int integer = 0x87654321 & 0xFFFFFFFF;
        Assert.assertEquals("21", DatatypeConverter.printHexBinary(DataPackUtil.getIntegerBytes(integer, 1)));
        Assert.assertEquals("4321", DatatypeConverter.printHexBinary(DataPackUtil.getIntegerBytes(integer, 2)));
        Assert.assertEquals("87654321", DatatypeConverter.printHexBinary(DataPackUtil.getIntegerBytes(integer, 4)));
    }

    @Test
    public void testGetBCDBytes() {
        Assert.assertEquals("012345678901", DatatypeConverter.printHexBinary(DataPackUtil.getBCDBytes("012345678901")));
    }
}
