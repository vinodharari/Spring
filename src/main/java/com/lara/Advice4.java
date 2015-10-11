package com.lara;

import org.springframework.aop.ThrowsAdvice;

public class Advice4 implements ThrowsAdvice{
	public void afterThrowing(NullPointerException ex){
		System.out.println("NPE occured : "+ex);
	}
	public void afterThrowing(ClassCastException ex){
		System.out.println("CCE occured : "+ex);
	}
}
