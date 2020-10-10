
package com.softinnovas.automation.test;
import com.softinnovas.automation.pages.SauceDemoLoginPageUsingFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
public class ValidateLoginTest1 {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","/Users/marala/IdeaProjects/Automation/chomedriver/chomedriver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        //SauceDemoLoginPageUsingFactory sauceDemoLoginPageUsingFactory=PageFactory.initElements(driver,SauceDemoLoginPageUsingFactory.class);
        SauceDemoLoginPageUsingFactory sauceDemoLoginPageUsingFactory=new SauceDemoLoginPageUsingFactory(driver);
        sauceDemoLoginPageUsingFactory.login("standard_user");
    }
}