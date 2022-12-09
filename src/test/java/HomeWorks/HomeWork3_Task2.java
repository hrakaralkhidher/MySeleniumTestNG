package HomeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork3_Task2 {
    public static void main(String[] args) throws InterruptedException {
        //TASK2: Google Feeling lucky button
        //1- Open a chrome browser
        //2- Go to: https://google.com
        //3- Write "apple" in search box
        //click i am feeling lucky button
        //Verify title contains Apple
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //1- Open a chrome browser
        //2- Go to: https://google.com
        driver.get("https://google.com");
        //3- Write "apple" in search box
        WebElement GoogleSearchBox = driver.findElement(By.name("q"));
        GoogleSearchBox.sendKeys("apple");
        //click i am feeling lucky button
        WebElement IamFeelingLuckButton = driver.findElement(By.name("btnI"));
        IamFeelingLuckButton.click();
        Thread.sleep(2000);
        //Verify title contains Apple
       String TitleContains = "Apple";
       String ActualTitle = driver.getTitle();
       if (ActualTitle.contains(TitleContains)){
           System.out.println("The Title Verification has been Passed, The Title is = "+driver.getTitle());
       }else{
           System.out.println("The Title Verification has been Failed");
       }
    }
}
