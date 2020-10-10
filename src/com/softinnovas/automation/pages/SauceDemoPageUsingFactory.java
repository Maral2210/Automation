package com.softinnovas.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SauceDemoPageUsingFactory {
    WebDriver driver;
    @FindBy(xpath = "//input[@id='user-name']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement loginButton;

}