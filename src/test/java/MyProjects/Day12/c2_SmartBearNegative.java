package MyProjects.Day12;

import MyProjects.POMPages.SmartBearLoginPage;
import MyProjects.base.TestBase2;
import MyProjects.utilities.DriverUtil;
import MyProjects.utilities.PropertiesReadingUtil;
import com.github.javafaker.Faker;
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
