package com.manikanta.Arrays;

//https://leetcode.com/problems/concatenation-of-array/

public class ConcatenationOfArray {
    public static void main(String args[]){
        int nums[] = {1,2,1};
        int nums2[] = new int[nums.length*2];
        nums2 = getConcatenation(nums);

    }
    static int[] getConcatenation(int[] nums){
        int arr[] = new int[nums.length *2];
//        System.out.println(arr.length);
        for(int i = 0; i < arr.length; i++){
            if(i < nums.length){
                arr[i] = nums[i];
            }
            else{
                arr[i] = nums[i - nums.length];
            }
        }
        for(int k : arr){
            System.out.println(k);
        }
        return arr;
    }
}
