package com.ak.service;

import com.ak.Pojo.Person;

public interface PersonService {
    Boolean Login(String person_name, String person_password) ;
    Person FindPersonByName(String person_name);
}
