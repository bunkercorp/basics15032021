import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Automation {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers/chromedriver.exe");
        WebDriver browser = new ChromeDriver();

        browser.get("https://google.com");
        browser.manage().window().getSize();
        Thread.sleep(3000);

        WebElement textField = browser.findElement(By.xpath("//form//input[@name = 'q']"));

        textField.sendKeys("lorem ipsum dolor sit amet");
        Thread.sleep(3000);

        WebElement goBtn = browser.findElements(By.cssSelector("form input[name = 'btnK']")).get(0);
        goBtn.click();

        Thread.sleep(3000);
        //List<WebElement> searchList = browser.findElements(By.xpath("//div[@id = 'search']//div[@id = 'rso']/div[1]"));
        WebElement loremClick = browser.findElements(By.xpath("//div[@id = 'search']//div[@id = 'rso']/div")).get(1);
        //searchList.get(1).click();
        loremClick.click();
//        for (WebElement s : searchList) {
//            System.out.println(s);
//        }

    }
}