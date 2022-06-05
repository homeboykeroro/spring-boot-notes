# spring-boot-notes

HOW TO USE:

1. Go to project root directory
2. Run `mvn clean install`
3. Deploy the war file located on `/target` directory to any web server (such as Tomcat)


PROJECT DESCRIPTION:

- The project includes Spring Boot project setup, notes, API explaination and reference


FRAMEWORK/ LIBRARY FEATURES:

- **Spring Boot** is used to simplfy and facilitate whole Spring project development. We don't need to manually configure core Spring components manualy such as Spring MVC DispatcherServlet, Spring Data JPA Transactional Management and Spring Beans scanning.

- **Spring Validation API** is used to reduces validation boilerplate code, provides a convenient way (Spring annotation) to do so.

- **Querydsl** is used to simplfy communication with database, especially for complex SQL query. We don't need to write JPQL/ HQL/ SQL statement anymore. It provides API to perform SQL operation in elegant and typesafe way.

- **Jasper Report** is used to design PDF report template. Developer can work with Jaspersoft Studio to easily control report layout and data binding. It provides UI to let developer graphically design their report without writing XML.

