package com.softinnovas.automation.test;
import com.softinnovas.automation.pages.SauceDemoHomePageUsingFactory;
import com.softinnovas.automation.pages.SauceDemoLoginPageUsingFactory;
import com.softinnovas.automation.utils.DriverManager;
import org.openqa.selenium.WebDriver;

public class ProperTestCase {
    public static void main(String[] args) throws Exception {
        // initializing the chrome driver

            WebDriver driver= DriverManager.initDriver("chrome","http://www.saucedemo.com");
           driver.manage().window().maximize();

        SauceDemoLoginPageUsingFactory sauceDemoLoginPageUsingFactory=new SauceDemoLoginPageUsingFactory(driver);
            sauceDemoLoginPageUsingFactory.login("standard_user");
        }
    }