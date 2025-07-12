#  Hello World RESTful Web Service

   1.This project demonstrates a basic RESTful web service using the Spring Boot framework. 
   
   2.It serves as an entry-level example to understand the core components of Spring Web and how to expose REST endpoints.


   ## Overview

   1.The goal of this application is to create a simple REST API that returns a hardcoded message in response to an HTTP GET request. 

   2.This type of setup is ideal for beginners exploring Spring Boot, REST architecture, and backend service development.


   ## Learning Objectives

   - Understand the structure of a Spring Boot application.

   - Learn how REST controllers work using Spring Web.

   - Explore how HTTP GET methods are mapped to Java methods.

   - Utilize logging to trace API execution.

   - Test and inspect HTTP requests using browser developer tools and Postman.


   ##  Project Structure

                                    spring-learn/
                                         ├── src/
                                         │    └── main/
                                         │          ├── java/
                                         │          │     └── com/cognizant/springlearn/
                                         │          │                           ├── SpringLearnApplication.java
                                         │          │                           └── controller/
                                         │          │                                     └── HelloController.java
                                         │          └── resources/
                                         │                  ├── application.properties
                                         ├── pom.xml
                                         

   ## Technologies Used

            | Technology     | Purpose                          |
            |----------------|----------------------------------|
            | Java 17        | Programming language             |
            | Spring Boot 3  | Application framework            |
            | Spring Web     | To build REST APIs               |
            | Maven          | Build and dependency management  |
            | SLF4J + Logback| Logging framework (default)      |
            | Postman        | API testing                      |
            | Chrome DevTools| HTTP header inspection           |

   ## API Endpoint

   - **Method**: GET  

   - **Endpoint**: `/hello`  

   - **Response**: A plain text message confirming successful API access.  

   - **Port**: Runs on port 8083 as configured in the application properties.



   ## Build & Run
 
   # Step 1: Navigate to the project directory

   `cd spring-learn`

   # Step 2: Build the project

   `mvn clean install`

   # Step 3: Run the Spring Boot application

   `mvn spring-boot:run`
 
   Once the app is running, open your browser or Postman and hit:


   `http://localhost:8083/hello`


   ## Testing Instructions

   ### Using Chrome:

   - Visit the API endpoint in the browser.

   - Use Developer Tools > Network tab to inspect request and response headers.

   - Confirm the HTTP status code and headers like `Content-Type`, `Content-Length`, and `Date`.

   ### Using Postman:

   - Set the method to GET and URL to the provided endpoint.

   - Send the request and observe the response body and headers.

   - Use the "Headers" tab to inspect technical response details.


   ## Author
   
   Name: Sirimavilla Kaushik
  
   Date: 12-07-2025
   
   Language Used:JAVA,SPRING BOOT,MAVEN

