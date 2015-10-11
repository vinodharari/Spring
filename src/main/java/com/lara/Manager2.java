package com.lara;


public class Manager2 {
	public static void main(String[] args) {
		TestImpl obj=(TestImpl) Util.getObject("t1");
		obj.hello("abc");
	} 
}
