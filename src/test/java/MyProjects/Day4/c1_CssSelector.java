package MyProjects.Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_CssSelector {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        //how to find element with css selector is howen in bottom this is  input[dir='auto']
        //the reason we use the css selector is because is faster than xpath locator
        //# means id in CSS selector
        //bottom is the first method to use the css selectors
//        driver.findElement(By.cssSelector("input[dir='auto']")).sendKeys("home decor");
        //second method using css selector
//        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("tea maker"); workes too
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("tea maker");//without input

    }
}
