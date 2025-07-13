# Spring Core-Load Country From Spring Configuration-XML

   1.This project is part of a hands-on exercise demonstrating the use of **Spring Core with XML-based configuration**. 

   2.The goal is to simulate a feature for an airline booking website that needs to manage country-specific booking configurations.

   3.Only one country is configured and loaded at a time using the **Spring IoC container**.
   

   ## Objective

   - Understand and implement **Inversion of Control (IoC)** using Spring.

   - Define beans via **XML configuration** rather than annotations or Java config.

   - Learn **dependency injection using the `<property>` tag**.

   - Apply **SLF4J with Logback** for structured logging during object lifecycle.

   - Get familiar with **ApplicationContext** and **bean retrieval** in Spring.

   ## Scenario

   An international airline website supports booking flights from four different countries. These are identified using standard ISO country codes:

   - US – United States  

   - DE – Germany  

   - IN – India  

   - JP – Japan  

   The application is expected to use Spring to manage country data. For this exercise, only **one country** (selected by the developer) is configured and loaded      via Spring XML.

   ## Technologies Used
 
           
          | Technology           | 
          |----------------------|
          | Java                 |
          | Spring Context       |
          | Maven                | 
          | SLF4J (API)          | 
          | VS Code              |


   ## Project Structure Overview

                  spring-learn/
                       ├── src/
                       │    └── main/
                       │          ├── java/
                       │          │     └── com/cognizant/springlearn/
                       │          │                           ├── Country.java
                       │          │                           └── SpringLearnApplication.java
                       │          └── resources/
                       │                 ├── country.xml
                       ├── pom.xml


   ## How It Works

   - The **Spring configuration file** defines a single bean representing a country.

   - Spring uses **setter-based injection** to populate its properties (`code`, `name`).

   - The **ApplicationContext** is initialized to read this XML and load the bean into memory.

   - The main application retrieves the bean and displays its values using logging.

   - The **lifecycle of the bean** is transparently logged, including constructor, setters, and output.


 
   ## How to Run in Visual Studio Code

   1. Open the project folder in VS Code.

   2. Ensure Maven and Java are installed and configured in your system.

   3. Use the integrated terminal to build the project using Maven.

   4. Run the main class directly from the VS Code Java extension or terminal.

   5. Observe logs in the terminal to verify successful loading and output of the country bean.


   ## Output 

   DEBUG com.cognizant.springlearn.Country - Inside Country Constructor.

   DEBUG com.cognizant.springlearn.Country - Inside setCode()

   DEBUG com.cognizant.springlearn.Country - Inside setName()

   DEBUG com.cognizant.springlearn.SpringLearnApplication - Country : Country [code=IN, name=India]

   ## Author
     
       Name: Sirimavilla Kaushik
       Date: 11-07-2025
       Language Used:JAVA,SPRING BOOT,MAVEN

