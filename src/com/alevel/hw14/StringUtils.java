package com.alevel.hw14;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class StringUtils {

    List<String> getDuplicates(@NotNull List<String> words) {
        Set<String> nonDuplicate = new HashSet<>(words);
        List<String> duplicateWords = new ArrayList<>();
        for (String word : words) {
            if (nonDuplicate.contains(word)) {
                nonDuplicate.remove(word);
            } else {
                duplicateWords.add(word);
            }
        }
        return duplicateWords;
    }

    String getLongestWord(@NotNull List<String> words) {

        words.sort(Comparator.comparing(String::length));

        return words.get(words.size() - 1);
    }
}
