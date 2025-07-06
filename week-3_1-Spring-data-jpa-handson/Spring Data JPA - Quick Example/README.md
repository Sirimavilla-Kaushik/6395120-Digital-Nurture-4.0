
   #   Spring Data JPA Project

   ##  Overview

   1.OrmLearn is a Java-based Spring Boot application that demonstrates Object Relational Mapping (ORM) using **Spring Data JPA** with **MySQL** as the backend. 
   
   2.This project serves as a practical introduction to integrating Spring Boot with Hibernate and JPA to perform database operations using a layered architecture.


   ## Objectives

   - Understand the working of Spring Data JPA and Hibernate.

   - Learn how to define and use entities and repositories.

   - Implement a layered architecture using Service and Repository components.

   - Connect to and query a MySQL database from a Spring Boot application.

   - Display and debug SQL queries via Hibernate logging.


   ##  Technologies Used

     | Technology         | 
     |--------------------|
     | Java               | 
     | Spring Boot        |
     | Spring Data JPA    | 
     | Hibernate ORM      | 
     | MySQL              | 
     | Maven              | 
     | VSCODE IDE         |



   ##  Project Structure

   - `model/` – Contains the entity classes mapped to database tables.

   - `repository/` – Defines repository interfaces extending `JpaRepository`.

   - `service/` – Contains business logic to handle data access operations.

   - `OrmLearnApplication.java` – The main class for bootstrapping the Spring Boot application.

   - `application.properties` – Contains all configuration for the datasource, JPA, and logging.


   ##  Features Implemented

   - Maven-based Spring Boot setup.

   - Entity class for a `country` table in MySQL.

   - Repository interface to abstract database operations.

   - Service class to handle business logic.

   - Logging of SQL queries using Hibernate.

   - Application startup and data fetch confirmed with console output.


   ## Database Setup

   - The database used is **MySQL**.

   - A database named `ormlearn` should be created manually.

   - A table named `country` should exist with appropriate data (e.g., country codes and names).

   - Connection properties (username, password, and URL) should be updated in `application.properties`.


   ## Expected Output

   On running the application successfully:

   - The console will show Hibernate SQL logs fetching country data.

   - Retrieved country objects will be printed in a list format.

   - `BUILD SUCCESS` message from Maven will confirm the application ran without errors.


  ## Author

       Name: Sirimavilla Kaushik
       Date: 06-07-2025
       Language Used:JAVA,SQL,XML
