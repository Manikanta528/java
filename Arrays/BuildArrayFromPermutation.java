package com.manikanta.Arrays;

//https://leetcode.com/problems/build-array-from-permutation/

public class BuildArrayFromPermutation {
    public static void main(String args[]){
        int nums[] = {0,2,1,5,3,4};

        nums = buildArray(nums);


    }
    static int[] buildArray(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i =0 ; i < nums.length ; i++){
            arr[i] = nums[nums[i]];
        }
        // for(int k : arr){
        //     System.out.println(k);
        // }
        return arr;
    }
}
