package com.manikanta.Arrays;

//https://leetcode.com/problems/shuffle-the-array/

public class ShuffleTheArray {
    public static void main(String args[]){
        int nums[] = {2,5,1,3,4,7};
        int n = nums.length/2;
        System.out.println(n);
        nums = shuffle(nums, n);
        for(int k : nums){
            System.out.print(k);
        }
    }
    static int[] shuffle(int[] nums, int n){
        int arr[] = new int[nums.length];
        int flag = 0;
        for(int i = 0; i < nums.length; i++){
            if(i%2 ==0){
                arr[i] = nums[flag];
                flag++;
            }
            else{
                arr[i] = nums[n];
                if(n < nums.length) {
                    n = n + 1;
                }
            }
        }
        return arr;
    }
}
