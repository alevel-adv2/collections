package com.alevel.longest.word;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {
    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }
    public static List<Integer> multiplyOddNumber(List<Integer> numbers) {
        List<Integer> doubleEven = new ArrayList<>(numbers);
        for (int i = 0; i < doubleEven.size(); i++) {
            if (i%2==0) {
                int multi = doubleEven.get(i)*2;
                doubleEven.set(i, multi);
            }
        }
        return doubleEven;
    }
}
