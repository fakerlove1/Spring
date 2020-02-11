package com.ak.Aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspectXml {
	public void beforeMethod() {
		System.out.println("前置通知");
	}
	
	public void afterMethod() {
		System.out.println("后置");
	}
	
	public  Object  roundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("环绕通知前");
		Object obj = pjp.proceed();
		System.out.println("环绕通知后");
		return obj;
	} 
	
	public void throwMethod() {
		System.out.println("抛出异常的通知");
	}
	
	public void returnMethod() {
		System.out.println("返回通知");
	}
	
	
}