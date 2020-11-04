# Server-side programming with servlets

## [How to install Apache Tomcat](https://wolfpaulus.com/tomcat/)

## [How to add a servlet](https://howtodoinjava.com/java/servlets/complete-java-servlets-tutorial/#webservlet_annotation)

## Excerpt from the applcation server log
All the logs can be found on the file `serverLog.txt`. 

The last excerpt:

    ...
    [apache-tomcat-9.0.39]: Nov 03, 2020 10:05:37 PM org.apache.catalina.startup.HostConfig deployDirectory
    INFO: Deployment of web application directory [/Users/paiva/Library/Application Support/Code/User/workspaceStorage/3ae0bd7d56a5d2796385b533fb4c8ed4/adashen.vscode-tomcat/tomcat/apache-tomcat-9.0.39/webapps/ROOT] has finished in [18] ms
    [apache-tomcat-9.0.39]: Nov 03, 2020 10:05:37 PM org.apache.coyote.AbstractProtocol start
    INFO: Starting ProtocolHandler ["http-nio-8080"]
    [apache-tomcat-9.0.39]: Nov 03, 2020 10:05:37 PM org.apache.catalina.startup.Catalina start
    INFO: Server startup in [274] milliseconds


## [What are the responsibilities/services of a “servlet container”?](https://ecomputernotes.com/servlet/intro/servlet-container)

A "servlet container" generates dynamic web pages using Java. That said, it is the essential part of the web server that interacts with the java servlets, communicating between client Browsers and the servlets.

The Servlet Container workflow:

• A client browser accesses a Web server or HTTP server for a page.

• The Web server redirects the request to the servlet container (Servlets are HTTP listeners that run inside the servlet container).

• The servlet container redirects the request to the appropriate servlet.

• The servlet is dynamically retrieved and loaded into the address space of the container, if it is not in the container.

• The servlet container invokes servlet init () method once when the servlet is loaded first time for initialization.

• The servlet container invokes the service () methods of the servlet to process the HTTP request, i.e., read data in the request and formulate a response. The servlet remains in the container’s address space and can process other HTTP requests.

• Web servlet generates data (HTML page, picture …) return the dynamically generated results to the correct location.