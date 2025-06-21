 # Financial Forecasting

  ## Scenario:
     You are developing a financial forecasting tool that predicts future values based on past data using recursive algorithms.
  ### Understand Recursive Algorithms
     What is Recursion?
     Recursion is a technique where a function calls itself to solve smaller instances of the same problem.
     Recursion simplifies problems that can be broken down into smaller, similar sub-problems, like forecasting 
     where each year’s value is based on the previous year's.

  ### Recursive Forecasting Formula

     simple growth model:
     Future Value = Current Value × (1 + Growth Rate)^n

     recursively growth model:
     FV(n) = FV(n - 1) × (1 + growthRate)

  ### Analysis
    Time Complexity: O(n)
    Space Complexity: O(n)

  ### Project Structure
     week-1_Algorithms-DataStructures
        └──Exercise-7_Financial-Forecasting
                ├── FinancialForecastApp.java    
                ├── Forecaster.java               
                ├── RecursiveForecaster.java  

  ### How to Compile and Run
     Save File as: FinancialForecast.java
     Open terminal/command prompt and navigate to the file directory
     Compile:
     javac FinancialForecast.java
     Run:
     java FinancialForecast

    

  ### Author
    Name: Sirimavilla Kaushik
    Date: 21-06-2025
    Language Used: Java
