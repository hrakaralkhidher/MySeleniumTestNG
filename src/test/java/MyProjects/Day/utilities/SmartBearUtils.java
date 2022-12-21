package MyProjects.Day.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartBearUtils {
    public static void LoginForSmartBearUtil(WebDriver driver){
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement LoginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        LoginButton.click();
    }


}
