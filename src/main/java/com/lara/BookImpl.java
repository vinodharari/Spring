package com.lara;

public class BookImpl implements Book{
	public String someProcessing(String s1) {
		System.out.println("from some Process");
		return "book"+s1;
	}
}
