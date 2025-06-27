# Assertions in JUnit

  ## Project Overview
   1.The goal of this project is to practice unit testing using various assertion methods provided by JUnit 5. 
   2.These assertions help verify the correctness of code by checking expected outcomes, object states, and logical conditions. 
   3.The entire test class is managed using Maven, making it easy to build and run tests consistently.

   ## Objectives
   - Understand the use of assertion methods in JUnit 5.
   - Set up a Maven project that supports test execution.
   - Practice writing a single test class that includes multiple assertion types.
   - Execute tests via Maven and interpret the results.

   ## Technologies Used
   - Java Development Kit (JDK) – version 8 or higher. 
   - Apache Maven – for project management and build automation.
   - JUnit 5 – for writing and running unit tests. 
   - Visual Studio Code – or any Java IDE.

   ## Assertions Included

   | Assertion Type     | Example                          | Purpose                                  |
   |--------------------|----------------------------------|------------------------------------------|
   | `assertEquals`     | `assertEquals(5, 2 + 3)`         | Checks if two values are equal           |
   | `assertTrue`       | `assertTrue(5 > 3)`              | Validates a boolean condition is `true`  |
   | `assertFalse`      | `assertFalse(5 < 3)`             | Validates a boolean condition is `false` |
   | `assertNull`       | `assertNull(null)`               | Ensures the object is `null`             |
   | `assertNotNull`    | `assertNotNull(new Object())`    | Ensures the object is not `null`         |

  ## Project Structure
    AssertionsJUnitProject/
        ├── pom.xml
        └── src/
        └── test/
        └── java/
        └── com/
        └── example/
        └── AppTest.java

  ## How to Run
   ### Prerequisites
   1.Java 8 or newer installed (java -version).
   2.Maven installed (mvn -v).
   3.Your folder structure must include `pom.xml` and the proper `src/test/java/... path`.
   
   ### Run with Maven
   Open terminal in your project root (where pom.xml is).
      Run the following:
             `mvn test`.

  ## Author
     Name: Sirimavilla Kaushik
     Date: 27-06-2025
     Language Used:JAVA and MAVEN

             




