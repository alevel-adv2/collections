package com.alevel.longest.word;

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

        List<String> strings = new ArrayList<>();
        strings.add("Superman");
        strings.add("Wonder woman");
        strings.add("Cyborg");
        strings.add("Aquamen");
        strings.add("Cyborg");
        strings.add("Wonder woman");

        List<String> duplicates = stringUtils.getDuplicates(strings);
        Assertions.assertEquals(duplicates.size(), 2);
        Assertions.assertEquals(duplicates.get(0), "Wonder woman");
        Assertions.assertEquals(duplicates.get(1), "Cyborg");
    }
}
