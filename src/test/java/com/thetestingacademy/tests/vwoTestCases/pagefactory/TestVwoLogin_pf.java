package com.thetestingacademy.tests.vwoTestCases.pagefactory;

import com.thetestingacademy.base.CommonToAllTest;
import com.thetestingacademy.driver.DriverManager;
import com.thetestingacademy.pages.pageFactory.LoginPage_PF;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.thetestingacademy.utils.PropertiesReader;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import static java.util.logging.LogManager.*;

public class TestVwoLogin_pf extends CommonToAllTest {

    private static final Logger logger = LogManager.getLogger(TestVwoLogin_pf.class);


    @Test
    public void testLoginNegativeVWO_PF() {
        logger.info("Starting the Testcases Page Factory");
        WebDriver driver = DriverManager.getDriver();
        driver.get(PropertiesReader.readKey("url"));
        LoginPage_PF loginPage_PF = new LoginPage_PF(driver);
        String error_msg = loginPage_PF.loginToVWOInvalidCreds();
        Assert.assertEquals(error_msg, PropertiesReader.readKey("error_message"));


    }
}
