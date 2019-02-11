package org.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\YUVARAJ\\eclipse-workspace\\Locator\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.shopclues.com/wholesale.html");
	driver.findElement(By.xpath("//input[@id=\"autocomplete\"]")).sendKeys("Fastrack Watch");
	driver.findElement(By.xpath("//a[@class=\"srch_action btn orange\"]")).click();
	driver.findElement(By.xpath("//img[@src=\"https://cdn.shopclues.com/images/thumbnails/79088/280/1/134318845-79088883-1518440243.jpg\"]")).click();
	Thread.sleep(2999);
	driver.findElement(By.xpath("//button[@data-formid=\"134318845\"]")).click();
}
}
