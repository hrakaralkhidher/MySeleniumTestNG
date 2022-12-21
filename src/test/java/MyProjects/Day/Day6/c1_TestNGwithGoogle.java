package MyProjects.Day.Day6;

import MyProjects.Day.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class c1_TestNGwithGoogle {
    //got to google
    //search macbook
    //verify title
    WebDriver driver;
    @BeforeMethod
    public void setUP(){
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.google.com");

    }
    @Test
    public void GoogleTitleVerification(){
        //search macbook
        WebElement GoogleSearchBox = driver.findElement(By.xpath("//input[@name='q']"));
        GoogleSearchBox.sendKeys("macbook", Keys.ENTER);
        //verify title contains "macbook"
        String actualTitle = driver.getTitle();
        String ExpectedTitle = "macbook";
        boolean b = actualTitle.contains(ExpectedTitle);
        Assert.assertTrue(b,"assertion Failed, Title does not contain macbook");
    }
    @AfterMethod
    public void Closing(){
        driver.quit();
    }
}
