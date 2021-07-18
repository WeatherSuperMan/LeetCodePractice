package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] nums = new int[] {0,1,2,2,3,0,4,2};
	    int left = removeElement(nums, 2);
    }

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                System.out.println("\nDo not delete");
                nums[left] = nums[right];
                left++;

            }else{
                System.out.println("\ndelete");
            }
            System.out.println(Arrays.toString(nums));
        }

        System.out.println("Final array is: "+Arrays.toString(nums));
        return left;
    }
}
