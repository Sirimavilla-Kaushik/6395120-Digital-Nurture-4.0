   # Configuring a Basic Spring Application

   A simple Java application that demonstrates how to configure and use the Spring Framework (Core) for building backend components of a **Library Management System** using **XML-based configuration**.


   ## Project Objective
 
   The purpose of this project is to showcase how **Spring’s Inversion of Control (IoC)** container can be used to manage and inject dependencies using a basic setup with:

- XML-based bean configuration

- Service and repository layer design

- Maven-based build and dependency management


   ## Technologies Used

      | Technology       | Purpose                                  |
      |------------------|------------------------------------------|
      | Java             | Core programming language                |
      | Spring Core      | Dependency Injection & Bean Management   |
      | Maven            | Project management and build tool        |
      | XML              | Spring context configuration             |
      | VS Code / IDE    | Development environment                  |


  ## Project Structure

      basicspringapp/
            │
            ├── pom.xml
            └── src/
            └── main/
            ├── java/
            │    └── com/
            │    └── library/
            │    ├── MainApplication.java
            │    ├── service/
            │    │     └── BookService.java
            │    └── repository/
            │            └── BookRepository.java
            └── resources/
                  └── applicationContext.xml


   ## Configuration Overview

     - `applicationContext.xml`: Defines beans and wiring between `BookService` and `BookRepository`.

     - `BookService.java`: A service layer class that uses `BookRepository`.

     - `BookRepository.java`: Simulates a repository that interacts with data.

     - `MainApplication.java`: Loads the Spring context and tests the configuration.


   ## How to Run the Project

     ### Prerequisites

     - Java 8 or higher

     - Maven 3.6+

     - VS Code / IntelliJ / Eclipse (any Java-supporting IDE)


     ### Compile the Project

   `mvn clean compile`

     ### Run the Application

     You can run the application using the Maven exec plugin:

   `mvn exec:java -Dexec.mainClass=com.library.MainApplication`

  ## Sample Output

     Calling service to display books...

     Fetching book details from the repository...


    ## Author
       Name: Sirimavilla Kaushik
       Date: 04-07-2025
       Language Used:JAVA,XML,MAVEN

