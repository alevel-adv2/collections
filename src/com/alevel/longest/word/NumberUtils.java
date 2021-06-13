package com.alevel.longest.word;

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
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 1) {
                newList.add(numbers.get(i) * 2);
            }
        }
        return newList;
    }
}
