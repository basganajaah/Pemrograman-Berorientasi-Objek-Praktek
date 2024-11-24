package com.example.calculator;

import java.util.logging.Logger;

public class Calculator {
    private static final Logger logger = Logger.getLogger(Calculator.class.getName());

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int result = 0;

        result = a + b;

        if (result > 50) {
            logger.info("Big number");
        } else {
            logger.info("Small number");
        }

        if (c > 15) {
            for (int i = 0; i < 5; i++) {
                d += i;
            }
            logger.info("Updated value of d: " + d);
        }
    }
}
