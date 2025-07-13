# Rest Country Web Service

   This project is part of the **Spring Learn Application** and demonstrates how to create a simple RESTful web service using Spring Boot with XML-based Spring        bean configuration.


   ## Description

   1.The application exposes a REST endpoint that returns details of a country (India). 
   
   2.The country data is configured using an external XML file and loaded via Spring’s ApplicationContext. 
   
   3.The response is returned in JSON format using Spring Boot’s built-in serialization.


   ## Features

   - REST API endpoint to fetch country details

   - Integration of XML-based Spring bean configuration

   - Automatic JSON response generation

   - Lightweight and easy to run with Spring Boot


   ## Technologies Used

       | Technology      | Purpose                                      |
       |------------------|----------------------------------------------|
       | Java 17+         | Programming language                         |
       | Spring Boot      | Framework to build REST APIs                 |
       | Spring Web       | To handle web-based REST endpoints           |
       | Spring Context   | To load and manage XML-based beans           |
       | Jackson          | Convert Java objects to JSON automatically   |
       | Maven            | Build and dependency management tool         |
       | XML              | Used to configure Spring beans               |
       | Postman/Browser  | For testing API responses                    |


   ## Project Structure

                            spring-learn/
                                  ├── src/
                                  │    ├── main/
                                  │    │     ├── java/
                                  │    │         │ └── com/
                                  │    │                └── cognizant/
                                  │    │                        └── springlearn/
                                  │    │                                  ├── SpringLearnApplication.java 
                                  │    │                                  ├── Country.java
                                  │    │                                  └── controller/
                                  │    │                                          └── CountryController.java 
                                  │    └── resources/
                                  │               ├── application.properties
                                  │               └── country.xml 
                                  ├── pom.xml 


   ## API Endpoint

              | Method | URL         | Description                            |
              |--------|-------------|----------------------------------------|
              | GET    | `/country`  | Returns JSON with India's code & name  |


   ##  How It Works

   1. The user sends a GET request to `/country`.

   2. The controller loads the Spring ApplicationContext from the XML file.

   3. The country bean (India) is retrieved using its ID.
 
   4. The bean is returned as a Java object.

   5. Spring Boot auto-converts the object into a JSON response.

 
   ##  How to Test

   - Run the application.

   - Open your browser or Postman and access: `http://localhost:8083/country`

   - View the JSON response.
 
   - To inspect headers:
 
   - Use **Developer Tools → Network Tab** in your browser.
 
   - Use the **Headers tab** in Postman.

   ## Author
    
     Name: Sirimavilla Kaushik
     Date: 12-07-2025
     Language Used:JAVA,SPRING BOOT,MAVEN
