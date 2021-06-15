package com.alevel.longest.word;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringUtils {

    public String getLongestWord(List<String> words) {
        int wordsTemp = 0;
        int iCount = 0;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() > wordsTemp) {
                wordsTemp = words.get(i).length();
                iCount = i;
            }
        }
        return words.get(iCount);
    }

    public List<String> getDuplicates(List<String> words) {
        List<String> duplicateWords = new ArrayList<>(words);
        List<String> result = new ArrayList<>();
        Collections.sort(duplicateWords);
        System.out.println(duplicateWords);
        int cut = duplicateWords.size();
        for (int i = 0; i < duplicateWords.size() - 1; i++) {
            if (!duplicateWords.get(i).equals(duplicateWords.get(i + 1))
                    && duplicateWords.get(i).equals(duplicateWords.get(i - 1))) {
                result.add(duplicateWords.get(i));
            }
        }
        if (duplicateWords.get(cut - 1).equals(duplicateWords.get(cut - 2))) {
            result.add(duplicateWords.get(cut - 1));
        }
        return result;
    }
}
