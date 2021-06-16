import java.util.List;

public class NumberUtils {

    static int getSum(List<Integer> numbers){
        int sum = 0;
        for (Integer num : numbers){
            sum += num;
        }
         return sum;
        }

    static void multiplyOddNumber(List<Integer> numbers){
        for(int i = 0; i < numbers.size(); i++){
            if (numbers.get(i) % 2 != 0){
                int num = numbers.get(i) * 2;
                numbers.remove(i);
                numbers.add(i, num);
            }
        }
    }
    }

