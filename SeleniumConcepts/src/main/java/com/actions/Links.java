package com.actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Links {
	public WebDriver driver;
	@BeforeMethod
	public void precondition() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/search?source=hp&ei=q1yTXOywIqrYz7sPmqOkyAc&q=youtube.com&btnK=Google+Search&oq=youtube.com&gs_l=psy-ab.3..0j0i131j0j0i131j0j0i131l3j0l2.1525.4421..4980...1.0..0.971.2576.0j6j2j0j1j0j1......0....1..gws-wiz.....6..35i39j0i67j0i20i263j0i2i203j0i131i20i263.YuGIufVvnS8");
	}
	@Test
	public void printLinks() {
	List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	for(WebElement link: allLinks) {
		System.out.println(link.getAttribute("href"));
	}
	
	//@AfterMethod
		//public void postcondition() {
			//driver.close();
		//}

	}
}
	
	

