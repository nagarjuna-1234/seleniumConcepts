package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHovering2 {
	public WebDriver driver;
	
	@BeforeMethod
	public void precondition() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");	
	}
	
	@Test
	public void mouseHovering() {
	//	driver.switchTo().alert().accept();
		WebElement crossLabel = driver.findElement(By.xpath("//button[.='✕']"));
		crossLabel.click();
		WebElement tvsAppliances = driver.findElement(By.xpath("//span[.='TVs & Appliances']"));
		Actions act=new Actions(driver);
		act.moveToElement(tvsAppliances).perform();
		WebElement Mi=driver.findElement(By.xpath("(//a[@title='Mi'])[2]"));
		Mi.click();
	}
	
	
	@AfterMethod
	public void postcondition() {
		//driver.close();
	}	

}
