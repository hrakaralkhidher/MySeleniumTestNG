package MyProjects.Day.Day10;

import MyProjects.Day.base.TestBase;
import MyProjects.Day.utilities.BrowserUtils;
import MyProjects.Day.utilities.PropertiesReadingUtil;
import MyProjects.Day.utilities.SmartBearUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class c2_Configuration_properties_withSmartBear extends TestBase {
    //open chrome browser
    //go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //click on box which belongs "charles Dodgeson"
    //click on delete button
    //verify if charles deleted from the list

    @Test
    public void TC1_verifyDelete(){
        //go to http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get(PropertiesReadingUtil.getProperties("SmartBearUrl"));
        SmartBearUtils.LoginForSmartBearUtil(driver);
        WebElement click= driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl05_OrderSelector"));
        click.click();
        WebElement delete = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        delete.click();
        List<WebElement>ListOfNames=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
        for(WebElement eachName: ListOfNames){
            Assert.assertFalse(eachName.getText().contains("charles Dodgeson"),"Verification failed, charles Dodgeson has not been deleted from the list");
        }
        System.out.println("Verification has been passed");
    }
}
