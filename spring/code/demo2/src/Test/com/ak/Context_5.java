package com.ak;


import com.ak.Pojo.Goods;
import com.ak.Pojo.Text;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * DI 依赖注入
 */
public class Context_5 {

    ApplicationContext classPathXmlApplicationContext_ClassPathxml;


    @Autowired
    private Goods good;

    @Before
    public void Before(){
        classPathXmlApplicationContext_ClassPathxml= new ClassPathXmlApplicationContext("Context_5.xml");
    }

    @Test
    public  void  kk(){
        Goods goods=(Goods) classPathXmlApplicationContext_ClassPathxml.getBean("good");
        System.out.println(goods);
        System.out.println(good);

    }


}
