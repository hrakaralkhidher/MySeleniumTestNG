package MyProjects.Day5;

import org.testng.Assert;
import org.testng.annotations.*;

public class c2_TestNGPractice {
    @BeforeClass
    public void setupBeforeclass(){
        System.out.println("Before class is running");
    }
    @AfterClass
    public void closingAfterClass(){
        System.out.println("After class is running");
    }
    @BeforeMethod
    public void setup(){
        System.out.println("This is before method, it is running");
    }
    @AfterMethod
    public void closing(){
        System.out.println("This is after method, it is running");
    }
// it doesnt matter if the test cases are out of order but when you run they will be in order, ex TC1 TC3 TC2 it will be 123
    //in the below case: TC1 is depends on Test3, if TC3 passed, TC1 will be executed,if Not TC1 will be ignored
    @Test(priority = 3)
    public void TC1(){
        System.out.println("Test 3 is running");
    }

    @Test(priority = 1)
    public void TC3(){
        System.out.println("Test 3 is running");
        String expectedbestDrink = "coffee";
        String ActualBestDrink = "tea";
        Assert.assertEquals(expectedbestDrink,ActualBestDrink,"Verification has failed");
        // if assertion is failed the rest of the code block will not be executed!!!!!!
        // thats why we need to choose very carefully because the rest of the code block wont be excuted
        System.out.println("TC1 is done");
    }
    @Test(priority = 2)
    public void TC2(){
        System.out.println("Test 2 is running");
        String expectedBestFood = "coxinha";
        String actualFood = "coxinha";
        Assert.assertEquals(actualFood,expectedBestFood,"Food Verification has failed");
    }
}
