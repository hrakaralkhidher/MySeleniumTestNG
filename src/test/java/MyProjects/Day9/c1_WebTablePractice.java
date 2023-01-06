package MyProjects.Day9;

import MyProjects.utilities.SmartBearUtils;
import MyProjects.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class c1_WebTablePractice {
    WebDriver driver;
    @BeforeMethod
    public void SetUp(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @Test
    public void TC1_Login(){
        SmartBearUtils.LoginForSmartBearUtil(driver);
        //verify that we login to SmartBear
        Assert.assertEquals(driver.getTitle(),"Web Orders");
    }

    @Test(dataProvider = "StreetDataLibrary")
    public void TC2_StreetVerification(String StreetName){
        //verify that given Street exist on the Web Table
        SmartBearUtils.LoginForSmartBearUtil(driver);
        SmartBearUtils.VerifyStreet(driver,StreetName);
    }
    @DataProvider(name = "StreetDataLibrary")
    public static Object [][] test(){
        return new Object[][]{
                {"55, Washington ave"},
                {"17, Park Avenue"},
                {"3, Garden st"}
        };


    }
}
