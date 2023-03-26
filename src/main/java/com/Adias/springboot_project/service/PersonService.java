package com.Adias.springboot_project.service;

import com.Adias.springboot_project.entity.Person;

import java.util.List;

public interface PersonService {
    void save(Person p);
    List<Person> getAll();
    Person update (Person p);
    void delete(Long id);


}
