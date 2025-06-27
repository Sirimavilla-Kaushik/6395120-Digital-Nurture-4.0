
# Verifying Interactions

   ## Overview
   
   1.This project focuses on **interaction-based unit testing** using **Mockito** and **JUnit 5**, forming part of Week 2's Java testing module. 
   
   2.The objective is to ensure that service-layer logic interacts with its dependencies as expected — a crucial concept in writing reliable, maintainable, and     
     decoupled unit tests.


   ## Objective

   - Verify that a method is invoked with the correct arguments.
   - Demonstrate the use of **Mockito's `verify()`** method to assert interactions.
   - Separate concerns by mocking dependencies rather than invoking real implementations.
   - Practice writing clean, modular, and testable Java code.
   - Explore proper Maven setup for Java test automation.


  ## Technologies & Tools

   | Technology    | Purpose                                    |
   |---------------|--------------------------------------------|
   | Java 17       | Core programming language                  |
   | JUnit 5       | Testing framework                          |
   | Mockito       | Mocking and interaction verification       |
   | Maven         | Build automation and dependency management |
   | Git & GitHub  | Version control and collaboration          |


  ## Project Structure

    my-mockito-demo/
       ├── pom.xml
       └── src/
       ├── main/
       │    └── java/
       │      └── com/example/
       │        ├── ExternalApi.java
       │        └── MyService.java
       └── test/
          └── java/
           └── com/example/
             └── MyServiceTest.java


   - `ExternalApi.java`: An interface representing an external service to be mocked.
   - `MyService.java`: Contains the business logic that depends on `ExternalApi`.
   - `MyServiceTest.java`: Verifies that the service correctly interacts with the mocked dependency.


  ## Maven Configuration

   A proper `pom.xml` was set up to include:

   - Dependencies for `junit-jupiter` (JUnit 5) and `mockito-core`
   - Configuration for `maven-surefire-plugin` to:
   - Enable JUnit 5
   - Suppress runtime JVM warnings using `argLine` (e.g., `-Xshare:off`, `-Djdk.instrument.traceUsage=disable`)


  ##  Testing Strategy

   1. **Mock Creation**: Use Mockito to create a fake implementation of `ExternalApi`.
  
   2. **Dependency Injection**: Inject the mock into the `MyService` object.

   3. **Method Invocation**: Call `fetchData()` which internally uses the mock.
  
   4. **Interaction Verification**: Assert that the mock’s method (`getData()`) was indeed called.

This approach ensures that **only the logic inside `MyService` is tested**, and external behaviors are simulated, isolating the test from external dependencies.

 ## Execution Workflow

   ###  Build and Test
   
  `mvn clean test`
  ## Output Summary
   Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

   BUILD SUCCESS

 ##  Author
    Name: Sirimavilla Kaushik
    Date: 27-06-2025
    Language Used:JAVA and MAVEN
