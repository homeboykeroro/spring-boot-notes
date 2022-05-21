package com.project.notes.springbootnotes;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/*
	This is an extension of WebApplicationInitializer which runs a SpringApplication 
	from a traditional WAR archive deployed on a web container

	Extending the SpringBootServletInitializer class also allows us to configure our application 
	when it's run by the servlet container, by overriding the configure() method.
*/
public class ServletInitializer extends SpringBootServletInitializer {
	/*
		That method uses SpringApplicationBuilder to simply register our class 
		as a configuration class of the application:
	*/
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootNotesApplication.class);
	}

}
