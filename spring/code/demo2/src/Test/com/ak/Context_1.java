package com.ak;

import com.ak.Pojo.HelloWorld_Prototype;
import com.ak.Pojo.HelloWorld_Singleton;
import com.ak.Pojo.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor;

/**
 * 方法一 beanfactory
 */
public class Context_1 {

    XmlBeanFactory factory;

    @Before
    public void Before(){
        factory= new XmlBeanFactory
                (new ClassPathResource("Context_1.xml"));
    }

    @Test
    public void k1(){
        Person person=(Person) factory.getBean("helloWorld_prototype");
        System.out.println(person);
    }


    @Test
    public void  k2(){
        //  singleton ,只能有一个对象
        HelloWorld_Singleton helloWorld_singleton =(HelloWorld_Singleton) factory.getBean("HelloWorld_Singleton");
        System.out.println(helloWorld_singleton+"----"+helloWorld_singleton.hashCode());
        //每调用一次就得 new

        helloWorld_singleton=(HelloWorld_Singleton) factory.getBean("HelloWorld_Singleton");
        System.out.println(helloWorld_singleton+"----"+helloWorld_singleton.hashCode());

        HelloWorld_Prototype helloWorld_prototype =(HelloWorld_Prototype) factory.getBean("HelloWorld_Prototype");
        System.out.println(helloWorld_prototype+"----"+helloWorld_prototype.hashCode());
        helloWorld_prototype=(HelloWorld_Prototype) factory.getBean("HelloWorld_Prototype");
        System.out.println(helloWorld_prototype+"----"+helloWorld_prototype.hashCode());

        // 继承接口 init 回调
        helloWorld_prototype=(HelloWorld_Prototype) factory.getBean("col");
        System.out.println(helloWorld_prototype+"----"+helloWorld_prototype.hashCode());

    }
}
