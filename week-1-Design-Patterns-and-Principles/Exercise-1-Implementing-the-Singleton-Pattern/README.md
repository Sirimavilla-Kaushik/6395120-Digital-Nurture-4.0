#  Singleton Pattern in Java
   ##  Objective
  You need to ensure that a logging utility class in your application has only one instance throughout the application lifecycle to ensure consistent logging.

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
    Your Name: Sirimavilla Kaushik,
    Date: 17-06-2025,
    Language Used: Java.

