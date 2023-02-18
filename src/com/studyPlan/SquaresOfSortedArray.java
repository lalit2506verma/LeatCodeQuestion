package com.studyPlan;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args){
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(squareArray(nums)));
    }

    static int[] squareArray(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }

        // Arrays.sort(nums);
        sort(nums);
        return nums;
    }

    static void sort(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

    }
}
