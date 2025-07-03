# Using different appenders

   ## Overview

   1.This project showcases the integration of SLF4J with Logback to implement structured and flexible logging in a Java application. 

   2.It focuses on configuring and utilizing multiple appenders to output logs both to the console and a log file. 

   3.The setup follows industry best practices for real-world logging implementations.


   ## Objective

   To demonstrate how a Java application can utilize the SLF4J logging API with Logback as the implementation backend, using both:

   - **Console Appender**: Displays log messages in the terminal during runtime.

   - **File Appender**: Persists log messages to a log file (`app.log`) for future analysis and auditing.


   ## Key Highlights

   - Logging levels used: `DEBUG`, `INFO`, `WARN`, and `ERROR`.

   - Dual output: Logs are displayed on the console and simultaneously saved to a file.
 
   - Log message formatting includes timestamps, thread information, and logger details for better traceability.

   - Project is built using Maven, with all dependencies managed centrally through the `pom.xml` file.

   - Demonstrates real-time logging behavior during application execution.


   ## Technologies Used

     | Technology         | Description                                    |
     |--------------------|------------------------------------------------|
     | Java               | Programming language for building the app      |
     | Maven              | Build automation and dependency management     |
     | SLF4J              | Logging facade providing uniform logging API   |
     | Logback Classic    | Logging backend for SLF4J                      |


   ##  Project Structure

         using-different-appenders/
                         ├── pom.xml
                         ├── src/
                              └── main/
                                   ├── java/
                                    │     └── com/
                                    │          └── example/
                                    │                 └── AppLoggerDemo.java
                                    └── resources/
                                             └── logback.xml



   ##  File Descriptions

   ### `AppLoggerDemo.java`
   This is the main Java class that demonstrates the use of the logger. It logs messages at different levels (`trace`, `debug`, `info`, `warn`, and `error`) using SLF4J.

   ### `logback.xml`
   This is the Logback configuration file that defines two appenders:

   - `ConsoleAppender`: Displays logs in the console with a pattern layout.

   - `FileAppender`: Logs all messages to a file named `app.log` in the root directory.

   ### `pom.xml`
   This is the Maven project file where SLF4J and Logback dependencies are declared. It also includes the `exec-maven-plugin` to allow running the Java class directly from the command line.


   ##  How to Run the Project

  1. **Open Terminal** and navigate to the project directory:

   `cd path/to/using-different-appenders`

  2.Compile the Project:

  `mvn compile`

  3.Run the Application:

  `mvn exec:java -Dexec.mainClass=com.example.Applogger`

  ## Author
     Name: Sirimavilla Kaushik
     Date: 28-06-2025
     Language Used:JAVA and XML
