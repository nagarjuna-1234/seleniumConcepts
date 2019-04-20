package com.popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.pages.LoginPage;

public class ChildBrowserPopup {

	public WebDriver driver;

	@BeforeMethod
	public void precondition() {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");

	}
	@Test
	public void testPopup() {
		String parentWindow=driver.getWindowHandle();
		//System.out.println("parent handle:"+parentWindow);
		Set<String> allWH=driver.getWindowHandles();
		
	//	System.out.println("wh size:"+allWH.size());
		for(String wh: allWH) {
			System.out.println("window handle :"+wh);
			if(wh.equals(parentWindow)) {
			driver.switchTo().window(wh);
			driver.close();
			}
		}
	}
	

	
	  @AfterMethod 
	  public void postcondition() {
	   driver.close();
	  
	  }
	 
}

