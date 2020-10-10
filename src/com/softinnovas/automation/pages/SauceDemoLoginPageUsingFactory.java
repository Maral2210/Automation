package com.softinnovas.automation.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SauceDemoLoginPageUsingFactory {
    WebDriver driver;
    @FindBy(xpath = "//input[@id='user-name']")
    @CacheLookup
    private WebElement userName;
    @FindBy(xpath = "//input[@id='password']")
    @CacheLookup
    private WebElement password1;
    @FindBy(xpath = "//input[@id='login-button']")
    @CacheLookup
    private WebElement loginButton;
    //This is a constructor
    public SauceDemoLoginPageUsingFactory(WebDriver driver){
        System.out.println("*******The constructor is called********");
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    //    public void login(String user) throws Exception{
//        Thread.sleep(2000);
//        userName.sendKeys(user);
//        password1.sendKeys("secret_sauce");
//        loginButton.click();
//    }
    public  SauceDemoHomePageUsingFactory login(String user) throws Exception{
        Thread.sleep(2000);
        userName.sendKeys(user);
        password1.sendKeys("secret_sauce");
        loginButton.click();
        SauceDemoHomePageUsingFactory sauceDemoHomePage=new SauceDemoHomePageUsingFactory(driver);
        return sauceDemoHomePage;
    }
}