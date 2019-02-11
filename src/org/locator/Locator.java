package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YUVARAJ\\eclipse-workspace\\Locator\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
         WebElement username =driver.findElement(By.id("username"));
		username.sendKeys("Green");
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("345678");
		
	}

}
