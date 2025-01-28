package com.thetestingacademy.tests.orangeHRTests;

import com.thetestingacademy.pages.pageObjectModel.orangeHR.LoginPageHR;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestOrangehr_POM {

    @Owner("D.krishna mohan panda")
    @Description("Verify that valid credentials give dashboard page")
    @Test
    public void testLoginpositive(){

        WebDriver driver = new EdgeDriver();
        LoginPageHR loginPageHR = new LoginPageHR(driver);
        loginPageHR.loginToHr("admin","Hacker@4321");

    }

    }
