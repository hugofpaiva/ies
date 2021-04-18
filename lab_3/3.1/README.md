
# Layered applications in Spring

Downloaded the [example](https://github.com/spring-guides/tut-rest) and runned on IntelliJ with this configurations:

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bcb4c682-e71c-458e-8716-3386d983cd29/Screenshot_2020-11-05_at_09.37.34.png](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/bcb4c682-e71c-458e-8716-3386d983cd29/Screenshot_2020-11-05_at_09.37.34.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20201117%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20201117T200216Z&X-Amz-Expires=86400&X-Amz-Signature=6c66c174fda070f6c25e34b067d01e8270b6615d5a76b8e4ac1aad8b374ed221&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Screenshot_2020-11-05_at_09.37.34.png%22)

### Testing API

**Getting all the employees**

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0303af29-310c-4074-bec2-a9018a36e3d4/Screenshot_2020-11-05_at_09.43.21.png](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/0303af29-310c-4074-bec2-a9018a36e3d4/Screenshot_2020-11-05_at_09.43.21.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20201117%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20201117T200235Z&X-Amz-Expires=86400&X-Amz-Signature=560ecf9285150a87d73b970e322ea3f6d4c66c702bb72e2758b281df2596caf9&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Screenshot_2020-11-05_at_09.43.21.png%22)

**Adding a new employee and checking his existence**

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f3df1c0d-d5e4-406e-ba53-f60ca01c142e/Screenshot_2020-11-05_at_09.45.45.png](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/f3df1c0d-d5e4-406e-ba53-f60ca01c142e/Screenshot_2020-11-05_at_09.45.45.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20201117%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20201117T200246Z&X-Amz-Expires=86400&X-Amz-Signature=ba19d2e18b817450edea36a7d46c2bf3059765770e6403adae07c2c85f87ef6e&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Screenshot_2020-11-05_at_09.45.45.png%22)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ca50b78c-e847-47fa-8901-358aa8ff3e8a/Screenshot_2020-11-05_at_09.47.13.png](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/ca50b78c-e847-47fa-8901-358aa8ff3e8a/Screenshot_2020-11-05_at_09.47.13.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20201117%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20201117T200256Z&X-Amz-Expires=86400&X-Amz-Signature=401e651db242a15985216fb3b04beab899644e5110ac5f6806fd4d03c5efb808&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Screenshot_2020-11-05_at_09.47.13.png%22)

**Replacing a employee**

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1536281f-8e11-4201-935e-80e55661ff71/Screenshot_2020-11-05_at_09.49.16.png](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/1536281f-8e11-4201-935e-80e55661ff71/Screenshot_2020-11-05_at_09.49.16.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20201117%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20201117T200304Z&X-Amz-Expires=86400&X-Amz-Signature=66eab86c24a1d0f5f07e2ddaf2673c9c868bbfd0b5570fdc7c36a8a1bb0fa8c1&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Screenshot_2020-11-05_at_09.49.16.png%22)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a44f0e65-18a0-41b7-83d2-a0c355abb989/Screenshot_2020-11-05_at_09.49.30.png](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/a44f0e65-18a0-41b7-83d2-a0c355abb989/Screenshot_2020-11-05_at_09.49.30.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20201117%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20201117T200316Z&X-Amz-Expires=86400&X-Amz-Signature=7f5b2dff3f1f8bbe226cd2dcc667c8df72f5880d429bed7fb8a58911105cd902&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Screenshot_2020-11-05_at_09.49.30.png%22)

**Deleting a employee**

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a26f1334-e0b9-402a-8b45-c790e3702220/Screenshot_2020-11-05_at_09.49.54.png](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/a26f1334-e0b9-402a-8b45-c790e3702220/Screenshot_2020-11-05_at_09.49.54.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20201117%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20201117T200325Z&X-Amz-Expires=86400&X-Amz-Signature=1f8db212cf55bc5a4d2bea963159eb3510c4a00a2f38c1d6dd028d16add80948&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Screenshot_2020-11-05_at_09.49.54.png%22)

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/85377fa7-fc03-45f7-86e6-06121f544028/Screenshot_2020-11-05_at_09.50.27.png](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/85377fa7-fc03-45f7-86e6-06121f544028/Screenshot_2020-11-05_at_09.50.27.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20201117%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20201117T200340Z&X-Amz-Expires=86400&X-Amz-Signature=25abf8ed396f6836ffc03152f039e3ac5b988ad6370c30315a1e6b72be1d8b99&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Screenshot_2020-11-05_at_09.50.27.png%22)

### C) **Checking if the data is persistent (when rebooting the app)**

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d4b771c7-cf9a-4d5b-90f0-728ccb638336/Screenshot_2020-11-05_at_09.52.45.png](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/d4b771c7-cf9a-4d5b-90f0-728ccb638336/Screenshot_2020-11-05_at_09.52.45.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20201117%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20201117T200407Z&X-Amz-Expires=86400&X-Amz-Signature=1d8f40046e1e5f82e864289a4e1a2c223ef0d8b186ef6743eb06ab0c8c2d34e4&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Screenshot_2020-11-05_at_09.52.45.png%22)

After the reboot, the employee **disappeared**

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4357e009-79b9-48e1-8854-79dfd032f143/Screenshot_2020-11-05_at_09.55.48.png](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/4357e009-79b9-48e1-8854-79dfd032f143/Screenshot_2020-11-05_at_09.55.48.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20201117%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20201117T200352Z&X-Amz-Expires=86400&X-Amz-Signature=4be29d0ff558c2787fb35632ec022f3c34aee852f67b5d7907dab05557885425&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Screenshot_2020-11-05_at_09.55.48.png%22)

In order to change this behavior, a database could be used to save all the data and persist even after a reboot or a stop.

### [What would be the proper HTTP Status code to get when searching an API for non-existent?](https://code-maze.com/the-http-reference/)

The proper HTTP Status Code to get when searching and API for non-existent is the **404** which has the reason "Not Found" and means that the server cannot find the requested URL.

### Layered Architecture View and the role of the elements modeled

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/afa5b199-1d40-4805-8f9b-1f639abf1363/Screenshot_2020-11-05_at_10.10.42.png](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/afa5b199-1d40-4805-8f9b-1f639abf1363/Screenshot_2020-11-05_at_10.10.42.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAT73L2G45O3KS52Y5%2F20201117%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20201117T193628Z&X-Amz-Expires=86400&X-Amz-Signature=5055833b49091297dadbba124bfe8a64453ae68bb098f329a62149eefb060840&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Screenshot_2020-11-05_at_10.10.42.png%22)

### [Describe the role of the elements modeled in the previous point](https://stackoverflow.com/questions/34429832/how-to-use-layered-architecture-of-spring-and-still-follow-object-oriented-struc)
 - Employee

    Representative class of entities in a database. At the bottom, it represents an entry in the table in object-oriented programming, containing all the fields in it.
     For this, an @Entity annotation is used in the class declaration allowing the objects of this class to represent entries in the database.
     As for the fields in the table, they are mapped to attributes, namely the _id_ field through the @Id annotation, automatically generating values with @GeneratedValues

 - EmployeeRepository

    Interface that extends the super class _JpaRepository_ indicating the type of entity (referred to above) and the type of _id_ associated

 - EmployeeController

    Following the Spring Boot architecture, the controller processes all requests and responds accordingly, whether or not data is handled. Maps all indicated HTTP methods and is part of the presentation layer

 - LoadDatabase

    Pre-loading data into the database when starting the service. As data is entered, _logs_ are shown

 - EmployeeNotFoundException

    It is called when the data treatment in the GET of a specific employee that does not exist, verified by the controller, returning an error message

 - EmployeeNotFoundAdvice

    Generates another error message like the one mentioned above that can be used in the same way

- PayrollAplication

    Load the configured settings and run Spring Boot. As mentioned in the previous work, the annotation @SpringBootApplication is equivalent to the set of annotations:

    - @EnableAutoConfiguration: enable Spring Boot’s auto-configuration mechanism
    
    - @ComponentScan: enable @Component scan on the package where the application is located (see the best practices)

    - @Configuration: allow to register extra beans in the context or import additional configuration classes
