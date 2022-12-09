package MyProjects.Day.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_BrowserNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        //maximize browser page
        driver.manage().window().maximize();
        // get current title
        System.out.println("current title = "+driver.getTitle());
        //get current url
        System.out.println("current urls is = "+driver.getCurrentUrl());

        //navigate to tesla
        driver.get("https://www.tesla.com/");
        System.out.println("current title = "+driver.getTitle());
        //to close browser page
        driver.close();
    }
}
