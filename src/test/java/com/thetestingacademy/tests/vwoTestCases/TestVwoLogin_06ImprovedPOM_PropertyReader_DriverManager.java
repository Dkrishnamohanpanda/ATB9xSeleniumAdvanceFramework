package com.thetestingacademy.tests.vwoTestCases;

import com.thetestingacademy.base.CommonToAllTest;
import com.thetestingacademy.driver.DriverManager;
import com.thetestingacademy.pages.pageObjectModel.vwo.normal.DashBoardPage;
import com.thetestingacademy.pages.pageObjectModel.vwo.normal.LoginPage;
import com.thetestingacademy.utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.assertj.core.api.Assertions.assertThat;

public class TestVwoLogin_06ImprovedPOM_PropertyReader_DriverManager extends CommonToAllTest {

    private static final Logger logger = LogManager.getLogger(TestVwoLogin_06ImprovedPOM_PropertyReader_DriverManager.class);

    @Owner("D.krishna mohan panda")
    @Description("Verify that valid credentials give dashboard page")
    @Test
    public void testLoginNegative(){

        logger.info("Starting the Testcases Page Object Model");

        LoginPage loginpage_vwo = new LoginPage(DriverManager.getDriver());
       String eror_msg = loginpage_vwo.loginWithInvalidCredentials(PropertiesReader.readKey("invalid_username"),PropertiesReader.readKey("invalid_password"));

        logger.info("End of the testLoginNegativeVWO !");

        Assert.assertEquals(eror_msg, PropertiesReader.readKey("error_message"));



    }

    @Owner("D.krishna mohan panda")
    @Description("Verify that invalid credentials give eror msg")
    @Test
    public void testLoginpositive(){

        logger.info("Starting the Testcases |  Verify that valid creds dashboard page is loaded");

        LoginPage loginpage_vwo = new LoginPage(DriverManager.getDriver());
        loginpage_vwo.loginWithvalidCredentials(PropertiesReader.readKey("valid_username"),PropertiesReader.readKey("valid_password"));

        DashBoardPage dashBoardPage = new DashBoardPage(DriverManager.getDriver());
        String logedinUsername =dashBoardPage.loggedInUsername();

        logger.info("End and Asserting testLoginPositiveVWO");

        assertThat(logedinUsername).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(logedinUsername,PropertiesReader.readKey("expected_username"));


    }
}
