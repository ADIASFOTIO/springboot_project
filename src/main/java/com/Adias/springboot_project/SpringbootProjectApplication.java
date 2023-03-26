package com.Adias.springboot_project;

import com.Adias.springboot_project.entity.Person;
import com.Adias.springboot_project.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication

public class SpringbootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProjectApplication.class, args);
	}





}
