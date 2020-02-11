package com.ak.Aop;

import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Date;

/**
 * 收钱的日志打印
 */
public class LoggingXml {

    public void Before(){
        System.out.println("开始收钱啦--腾讯开始收钱");
    }
    public void After(){
        System.out.println("收钱结束 --打印 日志 时间"+   new Date().toString());
    }

    public void AfterReturning(){
        System.out.println("AfterReturning方法执行借宿后");
    }

    public void AfterThrowing(){
        System.out.println("AfterThrowing");
    }

    public  Object  roundMethod(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知前");
        Object obj = pjp.proceed();
        System.out.println("环绕通知后");
        return obj;
    }
}
