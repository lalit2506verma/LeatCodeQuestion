package com.studyPlan;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * Algorithm: 2
     * First of all we reverse the whole array
     * then we reverse first k element of the array
     * after that we reverse the remaining part of the array
     */
    static void rotate(int[] nums, int k){
        /*
        // Below method works but don't for the large data

        while(k > 0){
            for (int i = nums.length - 1; i > 0; i--) {
                int temp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
            }
            k--;
        }
         */

        //check array is empty
        if(nums == null || nums.length == 0){
            return;
        }
        int n = k % nums.length;
        reverse(nums, 0, nums.length -1);
        reverse(nums, 0, n-1);
        reverse(nums, n, nums.length - 1);
    }

    static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
