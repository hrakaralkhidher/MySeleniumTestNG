package MyProjects.POMPages;

import MyProjects.utilities.DriverUtil;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    protected WebDriverWait driverWait = new WebDriverWait(DriverUtil.getDriver(), Duration.ofSeconds(0));

    public BasePage(){
        PageFactory.initElements(DriverUtil.getDriver(), this);
    }

}
