package MyProjects.Day.Day7;

import MyProjects.Day.utilities.SmartBearUtils;
import MyProjects.Day.utilities.WebDriverUtil;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class c3_SmartBearWithJavaFaker {
    //1- Open a chrome browser
    //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //3- Login
    //4. Click on Order
    //5. Select familyAlbum from product, set quantity to 5
    //6. Click to "Calculate" button
    //7. Fill address Info with JavaFaker
    //8. Click on "visa" radio button
    //9. Generate card number using JavaFaker
    //10Enter expiration date
    //11. Click on "Process"
    //12.Verify success message "New order has been successfully
    WebDriver driver;
    @BeforeMethod
    public void SetUp(){
        //1- Open a chrome browser
        //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        //3- Login
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartBearUtils.LoginForSmartBearUtil(driver);
    }
    @Test
    public void JavaFakerPractice(){

        //4. Click on Order
        WebElement orderLink = driver.findElement(By.xpath("//a[@href='Process.aspx']"));
        orderLink.click();

        //5. Select familyAlbum from product, set quantity to 5
        Select select = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        select.selectByIndex(1);
        WebElement quantity = driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity"));
        quantity.sendKeys(Keys.BACK_SPACE);
        quantity.sendKeys("5");
        //6. Click to "Calculate" button
        //7. Fill address Info with JavaFaker
        Faker fake = new Faker();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(fake.name().name());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(fake.address().streetAddress());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(fake.address().city());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(fake.address().state());
        WebElement zip = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
        zip.sendKeys(fake.address().zipCode().replaceAll("-",""));
        //8. Click on "visa" radio button
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
        //9. Generate card number using JavaFaker
        WebElement cardNumber = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        cardNumber.sendKeys(fake.finance().creditCard().replaceAll("-",""));
        //10Enter expiration date
        WebElement expDate = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        expDate.sendKeys("12/23");
        //11. Click on "Process"
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
        //12.Verify success message "New order has been successfully
        WebElement SuccessMessage = driver.findElement(By.tagName("strong"));
        Assert.assertEquals(SuccessMessage.getText(),"New order has been successfully added.");





    }
}
