package HomeWorks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork3_Task1 {
    public static void main(String[] args) throws InterruptedException {
        //TASK: Google search
        //1- Open a chrome browser
        //2- Go to: https://google.com
        //3- Write “apple” in search box
        //4- Click google search button
        //5- Verify title:
        //Expected: Title should start with "apple" word
        //6-navigate back
        //7-write cherry in search box
        //8-verify title contains cherry.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //TASK: Google search
        //1- Open a chrome browser
        //2- Go to: https://google.com
        driver.get("https://google.com");
        //3- Write “apple” in search box
        WebElement GoogleSearchBox = driver.findElement(By.name("q"));
        GoogleSearchBox.sendKeys("apple");
        //4- Click google search button
        WebElement clickButton = driver.findElement(By.name("btnK"));
        clickButton.click();
        //5- Verify title:
        //Expected: Title should start with "apple" word
        String TitleStart = "apple";
        String ActualTitle = driver.getTitle();
        if (ActualTitle.startsWith(TitleStart)){
            System.out.println("The Title Verification has Passed = "+driver.getTitle());
        }else{
            System.out.println("The Title Verification has Failed"+driver.getTitle());
        }
        //6-navigate back
        driver.navigate().back();
        //7-write cherry in search box
        GoogleSearchBox.sendKeys("cherry");
        WebElement ClickButton = driver.findElement(By.name("btnK"));
        ClickButton.click();
        Thread.sleep(2000);
        //8-verify title contains cherry.
        String TitleContains = "cherry";
        String Title = driver.getTitle();
        if (Title.contains(TitleContains)){
            System.out.println("The Title Verification has Passed = "+driver.getTitle());
        }
        else{
            System.out.println("The Title Verification has Failed"+driver.getTitle());
        }
    }
}
