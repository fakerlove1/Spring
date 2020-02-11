package com.ak;

import com.ak.Pojo.D_4;
import com.ak.Pojo.Person;
import com.ak.Pojo.Text;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Context_3 {
    ApplicationContext context;
    Person person=new Person();

    @Before
    public void Before(){
        context=new ClassPathXmlApplicationContext("Context_3.xml");
    }
    /**
     * 基于构造函数依赖注入
     */
    @Test
    public  void kk(){


        person=(Person)context.getBean("person_index");
        System.out.println(person);
        person=(Person)context.getBean("person_type");
        System.out.println(person);
        person=(Person)context.getBean("person_ref");
        System.out.println(person);
    }

    /**
     * 基于 设置函数，就是普通的，罪常见的注入方式
     */
    @Test
    public void k1(){
       person=(Person)context.getBean("person");
       System.out.println(person);

       person=(Person)context.getBean("person");
       System.out.println(person);

        person=(Person)context.getBean("person_p");
        System.out.println(person);

//                 xmlns:p="http://www.springframework.org/schema/p"
    }

    /**
     * 内部注入bean
     */
    @Test
    public void  k2(){
        Text text=new Text();
        text=(Text)context.getBean("Text");
        System.out.println(text);
    }

    /**
     * 注入集合
     */
    @Test
    public void  k3(){
        D_4 d_4=new D_4();
        d_4=(D_4)context.getBean("java_Collection");
        System.out.println(d_4);
    }
}
