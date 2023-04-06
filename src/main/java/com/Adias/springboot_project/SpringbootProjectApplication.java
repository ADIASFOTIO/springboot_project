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
	@Bean
	public CommandLineRunner demo(PersonService personService){
		return (args) -> {
				Person p1 = new Person();
			    p1.setCf("476fhhdghdhhc");
				p1.setAge(34);
				p1.setName("junior");
				p1.setFirstName("adias");
				p1.setDateOfBurn(LocalDate.now());
				personService.save(p1);

		};
	}





}
