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

/*	=============================================
  	=  Jackson Hibernate 5 LazyLoading Support 	=
	=============================================
	@Bean
	public Module datatypeHibernateModule() {
	  return new Hibernate5Module().disable(Hibernate5Module.Feature.USE_TRANSIENT_ANNOTATION);
	}
	
*/	
	public static void main(String[] args) {
		SpringApplication.run(Mars2Application.class, args);
	}
}
