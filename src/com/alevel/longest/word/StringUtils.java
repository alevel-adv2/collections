package com.alevel.longest.word;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringUtils {

    public String getLongestWord(List<String> words) {
        if(words.size()>0){
            String longestWord = words.get(0);
            for (String element:words){
                if(element.length()>longestWord.length()){
                    longestWord =element;
                }
            }
            return longestWord;
        }
        return "";
    }

    public List<String> getDuplicates(List<String> words){
        List<String> stringsDuplicates = new ArrayList<>();
        for (int i = 0; i < words.size()-1; i++) {
            for (int j = i+1; j < words.size(); j++) {
                if(words.get(i).equals(words.get(j))){
                    stringsDuplicates.add(words.get(j));
                }
            }
        }
        return stringsDuplicates;
    }
}
