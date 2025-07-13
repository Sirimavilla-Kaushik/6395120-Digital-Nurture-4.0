# Create Authentication Service that retruns Jwt

   1.This project demonstrates how to implement an **authentication microservice** using **Spring Boot** and **JWT (JSON Web Tokens)**. 

   2.It provides a secured endpoint that validates user credentials and returns a signed JWT token, which clients can use to authenticate future requests in a           stateless and secure manner.

   ## Overview

   In modern web applications, token-based authentication is a popular alternative to traditional session-based authentication. This project implements a              foundational service that:

   - Accepts user credentials via HTTP Basic Authentication

   - Validates the credentials using Spring Security
 
   - Generates and returns a JWT token for valid users

   - Lays the foundation for securing RESTful APIs using tokens


   ## Technologies Used

            | Technology              | Description                                        |
            |-------------------------|----------------------------------------------------|
            | Java 21                 | Programming language                               |
            | Spring Boot             | Java framework for rapid backend development       |
            | Spring Security         | Authentication and authorization framework         |
            | JJWT (io.jsonwebtoken)  | Library for creating and parsing JWTs              |
            | Maven                   | Dependency and build management                    |
            | cURL/Postman            | Tools for API testing                              |
            | Tomcat Embedded Server  | Web server used by Spring Boot                     |



   ## Project Structure

                 springsecurity/
                         │
                         ├── src/
                         │    ├── main/
                         │           ├── java/
                         │           │     └── com/
                         │           │           └── cognizant/
                         │           │                  └── springsecurity/
                         │           │                   ├── SpringSecurityApplication.java
                         │           │                   ├── config/
                         │           │                   │     └── SecurityConfig.java
                         │           │                   ├── controller/
                         │           │                   │       └── AuthenticationController.java
                         │           │                   └── util/
                         │           │                         └── JwtUtil.java
                         │           └── resources/
                         │                  ├── application.properties
                         │
                         ├── pom.xml


   ##  How It Works

   1. Client sends a `GET` request to `/authenticate` with credentials using HTTP Basic Auth.

   2. Spring Security intercepts the request and authenticates the user.

   3. If credentials are valid, a JWT is generated and returned in JSON format.

   4. The client can use this token for subsequent secured requests.


   ## Example Usage

   **Request (using cURL):**

   `curl -s -u user:pwd http://localhost:8090/authenticate`

   Response:

    {
     "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
    }


   ## Author

     Name: Sirimavilla Kaushik
     Date: 13-07-2025
     Language Used:JAVA,XML,JSON
