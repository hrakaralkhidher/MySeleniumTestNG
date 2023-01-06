package MyProjects.Day13;

import MyProjects.POMPages.SeleniumPracticeHomePage;
import MyProjects.base.TestBase2;
import MyProjects.utilities.DriverUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c1_explicitlywaitWithPOM extends TestBase2 {
    //go to http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html
// click on timer
// verify "WebDriver" text present


    @Test
    public void TC1_explicitlyWait(){
        DriverUtil.getDriver().get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        SeleniumPracticeHomePage seleniumPracticeHomePage = new SeleniumPracticeHomePage();
        seleniumPracticeHomePage.clickTimerButton();
        seleniumPracticeHomePage.getDefaultText();
        // verify "WebDriver" text present
        String acualText = seleniumPracticeHomePage.getWebDriverText().getText();
        Assert.assertEquals(acualText,"WebDriver","Web Driver is not present");


    }

}
