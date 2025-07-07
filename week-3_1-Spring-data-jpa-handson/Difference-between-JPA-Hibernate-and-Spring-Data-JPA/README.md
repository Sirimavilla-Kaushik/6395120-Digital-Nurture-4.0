   # Difference between jpa hibernate and spring data jpa

   1.This is a simple Java application that demonstrates how to use **JPA (Java Persistence API)** with **Hibernate** as the JPA provider and **MySQL** as the          relational database, all without Spring Boot.

   2.This project helps understand the difference between **JPA (specification)**, **Hibernate (implementation)**, and gives foundational knowledge before              exploring **Spring Data JPA**.


   ## Learning Goals

   - Understand ORM (Object Relational Mapping) in Java.

   - Learn how JPA and Hibernate work together.

   - Understand how to map Java classes (entities) to database tables.

   - Perform basic CRUD operations using JPA `EntityManager`.
 
   - Gain hands-on experience with `persistence.xml` configuration.

   - Set the stage for transitioning to Spring Data JPA.


   ## What You'll Learn

   What is JPA, and how does it differ from Hibernate?  

   How to write and map a JPA entity class.  

   How to configure Hibernate using `persistence.xml`.  

   How to use `EntityManager` to perform basic operations: `persist`, `find`, `remove`, `createQuery`.  

   How to configure Maven dependencies for a standalone Hibernate project.  


   ##  Technologies Used
  
      | Tool/Tech             |
      |-----------------------|
      | Java                  |
      | Hibernate ORM         | 
      | Jakarta Persistence   | 
      | MySQL Connector/J     |
      | Maven                 | 
      | MySQL Server          |
      |  VS Code / IntelliJ   |


   ##  Project Structure

                 orm-learn/
                      ├── src/
                      │    └── main/
                      │          ├── java/
                      │          │     └── com/cognizant/ormlearn/
                      │          │                        ├── Employee.java 
                      │          │                        └── JPAMain.java
                      │          └── resources/
                      │                  └── META-INF/
                      │                         └── persistence.xml 
                      ├── pom.xml 



   ##  Database Setup

   > **Step 1**: Start your MySQL server  

   > **Step 2**: Run the following SQL once


   ## How to Run the Project
  
   1.Open terminal in project root:
   
   `cd orm-learn`

   2.Compile the project:

   `mvn clean compile`

   3.Run the app:

   `mvn exec:java`

   ## Expected Output

   Hibernate: insert into EMPLOYEE ...

   Hibernate: select ... from EMPLOYEE ...

   Employee [id=1, name=Leona Grace, salary=60000]

   Fetched: Employee [id=1, name=Leona Grace, salary=60000]


   ## Author
     Name: Sirimavilla Kaushik
     Date: 06-07-2025
     Language Used:JAVA,SQL,XML
