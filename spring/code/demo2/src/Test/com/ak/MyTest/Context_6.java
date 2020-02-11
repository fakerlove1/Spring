package com.ak.MyTest;


import com.ak.Pojo.Goods;
import com.ak.Pojo.Person;
import com.ak.Service.MyDataSourceTest;
import com.ak.config.PersonConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * DI 依赖注入
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:Context_6.xml")
public class Context_6 {

    @Autowired
    private MyDataSourceTest myDataSourceTest;


    /**
     * @Rersource
     * @qualiter
     */
    @Test
    public  void  kk(){
        myDataSourceTest.getMyDataSource().connection();
    }

    /**
     *  配置类 测试
     */
    @Test
    public  void  k1(){
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(PersonConfig.class);
        Person person=(Person)ctx.getBean("g");
        System.out.println(person);
    }
}
