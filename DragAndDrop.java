package com.selenium.JavaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
		Actions action=new Actions(driver);
		WebElement srcElement=driver.findElement(By.id("draggable")); //src
		WebElement destElement=driver.findElement(By.id("droppable"));//destination
		
		//scrolldown
//		JavascriptExecutor je= (JavascriptExecutor)driver;
//		je.executeScript("window.scrollBy(0,200)","");
		
		//action.clickAndHold(srcElement).release(destElement).build().perform();
		action.dragAndDrop(srcElement, destElement).perform();

	}

}
