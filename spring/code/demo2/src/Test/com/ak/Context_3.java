package com.ak;


import com.ak.Pojo.D_4;
import com.ak.Pojo.Person;
import com.ak.Pojo.Text;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * DI 依赖注入
 */
public class Context_3 {

    ApplicationContext classPathXmlApplicationContext_ClassPathxml;

    @Before
    public void Before(){
        classPathXmlApplicationContext_ClassPathxml= new ClassPathXmlApplicationContext("Context_3.xml");

    }

    /**
     * 构造函数
     */
    @Test
    public void kk(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Context_3.xml");
        Person person=new Person();
        person=(Person)context.getBean("person_index");
        System.out.println(person);
        person=(Person)context.getBean("person_type");
        System.out.println(person);
        person=(Person)context.getBean("person_ref");
        System.out.println(person);
    }

    /**
     * 设置
     */
    @Test
    public void  k1(){
        Person person = (Person) classPathXmlApplicationContext_ClassPathxml.getBean("person");
        System.out.println(person);


        person=(Person)classPathXmlApplicationContext_ClassPathxml.getBean("person_p");
        System.out.println(person);

    }

    /**
     * 方法三： 注入内部 bean
     */
    @Test
    public void  k2(){
        Text text=(Text)classPathXmlApplicationContext_ClassPathxml.getBean("Text");
        System.out.println(text);
    }

    /**
     * 方式四：注入集合
     */
    @Test
    public void  k3(){
        D_4 d_4=new D_4();
        d_4=(D_4)classPathXmlApplicationContext_ClassPathxml.getBean("java_Collection");
        System.out.println(d_4);
    }
}
