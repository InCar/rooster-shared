package com.incarcloud.rooster.datapack;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * DataParserManagerTest
 *
 * @author Aaric, created on 2017-06-28T08:56.
 * @since 1.0-SNAPSHOT
 */
public class DataParserManagerTest {

    @Test
    @Ignore
    public void testGetDataParserClass() throws Exception {
        Class.forName("com.incarcloud.rooster.datapack.DataParserLandu");
        Assert.assertEquals("DataParserLandu", DataParserManager.getDataParserClass("china-landu-2.05").getSimpleName());
    }
}
