package HomeWorks;

import MyProjects.utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork8 {
/*
1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
Step 2) Enter Any Customer id.
Step 3) After entering the customer ID, Click on the “Submit” button.
Step 4) Reject/accept the alert.
 */
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
//        1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://demo.guru99.com/test/delete_customer.php");
    }
    @Test
    public void test() throws InterruptedException {
//        Step 2) Enter Any Customer id.
        WebElement CustomerID = driver.findElement(By.xpath("//input[@name='cusid']"));
        CustomerID.sendKeys("CustomerID");
//        Step 3) After entering the customer ID, Click on the “Submit” button.
        WebElement ClickSubmit = driver.findElement(By.xpath("//input[@name='submit']"));
        ClickSubmit.click();
//        Step 4) Reject/accept the alert.
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
        alert.dismiss();
    }
}
