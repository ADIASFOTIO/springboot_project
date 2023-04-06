package com.Adias.springboot_project.controller;

import com.Adias.springboot_project.entity.Person;
import com.Adias.springboot_project.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    private PersonService personService;
    // localhost:8080/persons/getAllPerson
    @GetMapping(value = "/getAllPerson")
    public List<Person> getAllPerson(){
        return personService.getAll();
    }
    @PostMapping("/insertPerson")
    public Person insertPerson(@RequestBody Person input){
       return personService.save(input);
    }
}
