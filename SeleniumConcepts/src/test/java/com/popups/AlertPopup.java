package com.popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertPopup {
	public WebDriver driver;

	@BeforeMethod
	public void precondition() {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

	}
	@Test
	public void testAlertPopup() {
		WebElement goButton=driver.findElement(By.name("proceed"));
		goButton.click();
		driver.switchTo().alert().accept();
	}

	
	@AfterMethod
	public void postcondition() {
		driver.close();
		
	}

}
