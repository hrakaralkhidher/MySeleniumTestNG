package HomeWorks;
import MyProjects.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
public class HomeWork6 {
//go to http://demo.guru99.com/test/newtours/register.php
// click on country dropdown and select Barbados with Select Method
//Use 3 different Select Method (visible text,index,value)
//and switch to another countries as you wish\
    WebDriver driver;
    @BeforeMethod
    public void Chrome(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://demo.guru99.com/test/newtours/register.php");
    }
    @Test
    public void demo() throws InterruptedException {
        driver.findElement(By.xpath("//select[@name='country']")).click();
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));
        Select dropD = new Select(dropdown);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        dropD.selectByVisibleText("BARBADOS");
        Thread.sleep(2000);
        dropD.selectByIndex(19);
        Thread.sleep(3000);
        dropD.selectByValue("IRAQ");
        Thread.sleep(4000);
    }
    @AfterMethod
    public void GoodBye(){
        driver.quit();
    }
}
