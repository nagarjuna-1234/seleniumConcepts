package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Invoke {
  @Test(invocationCount=2)
  public void m1() {
	  System.out.println("m1");
  }
  
  @Test(invocationCount=4)
  public void m2() {
	  System.out.println("m2");  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }

  
}
