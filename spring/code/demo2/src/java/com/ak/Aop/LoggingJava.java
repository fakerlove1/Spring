package com.ak.Aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 收钱的日志打印
 */
@Aspect//   </aop:aspect>
@Component  //<bean id="loggingAspect"  class="com.ak.Aop.LoggingXml"></bean>
public class LoggingJava {

    /**
     *   <aop:pointcut expression="execution(* com.ak.Service..*.receive(..))" id="apc"></aop:pointcut>
     */
    @Pointcut("execution(* com.ak.Service..*.receive(..))")
    public void pointcut_test(){}

    /**
     * <aop:before method="Before"   pointcut-ref="apc"/>
     */
    @Before("pointcut_test()")
    public void Before(){
        System.out.println("开始收钱啦--腾讯开始收钱 注解");
    }

    /**
     *  <aop:after method="After"  pointcut="execution(* com.ak.Service..*.receive(..))"/>
     */
    @After("execution(* com.ak.Service..*.receive(..))")
    public void After(){
        System.out.println("收钱结束 --打印 日志 时间"+   new Date().toString());
    }

    /**
     *  <aop:after-returning method="AfterThrowing"  pointcut-ref="apc"/>
     */
    @AfterReturning("pointcut_test()")
    public void AfterReturning(){
        System.out.println("AfterReturning方法执行借宿后");
    }

    /**
     *  <aop:after-throwing method="AfterThrowing"  pointcut-ref="apc"/>
     */
    @AfterThrowing("pointcut_test()")
    public void AfterThrowing(){
        System.out.println("AfterThrowing");
    }

    @Around("pointcut_test()")
    public  Object  roundMethod(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知前");
        Object obj = pjp.proceed();
        System.out.println("环绕通知后");
        return obj;
    }
}
