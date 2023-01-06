package MyProjects.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_AmazoneTitleVerfication {
    public static void main(String[] args) {
        //Open Chrome Browser
        //Go to google
        //Navigate to https://www.amazon.com
        //Navigate back
        //Navigate forward
        //Verify title contains : Smile
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //go to google
        driver.get("https://www.google.com/");
        //Navigate to https://www.amazon.com
        driver.navigate().to("https://www.amazon.com");
        driver.manage().window().fullscreen();
        //Navigate back
        driver.navigate().back();
        //Navigate forward
        driver.navigate().forward();
        //Verify title contains : Smile
//        System.out.println("Verify title contains : Smile "+driver.getTitle().contains("Smile")); can do this also
        String ExpectedTitleWord = "Smile";
        String actualtitle = driver.getTitle();
        if(actualtitle.contains(ExpectedTitleWord)){
            System.out.println("Amazone title contains smile and verfication has passed");
        }
        else {
            System.out.println("Amazone title does not contain smile and verfication failed");
        }
        System.out.println("Actual Title is = "+driver.getTitle());

        driver.close();

    }
}
