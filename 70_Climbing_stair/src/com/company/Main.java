package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int n = 5;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.println("cycle " + i);
            p = q;
            q = r;
            r = p + q;
            System.out.println("p:"+p+" q:"+q+" r:"+r);
        }
        return r;
    }


}
