package MyProjects.Day.Day12;

import MyProjects.Day.POMPages.SmartBearLoginPage;
import MyProjects.Day.base.TestBase2;
import MyProjects.Day.utilities.DriverUtil;
import MyProjects.Day.utilities.PropertiesReadingUtil;
import com.github.javafaker.Faker;
import org.openqa.selenium.devtools.Message;
import org.testng.Assert;
import org.testng.annotations.Test;

public class c2_SmartBearNegative extends TestBase2 {
    // enter invalid credentials
    // verify that you get error meddage

    @Test
    public void TC1_invalidUserCredentials(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBearUrl"));
        SmartBearLoginPage smartBearLoginPage = new SmartBearLoginPage();
        Faker faker = new Faker();
        smartBearLoginPage.loginForSmartBear(faker.name().username(),faker.internet().password());

        String expectedMessage = "Invalid Login or Password.";
        String actualMessage = smartBearLoginPage.getStatusMessage();
        Assert.assertEquals(expectedMessage,actualMessage,"verification has failed, user able to login");
    }

}
