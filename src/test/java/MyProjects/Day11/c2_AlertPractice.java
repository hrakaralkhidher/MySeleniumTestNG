package MyProjects.Day11;

import MyProjects.base.TestBase2;
import MyProjects.utilities.BrowserUtils;
import MyProjects.utilities.DriverUtil;
import MyProjects.utilities.PropertiesReadingUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c2_AlertPractice extends TestBase2 {
    /*
    Go to "http://the-internet.herokuapp.com/"
    click JavaScript Alerts
    Click for Js Prompt
    Enter "hello word" text
    Click okay
    Validate your text appearing on the page
*/
    @Test
    public void AlertPractice(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("herokuapp"));
//        click JavaScript Alerts
        WebElement jsAlertLink = DriverUtil.getDriver().findElement(By.xpath("//a[.='JavaScript Alerts']"));
        jsAlertLink.click();

        WebElement jsAlertPromptLink = DriverUtil.getDriver().findElement(By.xpath("//button[.='Click for JS Prompt']"));
        jsAlertPromptLink.click();
        Alert alert = DriverUtil.getDriver().switchTo().alert();
        alert.sendKeys("Hello world");
        BrowserUtils.Wait(4);
        alert.accept();


        WebElement actualText = DriverUtil.getDriver().findElement(By.id("result"));
        Assert.assertTrue(actualText.getText().contains("Hello World"));

    }
}
