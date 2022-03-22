package com.manikanta.Arrays;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

import java.util.*;

public class SmallestThanCurrentNum {
    public static void main(String args[]){
        int nums[] = {8,1,2,2,3};
        int res[] = smallerNumThanCurrent(nums);
        for(int k : res){
            System.out.print(k);
        }
    }
    static int[] smallerNumThanCurrent(int[] nums){
        int arr[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(i != j) {
                    if (nums[i] > nums[j]) {
                        count++;
                    }
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}
