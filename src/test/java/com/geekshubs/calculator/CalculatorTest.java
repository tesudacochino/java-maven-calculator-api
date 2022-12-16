package com.geekshubs.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        assertEquals(34, new Calculator(8, 26, 8 + 26).getResult());
    }

    @Test
    public void testSub() {
        assertEquals(10, new Calculator(14, 4, 14 - 4).getResult());
    }

    @Test
    public void testMult() {
        assertEquals(12, new Calculator(3, 4, 3 * 4).getResult());
    }

    @Test
    public void testDiv() {
        assertEquals(6, new Calculator(12, 2, 12 / 2).getResult());
    }
}
