package MyProjects.Day8;

import MyProjects.utilities.BrowserUtils;
import MyProjects.utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class c2_Alerts {
    //1- Open a chrome browser
    //2- Go to:https://renas-practice.herokuapp.com/home
    //click on elements
    //Click on Alert box
    //click button
    //handle alert
    WebDriver driver;
    @BeforeMethod
    public void SetUp(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://renas-practice.herokuapp.com/home");
    }
    @Test
    public void TC1_AlertPractice(){
        //click on elements
        driver.findElement(By.id("selenium-Elements")).click();
        //Click on Alert box
        driver.findElement(By.id("Alert BoxI")).click();
        //click on "click me" alert burron
       WebElement alertButton =  driver.findElement(By.id("alert-demo"));
       alertButton.click();
        //handle alert
        //first we switch to Alert, then handle it
        Alert alert = driver.switchTo().alert();
        BrowserUtils.Wait(2);
        alert.accept();
        alertButton.click();
        BrowserUtils.Wait(2);
        alert.dismiss();


    }
}
