package com.ak;

import com.ak.Pojo.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * 名字 千万不要起Test ，比如MyTest 啥的
 * 方法二 applicationcontext
 */
public class Context_2 {

    ApplicationContext classPathXmlApplicationContext_ClassPathxml;
    ApplicationContext classPathXmlApplicationContext_FileSystemXml;

    @Before
    public void Before(){
        classPathXmlApplicationContext_ClassPathxml= new ClassPathXmlApplicationContext("Context_2.xml");
        classPathXmlApplicationContext_FileSystemXml=new FileSystemXmlApplicationContext("C:\\Users\\bn\\Desktop\\ssm\\spring\\code\\demo2\\src\\resource\\Context_2.xml");

    }


    /**
     * 方式二 ApplicationContext
     */
    @Test
    public void k2(){
        Person person=(Person)classPathXmlApplicationContext_ClassPathxml.getBean("person");
        System.out.println(person);

        Person person1=(Person)classPathXmlApplicationContext_FileSystemXml.getBean("person");
        System.out.println(person1);
    }

}