package com.example.demo.controller;

import com.example.demo.PersonService;
import com.example.demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/PersonDetails")

public class PersonController {

        @Autowired
        private PersonService service;

        @PostMapping("/saveEntry")
        public ResponseEntity<String> savePerson( @RequestBody Person p){
            Integer id = service.savePerson(p);
            return  new ResponseEntity<String>("Entry with '"+id+"' has been saved", HttpStatus.OK);

        }
        @GetMapping("/EntryList")
        public ResponseEntity<List<Person>> getAllPerson(){
            List<Person> list = service.getAllPerson();
            return new ResponseEntity<List<Person>>(list,HttpStatus.OK);
        }

        @GetMapping("/getEntryById/{ID}")
        public ResponseEntity<Person> getPersonById( @PathVariable("ID")  Integer ID){
            Person std = service.getPersonById(ID);
            return new ResponseEntity<Person>(std,HttpStatus.OK);
        }

        /*
        @PutMapping("/updateEntry/{ID}")
        public ResponseEntity<String> updatePerson( @PathVariable("ID") Integer ID,  @RequestBody Person p){
            Person stdFromDb = service.getPersonById(ID);
            stdFromDb.setName;Name(p.getName());
            stdFromDb.setStdClass(Person.getStdClass());
            stdFromDb.setSchoolName(Person.getSchoolName());
            Integer id = service.savePerson(stdFromDb);
            return new ResponseEntity<String>("Student with '"+id+"' has been updated",HttpStatus.OK);

        }

        */
        @DeleteMapping("deleteEntry/{ID}")
        public ResponseEntity<String> deletePerson(@PathVariable("ID") Integer ID){
            service.deletePerson(ID);
            return new ResponseEntity<String>("Entry with '"+ID+"' has been deleted",HttpStatus.OK);
        }
}
