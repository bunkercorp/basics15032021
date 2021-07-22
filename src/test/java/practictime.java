import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class practictime {

    @Test
    public static void jira() throws InterruptedException {

//        final String path = "C:\\Applications\\chromedriver\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", path);
//        WebDriver browser = new ChromeDriver();

        final String path = "C:\\Applications\\geckodriver\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver",path);
        WebDriver browser = new FirefoxDriver();
// go to JIRA
        browser.get("https://jira.ithillel.com/browse/AQ-180");

//Login to JIRa
        browser.findElement(By.xpath("//*[@id='user-options']/a")).click();
//Login
        browser.findElement(By.xpath("//*[@id=\"login-form-username\"]")).sendKeys("alex.lyulka");

//Password
        browser.findElement(By.xpath("//*[@id=\"login-form-password\"]")).sendKeys("de13de13");
        Thread.sleep(3000);
        browser.findElement(By.xpath("//*[@id=\"login-form-submit\"]")).click();

        browser.findElement(By.xpath("//*[@id=\"assign-to-me\"]")).click();
        Thread.sleep(3000);

        String text = browser.findElement(By.xpath("//*[@id=\"issue_summary_assignee_alex.lyulka\"]")).getText();
        Assert.assertEquals(text.trim(), "Alex Lyulka");
    }
}