package HW14;

import java.util.*;

public class StringUtils {

    public String getLongestWord(List<String> words) {

        List<Integer> wordSizes = new ArrayList<>();
        String longestWord = "";

        for (String currentWord : words) {

            wordSizes.add(currentWord.length());
        }

        wordSizes.sort(Comparator.comparingInt(o -> o));

        int maxSize = wordSizes.get(words.size() - 1);

        for (String word : words) {

            if (word.length() == maxSize) {

                longestWord = word;
            }
        }

        return longestWord;
    }

    public ArrayList<String> getDuplicates(List<String> words) {

        ArrayList<String> duplicates = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {

            for (int j = i + 1; j < words.size(); j++) {

                if (words.get(i).equals(words.get(j))) {

                    duplicates.add(words.get(i));
                }
            }
        }
        return duplicates;
    }
}

