package com.ak.service.impl;

import com.ak.Pojo.Person;
import com.ak.service.PersonService;
import org.springframework.stereotype.Service;

/**
 * cglib 代理
 */
@Service
public class PersonServiceImpl_Clib {

    public Boolean Login(String person_name, String person_password) {
        if(person_name.equals("joker")&&person_password.equals("123")){
            return true;
        }
        return false;
    }

    public Person FindPersonByName(String person_name) {
        if(person_name.equals("joker")){
            Person person=new Person();
            person.setId(1);
            person.setName("joker");
            person.setScore(99.0);
            return  person;
        }
        return null;
    }
}
