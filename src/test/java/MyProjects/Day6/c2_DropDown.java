package MyProjects.Day6;

import MyProjects.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class c2_DropDown {
    //1. Open Chrome Browser
    //2. Go to "http://the-internet.herokuapp.com/"
    //3. Click on DropDown
    //4. Confirm default selected dropdown is "Please select an option"

    WebDriver driver;
    @BeforeMethod
    public void SetUp(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://the-internet.herokuapp.com/");
    }
    @Test
    public void TC1_VerifyDrpdown(){
        //3. Click on DropDown
        //select dropdowns are created by using <Select> tag in HTML
        //and if it is select dropdown you can handle by using Select class
        driver.findElement(By.xpath("//a[.='Dropdown']")).click();
        WebElement DropDownBox = driver.findElement(By.id("dropdown"));
//        4. Confirm default selected dropdown is "Please select an option"
        Select dropDown = new Select(DropDownBox);
        String ActualDefaultOption = dropDown.getFirstSelectedOption().getText();
        String ExpectedDefaultOption = "Please select an option";
        Assert.assertEquals(ActualDefaultOption,ExpectedDefaultOption,"The verification has failed!!");
    }
    @Test
    public void TC2VerifyOptionsFromDropDown() throws InterruptedException {
        //task2
        //1. Open Chrome Browser
        //2. Fo to "http://the-internet.herokuapp.com/"
        //3. click on dropdown
        //4. choose option 2 from dropdown
        //5. choose option 1 from dropdown
        //6. choose option 2 from dropdown
        //3. Click on DropDown
        driver.findElement(By.xpath("//a[.='Dropdown']")).click();
        WebElement DropDownBox = driver.findElement(By.id("dropdown"));
//        4. Confirm default selected dropdown is "Please select an option"
        Select dropDown = new Select(DropDownBox);
        //4. choose option 2 from dropdown
        Thread.sleep(2000);
        dropDown.selectByIndex(2);
        //5. choose option 1 from dropdown
        Thread.sleep(2000);
        dropDown.selectByValue("1");
//        /6. choose option 2 from dropdown
        Thread.sleep(2000);
        dropDown.selectByVisibleText("Option 2");
    }
    @AfterMethod
    public void Closing(){
        driver.quit();
    }
}
