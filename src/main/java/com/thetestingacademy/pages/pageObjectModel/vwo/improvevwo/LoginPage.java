package com.thetestingacademy.pages.pageObjectModel.vwo.improvevwo;
import com.thetestingacademy.base.CommonToAllPage;
import com.thetestingacademy.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends CommonToAllPage {
//    page class
//    1) page locators

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver ;
    }

//    step-1 pagelocators
    private By  username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");
//IF YOU ARE NOT USING IT THEN DON'T KEEP IT

    //STEP -2 PageAction
    public String loginWithInvalidCredentials(String user ,String pwd){
        openVWOUrl();
        enterInput(username,user);
        enterInput(password,pwd);
        clickElement(signButton);
        presenceOfElement(error_message);
        return getText(error_message);

    }

    public void loginWithvalidCredentials(String user ,String pwd){

        openVWOUrl();
        enterInput(username,user);
        enterInput(password,pwd);
        clickElement(signButton);
//        custom_wait();

    }












}
