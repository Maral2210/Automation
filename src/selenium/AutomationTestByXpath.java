package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTestByXpath {
    public static void main(String[] args) throws Exception{
        String id_url="https://www.saucedemo.com/";
        WebDriver driver;
        driver=new ChromeDriver(); //Assigning to chrome driver as we are testing in chrome
        driver.get(id_url);
        Thread.sleep(4000);
        //
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }
}
