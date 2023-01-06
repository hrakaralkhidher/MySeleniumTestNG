package MyProjects.Day12;

import MyProjects.utilities.DriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class c3_ExplicitlyWait {
            /*
          The Implicit Wait in Selenium is used to tell the web driver to
           wait for a certain amount of time before it throws a "No Such Element Exception".
          The default setting is 0. Once we set the time, the web driver will
          wait for the element for that time before throwing an exception

        Explicit Wait
      The Explicit Wait in Selenium is used to tell the Web Driver to wait for
      certain conditions (Expected Conditions) or maximum time exceeded before
      throwing "ElementNotVisibleException" exception.
      It is an intelligent kind of wait, but it can be applied only for specified elements.
      */

    @Test
    public void TC1_implicitlyWait(){
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        DriverUtil.getDriver().get("https://www.google.com");
    }
    @Test
    public void TC2_explicitlyWait(){
        WebDriverWait driverWait = new WebDriverWait(DriverUtil.getDriver(),Duration.ofSeconds(2));//explicitly wait
        DriverUtil.getDriver().get("https://www.google.com");
        driverWait.until(ExpectedConditions.titleIs("Google"));

        WebElement GoogleSearchBox = DriverUtil.getDriver().findElement(By.name("q"));
        driverWait.until(ExpectedConditions.visibilityOf(GoogleSearchBox));
        driverWait.until(ExpectedConditions.elementToBeClickable(GoogleSearchBox));
        GoogleSearchBox.sendKeys("Best Car In 2022");
    }
}
