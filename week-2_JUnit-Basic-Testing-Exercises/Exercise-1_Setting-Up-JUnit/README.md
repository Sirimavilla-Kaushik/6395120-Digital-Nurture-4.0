# Setting Up JUnit

  ## Overview
  
   1.This exercise introduces the process of integrating **JUnit**, a widely-used testing framework for Java, into a **Maven-based project structure**. 
   2.The objective is to establish a repeatable, scalable foundation for unit testing that adheres to modern software engineering best practices.
   3.This setup is foundational to ensure that future features developed within a Java application can be automatically tested as part of the build process, 
   thus improving **code quality**, **reliability**, and **maintainability**.

 
  ## Learning Objectives
  
   - Understand the purpose and advantages of unit testing in software development.
   - Set up a Maven project structure following industry conventions.
   - Add and manage testing dependencies using `pom.xml`.
   - Use JUnit to define and execute test cases within a Maven build lifecycle.
   - Gain hands-on experience with Maven commands like `mvn clean`, `mvn compile`, and `mvn test`.


  ##  Technologies & Frameworks

   | Tool/Framework   | Purpose                                    | Version       |
   |------------------|--------------------------------------------|---------------|
   | **Java**         | Primary programming language               | 17 or above   |
   | **Apache Maven** | Build automation and dependency management | 3.9.x         |
   | **JUnit**        | Unit testing framework                     | 5.x (Jupiter) |
   | **VS Code        | IDE for development                        | Any modern IDE|


   ## Folder Structure & Location
     This exercise is located at:
          6395120-Digital-Nurture-4.0/
             └── week-2_JUnit-Basic-Testing-Exercises/
                      └── Exercise-1_Setting-Up-JUnit/
                             └── junitdemo/
  Inside `junitdemo`, the Maven-standard structure is followed:
      - `src/main/java`: for application source code.
      - `src/test/java`: for unit test classes.
      - `pom.xml`: Maven configuration file defining project structure, dependencies, and plugins.

   ## Getting Started
   
  To run this project on a local machine:
      1. **Ensure Java and Maven are installed** and environment variables are configured.
      2. Open a terminal and navigate to the project directory:
                 `cd path/to/junitdemo`
      3. test the project using Maven:
                  `mvn test`

   ## Key Benefits 
   1.`Repeatability:` The Maven-based test execution is consistent across all environments.
   2.`Automation-ready:` Easily integrates with CI/CD pipelines for automated builds and tests.
   3.`Scalability:` The project setup supports modular growth for additional features and tests.

   ## Author
     Name: Sirimavilla Kaushik
     Date: 26-06-2025
     Language Used:JAVA and MAVEN
