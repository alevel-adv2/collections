package com.alevel.longest.word;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    public int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    List<Integer> multiplyOddNumber(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 1) {
                result.add(numbers.get(i) * 2);
            }
        }

        return result;
    }
}
