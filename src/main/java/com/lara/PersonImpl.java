package com.lara;

public class PersonImpl implements Person{
	public void method1() {
		System.out.println("from method1 begin");
		String s1=null;
		System.out.println(s1.length());
		System.out.println("from method1 end");
	}
	public void method2() {
		System.out.println("from method2 begin");
		Object obj=new Object();
		String s1=(String)obj;
		System.out.println("from method2 end");
	}
}
