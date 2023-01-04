package MyProjects.Day.Day11;

import MyProjects.Day.base.TestBase2;
import MyProjects.Day.utilities.BrowserUtils;
import MyProjects.Day.utilities.DriverUtil;
import MyProjects.Day.utilities.PropertiesReadingUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c3_Actions extends TestBase2 {
    //go to http://demo.guru99.com/test/simple_context_menu.html
    //double click to double click button
    //then accept the alert that pops up
    Actions actions;
    @Test
    public void TC1_double_click(){
        DriverUtil.getDriver().get("http://demo.guru99.com/test/simple_context_menu.html");
        WebElement doubleClickButton = DriverUtil.getDriver().findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
        actions= new Actions(DriverUtil.getDriver());
        //double click to double click button
        actions.doubleClick(doubleClickButton).perform();
        //then accept the alert that pops up
        Alert alert = DriverUtil.getDriver().switchTo().alert();
        BrowserUtils.Wait(2);
        alert.accept();
    }
    @Test
    public void TC2_rightClick(){
        //go to http://demo.guru99.com/test/simple_context_menu.html
        //right click to right click button
        //then click on edit button
        //then accept the alert that pops up
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("guru99"));
        WebElement rightClickButton = DriverUtil.getDriver().findElement(By.xpath("//span[.='right click me']"));
        //right click to right click button
        actions = new Actions(DriverUtil.getDriver());
        actions.contextClick(rightClickButton).perform();
        //then click on edit button
        DriverUtil.getDriver().findElement(By.xpath("//span[.='Edit']")).click();
        Alert alert = DriverUtil.getDriver().switchTo().alert();
        BrowserUtils.Wait(2);
        alert.accept();
    }
    @Test
    public void TC3_DragDrop(){
        //http://demo.guru99.com/test/drag_drop.html
        DriverUtil.getDriver().get("http://demo.guru99.com/test/drag_drop.html");
        //first find were drag from, in this case it is bank
        WebElement dragFrom = DriverUtil.getDriver().findElement(By.id("credit2"));
        //then firnd where to drop to
        WebElement dropTo = DriverUtil.getDriver().findElement(By.id("bank"));
        //use actions to drag and drop
        actions = new Actions(DriverUtil.getDriver());
        actions.dragAndDrop(dragFrom,dropTo).perform();
        // 2nd step , first specify the location of drag, and then the location of the drop
        WebElement dragFrom2 = DriverUtil.getDriver().findElement(By.id("fourth"));
        WebElement dropTo2 = DriverUtil.getDriver().findElement(By.id("amt7"));
        actions.dragAndDrop(dragFrom2,dropTo2).perform();
    }
}
