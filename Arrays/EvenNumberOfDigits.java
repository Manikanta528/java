package com.manikanta.Arrays;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenNumberOfDigits {
    public static void main(String[] args){
        int[] nums = {12,345,2,6,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }
    static int findNumbers(int[] nums){
        int evenCount = 0;
        for(int i = 0; i < nums.length; i++){
            int temp = nums[i];
            int count = 0;
            while(temp > 0){
                temp = temp/10;
                count++;
            }
            if(count % 2 == 0){
                evenCount++;
            }
        }
        return evenCount;
    }
}
