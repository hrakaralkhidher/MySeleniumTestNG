package MyProjects.Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class c3_ImplicitlyWait {
    public static void main(String[] args) throws InterruptedException {
        //1.open browser
        //2.go to the page https://www.vinexponewyork.com/
        //3.click on attend button
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vinexponewyork.com/");
        driver.manage().window().maximize();
//the bottom line is how to apply the implicitly wait time==> Thread.sleep will wait eaxactly the
// time you put while implicitly wait will excute once its ready to click so as soon as the page is loaded it will work
// instructor notes
//we are giving driver a option to wait until page loadded
//as soon as your web element load it will move on next step
//it is not going to wait until 10 sn
//if this was thread.sleep no matter it will always wait for 10 sn
//Implicit wait will effect all code block where we use it
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
        driver.findElement(By.cssSelector("a[href='/attend/']")).click();
//        driver.close(); this will just close that specific tab
        driver.quit();// this will quit the whole browser


    }
}
