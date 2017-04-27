package com.incarcloud.rooster;

import org.junit.*;
import org.slf4j.*;

public class HelperTest {
    private Logger s_logger = LoggerFactory.getLogger(HelperTest.class);

    @Test
    public void printStackTraceTest(){
        IllegalArgumentException ex = new IllegalArgumentException("Hello");
        String buf = Helper.printStackTrace(ex);
        // s_logger.info(buf);
        Assert.assertTrue(buf.length() > 0);
    }
}
