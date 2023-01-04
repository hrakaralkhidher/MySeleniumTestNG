package MyProjects.Day.Day12;

import MyProjects.Day.POMPages.SmartBearLoginPage;
import MyProjects.Day.base.TestBase2;
import MyProjects.Day.utilities.DriverUtil;
import MyProjects.Day.utilities.PropertiesReadingUtil;
import org.testng.annotations.Test;

public class c1_smartBearPOM extends TestBase2 {
    //POM ===> page object model

    @Test
    public void TC1_SmartBearPositiveTestVerfication(){
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("SmartBearUrl"));
        SmartBearLoginPage smartBearLoginPage=new SmartBearLoginPage();
        smartBearLoginPage.loginForSmartBear(PropertiesReadingUtil.getProperties("SmartBear_userName"),
                PropertiesReadingUtil.getProperties("SmartBear_password"));


    }
}
