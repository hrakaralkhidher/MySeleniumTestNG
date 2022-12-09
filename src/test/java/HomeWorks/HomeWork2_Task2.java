package HomeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2_Task2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Task - 2
        //Open Chrome Browser
        //Go to google
        //Navigate back
        //Navigate forward
        //Navigate to https://www.amazon.com
        //Verify title contains : Smile
        driver.get("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.get("https://www.amazon.com");
        String titlecontain = "Smile";
        String actualTitle = driver.getTitle();
        if(actualTitle.contains(titlecontain)){
            System.out.println("The verification has Passed, The Title Does Contain Smile "+driver.getTitle());
        }else {
            System.out.println("The verification has Failed");
        }
    }
}
