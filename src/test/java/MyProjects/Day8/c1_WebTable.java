package MyProjects.Day8;

import MyProjects.utilities.BrowserUtils;
import MyProjects.utilities.SmartBearUtils;
import MyProjects.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class c1_WebTable {
//    Smartbear software street verification
//       1. Open browser and login to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//       2. Click on View all orders
//       3. Verify Mark Smith has street as  "9, Maple Valley"
    WebDriver driver;
    @BeforeMethod
    public void SetUp(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtils.LoginForSmartBearUtil(driver);
    }
        @AfterMethod
    public void closing(){
        BrowserUtils.Wait(4);
        //driver.close();
    }
    @Test
    public void TC1_StreetVerfication(){
        WebElement markStreet = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[3]/td[6]"));
        System.out.println("mark street name: "+markStreet.getText());
        String actual = markStreet.getText();
        String expected = "9, Maple Valley";
        Assert.assertEquals(actual,expected,"StreetName Verification has failed!!!");

    }
}
