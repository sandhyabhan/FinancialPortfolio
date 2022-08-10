package com.example.demo;

import com.example.demo.entity.Person;

import java.util.List;

public interface PersonService {

    public Integer savePerson(Person p);

    public List<Person> getAllPerson();
    public Person getPersonById(Integer ID);

    public void deletePerson(Integer ID);


}
