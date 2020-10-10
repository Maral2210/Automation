package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class AutomationTestByID {
    //This is to test by using ID locator for selenium webdriver
    public static void main(String[] args) throws  Exception{
        //System.setProperty("webdriver.chrome.driver","driver/chromeDriver/chromedriver.exe");
     System.setProperty("webdriver.chrome.driver","/Users/marala/IdeaProjects/Automation/chromedriver");
        ////Users/marala/Desktop/Automation
      //  System.setProperty("webdriver.firefox.driver","//Users//marala//IdeaProjects//NAUBootCMP//geckodriver");
    //    System.setProperty("webdriver.gecko.driver","/Users/marala/IdeaProjects/Automation/geckodriver");
        System.setProperty("webdriver.gecko.driver", "/Users/marala/IdeaProject/Automation/geckodriver");
        //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        String url="https://www.saucedemo.com/";
        //WebDriver driver;
        WebDriver driver = new SafariDriver();
        //driver.get("https://www.google.co.uk/");


        //WebDriver driver = new FirefoxDriver();

        //driver=new ChromeDriver(); //Assigning to chrome driver as we are testing in chrome
        driver.get(url);
        Thread.sleep(4000);
        WebElement aa = driver.findElement(By.id("user-name"));
        aa.sendKeys("standard_user"); //set user name
        driver.findElement(By.id("password")).sendKeys("secret_sauce"); //set password
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000);
        String currentUrl=driver.getCurrentUrl();
        if(currentUrl.contains("inventory")){
            System.out.println("Test case 1 is passed");
        }
        else {
            System.out.println("Test case 1 is Failed");
        }
        String test= driver.findElement(By.className("product_label")).getText();
        if(test.contains("Products")){
            System.out.println("The page is loaded: Name="+test );
        }
        else{
            System.out.println("The page is not loaded");
        }
        String test1= driver.findElement(By.className("inventory_item_name")).getText();
        System.out.println(test1);

    }
}
