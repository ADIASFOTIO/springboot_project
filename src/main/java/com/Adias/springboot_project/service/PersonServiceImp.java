package com.Adias.springboot_project.service;

import com.Adias.springboot_project.entity.Person;
import com.Adias.springboot_project.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImp implements PersonService{
    @Autowired
    PersonRepository personRepository;
    @Override
    public void save(Person p) {
        personRepository.save(p);

    }

    @Override
    public List<Person> getAll() {
        personRepository.findAll();
        return null;
    }

    @Override
    public Person update(Person p) {
        Person updatePerson = personRepository.findById(p.getId()).get();
        updatePerson.setName(p.getName());
        updatePerson.setCf(p.getCf());
        updatePerson.setDateOfBurn(p.getDateOfBurn());
        updatePerson.setFirstName(p.getFirstName());
        updatePerson.setAge(p.getAge());
        personRepository.save(updatePerson);
        return updatePerson;
    }

    @Override
    public void delete(Long id) {
        Person deletePerson = personRepository.findById(id).get();
        personRepository.delete(deletePerson);
    }
}
