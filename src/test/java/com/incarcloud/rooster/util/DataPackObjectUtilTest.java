package com.incarcloud.rooster.util;

import org.junit.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

/**
 * DataPackObjectUtilTest
 *
 * @author Aaric, created on 2018-11-06T18:14.
 * @since 2.3.6-SNAPSHOT
 */
public class DataPackObjectUtilTest {

    @Test
    public void testIsLegalDetectionDate() throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date current = Date.from(Instant.now());
        Assert.assertFalse(DataPackObjectUtil.isLegalDetectionDate(current));

        Date longAgoTime = dateFormat.parse("2018-10-07 09:00:00");
        Assert.assertTrue(DataPackObjectUtil.isLegalDetectionDate(longAgoTime));

        Date futureTime = dateFormat.parse("2080-11-01 12:00:00");
        Assert.assertTrue(DataPackObjectUtil.isLegalDetectionDate(futureTime));
    }
}
