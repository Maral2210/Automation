package com.softinnovas.automation.utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
public class DriverManager {
    static WebDriver driver;
    public static WebDriver initDriver(String browser,String url){
        if(browser.equalsIgnoreCase("ff")){
            driver=new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("chrome")){
            //System.setProperty("","");
            driver=new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("safari")){
            driver=new SafariDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }
}