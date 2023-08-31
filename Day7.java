package com.selenium.JavaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7 {
	
	//Frames topic

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/frames/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.switchTo().frame("frame1");
		//System.out.println("********We are switch to the iframe*******");
		WebElement element= driver.findElement(By.xpath("/html"));
		String s=element.getText();	
		System.out.println(s);
		
		driver.switchTo().defaultContent();	
		String s1=element.getText();	
        System.out.println(s1);

	}

}
