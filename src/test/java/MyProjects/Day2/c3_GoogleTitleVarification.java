package MyProjects.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c3_GoogleTitleVarification {
    public static void main(String[] args) {
        //1.Open Chrome Browser
        //2.Go to google
        //3.Verify title : Expected : Google
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String ExpectedToSee = "Google";
        String ActualTitle = driver.getTitle();
        if(ActualTitle.contains(ExpectedToSee)){
            System.out.println("Verification passed");
        }
        else{
            System.out.println("Verification failed");
        }
    }
}
