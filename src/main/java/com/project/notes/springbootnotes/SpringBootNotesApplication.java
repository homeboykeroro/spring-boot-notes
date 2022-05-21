package com.project.notes.springbootnotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
	Application should only ever include one @SpringBootConfiguration 
	and most idiomatic Spring Boot applications will inherit it from @SpringBootApplication.

	Auto-configuration can be enabled by adding @SpringBootApplication or @EnableAutoConfiguration annotation 
	in startup class. It indicates that it is a spring context file.

		- It enables something called auto-configuration.
		- It enable something called components scan. It is the features of Spring where it will start 
			automatically scanning classes in the package and sub package for any bean file.
	
	There is some example of auto configuration done by Spring Boot:
		- DispatcherServletAutoConfiguration
		- DataSourceAutoConfiguration
		- JacksonAutoConfiguration
		- ErrorMvcAutoConfiguration (#basicErrorController)

	Almost equivalent to:
		@SpringBootConfiguration
		@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, SecurityAutoConfiguration.class})
		@ComponentScan(basePackages="com.example.quickstart")



	If one uses Spring but not Spring boot, we have to explictly configure all the stuff
	
	Manual configuration example:
		- Persistance: https://stackoverflow.com/questions/26548505/org-hibernate-hibernateexception-access-to-dialectresolutioninfo-cannot-be-null
		- DispatcherServelet: https://zetcode.com/spring/webapplicationinitializer/
*/
@SpringBootApplication
public class SpringBootNotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNotesApplication.class, args);
	}

}
