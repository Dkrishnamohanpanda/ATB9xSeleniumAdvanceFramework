package com.thetestingacademy.tests.sample;

import io.qameta.allure.Description;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTests {
    private static final Logger logger = LogManager.getLogger(SampleTests.class);
    @Description("Sample Tc1")
    @Test
    public void testSample0(){
        Assert.assertTrue(true);
        logger.info("Starting the Testcases |  Verify that valid creds dashboard page is loaded");

    }

    @Description("Sample Tc2")
    @Test
    public void testSample1(){
        Assert.assertTrue(true);
        logger.info("Starting the Testcases |  Verify that valid creds dashboard page is loaded");

    }
}
