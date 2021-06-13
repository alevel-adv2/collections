package com.alevel.longest.word;

import java.util.List;

public class NumberUtils {
    public double getSum(List<Double> numbers) {
        double result = 0.0;
        for (Double x : numbers) {
            result += x;
        }
        return result;
    }

    public double multiplyOddNumber(List<Double> numbers) {
        double result = 1.0;

        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 1) {
                result *= numbers.get(i);
            }
        }
        return result;
    }
}
