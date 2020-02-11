package com.ak.Aop;

import org.springframework.core.annotation.Order;

@Order(2)
public class LoginXml {
    public  void Before(){
        System.out.println("登陆开始日志 ");
    }
}
