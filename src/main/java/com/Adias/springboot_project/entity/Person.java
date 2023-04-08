package com.Adias.springboot_project.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(generator = "person_generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "person_generator", sequenceName = "person_sequence", allocationSize = 1)
    @Column(name= "id")
    private Long id;
    private String name;
    private String firstname;
    private String cf;
    private LocalDate dateofburn;
    private Integer age;


}
