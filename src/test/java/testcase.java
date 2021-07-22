import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class testcase {
    @Test
    public static void firsttest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://jira.ithillel.com/browse/AQ-181");
        browser.findElement(By.xpath("//*[@id='user-options']/a")).click();
//Login
        browser.findElement(By.xpath("//*[@id=\"login-form-username\"]")).sendKeys("victoriaoreshet");

//Password
        browser.findElement(By.xpath("//*[@id=\"login-form-password\"]")).sendKeys("vika201017");
        browser.findElement(By.xpath("//*[@id=\"login-form-submit\"]")).click();

        browser.findElement(By.xpath("//*[@id=\"assign-to-me\"]")).click();
        Thread.sleep(6000);
        String text = browser.findElement(By.xpath("//*[@id=\"assignee-val\"]")).getText();
        Assert.assertEquals(text.trim(), "Victoria");
}

@Test
    public static void firefox(String browsers) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\firefoxdriver/geckodriver.exe");
        WebDriver browser = new FirefoxDriver();
    browser.get("https://jira.ithillel.com/browse/AQ-181");
    browser.findElement(By.xpath("//*[@id='user-options']/a")).click();
//Login
    browser.findElement(By.xpath("//*[@id=\"login-form-username\"]")).sendKeys("victoriaoreshet");

//Password
    browser.findElement(By.xpath("//*[@id=\"login-form-password\"]")).sendKeys("vika201017");
    browser.findElement(By.xpath("//*[@id=\"login-form-submit\"]")).click();

    browser.findElement(By.xpath("//*[@id=\"assign-to-me\"]")).click();
    Thread.sleep(6000);
    browser.findElement(By.xpath("//*[@id=\"description-val\"]")).click();
    Thread.sleep(6000);
    browser.findElement(By.xpath("//*[@id=\"description-wiki-edit\"]/nav/div/div/ul/li[2]/a")).click();
    Thread.sleep(6000);
    browser.findElement(By.xpath("//*[@id=\"description\"]")).clear();
    Thread.sleep(6000);
    browser.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("My new description");
    Thread.sleep(6000);
    browser.findElement(By.className("aui-button aui-button-primary submit")).click();
    Thread.sleep(6000);

}






}
