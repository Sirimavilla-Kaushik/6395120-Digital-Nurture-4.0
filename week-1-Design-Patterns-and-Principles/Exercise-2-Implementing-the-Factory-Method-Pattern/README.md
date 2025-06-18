# Implementing the Factory Method Pattern

## Scenario: 
    You are developing a document management system that needs to create different types of documents (e.g., Word, PDF, Excel). Use the Factory Method Pattern to achieve this.

##  Project Structure

     FactoryMethodPatternExample/
          ├── Document.java
          ├── WordDocument.java
          ├── PdfDocument.java
          ├── ExcelDocument.java
          ├── DocumentFactory.java
          ├── WordDocumentFactory.java
          ├── PdfDocumentFactory.java
          ├── ExcelDocumentFactory.java
          └── FactoryMethodTest.java

## Design Overview
### Interface: `Document`
        Defines a common interface for all document types. It declares a method `open()` that all document classes implement.

### Concrete Document Classes:
             - `WordDocument`
             - `PdfDocument`
             - `ExcelDocument`

          Each class implements the `Document` interface and provides a specific implementation of the `open()` method.

 ### Abstract Factory: `DocumentFactory`
          Defines the factory method `createDocument()`, which is overridden by specific factories.

### Concrete Factories:
              - `WordDocumentFactory`
              - `PdfDocumentFactory`
              - `ExcelDocumentFactory`

         Each concrete factory encapsulates the logic for creating its respective document type.

        ### Test Class: `FactoryMethodTest`
        Demonstrates the use of different factories to create and open different types of documents.

 ## How to Run

    1.Open the folder in **VS Code** or your favorite IDE.
    2. Compile all `.java` files:
      javac *.java
    3.Run the test class:
      java FactoryMethodTest

 ## Benefits 
    Scalability
    Loose Coupling
    Single Responsibility

## Author

    Name: Sirimavilla Kaushik
    Date: 18-06-2025
    Language Used: Java
    
