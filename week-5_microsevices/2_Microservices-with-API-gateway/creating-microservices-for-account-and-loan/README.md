# creating-microservices-for-account-and-loan 

   A Maven-based microservices project built with **Spring Boot**, demonstrating RESTful API development, independent service management, and scalable backend        architecture.


   ##  Overview

   This project demonstrates a basic microservices setup where two independent services — **Account Service** and **Loan Service** — are exposed via RESTful          APIs. This forms a foundational structure for distributed, loosely coupled systems.


   ## Why Microservices?

   Microservices allow applications to be:

   - **Modular** – Each service has a single responsibility.

   - **Scalable** – Services can scale independently.

   - **Maintainable** – Easier to debug, test, and deploy.

   - **Resilient** – One service failure does not bring down the whole system.


   ## Folder Structure

                          microservices/
                                 │
                                 ├── account/
                                 │      ├── src/
                                 │      │     └── main/
                                 │      │          ├── java/
                                 │      │          │     └── com/
                                 │      │          │          └── cognizant/
                                 │      │          │                 └── account/
                                 │      │          │                 ├── controller/
                                 │      │          │                 │       └── AccountController.java
                                 │      │          │                 └── AccountApplication.java
                                 │      │          └── resources/
                                 │      │                 ├── application.properties
                                 │      └── pom.xml
                                 │
                                 ├── loan/
                                 │     ├── src/
                                 │     │     └── main/
                                 │     │           ├── java/
                                 │     │           │     └── com/
                                 │     │           │          └── cognizant/
                                 │     │           │                  └── loan/
                                 │     │           │                       ├── controller/
                                 │     │           │                       │         └── LoanController.java
                                 │     │           │                       └── LoanApplication.java
                                 │     │           └── resources/
                                 │     │                  ├── application.properties
                                 │     │          
                                 │     └── pom.xml


   ## Technologies Used

            | Technology           | Description                              |
            |----------------------|------------------------------------------|
            | Java 17+             | Programming language                     |
            | Spring Boot          | Framework for microservices              |
            | Maven                | Build and dependency management tool     |
            | RESTful APIs         | To expose endpoints                      |
            | application.properties | Service configuration per microservice |


   ## API Documentation

   ### Account Service

   URL: /accounts/00987987973432

   Method: GET

   Response:

           {
             "accountNumber": "10000001",
              "accountType": "Savings",
              "balance": 10000.0
           }

 ### Loan Service

   URL: /loans/H00987987972342

   Method: GET

   Response:

       {
           "loanNumber": "LN001",
            "loanType": "Home Loan",
            "loanAmount": 2500000
       } 

   ## Getting Started

   Run Each Service:
   
   1.cd account

   2.mvn spring-boot:run

   3.cd ../loan

   4.mvn spring-boot:run
   
   ## Access APIs:

   Visit: http://localhost:8080/accounts/00987987973432

   Visit: http://localhost:8081/loans/H00987987972342

   ## Testing

   You can test the APIs using:

   1.Postman

   2.cURL

   3.Browser (for GET only)


   ## Author
      Name: Sirimavilla Kaushik
      Date: 17-07-2025
      Language Used:JAVA,XML,PROPERTIES
