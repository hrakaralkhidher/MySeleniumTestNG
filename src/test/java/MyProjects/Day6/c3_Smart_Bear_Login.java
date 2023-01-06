package MyProjects.Day6;

import MyProjects.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class c3_Smart_Bear_Login {
    //1- Open a chrome browser
    //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3- Enter username --->Tester
    //4- Enter password --->test
    //5- Click "Login" button
    //6- Verify title equals: Web Orders
    WebDriver driver;
    @BeforeMethod
    public void SetUp(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }
    @AfterMethod
    public void closing(){
       // driver.close();
    }
    @Test
    public void TC1_loginVerfication(){
        //3- Enter username --->Tester
        //4- Enter password --->test
        //5- Click "Login" button
        //6- Verify title equals: Web Orders
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement LoginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        LoginButton.click();
        //6- Verify title equals: Web Orders
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Web Orders";
        Assert.assertEquals(ActualTitle,ExpectedTitle,"Title Verification has failed!!");
        System.out.println("Title Verification has Passed");
    }
}
