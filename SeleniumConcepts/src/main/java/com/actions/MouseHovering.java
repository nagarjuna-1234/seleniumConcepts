package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHovering {
	public WebDriver driver;

	@BeforeMethod
	public void precondition() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.actimind.com/");
	}

	@Test
	public void testMouseHovering() {
		WebElement areaofexpert = driver.findElement(By.xpath("//a[@class='c-link dropdown-toggle']"));
		Actions act = new Actions(driver);
		act.moveToElement(areaofexpert).perform();
		WebElement cloudApp=driver.findElement(By.xpath("//a[.='Cloud Applicationss']"));
		cloudApp.click();
		
		String exeTitle="Web-Based Cloud Applications";
		String obsTitle=driver.getTitle();
		
	 Assert.assertEquals(obsTitle, exeTitle);
		

	}

	@AfterMethod
	public void postcondition() {
		//driver.close();
	}

}
