package com.ak;

import com.ak.Bean.HelloWorldConfig;
import com.ak.Bean.MyDataSourceTest;
import com.ak.Pojo.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.Period;

/**
 属性注解 测试类
 */
public class Context_6 {

    ApplicationContext context;

    @Before
    public void Before(){
        context=new ClassPathXmlApplicationContext("Context_6.xml");
    }

    /**
     * 测试 Required
     */
    @Test
    public void kk(){
        Goods_Required goods_required=new Goods_Required();
        goods_required=(Goods_Required) context.getBean("Goods_Required");
        System.out.println(goods_required);
    }

    /**
     * 测试 AutoWired
     */
    @Test
    public void T(){

        Goods goods=(Goods)context.getBean("Good");
        System.out.println(goods);
    }

    /**
     *  用来测试 @Qualifier
     */
    @Test
    public void k2(){
        MyDataSourceTest test=(MyDataSourceTest)context.getBean("testBean");
        System.out.println(test);
        test.getMyDataSource().connection();
    }

    /**
     * 基于java 配置的方法
     */
    @Test
    public void  k3(){
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
        System.out.println(helloWorld);
    }
}
