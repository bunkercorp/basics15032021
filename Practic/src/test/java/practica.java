import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class practica {
    @Test
    public static void jira() throws InterruptedException {
        final String path = "C:\\Applications\\chromedriver\\chromedriver.exe";



        System.setProperty("webdriver.chrome.driver", path);
        WebDriver browser = new ChromeDriver();
        browser.get("https://jira.ithillel.com/browse/AQ-180");
        browser.findElement(By.xpath("//*[@id='user-options']/a")).click();
//Login
        browser.findElement(By.xpath("//*[@id=\"login-form-username\"]")).sendKeys("alex.lyulka");

//Password
        browser.findElement(By.xpath("//*[@id=\"login-form-password\"]")).sendKeys("de13de13");
        Thread.sleep(1000);
        browser.findElement(By.xpath("//*[@id=\"login-form-submit\"]")).click();
        Thread.sleep(1000);

//dropdown


        browser.findElement(By.xpath("//*[@id=\"priority-val\"]")).click();
        Select select = new Select(browser.findElement(By.xpath("#//*[@id=\"issuetype-options\"]")));
        WebElement option = select.getFirstSelectedOption();
        String defaultItem = option.getText();
        System.out.println(defaultItem );



//        Select dropdown = new Select(browser.findElement(By.xpath("#//*[@id=\"issuetype-options\"]")));
//        List<WebElement> dd = dropdown.getOptions();
//
//        System.out.println(dd.size());
//
//        for (int j = 0; j < dd.size(); j++) {
//            System.out.println(dd.get(j).getText());
//
//        }


//description operation
//        browser.findElement(By.xpath("//*[@id=\"description-val\"]")).click();
//        Thread.sleep(2000);
//        browser.findElement(By.xpath("//*[@id=\"description-wiki-edit\"]/nav/div/div/ul/li[2]/a")).click();
//
//        browser.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("Lorem ipsum dolor sit");
//        browser.findElement(By.cssSelector("#description-form > div.save-options.show-button-bar > div.wiki-button-bar-content > button.aui-button.aui-button-primary.submit")).click();
//        Thread.sleep(2000);
//        String text = browser.findElement(By.xpath("//*[@id=\"description-val\"]/div/p")).getText();
//        Assert.assertEquals(text.trim(), "Lorem ipsum dolor sit");

//Tickets
//        Actions actions = new Actions(browser);
//        Action controlClick = actions
//                .keyDown(Keys.CONTROL)
//                .click(browser.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div[1]/nav/div/div/ul/li[5]/a/span[2]")))
//                .keyUp(Keys.CONTROL)
//                .build();
//        controlClick.perform();
//        ArrayList<String> tabs = new ArrayList<String> (browser.getWindowHandles());
//        browser.switchTo().window(tabs.get(1));
//        List<WebElement> elemen = browser.findElements(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div/div/div/div/div/div[1]"));
//        System.out.println(elemen);




//  //      if(elemen != null || !elemen.isEmpty()){
//   //         System.out.println(elemen.size());
//            for (WebElement webElement : elemen) {
//                System.out.println(webElement.getAttribute("data-key"));
//            }
        }



    }
