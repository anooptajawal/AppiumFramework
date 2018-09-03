package testngpkg;

import org.testng.annotations.*;

public class DemoTestng {

    @BeforeMethod
    public void UseridGeneration() {
        System.out.println("This block executes before each Test");
    }

    //delete cookies
    @BeforeTest
    public void Cookies() {
        System.out.println("This block executes Before all Testcases");
    }

    //close the browesers
    @AfterTest
    public void Cookiesclose() {
        System.out.println("This block executes after all Testcases");
    }

    @AfterMethod
    public void Reportadding() {
        System.out.println("This block executes after each Test");
    }

    //This opens the Browser
    @Test
    public void OpeningBrowser() {
        System.out.println("Executing Test 2");
    }

    @Test
    public void FlightBooking() {
        System.out.println("Executing Test 1");
    }

    @Test
    public void FlightCancel() {
        System.out.println("Executing Test Priority 2");
    }
}
