package com.alevel.longest.word;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StringUtilsTest {

    @Test
    void getDuplicates() {
        List<String> strings = new ArrayList<>();
        StringUtils stringUtils = new StringUtils();

        strings.add("Batman");
        strings.add("Wonder woman");
        strings.add("Cyborg");
        strings.add("Aquamen");
        strings.add("Flash");
        strings.add("Martian Manhunter");
        strings.add("Green Lantern");
        strings.add("Flash");

        List<String> duplicate = stringUtils.getDuplicates(strings);

        Assertions.assertEquals(duplicate.get(0), "Flash");
        Assertions.assertEquals(duplicate.size(), 1);
    }

    @Test
    void getLongestWord() {
        List<String> strings = new ArrayList<>();
        StringUtils stringUtils = new StringUtils();

        strings.add("Batman");
        strings.add("Wonder woman");
        strings.add("Cyborg");
        strings.add("Aquamen");
        strings.add("Flash");
        strings.add("Martian Manhunter");
        strings.add("Green Lantern");
        strings.add("Flash");

        String longestWord = stringUtils.getLongestWord(strings);

        Assertions.assertEquals(longestWord, "Martian Manhunter");
    }

}
