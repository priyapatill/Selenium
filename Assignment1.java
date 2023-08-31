package com.selenium.JavaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//open the url
		driver.get("https://demo.smart-hospital.in/site/login");
		
		//maximize window
		driver.manage().window().maximize();
		
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		//click on pathologist
		driver.findElement(By.xpath("//a[@style='background:#e91e63;']")).click();
		
		//click on login
		driver.findElement(By.className("btn")).click();
		
		//click on messaging
		driver.findElement(By.cssSelector("#sibe-box > ul.sidebar-menu.verttop > li:nth-child(8) > a")).click();
		Thread.sleep(3000);
		
		//click on post new message
		driver.findElement(By.xpath("//*[@class='btn btn-primary btn-sm']")).click();
		
		//type into title
		driver.findElement(By.id("title")).sendKeys("This is a title");
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//type into frame
		WebElement element= driver.findElement(By.xpath("//body[@class='form-control wysihtml5-editor']"));
		element.sendKeys("This is a description");
		
		//get back to web-page
		driver.switchTo().defaultContent();	
		
		//notice date
		driver.findElement(By.id("date")).sendKeys("13/12/2023");
//		JavascriptExecutor js = (JavascriptExecutor) driver; --> or
//      js.executeScript("arguments[0].setAttribute('value','04/10/2023')",datepick);
        
        //publish date
        driver.findElement(By.id("publish_date")).sendKeys("05/10/2022");
        //js.executeScript("arguments[0].setAttribute('value','05/10/2022')",publishDate);
        
        //click on send
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        
        //confirmation
        System.out.println(driver.findElement(By.xpath("//*[@class='alert alert-success']")).getText());
        
        
	}

}
