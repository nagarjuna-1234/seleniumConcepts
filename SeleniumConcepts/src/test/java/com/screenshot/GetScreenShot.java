package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class GetScreenShot {
	public WebDriver driver;

	@BeforeMethod
	public void precondition() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
   @Test
	public void GetScreenShot() throws IOException {
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dst = new File("./screenshots/File.png");
		Files.copy(src, dst);

	}

	@AfterMethod
	public void postcondition() {
		driver.close();
	}

}
