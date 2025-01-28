package com.thetestingacademy.pages.pageObjectModel.vwo.normal;
import com.thetestingacademy.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
//    page class
//    1) page locators

    WebDriver driver;

    public LoginPage( WebDriver driver){
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
        driver.get(PropertiesReader.readKey("url"));
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signButton).click();

        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        String error_msg_txt =driver.findElement(error_message).getText();
        return error_msg_txt;
    }

    public void loginWithvalidCredentials(String user ,String pwd){

        driver.get("https://app.vwo.com/");
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signButton).click();

        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

    }












}
