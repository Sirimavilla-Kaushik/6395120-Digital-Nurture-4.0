# Rest-Get Country based on country Code

   1.This project implements a RESTful web service using Spring Boot that returns country details based on a country code provided in the request path. 

   2.The lookup is case-insensitive and retrieves data from an XML-based configuration.


   ## Overview

   This service is part of the **Spring Learn** application and demonstrates how to:

   - Build RESTful endpoints using Spring Boot.

   - Use XML configuration to manage static data.

   - Apply case-insensitive filtering using lambda expressions.

   - Follow a clean layered architecture (Controller, Service, Model).


   ## Features

   - Returns country details based on country code.

   - Case-insensitive match (e.g., `in`, `IN`, or `In` all return India).

   - Country data is stored in an external XML file.

   - Uses Spring’s ApplicationContext to load beans from `country.xml`.


   ## Technologies Used

             | Technology             | Description                                      |
             |------------------------|--------------------------------------------------|
             | Java 17                | Programming Language                             |
             | Spring Boot            | Framework to simplify REST API development       |
             | Spring Web             | To create and expose REST endpoints              |
             | Spring Context         | To load and manage XML-based configuration       |
             | XML                    | For static configuration of country data         |
             | Maven                  | Build and dependency management tool             |


   ## Project Structure

                   spring-learn/
                          ├── src/
                          │     └── main/
                          │           ├── java/
                          │           │      └── com/
                          │           │           └── cognizant/
                          │           │                  └── springlearn/
                          │           │                            ├── controller/
                          │           │                            ├── service/
                          │           │                            ├── model/
                          │           │                            └── SpringLearnApplication.java
                          │           └── resources/
                          │                  └── country.xml
                          └── pom.xml


   ##  How to Run

   1. Clone the project.

   2. Make sure Maven and Java 17+ are installed.

   3. Navigate to the project folder and run:

   `mvn spring-boot:run`

   4. Access the service at:

   `http://localhost:8083/countries/{code}`


   ## Sample Request

   `GET http://localhost:8083/countries/in`

   ## Sample Response

    {
      "code": "IN",
      "name": "India"
    }


   ## Author
   
     Name: Sirimavilla Kaushik
     Date: 12-07-2025
     Language Used:JAVA,SPRING BOOT,MAVEN
