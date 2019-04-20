package com.actions;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop {
	public WebDriver driver;

	@BeforeMethod
	public void precondition() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		
	}

	@Test
	public void testDragAndDrag() {
		WebElement src1 = driver.findElement(By.xpath("//h1[.='Block 2']"));
		WebElement dst = driver.findElement(By.xpath("//h1[.='Block 3']"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src1, dst).perform();		
	
	}
		
	

	//@AfterMethod
	//public void postcondition() {
		//driver.close();
	//}

}
