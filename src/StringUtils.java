import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringUtils {

    static ArrayList<String> getDuplicates(List<String> test){
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < test.size(); i++) {
            for (int j = i + 1; j < test.size(); j++) {
                if (test.get(i).equals(test.get(j))) answer.add(test.get(i));
            }
        }
        return answer;
    }

    static String getLongestWord(List<String> test){
        test.sort((Comparator.comparingInt(String::length)));
        return test.get(test.size() - 1);
    }


}
