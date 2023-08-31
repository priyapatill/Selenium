package com.selenium.JavaSelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//a[contains(text(),'Clothing')]")).click();
		List<WebElement> products= driver.findElements(By.className("product-title"));
		List<String> sortProducts=new ArrayList<String>();
		for (WebElement webElement : products) {
			sortProducts.add(webElement.getText());
		}
		Collections.sort(sortProducts);
		for (String string : sortProducts) {
			System.out.println(string);
		}
	}

}
