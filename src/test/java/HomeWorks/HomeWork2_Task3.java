package HomeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2_Task3 {
    public static void main(String[] args) {
        //Second Task:
        // Go to https://www.etsy.com/
        // Maximize window
        // Verify title doesnt contains "Smile"
        // Verify Current Url
        // Go to https://www.amazon.com/
        // Verify title
        // Verify Current Url
        // Navigate Back
        // Refresh
        // Quit browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // Go to https://www.etsy.com/
        driver.get("https://www.etsy.com/");
        // Maximize window
        driver.manage().window().maximize();
        // Verify title doesnt contains "Smile"
        String Contins = "Smile";
        String Title = driver.getTitle();
        if (Title.contains(Contins)){
            System.out.println("Title contains smile"+driver.getTitle());
        }else{
            System.out.println("The Title does not contain Smile = "+driver.getTitle());
        }
        // Verify Current Url
        System.out.println("The current URL is = "+driver.getCurrentUrl());
        // Go to https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        // Verify title
        System.out.println(driver.getTitle());
        // Verify Current Url
        System.out.println("The Title of the page is = "+driver.getCurrentUrl());
        // Navigate Back
        driver.navigate().back();
        // Refresh
        driver.navigate().refresh();
        // Quit browser
        driver.close();
    }
}
