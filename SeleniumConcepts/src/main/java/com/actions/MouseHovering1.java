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

public class MouseHovering1 {
	public WebDriver Driver;
	@BeforeMethod
	public void precondition() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	Driver=new ChromeDriver();
	Driver.get("http://istqb.in/#");
	}
	@Test
	public void testMouseHovering1() {
		WebElement campmobile=Driver.findElement(By.xpath("(//a[.='CMAP MOBILE'])[1]"));
		Actions act=new Actions(Driver);
		act.moveToElement(campmobile).perform();
		WebElement syllabus=Driver.findElement(By.xpath("(//a[.='SYLLABUS'])[1]"));
		syllabus.click();
		
		String exeTitle="SYLLABUS";
		String obsTitle=Driver.getTitle();
				
		Assert.assertEquals(obsTitle, exeTitle);
	}
	@AfterMethod
	public void postcondition() {
		//driver.close();
	}
	
	
	

}
