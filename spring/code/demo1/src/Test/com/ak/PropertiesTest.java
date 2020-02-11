package com.ak;

import com.ak.Pojo.HelloWorld;
import com.ak.Pojo.HelloWorld2;
import com.ak.Pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 用来测试 bean 中的属性
 */
public class PropertiesTest {

    @Test
    public void  kk(){
        ApplicationContext context=new ClassPathXmlApplicationContext("PropertiesContext.xml");

        HelloWorld helloWorld=new HelloWorld();
        HelloWorld2 helloWorld2=new HelloWorld2();

      // 这个是测试 scoped 属性
        helloWorld=(HelloWorld)context.getBean("coll");
        System.out.println(helloWorld+"-----"+helloWorld.hashCode());
        helloWorld.setMessage("修改过了");
        System.out.println(helloWorld+"----"+helloWorld.hashCode());
        helloWorld=(HelloWorld)context.getBean("coll");
        System.out.println(helloWorld+"----"+helloWorld.hashCode());
        System.out.println();

        // 测试 init-method,一个是使用了 init-method ,一个是使用了接口
        helloWorld=(HelloWorld)context.getBean("helloWorld");
        System.out.println(helloWorld+"----"+helloWorld.hashCode());

        helloWorld2=(HelloWorld2)context.getBean("helloWorld2");
        System.out.println(helloWorld2);


    }
}
