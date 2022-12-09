package HomeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2_Task1 {
    public static void main(String[] args) {
        //TC #1: Facebook title verification
        //Task - 1
        //Open Chrome Browser
        //Go to https://www.facebook.com
        //Verify title: Expected: "Facebook - Log In or Sign Up"
        //Task - 2
        //Open Chrome Browser
        //Go to google
        //Navigate back
        //Navigate forward
        //Navigate to https://www.amazon.com
        //Verify title contains : Smile

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

        //TC #1: Facebook title verification
        //Task - 1
        //Open Chrome Browser
        //Go to https://www.facebook.com
        //Verify title: Expected: "Facebook - Log In or Sign Up"
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        String expectedTitle = "Facebook - Log In or Sign Up";
        String ActualTitle = driver.getTitle();
        if(ActualTitle == expectedTitle){
            System.out.println("The Title verification has passed");
        }else {
            System.out.println("The Title verification has failed, The current title is = "+driver.getTitle());
        }
    }
}
