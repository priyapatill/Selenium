package com.selenium.JavaSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDay8 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
//		Alert alert=driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
//		
//		Alert alert1=driver.switchTo().alert();
//		System.out.println(alert1.getText());
//		alert1.accept();
		driver.findElement(By.id("promptexample")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		//System.out.println(alert.getText());
		alert.sendKeys("This is a text");	
		//alert.accept();
		

	}

}
