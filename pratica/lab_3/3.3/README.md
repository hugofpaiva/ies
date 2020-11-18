- Spring Data JPA

>  JPA handles most of the complexity of JDBC-based database access and object-relational mappings. On top of that, Spring Data JPA reduces the amount of boilerplate code required by JPA. That makes the implementation of your persistence layer easier and faster.

- H2 database

> H2 is an open-source lightweight Java database. It can be embedded in Java applications or run in the client-server mode. H2 database can be configured to run as in-memory database, which means that data will not persist on the disk.

- Thymeleaf

> Thymeleaf is a Java template engine for processing and creating HTML, XML, JavaScript, CSS, and text.




### [Explain the differences between the RestController and Controller components used in this sample](https://dzone.com/articles/spring-framework-restcontroller-vs-controller)

The main difference between Controller component and RestController is in the way the HTTP response body is created.

Using the @Controller annotation, it is needed to define the view. In this example, it is being using the Thymeleaf template engine to generate the views (IssueController.java):
 ```
 @GetMapping("/issues")
    public String getIssues(Model model) {
        model.addAttribute("issues", this.issueRepository.findAllButPrivate());
        return "issues/issuereport_list";
    }
```

Using @RestController, the service simply returns the object data as a JSON/XML.

### [Both the RestController and the Controller need to access the database, using a Repository. How do they get a valid instance of the Repository to work with?](https://docs.spring.io/spring-framework/docs/4.3.x/spring-framework-reference/htmlsingle/#beans-autowired-annotation)


> As of Spring Framework 4.3, an @Autowired annotation on such a constructor is no longer necessary if the target bean only defines one constructor to begin with. However, if several constructors are available, at least one must be annotated to teach the container which one to use.

So, at the bottom, it is being used the annotation @Autowired, explained previously.



[Optionals] - > Started implementation in another Spring Boot project with SQL Connector but didn't end before time for submission. The deployment of this with docker and using SQL in another container will be super useful for the practical project



