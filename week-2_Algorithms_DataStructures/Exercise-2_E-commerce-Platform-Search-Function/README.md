# E-commerce Platform Search Function

## Scenario
    You are working on the search functionality of an e-commerce platform. The search must be optimized for fast performance using appropriate search algorithms.

## 1. Understanding Asymptotic Notation
  ### What is Big O Notation?
           Big O Notation is used to describe how the performance of an algorithm scales with input size n. It helps compare algorithms and determine which is most efficient for large datasets.

  ### Time Complexities for Search Algorithms
     Algorithm	     Best Case	     Average Case	      Worst Case
     Linear Search	   O(1)	            O(n)	              O(n)
     Binary Search	   O(1)	            O(log n)	          O(log n)

    Linear Search: Scans each item one by one.

    Binary Search: Works only on sorted data, divides the array in half each time — much faster for large data.

## 2. Setup
    'Product.java' Class
## 3. Implementation
       'searchAlgorithms.java'-Contains search algorithms
       'searchApp.java'-Main application with user input

## 4. Analysis
      Time Complexity Comparison
            Algorithm	         Time Complexity
            Linear Search	         O(n)
            Binary Search	         O(log n)

 ## Which is Better?
     Use linear search for small or unsorted datasets.
     Use binary search for large, sorted datasets to achieve faster results.

## How to run
       1.Open the folder in **VS Code** or your favorite IDE.
       2. Compile all `.java` files:
           javac Product.java searchAlgorithms.java searchApp.java
       3.Run the test class:
           java ECommerceSearchApp

 ##  Author
      Name: Sirimavilla Kaushik
      Date: 18-06-2025
      Language Used: Java
