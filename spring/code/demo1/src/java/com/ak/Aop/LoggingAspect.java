package com.ak.Aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 标注该类为一个切面，并加入spring IOC容器
 */
@Component
@Aspect
public class LoggingAspect {

	@Pointcut("execution(* com.ak.service..*.*(..))")
	public void pointcut(){
		System.out.println("---pointcut()----");
	}

	@Before(value = "pointcut()")
	public void beforeMethod() {
		System.out.println("前置通知--在方法前执行啦");
	}

	@After("execution(* com.ak.service..*.*(..))")
	public void afterMethod() {
		System.out.println("后置---方法之后执行");
	}
	@Around("execution(* com.ak.service..*.*(..))")
	public  Object  roundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("环绕通知前");
		Object obj = pjp.proceed();
		System.out.println("环绕通知后");
		return obj;
	} 

	@AfterThrowing(value = "pointcut()")
	public void throwMethod() {
		System.out.println("抛出异常的通知");
	}

	@AfterReturning("within(com.ak.service..*.*)")
	public void returnMethod() {
		System.out.println("返回通知");
	}
	
	
}