package com.kodilla.abstracts.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator1 = new Calculator();
        int c = 5;
        int d = 7;
        int result = calculator1.subtract(c, d);
        assertEquals(-2, result);
    }

    @Test
    public void testpower() {
        Calculator calculator2 = new Calculator();
        int e = 3;
        int f = 2;
        int result2 = calculator2.power(e, f);
        assertEquals(9, result2);
    }

    @Test
    public void testpower1() {
        Calculator calculator3 = new Calculator();
        int e = -2;
        int f = 3;
        int result3 = calculator3.power(e, f);
        assertEquals(-8, result3);
    }

    @Test
    public void testpower2() {
        Calculator calculator4 = new Calculator();
        int e = 3;
        int f = 0;
        int result4 = calculator4.power(e, f);
        assertEquals(1, result4);
    }
}
