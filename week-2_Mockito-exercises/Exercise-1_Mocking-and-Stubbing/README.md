
# Mocking and Stubbing

   1.This project demonstrates a practical implementation of **mocking and stubbing** in Java using **Mockito** and **JUnit 5** within a Maven-based project. 
   
   2.It simulates unit testing scenarios where a class depends on an external API, allowing controlled testing without relying on the actual API.
  
  ## Objective
    
  1.The primary goal is to write **isolated, reliable, and repeatable unit tests** for a service that depends on an external API. 
  
  2.Instead of invoking the real API (which may be unavailable, slow, or produce unpredictable results), we:

   - Replace the API with a **mock** object.
   - Define **stubbed responses** to simulate various API return values.
   - Use **assertions** to verify that the service behaves correctly based on those mock responses.

     This ensures tests are fast, stable, and focused on the logic being tested — not external factors.


  ## Technologies Used

   | Tool / Technology | Purpose                              |
   |-------------------|--------------------------------------|
   | Java              | Primary programming language         |
   | Maven             | Project and dependency management    |
   | JUnit 5           | Unit testing framework               |
   | Mockito           | Mocking and stubbing tool            |
   | VS Code           | IDE for Java development             |


  ## Project Structure

   The project adheres to the standard Maven layout:

    mockito-demo/
     │
     ├── src/
     │    ├── main/
     │    │ └── java/
     │    │ └── com/example/ ← Contains service and external API interface
     │    └── test/
     │    └── java/
     │    └── com/example/ ← Contains unit tests using Mockito and JUnit
     │
     ├── pom.xml ← Maven configuration with dependencies


   ##  Features and Concepts Demonstrated

   ### 1.Mocking
   Creating **mock versions** of real objects (external APIs) that simulate behavior without requiring the actual implementation.

   ### 2.Stubbing
   Predefining responses from mocked methods, allowing you to simulate various scenarios such as success, failure, or exceptions.

   ### 3.Dependency Injection in Tests
   Passing mock objects into the service being tested, ensuring that tests are not coupled to actual implementations.

  ## Running the Project

   1. Navigate to the root directory (where `pom.xml` is located):

        cd path/to/mockito-demo

   2. Run the tests:
        `mvn test`

  ## Expected Output:
 
   Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
   
   BUILD SUCCESS

  ##  Author
    Name: Sirimavilla Kaushik
    Date: 27-06-2025
    Language Used:JAVA and MAVEN
      
