package com.selenium.JavaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DateDay7 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement src=driver.findElement(By.id("source"));
		src.sendKeys("Bangalore");
		WebElement dest=driver.findElement(By.id("destination"));
		dest.sendKeys("Bijapur");
		
		WebElement datepick = driver.findElement(By.xpath("//*[@id='datepicker1']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','04/10/2023')",datepick);
        
        driver.findElement(By.cssSelector("#frmFinal > div > div:nth-child(6) > a")).click();
	}

}
