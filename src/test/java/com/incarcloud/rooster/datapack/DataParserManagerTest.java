package com.incarcloud.rooster.datapack;

import org.junit.Assert;
import org.junit.Test;

/**
 * DataParserManagerTest
 *
 * @author Aaric, created on 2017-06-28T08:56.
 * @since 1.0-SNAPSHOT
 */
public class DataParserManagerTest {

    @Test
    public void testGetDataParserClass() throws Exception {
        DataParserManager.loadClassOfSamePackage();
        Assert.assertEquals(true, Any4DataParser.class.equals(DataParserManager.getDataParserClass("incar-any4-1.0.0")));
    }
}
