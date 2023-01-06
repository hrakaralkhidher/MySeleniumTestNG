package MyProjects.Day5;

import org.testng.annotations.*;

public class c1_TestNGIntro {
    //will run only one time before class
    @BeforeClass
    public void setupBeforeclass(){
        System.out.println("Before class is running");
    }
    //will run only one time after class
    @AfterClass
    public void closingAfterClass(){
        System.out.println("After class is running");
    }
    //the aftermethod will execute for each test case
    @AfterMethod
    public void closing(){
        System.out.println("This is after method, it is running");
    }

    // in TestNG we do NOT use the main methods anymore
    //the before method will execute for each test case
    // it doesnt matter where you locate the before and after methods they will still run properly
    // will run before each test
    @BeforeMethod
    public void setup(){
        System.out.println("This is before method, it is running");
    }
//@Test is out main annotation which store main code
    @Test
    public void TC1(){
        System.out.println("Test 1 is running");
    }
    @Test
    public void TC2(){
        System.out.println("Test 2 is running");
    }



}
