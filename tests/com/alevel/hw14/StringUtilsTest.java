package com.alevel.hw14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StringUtilsTest {

    @Test
    void getLongestWord() {

        StringUtils stringUtils = new StringUtils();

        List<String> strings = new ArrayList<>();
        strings.add("Superman");
        strings.add("Wonder woman");
        strings.add("Cyborg");
        strings.add("Aquamen");

        String longestWord = stringUtils.getLongestWord(strings);

        Assertions.assertEquals(longestWord, "Wonder woman");
    }

    @Test
    void getDuplicates() {

        StringUtils stringUtils = new StringUtils();
        List<String> words = new ArrayList<>();
        List<String> currentDuplicate = new ArrayList<>();

        words.add("Superman");
        words.add("Wonder woman");
        words.add("Cyborg");
        words.add("Aquamen");
        words.add("Superman");

        currentDuplicate.add("Superman");

        List<String> duplicateWords = stringUtils.getDuplicates(words);

        Assertions.assertEquals(duplicateWords, currentDuplicate);
    }
}
