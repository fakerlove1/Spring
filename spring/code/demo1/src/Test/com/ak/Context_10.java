package com.ak;


import com.ak.Pojo.Person;
import com.ak.service.PersonService;
import com.ak.service.impl.PersonServiceImpl_Clib;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration("classpath:Context_10.xml")
public class Context_10 {

    @Autowired
    private PersonService personService;

    @Autowired
    private PersonServiceImpl_Clib personServiceImpl_false;

    @Test
    public void  kk(){
        Person person=personService.FindPersonByName("joker");
        System.out.println(person);
        System.out.println();

        System.out.println(personService.Login("joker","123"));
        System.out.println();

        person=personServiceImpl_false.FindPersonByName("joker");
        System.out.println(person);
    }
}
