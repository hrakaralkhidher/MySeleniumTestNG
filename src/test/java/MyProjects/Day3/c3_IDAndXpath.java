package MyProjects.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_IDAndXpath {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        //ID locator
        //ID is always unique
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Christmas Tree");
        //How Xpath locator works, //tagname[@attribute='value']
        //click search burron
        driver.findElement(By.xpath("//input[@type='submit']")).click();

    }
}
