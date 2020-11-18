### [Explain the annotations @Table, @Column, @Id found in the Employee entity](https://www.baeldung.com/jpa-entities)

- @Table

    In most cases, the name of the table in the database and the name of the entity will not be the same. Using this annotation, it is possible to specify the database table name like 
    
    ```
	@Entity
    @Table(name="STUDENT")
    public class Student {
        
        // fields, getters and setters
        
    }
    ```

- @Column

    Associate an attribute to a column of a table in the database. It can be used to specify the column name and some other properties like _name_, _length_, _nullable_...

    ```
    @Entity
    @Table(name="STUDENT")
    public class Student {
        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        
        @Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
        private String name;
        
        // other fields, getters and setters
    }
    ```

- @Id

    Specify the primary key of an entity. It can be used with the annotation @GeneratedValue in order to automatically generate a number for it

    ```
	@Entity
    public class Student {
        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        
        private String name;
        
        // getters and setters
    }
    ```


### [Explain the use of the annotation @AutoWired (in the Rest Controller class)](https://www.tutorialspoint.com/spring/spring_autowired_annotation.htm)

It does an auto-scanning on the package for annotations like @Component, @Repository, etc and create a bean (an object managed by Spring IoC cntainer) for each one. By using this annotation in the Rest Controller, it is being used on a Property. By this way, there is no need for a setter, allowing the injection of values, in this case the a EmployeeRepository object already created.