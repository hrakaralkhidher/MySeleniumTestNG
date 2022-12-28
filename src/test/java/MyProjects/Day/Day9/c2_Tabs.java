package MyProjects.Day.Day9;

import MyProjects.Day.base.TestBase;
import MyProjects.Day.utilities.BrowserUtils;
import javafx.scene.control.Tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class c2_Tabs extends TestBase {
    //Used OOP Concept, Inheritance method

    @Test
    public void TC1_TabHandle(){
        //navigate to https://renas-practice.herokuapp.com/home
        //click on elements
        //click on windows
        driver.get("https://renas-practice.herokuapp.com/home");
        //click on elements
        driver.findElement(By.id("selenium-Elements")).click();
        //click on windows
        driver.findElement(By.id("WindowsII")).click();

        //this method will store current and only one window
        String currentWindow = driver.getWindowHandle();
        System.out.println("current window: "+currentWindow);
        System.out.println("current title: "+driver.getTitle());

        //click on open new tab button which is "click me"

        WebElement openTabButton = driver.findElement(By.id("open-tab"));
        openTabButton.click();
        System.out.println("current Title: "+driver.getTitle());
        Set<String> allTabs = driver.getWindowHandles();// this method will store all the tabs
        for(String tab: allTabs){
            driver.switchTo().window(tab);
            BrowserUtils.Wait(2);
            System.out.println(driver.getTitle());
        }




    }

}
