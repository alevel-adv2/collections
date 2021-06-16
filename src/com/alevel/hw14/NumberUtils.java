package com.alevel.hw14;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    public int getSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    public List<Integer> multiplyOddNumber(List<Integer> numbers) {

        List<Integer> multiplyOddNumbers = new ArrayList<>();
        int multiply;
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                multiply = number * 2;
                multiplyOddNumbers.add (multiply);
            }
        }
        return multiplyOddNumbers;
    }
}
