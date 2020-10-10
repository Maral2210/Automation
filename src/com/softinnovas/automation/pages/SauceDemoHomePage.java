package com.softinnovas.automation.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
public class SauceDemoHomePage {
    WebDriver driver;
    By openMenu = By.xpath("//button[contains(text(),'Open Menu')]");
    By logOutLink = By.xpath("//a[@id='logout_sidebar_link']");
    By elements = By.xpath("//div[@class='inventory_item_name']");

    public SauceDemoHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOpenMenu() {
        driver.findElement(openMenu).click();
    }

    public void logOut() {
        driver.findElement(logOutLink).click();
    }

    public List<WebElement> items() {
        return driver.findElements(elements);
    }

    public void addItem(String item) {
        for (WebElement element : items()) {
            String productName = element.getText();
            if (productName.contains(item)) {
                driver.findElement(By.xpath("//div[text()='" + productName + "']/../../../div[@class='pricebar']/button")).click();
                break;
            }
        }
    }
}