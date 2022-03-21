package com.manikanta.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/

public class RunningSumOf1DArray {
    public static void main(String args[]){
        int nums[] = {1,2,3,4};
        nums = runningSum(nums);

    }
    static int[] runningSum(int[] nums){
        int arr[] = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            arr[i] = sum;
        }
        return arr;
    }
}
