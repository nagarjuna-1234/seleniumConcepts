package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraysListCollections {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("naga");
		list.add("sheet");
		list.add("path");
		list.add("harsha");
		list.add("zam");
		list.add("arf");
		for(String val:list) {
			System.out.println("value is :"+val);
		}
		Collections.sort(list);
		System.out.println("aftersort");
		for(String val:list) {
			System.out.println("value is :"+val);
		}
		
		
	ArrayList<Integer>list1=new ArrayList<Integer>();
	list1.add(45);
	list1.add(-39);
	list1.add(12);
	for(Integer val:list1) {
		System.out.println("value is :"+val);
	}
	Collections.sort(list1);
	System.out.println("aftersort");
	for(Integer val:list1) {
		System.out.println("value is :"+val);
	}
	
		
	}
	

}
