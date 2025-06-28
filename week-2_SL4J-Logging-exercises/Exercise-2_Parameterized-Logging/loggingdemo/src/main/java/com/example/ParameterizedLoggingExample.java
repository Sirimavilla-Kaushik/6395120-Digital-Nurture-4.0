package com.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class ParameterizedLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);
    public static void main(String[] args) {
        String user = "abcd";
        int age = 25;
        logger.info("User '{}' has logged in.", user);
        logger.debug("User '{}' is {} years old.", user, age);
        int itemCount = 3;
        double price = 299.99;
        logger.warn("User '{}' purchased {} items at ${} each.", user, itemCount, price);
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            logger.error("An error occurred while performing division: {}", e.getMessage());
        }
    }
}
