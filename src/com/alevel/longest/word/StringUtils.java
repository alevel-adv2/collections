package com.alevel.longest.word;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    private final static short FIRST_ELEM_INDEX = 0;

    public String getLongestWord(List<String> words) {
        words.sort((w1, w2) -> w2.length() - w1.length());
        return words.get(FIRST_ELEM_INDEX);
    }

    public List<String> getDuplicates(List<String> words) {
        List<String> duplicates = new ArrayList<>();
        int size = words.size();

        for (int i = 0; i < size; i++) {
            String element = words.get(i);

            if (!duplicates.contains(element) && duplicates.lastIndexOf(element) != i) {
                duplicates.add(element);
            }
        }

        return duplicates;
    }
}
