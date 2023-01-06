package MyProjects.StudyHall;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Day04_MonkeyTesting {

    //Monkey Testing you as on user click the functionality randomly
    // you do not follow the steps you try to break the app by clicking random links.
    //"ul[data-ui='top-nav-category-list'] li a" ====> this is how to get the random link all together by the css selector



    @Test
    public void monkeyTesting(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement> linklist= driver.findElements(By.cssSelector("ul[data-ui='top-nav-category-list'] li a"));

        int headerCount = linklist.size();
        System.out.println(headerCount);

        System.out.println();

        for (int i = 0; i < headerCount; i++) {
            // this will basically choose randomly by the index if you dont put this then the forloop will go in order
            // of the index/ so this is choosing the links randomly
            int randomIndex = (int) Math.floor(Math.random() * headerCount);// randomly clicking  <*>
            System.out.println(randomIndex);

            WebElement element = linklist.get(randomIndex);
            System.out.println(element.getText());
            element.click();
            driver.navigate().back();
//            element.click();
            // if we use element.click() again, selenium will not recognize and you'll get staleElementReferenceException
            //the Reason for that you can not use sanme element when you navigate back because it counted as autdated
            //you need to declare that element again to avoid exception
            linklist = driver.findElements(By.cssSelector("ul[data-ui='top-nav-category-list'] li a"));




        }


    }




}
