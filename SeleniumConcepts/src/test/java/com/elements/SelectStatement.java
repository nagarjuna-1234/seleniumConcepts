package com.elements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectStatement {
	public WebDriver driver;

	@BeforeMethod
	public void precondition() {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("file:///C:/Users/venky/Documents/months.html");

	}

	@Test
	public void f() {
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='month']"));
		Select sel=new Select(dropdown);
		sel.selectByIndex(1);
		sel.selectByValue("feb");
		sel.selectByVisibleText("NOV");
		
		List<WebElement>seloptions=sel.getOptions();
		for(WebElement op:seloptions) {
			System.out.println("op is:"+op.getText());
		}

	}

	/*
	 * @AfterMethod public void postcondition() { driver.close();
	 * 
	 * }
	 */
}
