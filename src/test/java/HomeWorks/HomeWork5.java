package HomeWorks;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.security.Key;
import java.time.Duration;
public class HomeWork5 {
        //Go to Amazon
        //enter Desk in search box
        //Then search for desks
        // (Use this task with TestNG framework)
    WebDriver driver;
    @BeforeClass
    public void beforeclass(){System.out.println("Before the class");}
    @AfterClass
    public void AfterClass(){System.out.println("After the class");}
    @BeforeMethod
    public void ChromeSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void closing(){
        driver.quit();
    }
    @Test
    public void Search(){
        driver.get("https://www.amazon.com");
        WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
        Search.sendKeys("desk", Keys.ENTER);
    }
}
