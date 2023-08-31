package com.selenium.JavaSelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleSelectDay7 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		WebElement element=driver.findElement(By.xpath("//*[@name='selenium_commands']"));
		Select select= new Select(element);
		
		//get options of dropdown in list
//		List<WebElement> list=new ArrayList<WebElement>();
//		list=select.getOptions();
		
		//select item 3 and 4 by index
		select.selectByIndex(2);
		Thread.sleep(3000);
		select.selectByIndex(3);
		List<WebElement> list1= new ArrayList<WebElement>();
		list1=select.getAllSelectedOptions();
		for (WebElement webElement : list1) {
			System.out.println(webElement.getText());
			
		}
		Thread.sleep(2000);
		select.deselectByIndex(3);
		
		

	}

}
