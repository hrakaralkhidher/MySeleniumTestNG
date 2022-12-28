package HomeWorks;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;
public class HomeWork4 {
    public static void main(String[] args) {
        //1. Open Chrome browser
        //2. Go to https://demo.guru99.com/test/radio.html
        //3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
        //4. Click to checkbox3
        //5. Verify checkbox3 is selected
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> Checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement check : Checkboxes) {
            if (!check.isSelected()) {
                System.out.println(check.getAttribute("value") + " is not selected");
            } else {
                System.out.println(check.getAttribute("value") + " is selected");
            }
        }
        WebElement checkbox3 = driver.findElement(By.id("vfb-6-2"));
        checkbox3.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        if (checkbox3.isSelected()) {
            System.out.println("Checkbox 3 is checked, Verification passed");
        } else {
            System.out.println("Checkbox 3 is not checked, Verification failed");
        }
    }
}
