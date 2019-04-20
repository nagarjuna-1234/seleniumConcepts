package com.testng;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
  @DataProvider(name="btm")
  
  public String [][]getdata(){
	  String [][]data=new String [2][2];
	  data[0][0]="userA";
	  data[0][1]="A1";
	  data[1][0]="cmico";
	  data[1][1]="B1";
	  return data;
  }
  @Test(dataProvider="nag")
  public void testc(String user,String pwd) {
	  Reporter.log("create:"+user+":"+pwd+":",true);
  }
}
