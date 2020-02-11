package com.ak;

import com.ak.Pojo.HelloWorld;
import com.ak.Pojo.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * 名字 千万不要起Test ，比如MyTest 啥的
 */
public class MyTest {

    XmlBeanFactory factory;
    ApplicationContext classPathXmlApplicationContext_ClassPathxml;
    ApplicationContext classPathXmlApplicationContext_FileSystemXml;

    @Before
    public void Before(){
        factory= new XmlBeanFactory
                (new ClassPathResource("ApplicationContext.xml"));
       classPathXmlApplicationContext_ClassPathxml= new ClassPathXmlApplicationContext("applicationContext.xml");
    classPathXmlApplicationContext_FileSystemXml=new FileSystemXmlApplicationContext("C:\\Users\\bn\\Desktop\\ssm\\spring\\code\\demo1\\src\\resource\\ApplicationContext.xml");

    }

    /**
     * 方式一 BeanFactory
     */
    @Test
    public  void kk(){
        Person person=(Person)factory.getBean("helloWorld");
        System.out.println(person);
    }

    /**
     * 方式二 ApplicationContext
     */
    @Test
    public void k2(){
        Person person=(Person)classPathXmlApplicationContext_ClassPathxml.getBean("helloWorld");
        System.out.println(person);

        Person person1=(Person)classPathXmlApplicationContext_FileSystemXml.getBean("helloWorld");
        System.out.println(person1);
    }

    @Autowired
    private Person person;

    @Autowired
    private Person helloword;

    @Test
    public  void k3(){

        System.out.println(person);
        System.out.println(helloword);
    }
}
