# Parameterized Logging

   ## Project Overview

   1.This project demonstrates the application of **parameterized logging** in Java using the **SLF4J API** and **Logback** 
      as the underlying logging framework. 
   
   2.Logging is an essential part of software development, aiding in debugging, monitoring, and maintaining application behavior. 
   
   3.This project provides a clean and efficient way to log dynamic runtime information using SLF4J's placeholder-based formatting.

   ## Objective

   The main goal of this project is to explore:
   - How to configure and use SLF4J with Logback in a Maven-based Java project.
   - How to apply parameterized logging using placeholders for dynamic data.
   - How logging helps in debugging and error tracking.
   - The importance of proper logging levels for filtering and analysis.

   ## Technologies Used

   | Technology     | Purpose                                      |
   |----------------|----------------------------------------------|
   | Java           | Core programming language                    |
   | Maven          | Project management and dependency handling   |
   | SLF4J API      | Logging façade for abstraction               |
   | Logback Classic| Logging implementation for SLF4J             |
   | VS Code        | Development environment (IDE)                |

   ## Project Layout
          loggingdemo/
              ├── pom.xml
              └── src/
                  └── main/
                       ├── java/
                            └── com/
                                └── example/
                                      └── ParameterizedLoggingExample.java

   ## What Was Implemented
   - Maven project setup with necessary dependencies for SLF4J and Logback.

   - A Java class that demonstrates logging at different levels (INFO, DEBUG, WARN, ERROR).

   - Usage of parameterized messages using `{}` placeholders instead of string concatenation.

   - Demonstration of exception handling and how error details can be effectively logged.

   - Maven execution support via `exec-maven-plugin`.


   ## Logging Levels Explained

   - **INFO**: Informational messages that highlight the progress of the application.

   - **DEBUG**: Detailed information typically used during development and debugging.

   - **WARN**: Indication of potential issues or unexpected situations that aren’t necessarily errors.

   - **ERROR**: Logs error events that might still allow the application to continue running.

 
   ## Setup & Run

   1. **Prerequisites**  
         - `Java 11+`  
         - `Apache Maven`  

   2. **Build**  
       `mvn clean compile`
   
   3. **Execute**
      
       `mvn exec:java -Dexec.mainClass=com.example.ParameterizedLoggingExample`


  ## Author
         Name: Sirimavilla Kaushik
         Date: 28-06-2025
         Language Used:JAVA and XML
        
