package com.alevel.longest.word;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
        String[] wordArr = {"Cyborg", "Wonder woman", "Superman", "Superman", "Cyborg", "Aquaman", "Superman"};
        List<String> words = new ArrayList<>(Arrays.asList(wordArr));

        List<String> expected = new ArrayList<>(Arrays.asList("Superman", "Cyborg"));
        List<String> duplicates = stringUtils.getDuplicates(words);

        Assertions.assertTrue(duplicates.containsAll(expected));
    }
}
