# Creating and configuring a maven project

   ## Overview

   1.A Maven-based Java application designed to demonstrate how to configure and run a basic **Spring Framework** project with **Spring Context**, 
     **Spring AOP**, and **Spring WebMVC**.
     
   2.This exercise provides a foundational understanding of Maven setup, dependency management, and plugin configuration — essential for enterprise-grade 
     Spring development.

   ## Objective

   To create and configure a Maven project with the following goals:

   - Use **Spring Context** for Dependency Injection and IoC.

   - Integrate **Spring AOP** for modular cross-cutting concerns (e.g., logging).

   - Prepare the project for future **Spring MVC** capabilities.

   - Configure **Maven plugins** for Java compilation and execution.

   ## Project Structure

          mavendemo/
              │
              ├── pom.xml
              └── src/
                   └── main/
                        ├── java/
                              └── com/
                                   └── example/
                                         └── library/
                                                └── App.java


   ## Technologies Used

    | Technology         | Description                            |
    |--------------------|----------------------------------------|
    | Java               | Programming language                   |
    | Maven              | Project management and build tool      |
    | Spring Context     | Core IoC container for Spring          |
    | Spring AOP         | Aspect-Oriented Programming support    |
    | Spring WebMVC      | Web MVC framework                      |
    | Exec Maven Plugin  | Run Java classes via Maven             |


   ## Setup Instructions

   1. **Install JDK 1.8+ and Maven**  
   
   Ensure `JAVA_HOME` and `MAVEN_HOME` are properly configured.

   2. **Clone or Create Project Folder**  
   
   Create a Maven project named `LibraryManagement` using an IDE or manually.

   3. **Create Java Package and Class**  
   
   Inside `src/main/java/com/example/library/`, create `App.java`.

   4. **Add Dependencies and Plugins in `pom.xml`**  
   
   Include Spring libraries and `exec-maven-plugin` for running the main class.


   ##  Build & Run

   ###  Compile the Project
 
   `mvn compile`
   
   ### Run the Application

   `mvn exec:java`


   ## Sample Output

   Library Management Application Started


   ## Author
    Name: Sirimavilla Kaushik
    Date: 05-07-2025
    Language Used:JAVA,XML,MAVEN
