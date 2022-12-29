package HomeWorks;

import MyProjects.Day.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HomeWork9 {
/*
website: http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
Test Scenario:
* 		Go to the above URL.
* 		Get the current window’s handle and write to the console window. It must be the first window handle.
* 		Locate the “Visit W3Schools.com!” link and click it.
* 		Get all window handles and hold them in a list.
* 		Write to total window handle number to the console. It must be 2.
* 		Switch t the second window.
* 		Get the current window’s handle and write to the console window. It must be a second window handle.
* 		Check the upper left side logo in the second window.
* 		Go back (Switch) to the first window.
* 		Get the current window’s handle and write to the console window. It must be the first window handle.
* 		Check the See Run Button Text. It must contain “Run >” text.
 */
    WebDriver driver;
  @BeforeMethod
    public void SetUp(){
      driver = WebDriverUtil.getDriver("chrome");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      driver.manage().window().maximize();
//      * 		Go to the above URL.
      driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
  }
  @Test
    public void lab9() throws InterruptedException {
//      Locate the “Visit W3Schools.com!” link and click it.
      driver.switchTo().frame("iframeResult");
      driver.findElement(By.partialLinkText("Visit")).click();
//      * 		Get all window handles and hold them in a list.
      Set<String> allWindows = driver.getWindowHandles();
//      * 		Write to total window handle number to the console. It must be 2.
      System.out.println("The total tabs: "+allWindows.size());
      List<String> tabs = new ArrayList<>();
      for(String Window: allWindows){
          tabs.add(Window);
          driver.switchTo().window(Window);
          System.out.println("Switching to: "+Window);
      }
//      * 		Check the upper left side logo in the second window.
      WebElement logo = driver.findElement(By.xpath("//a[@title='Home']"));
      Assert.assertTrue(logo.isDisplayed());
//      * 		Go back (Switch) to the first window.
      driver.switchTo().window(tabs.get(0));
//      * 		Get the current window’s handle and write to the console window. It must be the first window handle.
      System.out.println("The Current Title: "+driver.getTitle());
//      * 		Check the See Run Button Text. It must contain “Run >” text.
      WebElement button = driver.findElement(By.id("runbtn"));
      Assert.assertTrue(button.getText().contains("Run"));
  }
}
