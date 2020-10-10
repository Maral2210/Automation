package com.softinnovas.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceDemoLoginPage {

    public static class Driver {
        private static WebDriver driver;
        public static WebDriver getDriver() {
            return driver;
        }
    }
    WebDriver driver;
    By userName=By.xpath("//input[@id='user-name']");
    By passWord=By.id("password");
    By loginButton=By.id("login-button");


    public SauceDemoLoginPage(WebDriver driver){
        this.driver=driver;

    }
    public void setUserName(String user){
        driver.findElement(userName).sendKeys(user);
    }
    public void setPassWord(){
        driver.findElement(passWord).sendKeys("secret_sauce");
    }
    public void clickLogin(){
        driver.findElement(loginButton).click();
    }
}
