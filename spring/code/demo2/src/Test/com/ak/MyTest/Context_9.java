package com.ak.MyTest;

import com.ak.Pojo.ExpressionTest;
import com.ak.Service.LoginServiceImpl;
import com.ak.Service.MoneyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration("classpath:Context_9.xml")
public class Context_9 {

    @Autowired
    MoneyService Face;

    @Autowired
    MoneyService Hero;

    @Autowired
    MoneyService Change;

    @Autowired
    LoginServiceImpl loginService;

    @Test
    public void kk(){
        loginService.Login("joker","123");
        Hero.receive("joker",88.0);
        Hero.happy("joker");
        System.out.println();
        Change.receive("vae",6.0);
        Change.happy("vae");
        System.out.println();
        Face.receive("peter",177.0);
        Face.happy("peter");
        System.out.println();

    }
}
