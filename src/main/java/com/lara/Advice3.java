package com.lara;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.IntroductionInterceptor;

public class Advice3 implements IntroductionInterceptor{

	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println(arg0.getMethod().getName());
		System.out.println(arg0.getThis().getClass());
		System.out.println(Arrays.toString(arg0.getArguments()));
		System.out.println("before proceed");
		Object obj=arg0.proceed();
		System.out.println("after proceed");
		return obj;
	}

	public boolean implementsInterface(Class<?> arg0) {
		return true;
	}
	
}
