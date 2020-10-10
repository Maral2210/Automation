package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationNameIDLinkClassNameTag {
    public static void main(String[] args) throws  Exception{
        System.setProperty("webdriver.chrome.driver","/Users/marala/IdeaProjects/Automation/chomedriver/chomedriver/chromedriver");

        String id_url="https://www.saucedemo.com/";
        WebDriver driver;
        driver=new ChromeDriver(); //Assigning to chrome driver as we are testing in chrome
        driver.get(id_url);
        Thread.sleep(4000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user"); //set user name
        driver.findElement(By.id("password")).sendKeys("secret_sauce"); //set password
        driver.findElement(By.id("login-button")).click();
        System.setProperty("","");
        /*ID locator  */
        String id_tagName_url="https://www.saucedemo.com/";
        String class_name_url="https://www.airbnb.com";
        String linkText_url="https://www.gmail.com";

        driver=new ChromeDriver(); //Assigning to chrome driver as we are testing in chrome
        driver.get(id_tagName_url);
        Thread.sleep(4000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user"); //set user name
        Thread.sleep(1000);
        driver.findElement(By.id("user-name")).clear();
        driver.findElement(By.tagName("input")).sendKeys("standard_user"); //setting the user by using input tag
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce"); //set password
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(5000);
        /*class name locator  */
        driver.navigate().to(class_name_url);
        Thread.sleep(3000);
        driver.findElement(By.className("_1xq16jy")).sendKeys("testUser");
        Thread.sleep(2000);
//By using name locator
        driver.findElement(By.name("query")).sendKeys("Mexico");
        /*linkText  locator  */
        driver.navigate().to(linkText_url);
        String linkName=driver.findElement(By.linkText("Terms")).getText();
//Print the link Name
        System.out.println("the link name ::"+linkName);
        /*Partial linkText  locator  */
        String partialLink=driver.findElement(By.partialLinkText("Hel")).getText();
        System.out.println("the link name(by using partial linkText ::"+partialLink);
}}
