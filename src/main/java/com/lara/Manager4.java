package com.lara;


public class Manager4 {
	public static void main(String[] args) {
		Greeting gr=(Greeting) Util.getObject("advicedGr");
		String msg=gr.sayHello("abc");
		System.out.println(msg);
	} 
}
