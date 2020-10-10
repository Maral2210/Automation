package com.softinnovas.automation.test;
import com.softinnovas.automation.pages.SauceDemoHomePage;
import com.softinnovas.automation.pages.SauceDemoLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ValidateLoginTest {
    public static void main(String[] args) throws  Exception{
        //System.setProperty("","");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        // Login Page---
        SauceDemoLoginPage sauceDemoLoginPage=new SauceDemoLoginPage(driver);
        sauceDemoLoginPage.setUserName("standard_user");
        sauceDemoLoginPage.setPassWord();
        sauceDemoLoginPage.clickLogin();
        SauceDemoHomePage sauceDemoHomePage=new SauceDemoHomePage(driver);
        sauceDemoHomePage.addItem("Sauce Labs Backpack");
        // Home Page-----
    }
}