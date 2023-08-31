package com.selenium.JavaSelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropBoxDay7 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//select object for sort by dropdown
		Select select=new Select(driver.findElement(By.xpath("//*[@id='input-sort']")));
		//select.selectByVisibleText("Name (Z-A)");
		
		//or
		//select.selectByIndex(3);
		
		//or
		select.selectByValue("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24&sort=pd.name&order=ASC");
		
		List<WebElement> l1=select.getOptions();
		List<String> strings = new ArrayList<>();
		
		for (WebElement webElement : l1) {
			strings.add(webElement.getText());
			//System.out.println(webElement.getText());				
		}
		Collections.sort(strings);
		for (String string : strings) {
			System.out.println(string);		
		}	
	}

}
