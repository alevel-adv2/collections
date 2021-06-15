package com.alevel.longest.word;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class NumberUtilsTest {
    @Test
    void getSum() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(500);
        numbers.add(5000);

        int sum = NumberUtils.getSum(numbers);
        Assertions.assertEquals(5555,sum);
    }

    @Test
    void multiplyOddNumber() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(500);
        numbers.add(5000);

        List<Integer> numbersMulti = new ArrayList<>();
        numbersMulti.add(10);
        numbersMulti.add(50);
        numbersMulti.add(1000);
        numbersMulti.add(5000);

        List<Integer> multiply = NumberUtils.multiplyOddNumber(numbers);
        Assertions.assertEquals(numbersMulti,multiply);
    }
}
