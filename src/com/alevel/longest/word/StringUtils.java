package com.alevel.longest.word;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {

    public List<String> getDuplicates(List<String> words) {
        List<String> duplicates = new ArrayList<>();
        for (int i = 0; i < words.size() - 1; i++) {
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j))) {
                    duplicates.add(words.get(j));
                }
            }
        }
        return duplicates;
    }

    public String getLongestWord(List<String> words) {
        String longestWord = words.get(0);
        if (words.size() > 0) {
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
        return longestWord;
    }
}
