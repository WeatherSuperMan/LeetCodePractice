package com.company;

public class Main {

    public static void main(String[] args) {
	    int x = 121;
        StringBuilder rev_x = new StringBuilder();
        rev_x.append(String.valueOf(x));
        rev_x.reverse();
        System.out.println(rev_x);

        if (String.valueOf(x).equals(rev_x.toString())){
            System.out.println("Reversible!!");
        }
    }
}
