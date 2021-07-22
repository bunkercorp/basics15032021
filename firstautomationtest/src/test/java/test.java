import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class test {
    WebDriver driver;
    String baseURL, nodeURL;

    @BeforeTest
    public void setup() throws MalformedURLException {
        baseURL = "https://jira.ithillel.com/browse/AQ-181";
        nodeURL = "http://10.0.0.69:4444/wd/hub";
        DesiredCapabilities capability = DesiredCapabilities.firefox();
   //     capability.setBrowserName("firefox");

        driver = new RemoteWebDriver(new URL(nodeURL), capability);

    }

    @Test
    public void first() throws InterruptedException {
        driver.get(baseURL);
        driver.findElement(By.xpath("//*[@id='user-options']/a")).click();
//Login
        driver.findElement(By.xpath("//*[@id=\"login-form-username\"]")).sendKeys("victoriaoreshet");

//Password
        driver.findElement(By.xpath("//*[@id=\"login-form-password\"]")).sendKeys("vika201017");
        driver.findElement(By.xpath("//*[@id=\"login-form-submit\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"assign-to-me\"]")).click();
        Thread.sleep(6000);
    }

    @AfterTest
    public void exit(){
        driver.quit();}}
