package com.alevel.longest.word;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class NumberUtilsTest {

    @Test
    void getSum() {
        NumberUtils numberUtils = new NumberUtils();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(55);
        numbers.add(1);
        numbers.add(125);
        numbers.add(3);
        numbers.add(12);
        numbers.add(8);

        int result = numberUtils.getSum(numbers);

        Assertions.assertEquals(result, 211);
    }

    @Test
    void multiplyOddNumber() {
        NumberUtils numberUtils = new NumberUtils();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(55);
        numbers.add(11);
        numbers.add(125);
        numbers.add(3);
        numbers.add(12);
        numbers.add(8);

        List<Integer> result = numberUtils.multiplyOddNumber(numbers);

        Assertions.assertEquals(result.size(), 5);
        Assertions.assertEquals(result.get(2), 22);
    }
}