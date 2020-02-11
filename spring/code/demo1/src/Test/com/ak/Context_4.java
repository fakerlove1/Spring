package com.ak;

import com.ak.Pojo.Text;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 自动装配的测试类
 * 和下面的 注解方式
 */
public class Context_4 {
    ApplicationContext context;

    @Before
    public void Before(){
        context=new ClassPathXmlApplicationContext("Context_4.xml");
    }

    @Test
    public void kk(){
        Text text=new Text();
        text=(Text)context.getBean("Text_Auto_ByName");
        System.out.println(text);
    }
}
