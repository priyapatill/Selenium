package com.selenium.JavaSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeftAndRightLocator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pcpatil\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //launch chrome
		
		driver.manage().window().maximize();//maximize window
		driver.get("https://www.softwaretestingmaterial.com/");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
		WebElement element=driver.findElement(By.xpath("//*[@id=\"kt-layout-id_ce6aeb-d9\"]/div/div[2]/div/figure/a/img"));
		WebElement right=driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(element));
		//explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(right));
		right.click();
		
		driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(By.xpath("//*[@id=\"kt-layout-id_ce6aeb-d9\"]/div/div[2]/div/figure/a/img"))).click();
		driver.findElement(RelativeLocator.with(By.tagName("img")).near(By.xpath("//*[@id=\"kt-layout-id_ce6aeb-d9\"]/div/div[2]/div/figure/a/img"))).click();
	}

}
