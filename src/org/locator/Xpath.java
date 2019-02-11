package org.locator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\YUVARAJ\\eclipse-workspace\\Locator\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		String handle = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		}

}
