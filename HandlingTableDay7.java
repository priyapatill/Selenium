package com.selenium.JavaSelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTableDay7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/ ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		List<WebElement> list= driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
		List<String> string=new ArrayList<>();
		//System.out.println(s);
//		for (WebElement webElement : list) {
//			System.out.println(webElement.getText());
//			
//		}
		//for column val
		//List<WebElement> rows= driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
		for(int i=0;i<list.size();i++) {
			WebElement num=driver.findElement(By.xpath("//table[@id='table1']//tr["+(i+1)+"]//td[3]"));
			string.add(num.getText());
		}
		Collections.sort(string);
		for (String string2 : string) {
			System.out.println(string2);
			
		}
		
		

	}

}
