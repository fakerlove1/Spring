package com.ak.Service;

import org.springframework.stereotype.Service;

/**
 *Cglib 代理
 */
@Service
public class LoginServiceImpl {

    public void Login(String name, String password) {
        if(name.equals("joker")&&password.equals("123")){
            System.out.println("登陆账户");
        }
    }
}
