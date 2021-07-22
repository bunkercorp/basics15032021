
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
    final String baseUrl = "https://www.saucedemo.com/", nodeUrl = "http://10.0.0.69:4444/wd/hub";

    @BeforeTest

    public void setup() throws MalformedURLException {
        // DesiredCapabilities capability = DesiredCapabilities.firefox();
        //capability.setBrowserName("firefox");
        //   capability.setPlatform(Platform.WIN10);
        // driver = new RemoteWebDriver(new URL(nodeUrl), capability);
        final boolean isCiRun = System.getenv("CI_RUN") != null;
        final String browserRequested = System.getProperty("browser");
        if (isCiRun) {
            DesiredCapabilities capability;
            if (browserRequested.contentEquals("firefox")) {
                capability = DesiredCapabilities.firefox();
            } else {
                capability = DesiredCapabilities.chrome();
            }
            driver = new RemoteWebDriver(new URL(nodeUrl), capability);
        } else {
            if (browserRequested.contentEquals("firefox")) {
                System.setProperty("webdriver.gecko.driver","C:\\Applications\\geckodriver\\geckodriver.exe");
                driver = new FirefoxDriver();

            } else {
                System.setProperty("webdriver.chrome.driver","C:\\Applications\\chromedriver\\chromedriver.exe");
                driver  = new ChromeDriver();

            }


        }
    }


    //    @AfterTest
//    public void afterTest(){
//        driver.quit();
//    }
    @Test
    public void simpleTest() {
        driver.get(baseUrl);

    }
}



