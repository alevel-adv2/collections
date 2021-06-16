import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<>();
        test.add("Batman");
        test.add("Wonder Woman");
        test.add("Cyborg");
        test.add("Superman");
        test.add("Batman");
        test.add("Cyborg");

        StringUtils.getDuplicates(test).forEach(System.out::println);
        System.out.println(StringUtils.getLongestWord(test));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);

        System.out.println(NumberUtils.getSum(numbers));
        NumberUtils.multiplyOddNumber(numbers);
        System.out.println(numbers);

    }
}
