package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSumMethod_A(nums,target)));
        System.out.println(Arrays.toString(twoSumMethod_B(nums,target)));
    }

    public static int[] twoSumMethod_A(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if(sum == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[2];
    }

    public static int[] twoSumMethod_B(int[] nums, int target) {
        // create a Map to store
        Map<Integer, Integer> map = new HashMap<>();

        // loop through all elements of nums
        for(int i = 0; i < nums.length; i++){

            // if map contains the exact difference between current element
            // and the target, we have found the pair of numbers, return their index

            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            // otherwise, put the current element as key, its index as value into the map
            else{
                map.put(nums[i], i);
            }
        }
        return new int[0]; // return empty list

    }
}
