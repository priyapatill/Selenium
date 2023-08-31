package com.selenium.JavaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.wpeverest.com/user-registration/paypal-integration.form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//user mail
		driver.findElement(By.id("user_email")).sendKeys("Ram@gmail.com");
		//password
		driver.findElement(By.id("user_pass")).sendKeys("Ram@123");
		//computer accessories
		driver.findElement(By.id("multiple_choice_1641271687_Keyboard")).click();
		System.out.println(driver.findElement(By.id("multiple_choice_1641271687_Keyboard")).isSelected()?"Selected":"Not selected");
		
		
		
		

	}

}
