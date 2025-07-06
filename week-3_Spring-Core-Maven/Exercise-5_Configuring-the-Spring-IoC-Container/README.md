# Configuring the Spring IoC Container 

   This project demonstrates how to configure the **Spring IoC (Inversion of Control) Container** using an **XML-based approach** for a simple **Library Management    System**. It focuses on the foundational concept of **dependency injection** using the `applicationContext.xml` configuration file.

  
   ##  Project Overview

   The objective of this application is to showcase:

   - How to define and wire Spring beans using XML.

   - How to perform **setter-based injection**.

   - How to organize your service and repository layers for a cleaner modular architecture.


   ##  Technologies Used
             | Technology         | Description                            |
             |--------------------|----------------------------------------|
             | Java               | Programming language                   |
             | Maven              | Project management and build tool      |
             | Spring Context     | Core IoC container for Spring          |
             | Spring AOP         | Aspect-Oriented Programming support    |
             | Spring WebMVC      | Web MVC framework                      |
             | Exec Maven Plugin  | Run Java classes via Maven             |

   ##  Project Structure

            LibraryManagement/
                      ├── src/
                      │    └── main/
                      │         ├── java/
                      │         │     └── com/example/library/
                      │         │                        ├── Book.java
                      │         │                        ├── BookRepository.java
                      │         │                        ├── BookService.java
                      │         │                        └── LibraryApp.java
                      │         └── resources/
                      │                 └── applicationContext.xml
                      └── pom.xml


   - `Book.java`: A model class representing a book entity.
   
   - `BookRepository.java`: Provides book-related data, acting as a simulated data access layer.

   - `BookService.java`: Calls the repository and handles service-level operations.

   - `LibraryApp.java`: A main class used to initialize Spring context and test the configuration.

   - `applicationContext.xml`: The Spring XML configuration file where beans are defined.
 
   - `pom.xml`: Maven configuration file listing all project dependencies.

  ## How to run
  
   Use the following commands to build and run the project:

   ### Compile the project
 
   `mvn compile`

   ### Run the main class

   `mvn exec:java -Dexec.mainClass="com.example.library.LibraryApp"`
 
   ## Sample Output

   Book: "Effective Java" by Joshua Bloch



   ## Author
     Name: Sirimavilla Kaushik
     Date: 06-07-2025
     Language Used:JAVA,XML,MAVEN
