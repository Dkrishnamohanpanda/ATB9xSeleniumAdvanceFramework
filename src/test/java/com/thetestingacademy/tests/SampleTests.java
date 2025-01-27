package com.thetestingacademy.tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTests {

    @Description("Sample Tc1")
    @Test
    public void testSample0(){
        Assert.assertTrue(true);
    }

    @Description("Sample Tc2")
    @Test
    public void testSample1(){
        Assert.assertTrue(true);
    }
}
