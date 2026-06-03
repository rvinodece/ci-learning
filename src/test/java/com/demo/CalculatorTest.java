package com.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAdd() {

        Calculator calculator = new Calculator();

        assertEquals(4, calculator.add(2, 2));
        assertEquals(2, calculator.subtract(5,3));
         }
    @Test
    void testDivide() {
        Calculator calculator = new Calculator();

        assertEquals(5, calculator.divide(10, 2));
    }
}