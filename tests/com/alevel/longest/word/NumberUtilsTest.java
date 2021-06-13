package com.alevel.longest.word;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class NumberUtilsTest {
    private static final Double ACCURACY = 1E-9;

    NumberUtils utils = new NumberUtils();
    Double[] numArray = {1.5, -1.5, 4.0, 3.2};

    @Test
    void getSum() {
        double expected = 7.2;
        double result = utils.getSum(Arrays.asList(numArray));
        assertEquals(result, expected);
    }

    @Test
    void multiplyOddNumber() {
        double expected = -4.8;
        double result = utils.multiplyOddNumber(Arrays.asList(numArray));
        assertEquals(result, expected, ACCURACY);
    }
}