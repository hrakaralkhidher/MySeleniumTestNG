package MyProjects.Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_getText_Attribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        WebElement gmaiLink = driver.findElement(By.linkText("Gmail"));
        System.out.println("Gmail text is = "+gmaiLink.getText());
        // this is how you we get the attribute value from the website you can change href to whatever attribute ex class or href
        System.out.println("Gmail class attrribute value is = "+gmaiLink.getAttribute("class"));
    }
}
