
# Implementing constructor and setter injection

   1.This is a simple Java-based Spring Framework project developed to demonstrate the concept of **Dependency Injection (DI)** using both **Constructor                  Injection** and **Setter Injection**. 
   
   2.It serves as a foundational exercise in understanding how Spring IoC (Inversion of Control) works and how dependencies are managed using XML-based                   configuration.


   ## Objective

   The primary goal of this exercise is to provide a practical implementation of:

   - Constructor-based Dependency Injection

   - Setter-based Dependency Injection

   - XML-based Spring Bean configuration

   - Maven project structure and dependency management

   - Loading and managing beans using `ClassPathXmlApplicationContext`

   Through this example, learners can understand how Spring injects required dependencies into Java components, ensuring loose coupling and better modular design.


   ## Concepts Covered

   ### Dependency Injection
   A design pattern that allows a class to receive its dependencies from an external source rather than creating them internally. This helps make the code more        testable, maintainable, and scalable.

   ### Constructor Injection
   
   A form of DI where dependencies are provided at the time of object creation. It’s best suited for required dependencies.

   ### Setter Injection

  A form of DI where dependencies are assigned using setter methods after object creation. It is often used for optional or changeable dependencies.


   ### Spring XML Configuration

  Spring allows the configuration of beans and dependencies using XML files. In this project, the `applicationContext.xml` file serves as the central place to        define and wire the beans.


   ##  Project Overview

   The application simulates a basic Library Management system where:

   - A `BookService` component manages library-related operations.

   - A `BookRepository` component simulates data access behavior.

   - The Spring container initializes and injects dependencies between these components using both constructor and setter methods.

  This project does not implement full business logic or database integration, as its focus is solely on demonstrating dependency management.


   ## Project Structure

                          demo/
                           ├── src/
                           │    └── main/
                           │         ├── java/
                           │         │     └── com/example/library/
                           │         │                       ├── BookRepository.java
                           │         │                       ├── BookService.java
                           │         │                       └── LibraryManagementApplication.java
                           │         └── resources/
                           │                └── applicationContext.xml
                           ├── pom.xml

   ## Tools and Technologies Used

   - **Java 8** or above

   - **Spring Framework (Core & Context)**

   - **Maven** for build and dependency management

   - **Commons Logging** for basic console output

   - **ClassPathXmlApplicationContext** to load the XML configuration


   ## How to run
   Use the following commands to build and run the project:

   1.Compile the project
 
   `mvn compile`

   2.Run the main class

   `mvn exec:java`


   ## Sample Output
   Constructor injection is used.

   Setter injection is used.

   BookRepository: Fetching books from database...



   ## Author
     Name: Sirimavilla Kaushik
     Date: 08-07-2025
     Language Used:JAVA,XML,MAVEN
