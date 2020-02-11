package com.ak.MyTest;


import com.ak.Pojo.Person;
import com.ak.Service.MyDataSourceTest;
import com.ak.config.PersonConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * DI 依赖注入
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:Context_7.xml")
public class Context_7 {

//    $ #
    @Value("${jdbc_url}")
    private String jdbc_url;

    @Value("${jdbc_driverClass}")
    private String jdbc_class;

    @Value("joker")
    private String name;

    @Test
    public void  kk(){
        System.out.println(jdbc_url);
        System.out.println(jdbc_class);
        System.out.println(name);
    }

}
