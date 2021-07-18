package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        // create a hashmap
        Map<String,List<String>> map = new HashMap<>();

        // for each word in the str array:
        for(String word: strs){
            // convert each word into character array
            char[] word_char = word.toCharArray();
            // sort char array
            Arrays.sort(word_char);
            // create a key from the sorted array
            String key = new String(word_char);
            // get the word list from inside the map
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            // add the new word into the list
            list.add(word);
            // put the updated list into the map according to key
            map.put(key,list);
        }
        return new ArrayList<>(map.values());
    }

}
