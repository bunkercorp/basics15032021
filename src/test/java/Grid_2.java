
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class Grid_2 {

    WebDriver driver;
    String baseUrl, nodeUrl;
    @BeforeTest
    public void setup() throws MalformedURLException {
    baseUrl = "https://www.saucedemo.com/" ;
    nodeUrl = "http://10.0.0.69:4444/wd/hub";
        DesiredCapabilities capability = DesiredCapabilities.firefox();
        capability.setBrowserName("firefox");
     //   capability.setPlatform(Platform.WIN10);
        driver = new RemoteWebDriver(new URL(nodeUrl), capability);
    }
//    @AfterTest
//    public void afterTest(){
//        driver.quit();
//    }
    @Test
    public void simpleTest(){
        driver.get(baseUrl);

    }
}



