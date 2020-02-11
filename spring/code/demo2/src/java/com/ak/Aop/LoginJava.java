package com.ak.Aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoginJava {
    @Before("execution(* com.ak.Service.LoginServiceImpl.*(..))")
    public  void Before(){
        System.out.println("登陆开始日志---java ");
    }
}
