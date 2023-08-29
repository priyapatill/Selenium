package com.selenium.JavaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
		Actions action=new Actions(driver);
		WebElement textElement=driver.findElement(By.name("q"));
		action.keyDown(Keys.SHIFT);
		action.sendKeys("hello world").perform();
		action.keyUp(Keys.SHIFT);
		action.sendKeys("  how are you").perform();
				

	}

}
