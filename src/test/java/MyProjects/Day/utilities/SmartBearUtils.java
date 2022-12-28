package MyProjects.Day.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SmartBearUtils {
    public static void LoginForSmartBearUtil(WebDriver driver){
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement LoginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        LoginButton.click();
    }
    public static void negativeLoginForSmartBearUtil(WebDriver driver, String userID, String passwordID){
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys(userID);
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys(passwordID);
        WebElement LoginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        LoginButton.click();
    }

    public static void VerifyStreet(WebDriver driver, String StreetName){
        //to find the table // //table[@id='ctl00_MainContent_orderGrid']
        //to find all table row //table[@id='ctl00_MainContent_orderGrid']//tr

        List<WebElement> StreetsList=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[6]"));
                for(WebElement eachStreet: StreetsList){
                    if(eachStreet.getText().equals(StreetName)){
                        Assert.assertTrue(eachStreet.getText().equals(StreetName));
                        return;
                    }
                }
                Assert.fail("Street name: "+StreetName+"is not present on the table");
    }


}
