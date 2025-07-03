
 #  Mocking and Stubbing with Multiple Returns using Mockito

   ## Overview

   1.This project demonstrates how to **mock and stub methods with multiple return values** using **Mockito** in a **JUnit 5** test environment. 
   
   2.The main goal is to simulate an external API’s dynamic behavior across multiple method calls and ensure that the dependent service handles it correctly.

   3.Mocking such behavior is especially useful in:
  
   - Simulating time-based or state-based changes in API responses

   - Avoiding flakiness caused by unstable external systems
 
   - Validating control flow logic that depends on multiple outcomes


   ## Key Concepts Demonstrated

   - Creating **mock objects** using Mockito

   - **Stubbing** methods with **consecutive return values**

   - Using **JUnit 5** and **Mockito Extension** for integration

   - Verifying **interactions and call counts**

   ##  Project Structure

               mocksandstubs/
                  ├── pom.xml
                  ├── src/
                  │ ├── main/
                  │ │    └── java/
                  │ │         └── com/example/
                  │ │                   ├── api/
                  │ │                   │    └── WeatherApiClient.java
                  │ │                   └── service/
                  │ │                         └── WeatherService.java
                  │ └── test/
                  │      └── java/
                  │           └── com/example/service/
                  │                            └── WeatherServiceTest.java



   ## Technologies Used

     | Technology           | Purpose                                      |
     |----------------------|----------------------------------------------|
     | Java 17              | Main programming language                    |
     | Maven                | Project and dependency management            |
     | JUnit 5              | Unit testing framework                       |
     | Mockito Core         | Mocking/stubbing framework                   |
     | Mockito JUnit Jupiter| Integration between Mockito and JUnit 5      |

   ## Files Breakdown

   ### `WeatherApiClient.java`
   - A simple interface representing an external weather data provider.

   ###  `WeatherService.java`
   - A service class that depends on `WeatherApiClient`.
 
   - Fetches temperature data by calling `getTemperature()`.

   ###  `WeatherServiceTest.java`
   - Contains unit test using `MockitoExtension`.

   - Uses `thenReturn()` to return multiple values on consecutive method calls.

   - Verifies if values returned are correct and checks call counts.

   ##  How to Run Tests

   ###  Prerequisites

   - JDK 17 or higher
  
   - Apache Maven installed and added to system path

   ###  Build and Test

   # Run tests

   `mvn clean test`

  ## Sample Test Output

-------------------------------------------------------
 T E S T S
-------------------------------------------------------

Running com.example.service.WeatherServiceTest

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

BUILD SUCCESS



  ## Author
    Name: Sirimavilla Kaushik
    Date: 30-06-2025
    Language Used:JAVA and MAVEN
