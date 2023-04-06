package com.Adias.springboot_project.service;

import com.Adias.springboot_project.entity.Person;
import com.Adias.springboot_project.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonServiceImp implements PersonService{
    @Autowired
    PersonRepository personRepository;
    @Override
    public Person save(Person p) {
        personRepository.save(p);

        return p;
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

    @Override
    public List<Person> findPersonMaggiorenni() {
        if(personRepository.findPersonMaggiorenni().isPresent()){
          return personRepository.findPersonMaggiorenni().get();
        }else
        return new ArrayList<Person>();
    }

    @Override
    public Optional<Person> findWithId() {
        if(personRepository.findWithId().isPresent()){
            return Optional.of(personRepository.findWithId().get());
        }else
        return Optional.of(new Person());

    }

    @Override
    public List<Person> findByQueryByExample(String nome) {
        // definisco un filtro
        Person filtro = new Person();
        filtro.setName(nome);
        //filtro.setCf(null);
        //filtro.setFirstName(null);
        // definizione dell' ogetto ExampleMacher
        ExampleMatcher matcher = ExampleMatcher.matching().
                withIgnoreCase().withIgnoreNullValues()
                .withStringMatcher(ExampleMatcher
                .StringMatcher.CONTAINING);
        // definizione dell'ogetto example
        Example<Person> ex = Example.of(filtro,matcher);
        List<Person> result = personRepository.findAll(ex);
        return result;
    }

    @Override
    public List<Person> findByEtaMethodName(Integer age) {
        return personRepository.findByAgeGreaterThanEqual(age);
    }

    @Override
    public List<Person> getPersonMaggiorenni2() {
        return personRepository.findAll().stream()
                .filter(person -> person.getAge()>=18)
                .collect(Collectors.toList());
    }


}

