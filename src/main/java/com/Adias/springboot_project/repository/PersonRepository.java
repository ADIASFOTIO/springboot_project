package com.Adias.springboot_project.repository;

import com.Adias.springboot_project.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
