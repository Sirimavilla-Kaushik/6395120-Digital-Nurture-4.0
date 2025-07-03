 # Handling Void Methods

   This project demonstrates a practical use-case of **unit testing a `void` method** using **Mockito** in combination with **JUnit 5** in a Java-based Maven           application.


   ## Project Goal

   The primary goal of this project is to show how to:

   - Mock external service dependencies.

   - Stub `void` methods to avoid triggering real logic.

   - Verify if the `void` method was invoked with the correct parameters.

   This is especially important when dealing with **side-effect-causing methods** (e.g., sending emails, logging, pushing data to queues, etc.), 
    where you want to test the interaction *without executing the actual side effect*.


   ## Detailed Explanation

   ### Classes Overview:

   - **`NotificationService`**  
  
  A simple service that contains a `notifyUser(String message)` method — which simulates a notification-sending operation. This method is a `void` return type.

   - **`UserManager`**  
  
  Depends on `NotificationService` and calls its `notifyUser()` method when a new user is created.

   - **`UserManagerTest`**  
 
  A unit test using **Mockito** to mock `NotificationService`, stub the void method using `doNothing()`, and verify the call.



   ## Testing Strategy

   ### Key Mockito Functions Used:

       | Function                    | Purpose                                                                 |
       |-----------------------------|-------------------------------------------------------------------------|
       | `mock()`                    | Creates a mock of a dependency.                                         |
       | `doNothing().when()`        | Stubs a void method to prevent actual execution.                        |
       | `verify()`                  | Verifies if the method was called with expected parameters.             |
       | `anyString()`               | A matcher that allows flexibility in verifying arguments passed.        |



   ## Why Void Method Testing Matters

   When testing void methods, especially those that have **no return value**, the only way to assert correctness is to:

   - Verify **method invocation**.

   - Validate **side effects** (like changing state, writing to logs).

   - Ensure **interaction correctness** with other components.

   Mockito provides the perfect toolset to handle these situations in a clean, elegant, and maintainable way.




   ## Technologies Used

     | Technology      | Description                          |
     |-----------------|--------------------------------------|
     | Java 17         | Base programming language            |
     | Maven           | Build automation and dependency tool |
     | JUnit           | Testing framework                    |
     | Mockito         | Mocking framework for unit tests     |


  ## Project Structure

         handlingvoidmethod/
              ├── pom.xml
              └── src
                   ├── main
                   │    └── java
                   │         └── com
                   │              └── example
                   │                    ├── NotificationService.java 
                   │                    └── UserManager.java 
                   └── test
                        └── java
                             └── com
                                 └── example
                                      └── UserManagerTest.java 

   ## How to Run the Project

   Run Tests
   
    `mvn clean test`
   ## Sample Output
   
 -------------------------------------------------------
 T E S T S
-------------------------------------------------------

Running com.example.UserManagerTest

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.158 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0


   ## Author
        Name: Sirimavilla Kaushik
        Date: 30-06-2025
        Language Used:JAVA and MAVEN
