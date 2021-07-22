import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class lesson2 {
    @Test
    public  static void lesson2() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://jira.ithillel.com/browse/AQ-181");
        browser.findElement(By.xpath("//*[@id='user-options']/a")).click();
//Login
        browser.findElement(By.xpath("//*[@id=\"login-form-username\"]")).sendKeys("victoriaoreshet");

//Password
        browser.findElement(By.xpath("//*[@id=\"login-form-password\"]")).sendKeys("vika201017");
        browser.findElement(By.xpath("//*[@id=\"login-form-submit\"]")).click();
//Description
       // browser.findElement(By.xpath("//*[@id=\"priority-val\"]")).click();

       // WebElement element = browser.findElement(By.xpath("//*[@id=\"priority-val\"]"));
//        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        //for(WebElement selectedOption : selectedOptions) {
         //   System.out.println(selectedOption.getText());
      //  }
      //  browser.findElement(By.xpath("//*[@id=\"priority-field\"]")).

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
