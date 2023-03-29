package com.Adias.springboot_project.service;

import com.Adias.springboot_project.entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface PersonService {
    void save(Person p);
    List<Person> getAll();
    Person update (Person p);
    void delete(Long id);
    List<Person> findPersonMaggiorenni();
    Optional<Person> findWithId();
    List<Person> findByQueryByExample(String nome);


}
