package com.alevel.hw14;

import java.util.List;

public class NumberUtils {

    public int getSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    public int multiplyOddNumber(List<Integer> numbers) {

        int multiplyOddNumber = 1;
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                multiplyOddNumber *= number;
            }
        }
        if (!numbers.contains(1)) {
            if (multiplyOddNumber == 1) {
                multiplyOddNumber = 0;
            }
        }
        return multiplyOddNumber;
    }
}
