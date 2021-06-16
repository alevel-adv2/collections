package com.alevel.hw14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class NumberUtilsTest {

    @Test
    void getSum() {
        NumberUtils sum = new NumberUtils();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        Assertions.assertEquals(sum.getSum(numbers), 28);
    }

    @Test
    void multiplyOddNumber() {

        NumberUtils multiplyOddNumbers = new NumberUtils();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        Assertions.assertEquals(multiplyOddNumbers.multiplyOddNumber(numbers), 105);
    }
}