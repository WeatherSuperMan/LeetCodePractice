package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	    String s = "anagram";
	    String t = "nagaram";

	    isAnagram(s, t);

    }

    public static boolean isAnagram(String s, String t) {
        char[] string_s_char = s.toCharArray();
        char[] string_t_char = t.toCharArray();
        Arrays.sort(string_s_char);
        Arrays.sort(string_t_char);
        return Arrays.equals(string_s_char,string_t_char);
    }
}
