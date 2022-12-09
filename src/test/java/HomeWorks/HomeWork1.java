package HomeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
    public static void main(String[] args) {
        /*
        ##Task 1
        Go to https://www.etsy.com/
        Maximize window
        ##Task 2
        Go to https://www.amazon.com/
        get title and print out
         */
        WebDriverManager.chromedriver().setup();
//        Go to https://www.etsy.com/
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
//        ##Task 2
//        Go to https://www.amazon.com/
//        get title and print out
        driver.get("https://www.amazon.com/");
        System.out.println("Title is = "+driver.getTitle());
    }
}
