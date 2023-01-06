package MyProjects.Day11;

import MyProjects.base.TestBase2;
import MyProjects.utilities.DriverUtil;
import MyProjects.utilities.PropertiesReadingUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c1_DriverUtilPractice extends TestBase2 {
    // go to Google
    //Search For 'Best City to celebrate New Year'
    //verify that title contains search Item

    @Test
    public void TC1(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("google_url"));
        WebElement searchBox = DriverUtil.getDriver().findElement(By.name("q"));
        searchBox.sendKeys(PropertiesReadingUtil.getProperties("search_item"));
        DriverUtil.getDriver().findElement(By.name("btnK")).click();
        Assert.assertTrue(DriverUtil.getDriver().getTitle().contains(PropertiesReadingUtil.getProperties("search_item")));
    }

}
