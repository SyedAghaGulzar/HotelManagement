package com.codentech.mars2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;

@SpringBootApplication
@Configuration
public class Mars2Application {

	@Bean
	public Module datatypeHibernateModule() {
	  return new Hibernate5Module();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Mars2Application.class, args);
	}
}
