package HW14;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    public int getSum(List<Integer> numbers) {
        int sum = 0;

        // для понимания до оптимизации выглядит так
        /*for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);*/

        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    public List<Integer> multiplyOddNumber(List<Integer> numbers) {
        List<Integer> multiplyNumbers = new ArrayList<>();

        // до преобразования for
        /*for (int i = 0; i < numbers.size(); i++) {
           if(numbers.get(i) % 2 == 0) {
                multiplyNumbers.add(numbers.get(i)*2);
            } else {
                multiplyNumbers.add(numbers.get(i));
            }
        }*/

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                multiplyNumbers.add(number * 2);
            } else {
                multiplyNumbers.add(number);
            }
        }
        return multiplyNumbers;
    }
}
