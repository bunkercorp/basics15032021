import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class swaglabs_test {

    @Test
    public static void swag() throws InterruptedException {

        final String path = "C:\\Applications\\chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", path);
        WebDriver browser = new ChromeDriver();

//        final String path = "C:\\Applications\\geckodriver\\geckodriver.exe";
//        System.setProperty("webdriver.gecko.driver",path);
//        WebDriver browser = new FirefoxDriver();

// go to SWAG
        browser.get("https://www.saucedemo.com/");


//Login to Swag
        browser.findElement(By.xpath("//*[@id=\"user-name\"]")).click();
//Login
        browser.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
//Password
        browser.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//Filtering by price

        browser.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select")).click();
        Thread.sleep(2000);

        List<WebElement> elements1 = browser.findElements(By.className("inventory_item_price"));
        for (WebElement element : elements1) {
            System.out.println(element.getText());
        }

        browser.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]")).click();
        Thread.sleep(2000);


        List<WebElement> elements2 = browser.findElements(By.className("inventory_item_price"));
        for (WebElement element : elements2) {
            System.out.println(element.getText());
        }

//inventory_item


////Add to cart
//        browser.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
//        Thread.sleep(2000);
//
////go to shop card
//        browser.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
//        Thread.sleep(2000);
//        String text = browser.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div")).getText();
//        Assert.assertEquals(text.trim(), "Sauce Labs Bike Light");
//
//        browser.quit();
    }
}
