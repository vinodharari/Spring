package com.lara;


public class Manager5 {
	public static void main(String[] args) {
		Book b1=(Book) Util.getObject("advicedBk");
		String s1=b1.someProcessing("abc");
		System.out.println(s1);
	} 
}
