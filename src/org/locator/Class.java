package org.locator;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\YUVARAJ\\eclipse-workspace\\Locator\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/automation-practice-table/");
		List<WebElement> list = driver.findElements(By.tagName("tr"));
	   for (int i = 0; i < list.size(); i++) {
			List<WebElement> list2 = list.get(i).findElements(By.tagName("td"));
			
			for (int j = 0; j < list2.size(); j++) {
				
				String text = list2.get(j).getText();
				if (text.equals("Taiwan")) {
				list2.get(4).getText();
					
					System.out.println(text);	
				}
				
				
			//	if(text.equals("China")) {
			//System.out.println(list2.get(4));	
				
			}
		}
			
	}
}

