package com.manikanta.Arrays;

//https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.*;

public class CreateTargetArray {
    public static void main(String args[]){
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] target = createTargetArray(nums, index);
        for (int k : target){
            System.out.print(k+" ");
        }
    }
    static int[] createTargetArray(int[] nums, int[] index){
        ArrayList<Integer> res = new ArrayList<Integer>(nums.length);
        for(int i = 0; i < nums.length; i++){
            res.add(index[i],nums[i]);
        }
        int[] arr = new int[nums.length];
        for(int i = 0; i < arr.length; i++){
            arr[i] = res.get(i);
        }
        return arr;
    }
}
