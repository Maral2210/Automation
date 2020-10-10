package com.softinnovas.automation.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import javax.xml.xpath.XPath;
public class SauceDemoHomePageUsingFactory {
    WebDriver driver;
    @CacheLookup //Declaration
    @FindBy(xpath ="//button[contains(text(),'Open Menu')]")
    private WebElement menu; //assignment
    //@FindBy(xpath ="//a[@id='logout_sidebar_link']")
    @FindBy(how= How.XPATH,using = "//a[@id='logout_sidebar_link']")
    private WebElement logoutLink;
    public SauceDemoHomePageUsingFactory(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void logout(){
        try{
            menu.click();
            Thread.sleep(3000);
            logoutLink.click();
            Thread.sleep(3000);
        }
        catch  (Exception e){
            e.printStackTrace();
        }
    }
}