package MyProjects.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_LinkText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https:/www.google.com");
//        driver.manage().window().maximize();
//        //click Gmail on the right top
//        used link text locator
//        driver.findElement(By.linkText("Gmail")).click();
//        used class name locator
//

//        used partial link text
        driver.findElement(By.partialLinkText("Gm")).click();
    }
}
