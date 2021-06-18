package HW14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StringUtils stringUtils = new StringUtils();

        List<String> strings = new ArrayList<>();
        strings.add("Superman");
        strings.add("Wonder woman");
        strings.add("Superman");
        strings.add("Aquaman");
        strings.add("Aquaman");

        stringUtils.getLongestWord(strings);

        System.out.println(stringUtils.getDuplicates(strings));

        NumberUtils numberUtils = new NumberUtils();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);

        System.out.println(numberUtils.getSum(numbers));

        System.out.println(numberUtils.multiplyOddNumber(numbers));
    }

}
