package MyProjects.Day12;

import MyProjects.POMPages.SmartBearLoginPage;
import MyProjects.base.TestBase2;
import MyProjects.utilities.DriverUtil;
import MyProjects.utilities.PropertiesReadingUtil;
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
