package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationTestByTagName {
    public static void main(String[] args) throws Exception{

        String url="https://www.saucedemo.com/";
        WebDriver driver;
        driver=new ChromeDriver(); //Assigning to chrome driver as we are testing in chrome
        //driver=new FirefoxDriver(); //Assigning to chrome driver as we are testing in chrome

        driver.get(url);
        Thread.sleep(4000);
        driver.findElement(By.tagName("input")).sendKeys("softInnovas");
    }
}
