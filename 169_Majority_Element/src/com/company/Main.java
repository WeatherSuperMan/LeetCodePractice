package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = new int[] {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
