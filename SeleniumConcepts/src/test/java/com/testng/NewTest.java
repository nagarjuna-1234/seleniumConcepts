package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	@BeforeMethod
	public void beforeTest() {
		System.out.println("BeforeTest");
	}

	@Test(priority=15)
	public void testm1() {
		System.out.println("testm1");
	}

	@Test(priority=1)
	public void testm2() {
		System.out.println("testm2");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
}
