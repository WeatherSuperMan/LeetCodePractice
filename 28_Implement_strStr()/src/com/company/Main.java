package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String haystack = "aaaaa";
        String needle = "bba";
        System.out.println(strStr(haystack,needle));

    }

    public static int strStr(String haystack, String needle){
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
