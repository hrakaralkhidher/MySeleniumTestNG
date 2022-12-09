package HomeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork3_Task3 {
    public static void main(String[] args) throws InterruptedException {
        //go to https://opensource-demo.orangehrmlive.com/
        //locate user name and send user name, (username=Admin)
        //locate user password and send password (password=admin123)
        //click on the login button
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //go to https://opensource-demo.orangehrmlive.com/
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(2000);
        //locate user name and send user name, (username=Admin)
        WebElement UsernameButton = driver.findElement(By.name("username"));
        UsernameButton.sendKeys("Admin");
        Thread.sleep(2000);
        //locate user password and send password (password=admin123)
        WebElement PasswordButton = driver.findElement(By.name("password"));
        PasswordButton.sendKeys("admin123");
        Thread.sleep(2000);
        //click on the login button
        WebElement clickLogin = driver.findElement(By.tagName("button"));
        clickLogin.click();
        Thread.sleep(2000);
    }
}
