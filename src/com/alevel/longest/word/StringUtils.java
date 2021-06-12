package com.alevel.longest.word;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringUtils {

    public String getLongestWord(List<String> words) {

        List<Integer> wordSizes = new ArrayList<>();
        String longestWord = "";

        for (int i = 0; i < words.size(); i++) {
            String currentWord = words.get(i);
            wordSizes.add(currentWord.length());
        }

        wordSizes.sort(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return (Integer) o1 - (Integer) o2;
            }
        });

        int maxSize = wordSizes.get(words.size()-1);

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == maxSize) {
                longestWord = words.get(i);
            }
        }

        return longestWord;
    }
}
