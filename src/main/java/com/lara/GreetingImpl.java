package com.lara;

public class GreetingImpl implements Greeting{
	public String sayHello(String s1) {
		System.out.println("from sayHello");
		return "Hello "+s1;
	}
}
