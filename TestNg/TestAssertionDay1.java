import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

public class TestAssertionDay1 {
  @Test(priority = 2)
  public void f1() {
	  //driver setup
	  WebDriverManager.chromedriver().setup();
	  //browser object
	  WebDriver driver=new ChromeDriver();
	  //open Google
	  driver.get("https://google.com");
	  //Search Hello and hit enter
	  driver.findElement(By.name("q")).sendKeys("Hello", Keys.ENTER);
	  //verify actual and expected titles are same
	  //Assert.assertEquals(driver.getTitle(), "Hello - Google Search");
	  Assert.assertNotEquals(driver.getTitle(), "Hello - gle Search");
  }
   
  @Test(priority = 1)
  public void f2() {
	  //driver setup
	  WebDriverManager.chromedriver().setup();
	  //browser object
	  WebDriver driver=new ChromeDriver();
	  //open Google
	  driver.get("https://bing.com");
	  
  }
  
  @Test
  public void f3() {
	  //driver setup
	  WebDriverManager.chromedriver().setup();
	  //browser object
	  WebDriver driver=new ChromeDriver();
	  //open Google
	  driver.get("https://demoblaze.com");
	  
  }
}
