package MyProjects.Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumCode {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //set Up chrome driver
        WebDriverManager.chromedriver().setup();
        //create an instance of the driver
        WebDriver driver = new ChromeDriver();
        //navigate to chrome browser
        driver.get("https://www.google.com/");
        //go to amazone
        driver.get("https://www.amazone.com/");
        


    }
}
