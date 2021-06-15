package com.alevel.longest.word;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StringUtilsTest {

    @Test
    void getLongestWord() {
        StringUtils stringUtils =  new StringUtils();

        List<String> strings = new ArrayList<>();
        strings.add("Superman");
        strings.add("Wonder woman");
        strings.add("Cyborg");
        strings.add("Aquamen");

        String longestWord = stringUtils.getLongestWord(strings);

        Assertions.assertEquals(longestWord, "Wonder woman");
    }
    @Test
    void getDuplicates(){
        StringUtils stringUtils =  new StringUtils();
        List<String> hopefully = new ArrayList<>();
        hopefully.add("Bat");
        hopefully.add("Cat");
        hopefully.add("Wonder woman");

        List<String> strings = new ArrayList<>();
        strings.add("Wonder woman");
        strings.add("Cat");
        strings.add("Bat");
        strings.add("Cat");
        strings.add("Man");
        strings.add("Bat");
        strings.add("Green");
        strings.add("Super");
        strings.add("Cat");
        strings.add("Wonder woman");

        List<String> duplicateWord = stringUtils.getDuplicates(strings);
        Assertions.assertEquals(hopefully,duplicateWord);
    }
}
