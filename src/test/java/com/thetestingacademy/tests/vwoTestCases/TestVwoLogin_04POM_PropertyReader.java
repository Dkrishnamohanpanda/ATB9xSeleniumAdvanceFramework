package com.thetestingacademy.tests.vwoTestCases;

import com.thetestingacademy.pages.pageObjectModel.vwo.normal.DashBoardPage;
import com.thetestingacademy.pages.pageObjectModel.vwo.normal.LoginPage;
import com.thetestingacademy.utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestVwoLogin_04POM_PropertyReader {

    @Owner("D.krishna mohan panda")
    @Description("Verify that valid credentials give dashboard page")
    @Test
    public void testLoginNegative(){
        WebDriver driver = new EdgeDriver();
        LoginPage loginpage_vwo = new LoginPage(driver);
       String eror_msg = loginpage_vwo.loginWithInvalidCredentials(PropertiesReader.readKey("invalid_username"),PropertiesReader.readKey("invalid_password"));

        Assert.assertEquals(eror_msg, PropertiesReader.readKey("error_message"));


    }

    @Owner("D.krishna mohan panda")
    @Description("Verify that invalid credentials give eror msg")
    @Test
    public void testLoginpositive(){
        WebDriver driver = new EdgeDriver();
        LoginPage loginpage_vwo = new LoginPage(driver);
        loginpage_vwo.loginWithvalidCredentials(PropertiesReader.readKey("valid_username"),PropertiesReader.readKey("valid_password"));

        DashBoardPage dashBoardPage = new DashBoardPage(driver);
        String logedinUsername =dashBoardPage.loggedInUsername();

        assertThat(logedinUsername).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(logedinUsername,PropertiesReader.readKey("expected_username"));


    }
}
