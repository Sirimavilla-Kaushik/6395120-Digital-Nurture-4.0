package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;
    @Before
    public void setUp() {
        System.out.println("Setting up before each test...");
        calculator = new Calculator(); 
    }
    @After
    public void tearDown() {
        System.out.println("Cleaning up after each test...");
        calculator = null;
    }
    @Test
    public void testAddition() {
        //Arrange
        int a = 5;
        int b = 3;
        int result = calculator.add(a, b);//Act
        assertEquals(8, result); // Assert
    }
    @Test
    public void testSubtraction() {
        //Arrange
        int a = 10;
        int b = 4;
        int result = calculator.subtract(a, b);//Act
        assertEquals(6, result); // Assert
    }
}
