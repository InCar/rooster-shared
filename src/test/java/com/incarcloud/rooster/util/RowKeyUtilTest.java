package com.incarcloud.rooster.util;

import com.incarcloud.rooster.datapack.DataPackTrip;
import org.junit.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * RowKeyUtilTest
 *
 * @author Aaric, created on 2018-08-06T11:31.
 * @since 2.2.7-SNAPSHOT
 */
public class RowKeyUtilTest {

    DateFormat dateFormat = new SimpleDateFormat(DataPackObjectUtil.DATE_PATTERN);

    @Test
    public void testMakeRowKey() throws Exception {
        //String rowKey = RowKeyUtil.makeRowKey("LSBAAAAAAZZ000001", "TRIP", "20180910120000");
        //String rowKey = RowKeyUtil.makeRowKey("LSBAAAAAAZZ000001", "TRIP", dateFormat.parse("20180910120000"));
        //String rowKey = RowKeyUtil.makeRowKey("LSBAAAAAAZZ000001", DataPackTrip.class, "20180910120000");
        String rowKey = RowKeyUtil.makeRowKey("LSBAAAAAAZZ000001", DataPackTrip.class, dateFormat.parse("20180910120000"));
        System.out.println(rowKey);
        Assert.assertEquals("bc3c000LSBAAAAAAZZ000001TRIP###########20180910120000####0001", rowKey);
    }

    @Test
    public void testMakeMinRowKey1() {
        String rowKey = RowKeyUtil.makeMinRowKey("LSBAAAAAAZZ000001");
        System.out.println(rowKey);
        Assert.assertEquals("bc3c000LSBAAAAAAZZ000001##", rowKey);
    }

    @Test
    public void testMakeMinRowKey2() {
        //String rowKey = RowKeyUtil.makeMinRowKey("LSBAAAAAAZZ000001", "TRIP");
        String rowKey = RowKeyUtil.makeMinRowKey("LSBAAAAAAZZ000001", DataPackTrip.class);
        System.out.println(rowKey);
        Assert.assertEquals("bc3c000LSBAAAAAAZZ000001TRIP#############", rowKey);
    }

    @Test
    public void testMakeMinRowKey3() throws Exception {
        //String rowKey = RowKeyUtil.makeMinRowKey("LSBAAAAAAZZ000001", "TRIP", "20180910120000");
        //String rowKey = RowKeyUtil.makeMinRowKey("LSBAAAAAAZZ000001", "TRIP", dateFormat.parse("20180910120000"));
        //String rowKey = RowKeyUtil.makeMinRowKey("LSBAAAAAAZZ000001", DataPackTrip.class, "20180910120000");
        String rowKey = RowKeyUtil.makeMinRowKey("LSBAAAAAAZZ000001", DataPackTrip.class, dateFormat.parse("20180910120000"));
        System.out.println(rowKey);
        Assert.assertEquals("bc3c000LSBAAAAAAZZ000001TRIP###########20180910120000######", rowKey);
    }

    @Test
    public void testMakeMaxRowKey1() {
        String rowKey = RowKeyUtil.makeMaxRowKey("LSBAAAAAAZZ000001");
        System.out.println(rowKey);
        Assert.assertEquals("bc3c000LSBAAAAAAZZ000001zz", rowKey);
    }

    @Test
    public void testMakeMaxRowKey2() {
        //String rowKey = RowKeyUtil.makeMaxRowKey("LSBAAAAAAZZ000001", "TRIP");
        String rowKey = RowKeyUtil.makeMaxRowKey("LSBAAAAAAZZ000001", DataPackTrip.class);
        System.out.println(rowKey);
        Assert.assertEquals("bc3c000LSBAAAAAAZZ000001TRIP###########zz", rowKey);
    }

    @Test
    public void testMakeMaxRowKey3() throws Exception {
        //String rowKey = RowKeyUtil.makeMaxRowKey("LSBAAAAAAZZ000001", "TRIP", "20180910120000");
        //String rowKey = RowKeyUtil.makeMaxRowKey("LSBAAAAAAZZ000001", "TRIP", dateFormat.parse("20180910120000"));
        String rowKey = RowKeyUtil.makeMaxRowKey("LSBAAAAAAZZ000001", DataPackTrip.class, dateFormat.parse("20180910120000"));
        //String rowKey = RowKeyUtil.makeMaxRowKey("LSBAAAAAAZZ000001", DataPackTrip.class, "20180910120000");
        System.out.println(rowKey);
        Assert.assertEquals("bc3c000LSBAAAAAAZZ000001TRIP###########20180910120000####zz", rowKey);
    }

    @Test
    public void testGetDataPackType() {
        String rowKey = "bc3c000LSBAAAAAAZZ000001TRIP###########20180910120000####0001";
        String type = RowKeyUtil.getDataPackType(rowKey);
        System.out.println(type);
        Assert.assertEquals("TRIP", type);
    }
}
