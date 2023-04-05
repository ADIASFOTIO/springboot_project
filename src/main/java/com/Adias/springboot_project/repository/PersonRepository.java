package com.Adias.springboot_project.repository;

import com.Adias.springboot_project.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {
    // query by example query by methodo name query by native
    @Query(value = "slect* from person where age >= 18", nativeQuery = true)
    Optional<List<Person>> findPersonMaggiorenni();
    @Query(value = "select* from person where id = 2",nativeQuery = true)
    Optional<Person> findWithId();
    List<Person> findByAgeGreaterThanEqual(Integer age);




}
