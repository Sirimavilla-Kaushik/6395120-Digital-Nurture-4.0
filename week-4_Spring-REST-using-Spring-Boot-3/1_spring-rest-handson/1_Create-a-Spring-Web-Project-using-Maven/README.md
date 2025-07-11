 # Spring Web Project Using Maven

   This project is a simple web application developed using **Spring Boot** and **Maven**, designed to demonstrate the basic setup and structure of a Spring      Web application.

   ## Overview

   The `spring-learn` project was created using [Spring Initializr](https://start.spring.io/) with the following configurations:

   - **Group ID**: `com.cognizant`

   - **Artifact ID**: `spring-learn`

   - **Dependencies**: Spring Web, Spring Boot DevTools

   - **Java Version**: 17

   The purpose of this project is to serve as a foundational template for building RESTful web services using Spring Boot.

   ## Key Components

   - **Spring Boot Auto-Configuration**  

       The application leverages Spring Boot's auto-configuration to simplify the setup process.

   - **Spring Web Dependency**  
 
       Enables the creation of RESTful endpoints and HTTP handling.

   - **DevTools Integration**  
  
       Provides developer-friendly features like hot reloading during development.

   - **Maven Build System**  
  
       Handles project dependencies and build lifecycle through a standardized `pom.xml`.


   ## Technologies Used

      | Technology       | Description                                |
      |------------------|--------------------------------------------|
      | Java             | Programming Language (version 17)          |
      | Spring Boot      | Framework for building web applications    |
      | Spring Web       | Module to create RESTful web services      |
      | Maven            | Build and dependency management tool       |
      | Vscode           | IDE used for development                   |

   ## Project Structure

                  spring-learn/
                        ├── src/
                        │    ├── main/
                        │          ├── java/
                        │          │    └── com/cognizant/springlearn/
                        │          │                        ├── SpringLearnApplication.java
                        │          │                        └── controller/HelloController.java
                        │          └── resources/
                        │                  └── application.properties
                        └── pom.xml


   ## Setup & Installation

   ### 1. Clone the Repository

   `git clone https://github.com/your-username/spring-learn.git`

   `cd spring-learn`

   ### 2. Build the Project

   `mvn clean install`

   For corporate proxy users, add:

   `mvn clean install -Dhttp.proxyHost=proxy.cognizant.com -Dhttp.proxyPort=6050 -Dhttps.proxyHost=proxy.cognizant.com -Dhttps.proxyPort=6050 -                  Dhttp.proxyUser=123456`


   ### 3. Run the Application

   `mvn spring-boot:run`

   ### 4. Access the Application

   Open your browser and navigate to:

   `http://localhost:9090/`


  ## Expected Output:

   `Hello from Spring Boot!`



    ## Author
       Name: Sirimavilla Kaushik
       Date: 11-07-2025
       Language Used:JAVA,SPRING BOOT,MAVEN
