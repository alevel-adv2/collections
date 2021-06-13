package com.alevel.longest.word;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class NumberUtilsTest {
    @Test
    void getSum() {
        NumberUtils numberUtils = new NumberUtils();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        int sum = numberUtils.getSum(numbers);
        Assertions.assertEquals(sum, 28);
    }

    @Test
    void multiplyOddNumber() {
        NumberUtils numberUtils = new NumberUtils();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        List<Integer> result = numberUtils.multiplyOddNumber(numbers);
        Assertions.assertEquals(result.size(), 4);
        Assertions.assertEquals(result.get(0), 2);
        Assertions.assertEquals(result.get(1), 6);
        Assertions.assertEquals(result.get(2), 10);
        Assertions.assertEquals(result.get(3), 14);

    }
}
