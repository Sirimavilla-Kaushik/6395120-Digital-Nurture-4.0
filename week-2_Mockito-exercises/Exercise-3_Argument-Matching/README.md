#  Mockito Argument

   ## Overview
    
  1.This project demonstrates how to test **void methods using Mockito** by verifying whether they are called with the correct arguments. 
  
  2.The scenario involves a basic `UserService` class with a method designed to send notifications. 
  
  3.Although the method doesn't return a value, its **execution and argument validation** are essential in unit testing.

  4.Mockito's `verify()` method and argument matchers like `eq()` play a central role in this behavior verification approach. 
  
  5.The project emphasizes clean test design, proper Maven setup, and best practices in mocking dependencies.


   ## Project Goal

   - To mock a service class (`UserService`) that has a void method.

   - To verify the interaction between the test class and the void method using **argument matching**.

   - To implement a **JUnit-based test** using **Mockito** and confirm that the method was called with the expected arguments.

   - To ensure **zero warnings or runtime issues** during test execution using Maven with proper JVM flags and configurations.


   ## Project Structure

   The project follows a standard Maven directory layout:

           argumentmatching/
                 ├── pom.xml 
                 └── src/
                      ├── main/
                      │    └── java/
                      │        └── com/
                      │             └── example/
                      │                  └── UserService.java 
                      └── test/
                            └── java/
                                  └── com/
                                       └── example/
                                                └── UserServiceTest.java 


   ## Technologies Used

                | Technology        | Role                                 |
                |-------------------|--------------------------------------|
                | Java 17           | Programming Language                 |
                | JUnit             | Testing Framework                    |
                | Mockito           | Mocking Framework for Behavior Tests |
                | Maven             | Build & Dependency Management Tool   |


   ## Key Highlights

   - Focused on **testing behavior** instead of return values.

   - Ensured that **void method execution** is validated through interaction.

   - Verified that **arguments passed** to the void method are exactly as expected.

   - Used **Mockito matchers** to test argument correctness.

   - Handled all common test-time JVM warnings using proper `pom.xml` configuration.


   ## How to Run the Tests

   To build and test the project, open a terminal in the project directory and run the following commands:

    # Clean previous builds
       
       mvn clean

    # Compile the project

       mvn compile

    # Run all unit tests

       mvn test

   ## Expected Output

 -------------------------------------------------------
 T E S T S
-------------------------------------------------------

Running com.example.UserServiceTest

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

BUILD SUCCESS

   ## Author
      Name: Sirimavilla Kaushik
      Date: 30-06-2025
      Language Used:JAVA and MAVEN
