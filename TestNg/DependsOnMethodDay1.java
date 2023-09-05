import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependsOnMethodDay1 {
	WebDriver driver;
  @Test
  public void f() {
	//driver setup
	  WebDriverManager.chromedriver().setup();
	  //browser object
	   driver=new ChromeDriver();
	  //open Google
	  driver.get("https://google.com");
  }
  
  @Test(dependsOnMethods = {"f"})
  public void f2() {
	driver.findElement(By.name("q")).sendKeys("Depends on",Keys.ENTER);
  }
  
  @Test(dependsOnMethods = {"f","f2"})
  public void f3() {
	  driver.quit();	
  }
  
}
