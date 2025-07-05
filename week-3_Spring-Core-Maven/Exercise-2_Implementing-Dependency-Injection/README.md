

#  Implementing Dependency Injection 

   1.This project demonstrates the implementation of **Dependency Injection (DI)** using **Spring Framework's Inversion of Control (IoC)** container via **XML            configuration**. 
   
   2.It simulates a basic library management scenario, where a service class depends on a repository class, and this dependency is managed by Spring, not manually        instantiated in code.

   3.The project aims to show how Spring IoC promotes loose coupling and better testability in Java applications.
 
   ## Technologies Used

          | Technology     | Purpose                                      |
          |----------------|----------------------------------------------|
          | Java           | Core programming language                    |
          | Spring Core    | Provides IoC and DI container functionality  |
          | Spring Context | Extends core with application context        |
          | Maven          | Project build and dependency management tool |
          | XML            | Configuration format for Spring beans        |
          | VS Code/Eclipse| IDEs for development                         |


   ## Project Structure

            dependencyinjectiondemo/
                        ├── src/
                        │ ├── main/
                        │       ├── java/
                        │       │ └── com/library/
                        |       |              ├──Book.java
                        │       |              ├──BookRepository.java
                        │       |              ├──BookService.java
                        │       |              └──LibraryManagmentApplication.java
                        │       └── resources/
                        │              └── applicationContext.xml
                        └── pom.xml



   ## Application Overview

   The project consists of the following layers:

   - **BookRepository**: Simulates interaction with a data store.

   - **BookService**: Contains business logic and depends on BookRepository.

   - **LibraryManagementApplication**: The entry point that loads the Spring context and triggers execution.

   - **applicationContext.xml**: Declares and wires Spring beans using XML configuration.

   - Spring's IoC container manages the creation and injection of these beans, reducing manual boilerplate and enhancing maintainability.


   ## Key Concepts Covered

   - Inversion of Control (IoC)

   - Setter-based Dependency Injection

   - XML-based Spring Bean Configuration
 
   - Separation of Concerns
 
   - Spring Container Lifecycle
 
   - Classpath Resource Management


   ##  How to Run the Project

   ###  Prerequisites

   - Java (version 8 or above)

   - Maven installed and configured

   - IDE like VS Code or Eclipse (recommended)

   ###  Steps to Run

   1. Open terminal inside project root (`dependencyinjectiondemo`)

   2. Compile the project:

   `mvn clean compile`

   3. Run the application:

   `mvn exec:java -Dexec.mainClass="com.library.LibraryManagementApplication`

   ## Sample Output
    
   Book saved: Effective Java


   ## Author
      Name: Sirimavilla Kaushik
      Date: 04-07-2025
     Language Used:JAVA,XML,MAVEN
