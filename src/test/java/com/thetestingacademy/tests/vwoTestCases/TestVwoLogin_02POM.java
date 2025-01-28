package com.thetestingacademy.tests.vwoTestCases;

import com.thetestingacademy.pages.pageObjectModel.vwo.normal.DashBoardPage;
import com.thetestingacademy.pages.pageObjectModel.vwo.normal.LoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVwoLogin_02POM {

    @Owner("D.krishna mohan panda")
    @Description("Verify that valid credentials give dashboard page")
    @Test
    public void testLoginNegative(){
        WebDriver driver = new EdgeDriver();
        LoginPage loginpage_vwo = new LoginPage(driver);
       String eror_msg = loginpage_vwo.loginWithInvalidCredentials("admin@gmail.com","1234");

        Assert.assertEquals(eror_msg,"Your email, password, IP address or location did not match");


    }

    @Owner("D.krishna mohan panda")
    @Description("Verify that invalid credentials give eror msg")
    @Test
    public void testLoginpositive(){
        WebDriver driver = new EdgeDriver();
        LoginPage loginpage_vwo = new LoginPage(driver);
        loginpage_vwo.loginWithvalidCredentials("contact+aug@thetestingacademy.com","TtxkgQ!s$rJBk85");

        DashBoardPage dashBoardPage = new DashBoardPage(driver);
        String logedinUsername =dashBoardPage.loggedInUsername();
        Assert.assertEquals(logedinUsername,"Aman");


    }
}
