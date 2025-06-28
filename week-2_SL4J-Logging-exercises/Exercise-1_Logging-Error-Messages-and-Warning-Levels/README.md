
# Logging Error Messages and Warning Levels using SLF4J

   ## Project Overview

   1.This project demonstrates how to implement structured logging in a Java application using **SLF4J** (Simple Logging Facade for Java) 
     along with **Logback**, a powerful logging backend.
   
   2.The goal is to provide developers with a foundational understanding of how logging works in enterprise-grade Java applications and
      how to manage different logging levels such as **error** and **warning** effectively.

   3.This is a Maven-based project developed in **Visual Studio Code (VS Code)** and executed through the integrated terminal using standard Maven commands.


   ## Objectives

   - Understand the role and importance of logging in software development.
   - Learn how to integrate SLF4J with a backend implementation (Logback).
   - Demonstrate logging of warning and error messages.
   - Explore Maven project structure and configuration.
   - Debug and resolve issues related to class loading and project setup.


   ## Technologies and Tools Used

   | Technology                | Purpose                                    |
   |---------------------------|--------------------------------------------|
   | Java                      | Core programming language                  |
   | Maven                     | Build automation and dependency management |
   | SLF4J                     | Logging abstraction                        |
   | Logback                   | SLF4J-compliant logging implementation     |
   | VS Code                   | Development Environment                    |
   | Terminal (CMD/PowerShell) | Command-line execution                     |


   ## Project Structure

   The project follows the standard Maven structure:

                  logging-demo/
                       ├── pom.xml
                       └── src/
                        └── main/
                          └── java/
                           └── com/
                            └── example/
                              └── LoggingExample.java



   ## Implementation Highlights

   - Configured SLF4J and Logback as Maven dependencies in the `pom.xml`.
     
   - Created a logging class that emits error and warning messages using the SLF4J logger.
     
   - Ensured the Java file had the correct package declaration.
   
   - Verified class file compilation under the `target/classes` directory to avoid `ClassNotFoundException`.
   
   - Used the Maven Exec Plugin to run the main class from the terminal.


   ## Execution Steps

   1. Created the Maven project using the correct archetype and parameters via terminal.

   2. Navigated to the generated project directory and opened it in VS Code.

   3. Placed the Java source file in the correct package folder inside `src/main/java`.

   4. Verified the presence of the package declaration at the top of the Java file.

   5. Updated the `pom.xml` file to include required dependencies and plugin configuration.

   6. Used the Maven commands `mvn clean compile` and `mvn exec:java` to build and run the project.


   ## Terminal Commands Used

   - Project generation using Maven archetype.

   - Compilation and execution using:
     - `mvn clean compile`
  
     - `mvn exec:java -Dexec.mainClass=com.example.LoggingExample`
    
     ## Author
          Name: Sirimavilla Kaushik
          Date: 28-06-2025
         Language Used:JAVA and XML
    
      
