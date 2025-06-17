#  Singleton Pattern in Java
   ##  Objective
  You need to ensure that a logging utility class in your application has only one instance throughout the application lifecycle to ensure consistent logging.
  
  ##  How It Works

   The **Singleton Pattern** works by restricting object creation and ensuring that only one instance of the class can ever exist.

   In this project:

  - The **Logger** class is designed as a Singleton.
  - The constructor is marked **private** so no other class can instantiate it.
  - A  static reference **instance** is maintained in the class.
  - The **getInstance()** method checks if the instance is null, and if so, creates a new one. If not, it returns the existing one.
  - This ensures only **one Logger object** exists, no matter how many times you try to get the instance.



   ##  Project Structure
    /week-1-Design-Patterns-and-Principles
        └── Exercise-1-Implementing-the-Singleton-Pattern/
             ├── Logger.java 
             └── SingletonTest.java 
    
   ##  How to Compile and Run
    javac singleton/*.java
    java singleton.SingletonTest

  ## When to Use Singleton
    Logging utility
    Configuration management
    Thread pools
    Caching
    Database connections

 ## Note on Thread Safety
This basic implementation is not thread-safe. In multithreaded environments, use synchronized blocks or enums to prevent multiple instances.

   ## Author
    Name: Sirimavilla Kaushik
    Date: 17-06-2025
    Language Used: Java

