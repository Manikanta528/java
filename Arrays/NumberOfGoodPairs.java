package com.manikanta.Arrays;

//https://leetcode.com/problems/number-of-good-pairs/

import java.util.*;

public class NumberOfGoodPairs {
    public static void main(String args[]){
        int nums[] = {1,2,3,1,1,3};
        int res = numIdenticalPairs(nums);
        System.out.println(res);
    }
    static int numIdenticalPairs(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
