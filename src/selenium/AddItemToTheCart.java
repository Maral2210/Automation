package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.List;
    public class AddItemToTheCart {
        static String url = "https://www.saucedemo.com/";
        static String[] users = {"standard_user", "problem_user", "performance_glitch_user"};
        static String[] items = {"Sauce Labs Backpack", "Sauce Labs Fleece Jacket", "Sauce Labs Onesie"};
        static WebDriver driver;

        /*this function takes user as an argument
         * and logs into the application */
        static void login(String user) {
            driver = new ChromeDriver();
            driver.get(url);
            driver.findElement(By.id("user-name")).sendKeys(user);
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
        }

        /*This function validate the user
        after it logs in to the homepage */
        static boolean validateUser() {
            boolean result = false;
            String homePageUrl = driver.getCurrentUrl();
            if (homePageUrl.contains("inventory")) {
                result = true;
            }
            return result;
        }

        static int itemCount() {
            String count = driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']")).getText();
            return Integer.parseInt(count);
        }

        /*This is to log out of the application */
        static void logOut() {
            try {
                driver.findElement(By.xpath("//button[contains(text(),'Open Menu')]")).click();
                Thread.sleep(3000);
                driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        public static void addItemToTheCart(String itemName) {
            List<WebElement> elements = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
            for (WebElement element : elements) {
                String productName = element.getText();
                if (productName.contains(itemName)) {
                    driver.findElement(By.xpath("//div[text()='" + productName + "']/../../../div[@class='pricebar']/button")).click();
                    break;
                }
            }
        }

        public static void clickItem(String itemName) {
            driver.findElement(By.xpath("//div[text()='" + itemName + "']")).click();
        }

        public static String getItemPrice(String itemName) {
            return driver.findElement(By.xpath("//div[text()='" + itemName + "']/../../../div[@class='pricebar']/div[@class='inventory_item_price']")).getText();
        }

        //inline method parameter passing
        public static String getItemDescription(String itemName) {
            return driver.findElement(By.xpath("//div[text()='" + itemName + "']/../../div")).getText();
        }

        public static void main(String[] args) throws Exception {
            //login to the app
            login("standard_user");
            for (String item : items) {
                System.out.println("The item price for item : " + item + "=" + getItemPrice(item) + "\n");
                System.out.println("The item desc for item : " + item + "=" + getItemDescription(item) + "\n");
            }
        }
    }