package com.incarcloud.rooster.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * RowKeyUtilTest
 *
 * @author Aaric, created on 2018-08-06T11:31.
 * @since 2.2.7-SNAPSHOT
 */
public class RowKeyUtilTest {

    @Test
    public void testMakeRowKey() {
        String rowKey = RowKeyUtil.makeRowKey("LSBAAAAAAZZ200000", "TRIP", "20180806113300");
        System.out.println(rowKey);
        Assert.assertEquals("221a000LSBAAAAAAZZ200000TRIP###########20180806113300####0001", rowKey);
    }
}
