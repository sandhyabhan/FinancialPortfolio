package com.example.demo;

import com.example.demo.entity.Person;
import com.example.demo.repos.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImplementation implements PersonService {

        @Autowired
        private PersonRepo repository;


        @Override
        public Integer savePerson(Person p) {
            return repository.save(p).getID();
        }

        @Override
        public List<Person> getAllPerson() {
            return (List<Person>) repository.findAll();
        }

        @Override
        public Person getPersonById(Integer ID) {
            return repository.findById(ID).get();
        }

        @Override
        public void deletePerson(Integer ID) {
            repository.deleteById(ID);
        }
    }



