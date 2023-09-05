import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class AnnotateDay1 {
	WebDriver driver;
	
	// This method will run before any test method in the class
    @BeforeClass
    public void setUp() {
        System.out.println("Setting up test environment");
    }

    // This method will run after all test methods in the class
    @AfterClass
    public void tearDown() {
        System.out.println("Tearing down test environment");
    }

    // This method will run before each test method
    @BeforeMethod
    public void beforeTestMethod() {
        System.out.println("Before each test method");
    }

    // This method will run after each test method
    @AfterMethod
    public void afterTestMethod() {
        System.out.println("After each test method");
    }

    // This is a test method
    @Test
    public void testMethod1() {
        System.out.println("Executing Test Method 1");
    }

    // This is another test method
    @Test
    public void testMethod2() {
        System.out.println("Executing Test Method 2");
    }

    // This method will run before any test method in the class
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }
    // This method will run after all test methods in the class
    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }
}
