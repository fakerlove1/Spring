package com.ak;


import com.ak.Pojo.D_4;
import com.ak.Pojo.Person;
import com.ak.Pojo.Text;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * DI 依赖注入
 */
public class Context_4 {

    ApplicationContext classPathXmlApplicationContext_ClassPathxml;

    @Before
    public void Before(){
        classPathXmlApplicationContext_ClassPathxml= new ClassPathXmlApplicationContext("Context_4.xml");

    }

    /**
     * 第一种叫做 ByName
     *
     */

    @Test
    public void k1(){
        Text text=(Text)classPathXmlApplicationContext_ClassPathxml.getBean("Text_Auto_ByName");
        System.out.println(text);
    }

    public void k2(){
        Text text=(Text)classPathXmlApplicationContext_ClassPathxml.getBean("Text_Auto_ByType");
        System.out.println(text);
    }
}
