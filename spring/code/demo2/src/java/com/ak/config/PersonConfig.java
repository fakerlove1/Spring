package com.ak.config;

import com.ak.Pojo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

//    @Bean("person")
    @Bean()
    public Person  g(){
        Person person=new Person();
        person.setScore(99.9);
        person.setId(110);
        person.setName("joker");
        return person;
    }

//    <bean id="person" class="com.ak.Pojo.Person">
//        <property name="id" value="24"></property>
//        <property name="score" value="100"></property>
//        <property name="name" value="joker"></property>
//    </bean>
}
