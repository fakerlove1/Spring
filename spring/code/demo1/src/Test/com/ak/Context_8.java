package com.ak;


import com.ak.Pojo.ExpressionTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration("classpath:Context_8.xml")
public class Context_8 {

    @Autowired
    private ExpressionTest expressionTest;

    @Test
    public void kk(){
        System.out.println(expressionTest);
    }
}
