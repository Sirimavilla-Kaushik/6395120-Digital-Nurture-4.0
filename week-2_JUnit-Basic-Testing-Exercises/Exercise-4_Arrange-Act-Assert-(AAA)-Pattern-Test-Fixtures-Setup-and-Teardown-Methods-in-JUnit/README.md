# Exercise 4: Arrange-Act-Assert (AAA) Pattern, Test Fixtures, Setup and Teardown Methods in JUnit

 1. This is a simple Java Maven project that demonstrates **unit testing** using **JUnit 4**. 
 2. It showcases best practices like the **Arrange-Act-Assert (AAA)** pattern and the use of **test fixtures** with 
    `@Before` and `@After` annotations for setup and teardown of test environments.

 ##  What This Project Demonstrates
   - **JUnit 4 Test Setup** using `@Before` for initialization and `@After` for cleanup.
     
   - The **AAA (Arrange-Act-Assert)** testing pattern for clear, readable tests.
     
   - Separation of business logic and test logic in Maven directory structure.
     
   - Running tests with a simple Maven command.


   ## 🛠 Technologies Used
   
  - **Java**: JDK 8 or higher.
   
  - **JUnit**: Version 4.13.2.
     
  - **Maven**: Build and dependency management tool.
     
  - **IDE**: IntelliJ IDEA / Eclipse (or any Java IDE).

    ## Project Structure

        CalculatorJUnitProject/
               │
               ├── pom.xml # Maven project configuration
               └── src
               ├── main
               │    └── java
               │     └── Calculator.java # Simple class with basic methods
               └── test
               └── java
               └── CalculatorTest.java # JUnit test class


    ## How to Run This Project

    1. **Open your terminal or IDE**.

    2. Navigate to the root of the project folder:

         cd `CalculatorJUnitProject`

    3.Run the tests using Maven:

         `mvn test`
    ## Output:

   1.JUnit will execute all test cases in src/test/java.

   2.You will see messages printed from setup and teardown methods in the console.

  ## Testing Approach: AAA Pattern
   Each test method is structured in 3 clear steps:

  1.Arrange: Prepare the input data and test objects

  2.Act: Call the method under test

  3.Assert: Verify the result using assertions

  Using @Before and @After ensures test isolation by setting up fresh test conditions and cleaning up after each test execution.

 ## Author
    Name: Sirimavilla Kaushik
    Date: 27-06-2025
    Language Used:JAVA and MAVEN
